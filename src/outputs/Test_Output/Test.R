genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_x_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, x_0=fault_binerrs_all$x_0)
results[["x_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_x_0_treat_df, "Y", "x_0")

return(results)

}
