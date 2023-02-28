genCFmeansRF_fault_binerss <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

fault_binerrs_y_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_0=fault_binerrs_all$y_0)
results[["y_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_1_treat_df, "Y", "y_1")

fault_binerrs_x_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0)
results[["x_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_2_treat_df, "Y", "x_2")

fault_binerrs_y_0_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["y_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_0_treat_df, "Y", "y_0")

fault_binerrs_x_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0)
results[["x_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_1_treat_df, "Y", "x_1")

fault_binerrs_y_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_0=fault_binerrs_all$y_0)
results[["y_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_3_treat_df, "Y", "y_3")

fault_binerrs_x_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2)
results[["x_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_4_treat_df, "Y", "x_4")

fault_binerrs_y_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_0=fault_binerrs_all$y_0)
results[["y_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_2_treat_df, "Y", "y_2")

fault_binerrs_x_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2)
results[["x_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_3_treat_df, "Y", "x_3")

fault_binerrs_x_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_1=fault_binerrs_all$x_1, x_5=fault_binerrs_all$x_5)
results[["x_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_6_treat_df, "Y", "x_6")

fault_binerrs_x_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_3=fault_binerrs_all$x_3, x_4=fault_binerrs_all$x_4)
results[["x_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_5_treat_df, "Y", "x_5")

fault_binerrs_y_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_1=fault_binerrs_all$y_1, y_3=fault_binerrs_all$y_3)
results[["y_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_4_treat_df, "Y", "y_4")

return(results)

}
