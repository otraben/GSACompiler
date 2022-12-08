package outputs;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

   public static Map<String, Integer> distanceVectors = new HashMap<String, Integer>();
   public static String routerID;
   public static DatagramSocket socket = null;
   
   public static void updateDV(String command) {
      String updatedID = command.substring(0, command.indexOf("\n"));
      command = command.substring(command.lastIndexOf("\n") + 1);
      Map<String, Integer> newDVs = new HashMap<String, Integer>();
      int i=0;
		while(i<command.length()) {
         newDVs.put(command.substring(i, i + command.substring(i).indexOf(",")), Integer.parseInt(command.substring(i + command.substring(i).indexOf(",") + 1, i + command.substring(i).indexOf(" "))));
         i = i + command.substring(i).indexOf(" ");
      	i = i + 1;
		}

      Map<String, Integer> update = new HashMap<String, Integer>();
      for(String node : distanceVectors.keySet()) {
         if(node.equals(updatedID)) {
            update.put(node, distanceVectors.get(node));
            continue;
         }
         if(newDVs.get(node) != -1 && distanceVectors.get(node) > (distanceVectors.get(updatedID) + newDVs.get(node))) {
            update.put(node, distanceVectors.get(updatedID) + newDVs.get(node));
         }
         else {
            update.put(node, distanceVectors.get(node));
         }
      }
      distanceVectors = update;
   }

   public static void initialDV(String command) {
      command = command.substring(command.lastIndexOf("\n") + 1);
      int i=0;
		while(i<command.length()) {
         distanceVectors.put(command.substring(i, i + command.substring(i).indexOf(",")), Integer.parseInt(command.substring(i + command.substring(i).indexOf(",") + 1, i + command.substring(i).indexOf(" "))));
         i = i + command.substring(i).indexOf(" ");
      	i = i + 1;
		}
   }

   public static void printDV() {
      for(String neighbor : distanceVectors.keySet()) {
         System.out.println(neighbor + ": " + distanceVectors.get(neighbor));
      }
   }

   public static String UPDATE() {
      String command = "UPDATE " + routerID + ": ";

      for(String neighbor : distanceVectors.keySet()) {
         command = command + neighbor + "," + distanceVectors.get(neighbor) + " ";
      }

      return command;
   }

   public static void main(String[] args) {
      
      // scans the input the user types in the client terminal
      Scanner input = new Scanner(System.in);
      
      if(args.length != 2) {
         System.out.println("Usage: java Client SERVER-HOST-OR-IP ROUTER-ID");
         System.exit(1);
      }
      
      // used to hold the IP address or Hostname
      String host = args[0];

      // gets the RouterID of the node
      routerID = args[1];

      // try to establish a connection using the inputted hostname/IP
      while(socket == null) {
         try {
            socket = new DatagramSocket();
            System.out.println("Connecting...");
         } 
         catch (IOException e) {
            System.out.println(e);
         }
      } 

      System.out.println("Connection Established");
      String command = "JOIN "+routerID;

      byte[] data = command.getBytes();
      DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress("localhost", 5555));

      try {
         socket.send(packet);

         socket.receive(packet);
         command = data.toString();
         initialDV(command);
         printDV();
      }
      catch(Exception e) {
         System.out.println(e);
      }
      
      boolean stabilized = false;
      // this loop will continue until the client is stabilized
      while(!stabilized) {
         try {

            updateDV(command);
            printDV();
         }
         catch (Exception e) {
            System.out.println(e);
         }
      }

      // when the user breaks out of the loop, the connection is closed
      try {
         System.out.println("See you later.\n");
         socket.close();
      }
      catch (Exception e) {
         System.out.println(e);
      }  
   
   }

}