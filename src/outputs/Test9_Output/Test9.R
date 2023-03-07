genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

fault_binerrs_x_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2)
results[["x_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_2_treat_df, "Y", "x_2")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_x_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_1=fault_binerrs_all$x_1)
results[["x_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_1_treat_df, "Y", "x_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_x_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_4=fault_binerrs_all$x_4, x_1=fault_binerrs_all$x_1, x_2=fault_binerrs_all$x_2, x_3=fault_binerrs_all$x_3)
results[["x_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_4_treat_df, "Y", "x_4")

fault_binerrs_x_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_3=fault_binerrs_all$x_3)
results[["x_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_3_treat_df, "Y", "x_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_x_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_6=fault_binerrs_all$x_6, x_4=fault_binerrs_all$x_4, x_5=fault_binerrs_all$x_5)
results[["x_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_6_treat_df, "Y", "x_6")

fault_binerrs_x_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_5=fault_binerrs_all$x_5, x_4=fault_binerrs_all$x_4, x_5=fault_binerrs_all$x_5)
results[["x_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_5_treat_df, "Y", "x_5")

return(results)

}
