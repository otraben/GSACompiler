genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_minMN_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_2=fault_binerrs_all$minMN_2, minMN_0=fault_binerrs_all$minMN_0, minMN_1=fault_binerrs_all$minMN_1)
results[["minMN_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_2_treat_df, "Y", "minMN_2")

fault_binerrs_minMN_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_0=fault_binerrs_all$minMN_0, M_3=fault_binerrs_all$M_3, N_6=fault_binerrs_all$N_6)
results[["minMN_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_0_treat_df, "Y", "minMN_0")

fault_binerrs_j_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_20=fault_binerrs_all$j_20, j_19=fault_binerrs_all$j_19, j_20=fault_binerrs_all$j_20)
results[["j_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_20_treat_df, "Y", "j_20")

fault_binerrs_minMN_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_1=fault_binerrs_all$minMN_1, minMN_0=fault_binerrs_all$minMN_0, minMN_1=fault_binerrs_all$minMN_1)
results[["minMN_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_1_treat_df, "Y", "minMN_1")

fault_binerrs_j_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_22=fault_binerrs_all$j_22)
results[["j_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_22_treat_df, "Y", "j_22")

fault_binerrs_j_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_21=fault_binerrs_all$j_21, j_19=fault_binerrs_all$j_19, j_20=fault_binerrs_all$j_20)
results[["j_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_21_treat_df, "Y", "j_21")

fault_binerrs_j_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_24=fault_binerrs_all$j_24, j_22=fault_binerrs_all$j_22, j_23=fault_binerrs_all$j_23)
results[["j_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_24_treat_df, "Y", "j_24")

fault_binerrs_j_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_23=fault_binerrs_all$j_23, j_22=fault_binerrs_all$j_22, j_23=fault_binerrs_all$j_23)
results[["j_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_23_treat_df, "Y", "j_23")

fault_binerrs_j_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_26=fault_binerrs_all$j_26, j_25=fault_binerrs_all$j_25, j_26=fault_binerrs_all$j_26)
results[["j_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_26_treat_df, "Y", "j_26")

fault_binerrs_j_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_25=fault_binerrs_all$j_25)
results[["j_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_25_treat_df, "Y", "j_25")

fault_binerrs_j_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_27=fault_binerrs_all$j_27, j_25=fault_binerrs_all$j_25, j_26=fault_binerrs_all$j_26)
results[["j_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_27_treat_df, "Y", "j_27")

fault_binerrs_Nd_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, Nd_0=fault_binerrs_all$Nd_0, N_0=fault_binerrs_all$N_0)
results[["Nd_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_Nd_0_treat_df, "Y", "Nd_0")

fault_binerrs_t_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_0=fault_binerrs_all$t_0)
results[["t_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_0_treat_df, "Y", "t_0")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11, j_10=fault_binerrs_all$j_10)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10, j_9=fault_binerrs_all$j_9, j_14=fault_binerrs_all$j_14)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_t_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_2=fault_binerrs_all$t_2, ab_1=fault_binerrs_all$ab_1)
results[["t_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_2_treat_df, "Y", "t_2")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13, j_12=fault_binerrs_all$j_12)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_t_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_1=fault_binerrs_all$t_1, t_0=fault_binerrs_all$t_0, t_3=fault_binerrs_all$t_3)
results[["t_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_1_treat_df, "Y", "t_1")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12, j_11=fault_binerrs_all$j_11)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_t_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_4=fault_binerrs_all$t_4, t_0=fault_binerrs_all$t_0, t_3=fault_binerrs_all$t_3)
results[["t_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_4_treat_df, "Y", "t_4")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15, j_9=fault_binerrs_all$j_9, j_14=fault_binerrs_all$j_14)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_t_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_3=fault_binerrs_all$t_3, t_2=fault_binerrs_all$t_2, t_1=fault_binerrs_all$t_1)
results[["t_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_3_treat_df, "Y", "t_3")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_13=fault_binerrs_all$j_13)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_ip_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ip_0=fault_binerrs_all$ip_0)
results[["ip_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ip_0_treat_df, "Y", "ip_0")

fault_binerrs_j_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_17=fault_binerrs_all$j_17, j_16=fault_binerrs_all$j_16, j_17=fault_binerrs_all$j_17)
results[["j_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_17_treat_df, "Y", "j_17")

fault_binerrs_j_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_16=fault_binerrs_all$j_16, j_16=fault_binerrs_all$j_16, j_17=fault_binerrs_all$j_17)
results[["j_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_16_treat_df, "Y", "j_16")

fault_binerrs_j_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_19=fault_binerrs_all$j_19, j_19=fault_binerrs_all$j_19, j_20=fault_binerrs_all$j_20)
results[["j_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_19_treat_df, "Y", "j_19")

fault_binerrs_j_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_18=fault_binerrs_all$j_18, j_16=fault_binerrs_all$j_16, j_17=fault_binerrs_all$j_17)
results[["j_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_18_treat_df, "Y", "j_18")

fault_binerrs_jp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_0=fault_binerrs_all$jp_0)
results[["jp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_0_treat_df, "Y", "jp_0")

fault_binerrs_jp_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_2=fault_binerrs_all$jp_2, jp_0=fault_binerrs_all$jp_0, jp_1=fault_binerrs_all$jp_1)
results[["jp_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_2_treat_df, "Y", "jp_2")

fault_binerrs_jp_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_1=fault_binerrs_all$jp_1)
results[["jp_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_1_treat_df, "Y", "jp_1")

fault_binerrs_jp_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_4=fault_binerrs_all$jp_4, jp_3=fault_binerrs_all$jp_3)
results[["jp_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_4_treat_df, "Y", "jp_4")

fault_binerrs_jp_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_3=fault_binerrs_all$jp_3, jp_2=fault_binerrs_all$jp_2)
results[["jp_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_3_treat_df, "Y", "jp_3")

fault_binerrs_AiiJ_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, AiiJ_0=fault_binerrs_all$AiiJ_0)
results[["AiiJ_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_AiiJ_0_treat_df, "Y", "AiiJ_0")

fault_binerrs_k_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_1=fault_binerrs_all$k_1, k_0=fault_binerrs_all$k_0, k_1=fault_binerrs_all$k_1)
results[["k_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_1_treat_df, "Y", "k_1")

fault_binerrs_k_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_0=fault_binerrs_all$k_0, j_12=fault_binerrs_all$j_12)
results[["k_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_0_treat_df, "Y", "k_0")

fault_binerrs_k_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_2=fault_binerrs_all$k_2, k_0=fault_binerrs_all$k_0, k_1=fault_binerrs_all$k_1)
results[["k_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_2_treat_df, "Y", "k_2")

fault_binerrs_N_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_0=fault_binerrs_all$N_0)
results[["N_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_0_treat_df, "Y", "N_0")

fault_binerrs_N_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_2=fault_binerrs_all$N_2)
results[["N_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_2_treat_df, "Y", "N_2")

fault_binerrs_N_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_1=fault_binerrs_all$N_1)
results[["N_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_1_treat_df, "Y", "N_1")

fault_binerrs_N_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_4=fault_binerrs_all$N_4)
results[["N_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_4_treat_df, "Y", "N_4")

fault_binerrs_N_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_3=fault_binerrs_all$N_3)
results[["N_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_3_treat_df, "Y", "N_3")

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_N_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_6=fault_binerrs_all$N_6)
results[["N_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_6_treat_df, "Y", "N_6")

fault_binerrs_N_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_5=fault_binerrs_all$N_5)
results[["N_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_5_treat_df, "Y", "N_5")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_N_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_7=fault_binerrs_all$N_7)
results[["N_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_7_treat_df, "Y", "N_7")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_i_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_16=fault_binerrs_all$i_16, i_15=fault_binerrs_all$i_15, i_16=fault_binerrs_all$i_16)
results[["i_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_16_treat_df, "Y", "i_16")

fault_binerrs_i_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_15=fault_binerrs_all$i_15, i_15=fault_binerrs_all$i_15, i_16=fault_binerrs_all$i_16)
results[["i_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_15_treat_df, "Y", "i_15")

fault_binerrs_remainder_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, remainder_0=fault_binerrs_all$remainder_0, remainder_0=fault_binerrs_all$remainder_0, remainder_0=fault_binerrs_all$remainder_0)
results[["remainder_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_remainder_0_treat_df, "Y", "remainder_0")

fault_binerrs_i_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_18=fault_binerrs_all$i_18, i_18=fault_binerrs_all$i_18, i_19=fault_binerrs_all$i_19)
results[["i_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_18_treat_df, "Y", "i_18")

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_15=fault_binerrs_all$i_15, i_16=fault_binerrs_all$i_16)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19, i_18=fault_binerrs_all$i_18, i_19=fault_binerrs_all$i_19)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_3=fault_binerrs_all$j_3, j_4=fault_binerrs_all$j_4)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5, j_3=fault_binerrs_all$j_3, j_4=fault_binerrs_all$j_4)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8, j_6=fault_binerrs_all$j_6, j_7=fault_binerrs_all$j_7)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7, j_6=fault_binerrs_all$j_6, j_7=fault_binerrs_all$j_7)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9, j_9=fault_binerrs_all$j_9, j_14=fault_binerrs_all$j_14)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_sum_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_3=fault_binerrs_all$sum_3, sum_1=fault_binerrs_all$sum_1, sum_2=fault_binerrs_all$sum_2)
results[["sum_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_3_treat_df, "Y", "sum_3")

fault_binerrs_sum_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_2=fault_binerrs_all$sum_2, sum_1=fault_binerrs_all$sum_1, sum_2=fault_binerrs_all$sum_2)
results[["sum_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_2_treat_df, "Y", "sum_2")

fault_binerrs_sum_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_1=fault_binerrs_all$sum_1, sum_0=fault_binerrs_all$sum_0)
results[["sum_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_1_treat_df, "Y", "sum_1")

fault_binerrs_sum_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_0=fault_binerrs_all$sum_0, ip_0=fault_binerrs_all$ip_0)
results[["sum_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_0_treat_df, "Y", "sum_0")

fault_binerrs_M_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_1=fault_binerrs_all$M_1)
results[["M_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_1_treat_df, "Y", "M_1")

fault_binerrs_ab_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, ab_1=fault_binerrs_all$ab_1, ab_0=fault_binerrs_all$ab_0)
results[["ab_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_ab_1_treat_df, "Y", "ab_1")

fault_binerrs_M_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_0=fault_binerrs_all$M_0)
results[["M_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_0_treat_df, "Y", "M_0")

fault_binerrs_ab_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ab_0=fault_binerrs_all$ab_0)
results[["ab_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ab_0_treat_df, "Y", "ab_0")

fault_binerrs_M_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_3=fault_binerrs_all$M_3)
results[["M_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_3_treat_df, "Y", "M_3")

fault_binerrs_jj_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_0=fault_binerrs_all$jj_0)
results[["jj_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_0_treat_df, "Y", "jj_0")

fault_binerrs_M_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_2=fault_binerrs_all$M_2)
results[["M_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_2_treat_df, "Y", "M_2")

fault_binerrs_jj_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_2=fault_binerrs_all$jj_2, jj_0=fault_binerrs_all$jj_0, jj_1=fault_binerrs_all$jj_1)
results[["jj_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_2_treat_df, "Y", "jj_2")

fault_binerrs_M_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_5=fault_binerrs_all$M_5, M_3=fault_binerrs_all$M_3, M_4=fault_binerrs_all$M_4)
results[["M_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_5_treat_df, "Y", "M_5")

fault_binerrs_M_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_4=fault_binerrs_all$M_4, M_3=fault_binerrs_all$M_3, M_4=fault_binerrs_all$M_4)
results[["M_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_4_treat_df, "Y", "M_4")

fault_binerrs_jj_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_1=fault_binerrs_all$jj_1, jj_0=fault_binerrs_all$jj_0, jj_1=fault_binerrs_all$jj_1)
results[["jj_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_1_treat_df, "Y", "jj_1")

fault_binerrs_M_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_6=fault_binerrs_all$M_6)
results[["M_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_6_treat_df, "Y", "M_6")

fault_binerrs_sum_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_7=fault_binerrs_all$sum_7, sum_5=fault_binerrs_all$sum_5, sum_6=fault_binerrs_all$sum_6)
results[["sum_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_7_treat_df, "Y", "sum_7")

fault_binerrs_lu_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, lu_0=fault_binerrs_all$lu_0)
results[["lu_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_lu_0_treat_df, "Y", "lu_0")

fault_binerrs_sum_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_6=fault_binerrs_all$sum_6, sum_5=fault_binerrs_all$sum_5, sum_6=fault_binerrs_all$sum_6)
results[["sum_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_6_treat_df, "Y", "sum_6")

fault_binerrs_sum_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_5=fault_binerrs_all$sum_5)
results[["sum_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_5_treat_df, "Y", "sum_5")

fault_binerrs_sum_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_4=fault_binerrs_all$sum_4, sum_3=fault_binerrs_all$sum_3, sum_1=fault_binerrs_all$sum_1, sum_1=fault_binerrs_all$sum_1)
results[["sum_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_4_treat_df, "Y", "sum_4")

fault_binerrs_recp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, recp_0=fault_binerrs_all$recp_0, j_12=fault_binerrs_all$j_12, j_12=fault_binerrs_all$j_12)
results[["recp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_recp_0_treat_df, "Y", "recp_0")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_ii_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_0=fault_binerrs_all$ii_0, ii_0=fault_binerrs_all$ii_0, ii_1=fault_binerrs_all$ii_1)
results[["ii_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_0_treat_df, "Y", "ii_0")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_ii_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_2=fault_binerrs_all$ii_2, ii_0=fault_binerrs_all$ii_0, ii_1=fault_binerrs_all$ii_1)
results[["ii_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_2_treat_df, "Y", "ii_2")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_ii_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_1=fault_binerrs_all$ii_1, ii_0=fault_binerrs_all$ii_0, ii_1=fault_binerrs_all$ii_1)
results[["ii_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_1_treat_df, "Y", "ii_1")

fault_binerrs_ii_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_4=fault_binerrs_all$ii_4, ii_3=fault_binerrs_all$ii_3, ii_6=fault_binerrs_all$ii_6)
results[["ii_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_4_treat_df, "Y", "ii_4")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_ii_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_3=fault_binerrs_all$ii_3)
results[["ii_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_3_treat_df, "Y", "ii_3")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20, i_18=fault_binerrs_all$i_18, i_19=fault_binerrs_all$i_19)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_ii_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_6=fault_binerrs_all$ii_6, ii_4=fault_binerrs_all$ii_4, ii_5=fault_binerrs_all$ii_5, ii_4=fault_binerrs_all$ii_4)
results[["ii_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_6_treat_df, "Y", "ii_6")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23, i_21=fault_binerrs_all$i_21, i_22=fault_binerrs_all$i_22)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_ii_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_5=fault_binerrs_all$ii_5)
results[["ii_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_5_treat_df, "Y", "ii_5")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22, i_21=fault_binerrs_all$i_21, i_22=fault_binerrs_all$i_22)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25, i_24=fault_binerrs_all$i_24, i_25=fault_binerrs_all$i_25)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_ii_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_7=fault_binerrs_all$ii_7, ii_3=fault_binerrs_all$ii_3, ii_6=fault_binerrs_all$ii_6)
results[["ii_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_7_treat_df, "Y", "ii_7")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26, i_24=fault_binerrs_all$i_24, i_25=fault_binerrs_all$i_25)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

return(results)

}
