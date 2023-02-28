genCFmeansRF_fault_binerss <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

fault_binerrs_x_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_1=fault_binerrs_all$x_1, x_0=fault_binerrs_all$x_0)
results[["x_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_2_treat_df, "Y", "x_2")

fault_binerrs_y_0_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["y_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_y_0_treat_df, "Y", "y_0")

fault_binerrs_x_1_treat_df <- data.frame(Y=fault_binerrs_all$Y)
results[["x_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_1_treat_df, "Y", "x_1")

return(results)

}
