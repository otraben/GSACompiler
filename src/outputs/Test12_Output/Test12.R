genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_other_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, other_2=fault_binerrs_all$other_2, other_0=fault_binerrs_all$other_0, other_1=fault_binerrs_all$other_1)
results[["other_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_other_2_treat_df, "Y", "other_2")

fault_binerrs_other_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, other_1=fault_binerrs_all$other_1, other_0=fault_binerrs_all$other_0, other_1=fault_binerrs_all$other_1)
results[["other_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_other_1_treat_df, "Y", "other_1")

fault_binerrs_other_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, other_0=fault_binerrs_all$other_0)
results[["other_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_other_0_treat_df, "Y", "other_0")

fault_binerrs_count_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, count_4=fault_binerrs_all$count_4, count_0=fault_binerrs_all$count_0, count_3=fault_binerrs_all$count_3)
results[["count_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_count_4_treat_df, "Y", "count_4")

fault_binerrs_count_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, count_3=fault_binerrs_all$count_3, count_0=fault_binerrs_all$count_0, count_2=fault_binerrs_all$count_2)
results[["count_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_count_3_treat_df, "Y", "count_3")

fault_binerrs_count_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, count_2=fault_binerrs_all$count_2, count_1=fault_binerrs_all$count_1, other_1=fault_binerrs_all$other_1)
results[["count_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_count_2_treat_df, "Y", "count_2")

fault_binerrs_count_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, count_1=fault_binerrs_all$count_1, count_0=fault_binerrs_all$count_0, count_2=fault_binerrs_all$count_2)
results[["count_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_count_1_treat_df, "Y", "count_1")

fault_binerrs_count_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, count_0=fault_binerrs_all$count_0)
results[["count_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_count_0_treat_df, "Y", "count_0")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

return(results)

}
