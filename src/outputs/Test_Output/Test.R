genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_p_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_0=fault_binerrs_all$p_0)
results[["p_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_0_treat_df, "Y", "p_0")

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

fault_binerrs_w_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_0=fault_binerrs_all$w_0)
results[["w_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_0_treat_df, "Y", "w_0")

fault_binerrs_z_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, z_0=fault_binerrs_all$z_0)
results[["z_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_z_0_treat_df, "Y", "z_0")

fault_binerrs_y_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_1=fault_binerrs_all$y_1)
results[["y_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_1_treat_df, "Y", "y_1")

fault_binerrs_x_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2)
results[["x_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_2_treat_df, "Y", "x_2")

fault_binerrs_x_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_1=fault_binerrs_all$x_1)
results[["x_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_1_treat_df, "Y", "x_1")

fault_binerrs_y_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_0=fault_binerrs_all$y_0, x_1=fault_binerrs_all$x_1)
results[["y_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_0_treat_df, "Y", "y_0")

fault_binerrs_y_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_3=fault_binerrs_all$y_3)
results[["y_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_3_treat_df, "Y", "y_3")

fault_binerrs_z_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, z_2=fault_binerrs_all$z_2)
results[["z_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_z_2_treat_df, "Y", "z_2")

fault_binerrs_x_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_4=fault_binerrs_all$x_4, x_2=fault_binerrs_all$x_2, x_1=fault_binerrs_all$x_1, x_3=fault_binerrs_all$x_3)
results[["x_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_4_treat_df, "Y", "x_4")

fault_binerrs_y_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_2=fault_binerrs_all$y_2)
results[["y_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_2_treat_df, "Y", "y_2")

fault_binerrs_z_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, z_1=fault_binerrs_all$z_1)
results[["z_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_z_1_treat_df, "Y", "z_1")

fault_binerrs_x_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_3=fault_binerrs_all$x_3)
results[["x_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_3_treat_df, "Y", "x_3")

fault_binerrs_z_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, z_4=fault_binerrs_all$z_4, z_1=fault_binerrs_all$z_1, z_2=fault_binerrs_all$z_2, z_3=fault_binerrs_all$z_3)
results[["z_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_z_4_treat_df, "Y", "z_4")

fault_binerrs_z_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, z_3=fault_binerrs_all$z_3)
results[["z_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_z_3_treat_df, "Y", "z_3")

fault_binerrs_y_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_4=fault_binerrs_all$y_4, y_2=fault_binerrs_all$y_2, y_3=fault_binerrs_all$y_3, y_1=fault_binerrs_all$y_1)
results[["y_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_4_treat_df, "Y", "y_4")

return(results)

}
