genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_10=fault_binerrs_all$i_10)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_g_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_1=fault_binerrs_all$g_1)
results[["g_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_1_treat_df, "Y", "g_1")

fault_binerrs_g_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_0=fault_binerrs_all$g_0)
results[["g_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_0_treat_df, "Y", "g_0")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0, n_2=fault_binerrs_all$n_2)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_g_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_2=fault_binerrs_all$g_2, g_0=fault_binerrs_all$g_0, g_1=fault_binerrs_all$g_1)
results[["g_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_2_treat_df, "Y", "g_2")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_2=fault_binerrs_all$j_2, j_3=fault_binerrs_all$j_3)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_n_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_0=fault_binerrs_all$n_0)
results[["n_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_0_treat_df, "Y", "n_0")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_2=fault_binerrs_all$j_2, j_3=fault_binerrs_all$j_3)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_n_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_2=fault_binerrs_all$n_2, n_1=fault_binerrs_all$n_1)
results[["n_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_2_treat_df, "Y", "n_2")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_n_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_1=fault_binerrs_all$n_1, n_0=fault_binerrs_all$n_0)
results[["n_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_1_treat_df, "Y", "n_1")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_5=fault_binerrs_all$i_5)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_n_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_4=fault_binerrs_all$n_4, n_3=fault_binerrs_all$n_3)
results[["n_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_4_treat_df, "Y", "n_4")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_n_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_3=fault_binerrs_all$n_3, n_2=fault_binerrs_all$n_2)
results[["n_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_3_treat_df, "Y", "n_3")

return(results)

}
