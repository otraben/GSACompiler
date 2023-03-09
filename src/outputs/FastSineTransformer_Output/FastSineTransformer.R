genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_n_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_2=fault_binerrs_all$n_2, n_2=fault_binerrs_all$n_2, n_2=fault_binerrs_all$n_2)
results[["n_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_2_treat_df, "Y", "n_2")

fault_binerrs_n_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_1=fault_binerrs_all$n_1)
results[["n_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_1_treat_df, "Y", "n_1")

fault_binerrs_type_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, type_1=fault_binerrs_all$type_1)
results[["type_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_type_1_treat_df, "Y", "type_1")

fault_binerrs_type_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, type_0=fault_binerrs_all$type_0)
results[["type_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_type_0_treat_df, "Y", "type_0")

fault_binerrs_s_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_1=fault_binerrs_all$s_1)
results[["s_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_1_treat_df, "Y", "s_1")

fault_binerrs_s_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_0=fault_binerrs_all$s_0)
results[["s_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_0_treat_df, "Y", "s_0")

fault_binerrs_min_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, min_0=fault_binerrs_all$min_0)
results[["min_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_min_0_treat_df, "Y", "min_0")

fault_binerrs_b_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_0=fault_binerrs_all$b_0)
results[["b_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_0_treat_df, "Y", "b_0")

fault_binerrs_normalization_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, normalization_0=fault_binerrs_all$normalization_0)
results[["normalization_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_normalization_0_treat_df, "Y", "normalization_0")

fault_binerrs_a_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_0=fault_binerrs_all$a_0)
results[["a_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_0_treat_df, "Y", "a_0")

fault_binerrs_f_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_0=fault_binerrs_all$f_0)
results[["f_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_0_treat_df, "Y", "f_0")

fault_binerrs_max_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_0=fault_binerrs_all$max_0)
results[["max_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_0_treat_df, "Y", "max_0")

fault_binerrs_transformer_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, transformer_0=fault_binerrs_all$transformer_0)
results[["transformer_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_transformer_0_treat_df, "Y", "transformer_0")

fault_binerrs_transformer_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, transformer_1=fault_binerrs_all$transformer_1)
results[["transformer_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_transformer_1_treat_df, "Y", "transformer_1")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_n_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_0=fault_binerrs_all$n_0)
results[["n_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_0_treat_df, "Y", "n_0")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

return(results)

}
