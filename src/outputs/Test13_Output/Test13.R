genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_p_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_0=fault_binerrs_all$p_0)
results[["p_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_0_treat_df, "Y", "p_0")

fault_binerrs_p_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_2=fault_binerrs_all$p_2, p_0=fault_binerrs_all$p_0)
results[["p_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_2_treat_df, "Y", "p_2")

fault_binerrs_p_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_1=fault_binerrs_all$p_1, p_0=fault_binerrs_all$p_0)
results[["p_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_1_treat_df, "Y", "p_1")

fault_binerrs_p_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_4=fault_binerrs_all$p_4, p_1=fault_binerrs_all$p_1, p_2=fault_binerrs_all$p_2, p_3=fault_binerrs_all$p_3)
results[["p_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_4_treat_df, "Y", "p_4")

fault_binerrs_c_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, c_0=fault_binerrs_all$c_0)
results[["c_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_c_0_treat_df, "Y", "c_0")

fault_binerrs_p_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_3=fault_binerrs_all$p_3, p_0=fault_binerrs_all$p_0)
results[["p_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_3_treat_df, "Y", "p_3")

return(results)

}
