genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_10=fault_binerrs_all$i_10)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_d_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, d_0=fault_binerrs_all$d_0, d_0=fault_binerrs_all$d_0, d_1=fault_binerrs_all$d_1)
results[["d_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_d_0_treat_df, "Y", "d_0")

fault_binerrs_d_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, d_2=fault_binerrs_all$d_2, d_0=fault_binerrs_all$d_0, d_1=fault_binerrs_all$d_1)
results[["d_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_d_2_treat_df, "Y", "d_2")

fault_binerrs_d_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, d_1=fault_binerrs_all$d_1, s_3=fault_binerrs_all$s_3, s_3=fault_binerrs_all$s_3)
results[["d_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_d_1_treat_df, "Y", "d_1")

fault_binerrs_d_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, d_3=fault_binerrs_all$d_3, j_3=fault_binerrs_all$j_3, j_3=fault_binerrs_all$j_3, d_2=fault_binerrs_all$d_2)
results[["d_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_d_3_treat_df, "Y", "d_3")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_2=fault_binerrs_all$j_2, j_5=fault_binerrs_all$j_5)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_3=fault_binerrs_all$j_3)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6, j_2=fault_binerrs_all$j_2, j_5=fault_binerrs_all$j_5)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_k_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_20=fault_binerrs_all$k_20, k_20=fault_binerrs_all$k_20, k_23=fault_binerrs_all$k_23)
results[["k_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_20_treat_df, "Y", "k_20")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5, j_4=fault_binerrs_all$j_4)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_k_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_21=fault_binerrs_all$k_21)
results[["k_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_21_treat_df, "Y", "k_21")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8, j_7=fault_binerrs_all$j_7)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11, j_9=fault_binerrs_all$j_9, j_10=fault_binerrs_all$j_10)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_k_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_24=fault_binerrs_all$k_24, k_20=fault_binerrs_all$k_20, k_23=fault_binerrs_all$k_23)
results[["k_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_24_treat_df, "Y", "k_24")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9, j_9=fault_binerrs_all$j_9, j_10=fault_binerrs_all$j_10)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13, j_12=fault_binerrs_all$j_12)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_k_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_22=fault_binerrs_all$k_22, k_20=fault_binerrs_all$k_20, k_21=fault_binerrs_all$k_21)
results[["k_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_22_treat_df, "Y", "k_22")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_k_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_23=fault_binerrs_all$k_23)
results[["k_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_23_treat_df, "Y", "k_23")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_14=fault_binerrs_all$j_14, j_15=fault_binerrs_all$j_15)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_j_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_16=fault_binerrs_all$j_16, j_14=fault_binerrs_all$j_14, j_15=fault_binerrs_all$j_15)
results[["j_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_16_treat_df, "Y", "j_16")

fault_binerrs_Arg_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, Arg_0=fault_binerrs_all$Arg_0)
results[["Arg_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_Arg_0_treat_df, "Y", "Arg_0")

fault_binerrs_k_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_10=fault_binerrs_all$k_10, k_8=fault_binerrs_all$k_8, k_9=fault_binerrs_all$k_9)
results[["k_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_10_treat_df, "Y", "k_10")

fault_binerrs_k_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_13=fault_binerrs_all$k_13, k_13=fault_binerrs_all$k_13, k_16=fault_binerrs_all$k_16)
results[["k_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_13_treat_df, "Y", "k_13")

fault_binerrs_k_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_14=fault_binerrs_all$k_14)
results[["k_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_14_treat_df, "Y", "k_14")

fault_binerrs_k_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_11=fault_binerrs_all$k_11)
results[["k_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_11_treat_df, "Y", "k_11")

fault_binerrs_k_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_12=fault_binerrs_all$k_12, k_11=fault_binerrs_all$k_11)
results[["k_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_12_treat_df, "Y", "k_12")

fault_binerrs_nx_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nx_0=fault_binerrs_all$nx_0, nx_0=fault_binerrs_all$nx_0, nx_1=fault_binerrs_all$nx_1)
results[["nx_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nx_0_treat_df, "Y", "nx_0")

fault_binerrs_k_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_17=fault_binerrs_all$k_17, k_13=fault_binerrs_all$k_13, k_16=fault_binerrs_all$k_16)
results[["k_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_17_treat_df, "Y", "k_17")

fault_binerrs_k_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_18=fault_binerrs_all$k_18)
results[["k_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_18_treat_df, "Y", "k_18")

fault_binerrs_k_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_15=fault_binerrs_all$k_15, k_13=fault_binerrs_all$k_13, k_14=fault_binerrs_all$k_14)
results[["k_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_15_treat_df, "Y", "k_15")

fault_binerrs_k_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_16=fault_binerrs_all$k_16)
results[["k_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_16_treat_df, "Y", "k_16")

fault_binerrs_nx_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, nx_4=fault_binerrs_all$nx_4, nx_2=fault_binerrs_all$nx_2, nx_3=fault_binerrs_all$nx_3)
results[["nx_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_nx_4_treat_df, "Y", "nx_4")

fault_binerrs_nx_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, nx_3=fault_binerrs_all$nx_3)
results[["nx_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_nx_3_treat_df, "Y", "nx_3")

fault_binerrs_nx_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, nx_2=fault_binerrs_all$nx_2, nx_2=fault_binerrs_all$nx_2, nx_3=fault_binerrs_all$nx_3)
results[["nx_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_nx_2_treat_df, "Y", "nx_2")

fault_binerrs_k_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_19=fault_binerrs_all$k_19, k_18=fault_binerrs_all$k_18)
results[["k_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_19_treat_df, "Y", "k_19")

fault_binerrs_nx_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nx_1=fault_binerrs_all$nx_1)
results[["nx_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nx_1_treat_df, "Y", "nx_1")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_k_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_1=fault_binerrs_all$k_1, k_0=fault_binerrs_all$k_0)
results[["k_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_1_treat_df, "Y", "k_1")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_k_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_0=fault_binerrs_all$k_0)
results[["k_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_0_treat_df, "Y", "k_0")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_k_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_3=fault_binerrs_all$k_3)
results[["k_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_3_treat_df, "Y", "k_3")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_k_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_2=fault_binerrs_all$k_2, k_2=fault_binerrs_all$k_2, k_4=fault_binerrs_all$k_4)
results[["k_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_2_treat_df, "Y", "k_2")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_k_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_5=fault_binerrs_all$k_5, k_2=fault_binerrs_all$k_2, k_4=fault_binerrs_all$k_4)
results[["k_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_5_treat_df, "Y", "k_5")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_k_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_4=fault_binerrs_all$k_4, k_3=fault_binerrs_all$k_3)
results[["k_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_4_treat_df, "Y", "k_4")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_5=fault_binerrs_all$i_5)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_k_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_7=fault_binerrs_all$k_7, k_6=fault_binerrs_all$k_6)
results[["k_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_7_treat_df, "Y", "k_7")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_k_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_6=fault_binerrs_all$k_6, j_3=fault_binerrs_all$j_3)
results[["k_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_6_treat_df, "Y", "k_6")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_s_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_1=fault_binerrs_all$s_1)
results[["s_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_1_treat_df, "Y", "s_1")

fault_binerrs_k_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_9=fault_binerrs_all$k_9)
results[["k_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_9_treat_df, "Y", "k_9")

fault_binerrs_s_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_0=fault_binerrs_all$s_0, s_0=fault_binerrs_all$s_0, s_1=fault_binerrs_all$s_1)
results[["s_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_0_treat_df, "Y", "s_0")

fault_binerrs_k_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_8=fault_binerrs_all$k_8, k_8=fault_binerrs_all$k_8, k_9=fault_binerrs_all$k_9)
results[["k_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_8_treat_df, "Y", "k_8")

fault_binerrs_s_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_3=fault_binerrs_all$s_3, k_3=fault_binerrs_all$k_3, s_2=fault_binerrs_all$s_2, k_3=fault_binerrs_all$k_3, k_3=fault_binerrs_all$k_3)
results[["s_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_3_treat_df, "Y", "s_3")

fault_binerrs_s_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_2=fault_binerrs_all$s_2, s_0=fault_binerrs_all$s_0, s_1=fault_binerrs_all$s_1)
results[["s_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_2_treat_df, "Y", "s_2")

fault_binerrs_B_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, B_0=fault_binerrs_all$B_0)
results[["B_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_B_0_treat_df, "Y", "B_0")

return(results)

}
