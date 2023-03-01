genCFmeansRF_fault_binerss <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_a_1_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["a_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_1_treat_df, "Y", "a_1")

fault_binerrs_b_1_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["b_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_1_treat_df, "Y", "b_1")

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

fault_binerrs_y_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_0=fault_binerrs_all$y_0, y_1=fault_binerrs_all$y_1)
results[["y_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_1_treat_df, "Y", "y_1")

fault_binerrs_x_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0, x_1=fault_binerrs_all$x_1)
results[["x_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_2_treat_df, "Y", "x_2")

fault_binerrs_var2_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_0=fault_binerrs_all$b_0)
results[["var2_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_var2_0_treat_df, "Y", "var2_0")

fault_binerrs_y_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0)
results[["y_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_0_treat_df, "Y", "y_0")

fault_binerrs_x_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0, x_1=fault_binerrs_all$x_1)
results[["x_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_1_treat_df, "Y", "x_1")

fault_binerrs_var1_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_0=fault_binerrs_all$a_0)
results[["var1_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_var1_0_treat_df, "Y", "var1_0")

fault_binerrs_x_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2, x_3=fault_binerrs_all$x_3)
results[["x_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_4_treat_df, "Y", "x_4")

fault_binerrs_y_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, y_0=fault_binerrs_all$y_0, y_1=fault_binerrs_all$y_1)
results[["y_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_2_treat_df, "Y", "y_2")

fault_binerrs_x_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_2=fault_binerrs_all$x_2, x_3=fault_binerrs_all$x_3)
results[["x_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_3_treat_df, "Y", "x_3")

return(results)

}
