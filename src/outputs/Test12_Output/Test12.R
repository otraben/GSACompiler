genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_6=fault_binerrs_all$i_6)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_3=fault_binerrs_all$i_3, i_5=fault_binerrs_all$i_5)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8, i_2=fault_binerrs_all$i_2, i_7=fault_binerrs_all$i_7)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0, x_0=fault_binerrs_all$x_0, x_7=fault_binerrs_all$x_7)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

fault_binerrs_x_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2, x_2=fault_binerrs_all$x_2, x_5=fault_binerrs_all$x_5)
results[["x_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_2_treat_df, "Y", "x_2")

fault_binerrs_x_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_1=fault_binerrs_all$x_1)
results[["x_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_1_treat_df, "Y", "x_1")

fault_binerrs_x_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_4=fault_binerrs_all$x_4)
results[["x_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_4_treat_df, "Y", "x_4")

fault_binerrs_x_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_3=fault_binerrs_all$x_3)
results[["x_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_3_treat_df, "Y", "x_3")

fault_binerrs_x_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_6=fault_binerrs_all$x_6, x_2=fault_binerrs_all$x_2, x_5=fault_binerrs_all$x_5)
results[["x_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_6_treat_df, "Y", "x_6")

fault_binerrs_x_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_5=fault_binerrs_all$x_5, x_3=fault_binerrs_all$x_3, x_4=fault_binerrs_all$x_4)
results[["x_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_5_treat_df, "Y", "x_5")

fault_binerrs_x_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_8=fault_binerrs_all$x_8, x_0=fault_binerrs_all$x_0, x_7=fault_binerrs_all$x_7)
results[["x_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_8_treat_df, "Y", "x_8")

fault_binerrs_x_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_7=fault_binerrs_all$x_7, x_1=fault_binerrs_all$x_1, x_6=fault_binerrs_all$x_6)
results[["x_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_7_treat_df, "Y", "x_7")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_2=fault_binerrs_all$i_2, i_7=fault_binerrs_all$i_7)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

return(results)

}
