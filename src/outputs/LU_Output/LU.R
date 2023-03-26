genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_minMN_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_2=fault_binerrs_all$minMN_2)
results[["minMN_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_2_treat_df, "Y", "minMN_2")

fault_binerrs_minMN_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_3=fault_binerrs_all$minMN_3, minMN_1=fault_binerrs_all$minMN_1, minMN_2=fault_binerrs_all$minMN_2)
results[["minMN_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_3_treat_df, "Y", "minMN_3")

fault_binerrs_minMN_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_0=fault_binerrs_all$minMN_0, M_5=fault_binerrs_all$M_5, N_12=fault_binerrs_all$N_12)
results[["minMN_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_0_treat_df, "Y", "minMN_0")

fault_binerrs_j_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_20=fault_binerrs_all$j_20, j_19=fault_binerrs_all$j_19)
results[["j_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_20_treat_df, "Y", "j_20")

fault_binerrs_minMN_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, minMN_1=fault_binerrs_all$minMN_1, minMN_1=fault_binerrs_all$minMN_1, minMN_2=fault_binerrs_all$minMN_2)
results[["minMN_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_minMN_1_treat_df, "Y", "minMN_1")

fault_binerrs_j_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_22=fault_binerrs_all$j_22, j_21=fault_binerrs_all$j_21)
results[["j_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_22_treat_df, "Y", "j_22")

fault_binerrs_j_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_21=fault_binerrs_all$j_21, j_20=fault_binerrs_all$j_20)
results[["j_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_21_treat_df, "Y", "j_21")

fault_binerrs_j_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_24=fault_binerrs_all$j_24, j_23=fault_binerrs_all$j_23)
results[["j_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_24_treat_df, "Y", "j_24")

fault_binerrs_j_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_23=fault_binerrs_all$j_23, j_22=fault_binerrs_all$j_22, j_21=fault_binerrs_all$j_21)
results[["j_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_23_treat_df, "Y", "j_23")

fault_binerrs_j_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_26=fault_binerrs_all$j_26)
results[["j_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_26_treat_df, "Y", "j_26")

fault_binerrs_j_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_25=fault_binerrs_all$j_25, j_25=fault_binerrs_all$j_25, j_26=fault_binerrs_all$j_26)
results[["j_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_25_treat_df, "Y", "j_25")

fault_binerrs_j_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_28=fault_binerrs_all$j_28, j_27=fault_binerrs_all$j_27, j_24=fault_binerrs_all$j_24)
results[["j_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_28_treat_df, "Y", "j_28")

fault_binerrs_j_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_27=fault_binerrs_all$j_27, j_25=fault_binerrs_all$j_25, j_26=fault_binerrs_all$j_26)
results[["j_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_27_treat_df, "Y", "j_27")

fault_binerrs_j_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_29=fault_binerrs_all$j_29, j_28=fault_binerrs_all$j_28)
results[["j_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_29_treat_df, "Y", "j_29")

fault_binerrs_i_41_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_41=fault_binerrs_all$i_41)
results[["i_41"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_41_treat_df, "Y", "i_41")

fault_binerrs_Nd_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, Nd_0=fault_binerrs_all$Nd_0, N_0=fault_binerrs_all$N_0)
results[["Nd_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_Nd_0_treat_df, "Y", "Nd_0")

fault_binerrs_i_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_40=fault_binerrs_all$i_40, i_40=fault_binerrs_all$i_40, i_41=fault_binerrs_all$i_41)
results[["i_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_40_treat_df, "Y", "i_40")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11, j_10=fault_binerrs_all$j_10)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_t_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_0=fault_binerrs_all$t_0, t_0=fault_binerrs_all$t_0, t_3=fault_binerrs_all$t_3)
results[["t_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_0_treat_df, "Y", "t_0")

fault_binerrs_i_43_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_43=fault_binerrs_all$i_43)
results[["i_43"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_43_treat_df, "Y", "i_43")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10, remainder_1=fault_binerrs_all$remainder_1)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_i_42_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_42=fault_binerrs_all$i_42, i_40=fault_binerrs_all$i_40, i_41=fault_binerrs_all$i_41)
results[["i_42"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_42_treat_df, "Y", "i_42")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_t_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_2=fault_binerrs_all$t_2, ab_1=fault_binerrs_all$ab_1)
results[["t_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_2_treat_df, "Y", "t_2")

fault_binerrs_i_45_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_45=fault_binerrs_all$i_45, i_45=fault_binerrs_all$i_45, i_46=fault_binerrs_all$i_46)
results[["i_45"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_45_treat_df, "Y", "i_45")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12, j_12=fault_binerrs_all$j_12, j_13=fault_binerrs_all$j_13)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_t_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_1=fault_binerrs_all$t_1)
results[["t_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_1_treat_df, "Y", "t_1")

fault_binerrs_i_44_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_44=fault_binerrs_all$i_44, i_43=fault_binerrs_all$i_43)
results[["i_44"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_44_treat_df, "Y", "i_44")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_t_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_4=fault_binerrs_all$t_4, t_0=fault_binerrs_all$t_0, t_3=fault_binerrs_all$t_3)
results[["t_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_4_treat_df, "Y", "t_4")

fault_binerrs_i_47_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_47=fault_binerrs_all$i_47, i_45=fault_binerrs_all$i_45, i_46=fault_binerrs_all$i_46)
results[["i_47"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_47_treat_df, "Y", "i_47")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_12=fault_binerrs_all$j_12, j_13=fault_binerrs_all$j_13)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_t_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_3=fault_binerrs_all$t_3, t_2=fault_binerrs_all$t_2, t_1=fault_binerrs_all$t_1)
results[["t_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_3_treat_df, "Y", "t_3")

fault_binerrs_ip_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ip_0=fault_binerrs_all$ip_0)
results[["ip_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ip_0_treat_df, "Y", "ip_0")

fault_binerrs_i_46_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_46=fault_binerrs_all$i_46)
results[["i_46"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_46_treat_df, "Y", "i_46")

fault_binerrs_j_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_17=fault_binerrs_all$j_17, j_17=fault_binerrs_all$j_17, j_29=fault_binerrs_all$j_29)
results[["j_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_17_treat_df, "Y", "j_17")

fault_binerrs_j_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_16=fault_binerrs_all$j_16, j_15=fault_binerrs_all$j_15)
results[["j_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_16_treat_df, "Y", "j_16")

fault_binerrs_j_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_19=fault_binerrs_all$j_19, j_18=fault_binerrs_all$j_18)
results[["j_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_19_treat_df, "Y", "j_19")

fault_binerrs_j_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_18=fault_binerrs_all$j_18)
results[["j_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_18_treat_df, "Y", "j_18")

fault_binerrs_j_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_40=fault_binerrs_all$j_40, j_38=fault_binerrs_all$j_38, j_39=fault_binerrs_all$j_39)
results[["j_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_40_treat_df, "Y", "j_40")

fault_binerrs_j_42_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_42=fault_binerrs_all$j_42, j_41=fault_binerrs_all$j_41)
results[["j_42"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_42_treat_df, "Y", "j_42")

fault_binerrs_j_41_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_41=fault_binerrs_all$j_41)
results[["j_41"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_41_treat_df, "Y", "j_41")

fault_binerrs_j_44_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_44=fault_binerrs_all$j_44)
results[["j_44"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_44_treat_df, "Y", "j_44")

fault_binerrs_j_43_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_43=fault_binerrs_all$j_43, j_43=fault_binerrs_all$j_43, j_44=fault_binerrs_all$j_44)
results[["j_43"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_43_treat_df, "Y", "j_43")

fault_binerrs_jp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_0=fault_binerrs_all$jp_0)
results[["jp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_0_treat_df, "Y", "jp_0")

fault_binerrs_j_46_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_46=fault_binerrs_all$j_46)
results[["j_46"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_46_treat_df, "Y", "j_46")

fault_binerrs_j_45_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_45=fault_binerrs_all$j_45, j_43=fault_binerrs_all$j_43, j_44=fault_binerrs_all$j_44)
results[["j_45"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_45_treat_df, "Y", "j_45")

fault_binerrs_jp_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_2=fault_binerrs_all$jp_2, jp_1=fault_binerrs_all$jp_1, jp_0=fault_binerrs_all$jp_0)
results[["jp_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_2_treat_df, "Y", "jp_2")

fault_binerrs_j_48_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_48=fault_binerrs_all$j_48, j_48=fault_binerrs_all$j_48, j_49=fault_binerrs_all$j_49)
results[["j_48"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_48_treat_df, "Y", "j_48")

fault_binerrs_jp_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_1=fault_binerrs_all$jp_1)
results[["jp_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_1_treat_df, "Y", "jp_1")

fault_binerrs_j_47_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_47=fault_binerrs_all$j_47, j_46=fault_binerrs_all$j_46)
results[["j_47"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_47_treat_df, "Y", "j_47")

fault_binerrs_jp_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_4=fault_binerrs_all$jp_4, jp_3=fault_binerrs_all$jp_3)
results[["jp_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_4_treat_df, "Y", "jp_4")

fault_binerrs_jp_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_3=fault_binerrs_all$jp_3, jp_0=fault_binerrs_all$jp_0, jp_2=fault_binerrs_all$jp_2)
results[["jp_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_3_treat_df, "Y", "jp_3")

fault_binerrs_j_49_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_49=fault_binerrs_all$j_49)
results[["j_49"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_49_treat_df, "Y", "j_49")

fault_binerrs_jp_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, jp_5=fault_binerrs_all$jp_5, jp_4=fault_binerrs_all$jp_4)
results[["jp_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_jp_5_treat_df, "Y", "jp_5")

fault_binerrs_AiiJ_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, AiiJ_0=fault_binerrs_all$AiiJ_0)
results[["AiiJ_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_AiiJ_0_treat_df, "Y", "AiiJ_0")

fault_binerrs_k_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_1=fault_binerrs_all$k_1, k_0=fault_binerrs_all$k_0)
results[["k_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_1_treat_df, "Y", "k_1")

fault_binerrs_k_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_0=fault_binerrs_all$k_0, j_21=fault_binerrs_all$j_21)
results[["k_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_0_treat_df, "Y", "k_0")

fault_binerrs_k_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_3=fault_binerrs_all$k_3)
results[["k_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_3_treat_df, "Y", "k_3")

fault_binerrs_k_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_2=fault_binerrs_all$k_2, k_2=fault_binerrs_all$k_2, k_3=fault_binerrs_all$k_3)
results[["k_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_2_treat_df, "Y", "k_2")

fault_binerrs_k_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_4=fault_binerrs_all$k_4, k_2=fault_binerrs_all$k_2, k_3=fault_binerrs_all$k_3)
results[["k_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_4_treat_df, "Y", "k_4")

fault_binerrs_j_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_31=fault_binerrs_all$j_31, ii_6=fault_binerrs_all$ii_6)
results[["j_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_31_treat_df, "Y", "j_31")

fault_binerrs_j_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_30=fault_binerrs_all$j_30, j_17=fault_binerrs_all$j_17, j_29=fault_binerrs_all$j_29)
results[["j_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_30_treat_df, "Y", "j_30")

fault_binerrs_j_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_33=fault_binerrs_all$j_33, j_33=fault_binerrs_all$j_33, j_34=fault_binerrs_all$j_34)
results[["j_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_33_treat_df, "Y", "j_33")

fault_binerrs_j_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_32=fault_binerrs_all$j_32, j_31=fault_binerrs_all$j_31)
results[["j_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_32_treat_df, "Y", "j_32")

fault_binerrs_j_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_35=fault_binerrs_all$j_35, j_33=fault_binerrs_all$j_33, j_34=fault_binerrs_all$j_34)
results[["j_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_35_treat_df, "Y", "j_35")

fault_binerrs_ii_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_10=fault_binerrs_all$ii_10, ii_5=fault_binerrs_all$ii_5, ii_9=fault_binerrs_all$ii_9)
results[["ii_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_10_treat_df, "Y", "ii_10")

fault_binerrs_j_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_34=fault_binerrs_all$j_34)
results[["j_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_34_treat_df, "Y", "j_34")

fault_binerrs_j_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_37=fault_binerrs_all$j_37, j_36=fault_binerrs_all$j_36)
results[["j_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_37_treat_df, "Y", "j_37")

fault_binerrs_j_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_36=fault_binerrs_all$j_36)
results[["j_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_36_treat_df, "Y", "j_36")

fault_binerrs_j_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_39=fault_binerrs_all$j_39)
results[["j_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_39_treat_df, "Y", "j_39")

fault_binerrs_j_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_38=fault_binerrs_all$j_38, j_38=fault_binerrs_all$j_38, j_39=fault_binerrs_all$j_39)
results[["j_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_38_treat_df, "Y", "j_38")

fault_binerrs_M_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_13=fault_binerrs_all$M_13)
results[["M_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_13_treat_df, "Y", "M_13")

fault_binerrs_M_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_14=fault_binerrs_all$M_14, M_13=fault_binerrs_all$M_13)
results[["M_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_14_treat_df, "Y", "M_14")

fault_binerrs_M_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_10=fault_binerrs_all$M_10, M_9=fault_binerrs_all$M_9)
results[["M_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_10_treat_df, "Y", "M_10")

fault_binerrs_M_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_11=fault_binerrs_all$M_11, M_10=fault_binerrs_all$M_10, M_9=fault_binerrs_all$M_9)
results[["M_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_11_treat_df, "Y", "M_11")

fault_binerrs_M_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_12=fault_binerrs_all$M_12, M_5=fault_binerrs_all$M_5, M_11=fault_binerrs_all$M_11)
results[["M_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_12_treat_df, "Y", "M_12")

fault_binerrs_N_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_0=fault_binerrs_all$N_0)
results[["N_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_0_treat_df, "Y", "N_0")

fault_binerrs_N_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_2=fault_binerrs_all$N_2, N_1=fault_binerrs_all$N_1)
results[["N_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_2_treat_df, "Y", "N_2")

fault_binerrs_N_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_1=fault_binerrs_all$N_1)
results[["N_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_1_treat_df, "Y", "N_1")

fault_binerrs_N_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_4=fault_binerrs_all$N_4)
results[["N_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_4_treat_df, "Y", "N_4")

fault_binerrs_remainder_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, remainder_2=fault_binerrs_all$remainder_2, remainder_1=fault_binerrs_all$remainder_1)
results[["remainder_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_remainder_2_treat_df, "Y", "remainder_2")

fault_binerrs_N_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_3=fault_binerrs_all$N_3, N_3=fault_binerrs_all$N_3, N_4=fault_binerrs_all$N_4)
results[["N_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_3_treat_df, "Y", "N_3")

fault_binerrs_remainder_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, remainder_3=fault_binerrs_all$remainder_3, remainder_0=fault_binerrs_all$remainder_0, remainder_2=fault_binerrs_all$remainder_2)
results[["remainder_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_remainder_3_treat_df, "Y", "remainder_3")

fault_binerrs_N_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_6=fault_binerrs_all$N_6)
results[["N_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_6_treat_df, "Y", "N_6")

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_N_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_5=fault_binerrs_all$N_5, N_3=fault_binerrs_all$N_3, N_4=fault_binerrs_all$N_4)
results[["N_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_5_treat_df, "Y", "N_5")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_N_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_8=fault_binerrs_all$N_8, N_8=fault_binerrs_all$N_8, N_9=fault_binerrs_all$N_9)
results[["N_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_8_treat_df, "Y", "N_8")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_10=fault_binerrs_all$i_10)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_N_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_7=fault_binerrs_all$N_7, N_6=fault_binerrs_all$N_6)
results[["N_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_7_treat_df, "Y", "N_7")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_N_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_9=fault_binerrs_all$N_9)
results[["N_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_9_treat_df, "Y", "N_9")

fault_binerrs_i_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_16=fault_binerrs_all$i_16, i_15=fault_binerrs_all$i_15)
results[["i_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_16_treat_df, "Y", "i_16")

fault_binerrs_i_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_15=fault_binerrs_all$i_15)
results[["i_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_15_treat_df, "Y", "i_15")

fault_binerrs_remainder_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, remainder_0=fault_binerrs_all$remainder_0, remainder_0=fault_binerrs_all$remainder_0, remainder_2=fault_binerrs_all$remainder_2)
results[["remainder_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_remainder_0_treat_df, "Y", "remainder_0")

fault_binerrs_i_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_18=fault_binerrs_all$i_18)
results[["i_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_18_treat_df, "Y", "i_18")

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_17=fault_binerrs_all$i_17, i_18=fault_binerrs_all$i_18)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_remainder_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, remainder_1=fault_binerrs_all$remainder_1)
results[["remainder_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_remainder_1_treat_df, "Y", "remainder_1")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19, i_17=fault_binerrs_all$i_17, i_18=fault_binerrs_all$i_18)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_N_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_14=fault_binerrs_all$N_14, N_12=fault_binerrs_all$N_12, N_13=fault_binerrs_all$N_13)
results[["N_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_14_treat_df, "Y", "N_14")

fault_binerrs_N_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_15=fault_binerrs_all$N_15, N_14=fault_binerrs_all$N_14, N_12=fault_binerrs_all$N_12)
results[["N_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_15_treat_df, "Y", "N_15")

fault_binerrs_N_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_16=fault_binerrs_all$N_16, N_12=fault_binerrs_all$N_12, N_15=fault_binerrs_all$N_15)
results[["N_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_16_treat_df, "Y", "N_16")

fault_binerrs_N_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_17=fault_binerrs_all$N_17)
results[["N_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_17_treat_df, "Y", "N_17")

fault_binerrs_N_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_10=fault_binerrs_all$N_10, N_8=fault_binerrs_all$N_8, N_9=fault_binerrs_all$N_9)
results[["N_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_10_treat_df, "Y", "N_10")

fault_binerrs_N_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_11=fault_binerrs_all$N_11)
results[["N_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_11_treat_df, "Y", "N_11")

fault_binerrs_N_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_12=fault_binerrs_all$N_12, N_12=fault_binerrs_all$N_12, N_13=fault_binerrs_all$N_13)
results[["N_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_12_treat_df, "Y", "N_12")

fault_binerrs_N_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_13=fault_binerrs_all$N_13)
results[["N_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_13_treat_df, "Y", "N_13")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_2=fault_binerrs_all$j_2, j_3=fault_binerrs_all$j_3)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_N_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_18=fault_binerrs_all$N_18, N_18=fault_binerrs_all$N_18, N_19=fault_binerrs_all$N_19)
results[["N_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_18_treat_df, "Y", "N_18")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_N_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_19=fault_binerrs_all$N_19)
results[["N_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_19_treat_df, "Y", "N_19")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_2=fault_binerrs_all$j_2, j_3=fault_binerrs_all$j_3)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6, j_5=fault_binerrs_all$j_5)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_j_50_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_50=fault_binerrs_all$j_50, j_48=fault_binerrs_all$j_48, j_49=fault_binerrs_all$j_49)
results[["j_50"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_50_treat_df, "Y", "j_50")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7, j_7=fault_binerrs_all$j_7, j_8=fault_binerrs_all$j_8)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9, j_7=fault_binerrs_all$j_7, j_8=fault_binerrs_all$j_8)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_sum_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_3=fault_binerrs_all$sum_3, sum_1=fault_binerrs_all$sum_1, sum_2=fault_binerrs_all$sum_2)
results[["sum_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_3_treat_df, "Y", "sum_3")

fault_binerrs_sum_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_2=fault_binerrs_all$sum_2)
results[["sum_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_2_treat_df, "Y", "sum_2")

fault_binerrs_sum_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_1=fault_binerrs_all$sum_1, sum_1=fault_binerrs_all$sum_1, sum_2=fault_binerrs_all$sum_2)
results[["sum_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_1_treat_df, "Y", "sum_1")

fault_binerrs_sum_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_0=fault_binerrs_all$sum_0, ip_0=fault_binerrs_all$ip_0)
results[["sum_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_0_treat_df, "Y", "sum_0")

fault_binerrs_M_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_1=fault_binerrs_all$M_1, M_0=fault_binerrs_all$M_0)
results[["M_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_1_treat_df, "Y", "M_1")

fault_binerrs_ab_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, ab_1=fault_binerrs_all$ab_1, ab_0=fault_binerrs_all$ab_0)
results[["ab_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_ab_1_treat_df, "Y", "ab_1")

fault_binerrs_M_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_0=fault_binerrs_all$M_0)
results[["M_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_0_treat_df, "Y", "M_0")

fault_binerrs_ab_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ab_0=fault_binerrs_all$ab_0)
results[["ab_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ab_0_treat_df, "Y", "ab_0")

fault_binerrs_M_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_3=fault_binerrs_all$M_3, M_2=fault_binerrs_all$M_2)
results[["M_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_3_treat_df, "Y", "M_3")

fault_binerrs_jj_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_0=fault_binerrs_all$jj_0)
results[["jj_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_0_treat_df, "Y", "jj_0")

fault_binerrs_M_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_2=fault_binerrs_all$M_2)
results[["M_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_2_treat_df, "Y", "M_2")

fault_binerrs_M_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_5=fault_binerrs_all$M_5, M_5=fault_binerrs_all$M_5, M_11=fault_binerrs_all$M_11)
results[["M_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_5_treat_df, "Y", "M_5")

fault_binerrs_jj_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_2=fault_binerrs_all$jj_2, jj_2=fault_binerrs_all$jj_2, jj_3=fault_binerrs_all$jj_3)
results[["jj_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_2_treat_df, "Y", "jj_2")

fault_binerrs_i_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_30=fault_binerrs_all$i_30)
results[["i_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_30_treat_df, "Y", "i_30")

fault_binerrs_M_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_4=fault_binerrs_all$M_4)
results[["M_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_4_treat_df, "Y", "M_4")

fault_binerrs_jj_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_1=fault_binerrs_all$jj_1, jj_0=fault_binerrs_all$jj_0)
results[["jj_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_1_treat_df, "Y", "jj_1")

fault_binerrs_M_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_7=fault_binerrs_all$M_7, M_6=fault_binerrs_all$M_6)
results[["M_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_7_treat_df, "Y", "M_7")

fault_binerrs_jj_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_4=fault_binerrs_all$jj_4, jj_2=fault_binerrs_all$jj_2, jj_3=fault_binerrs_all$jj_3)
results[["jj_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_4_treat_df, "Y", "jj_4")

fault_binerrs_i_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_32=fault_binerrs_all$i_32, N_17=fault_binerrs_all$N_17)
results[["i_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_32_treat_df, "Y", "i_32")

fault_binerrs_M_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_6=fault_binerrs_all$M_6)
results[["M_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_6_treat_df, "Y", "M_6")

fault_binerrs_jj_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_3=fault_binerrs_all$jj_3)
results[["jj_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_3_treat_df, "Y", "jj_3")

fault_binerrs_i_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_31=fault_binerrs_all$i_31, i_27=fault_binerrs_all$i_27, i_30=fault_binerrs_all$i_30)
results[["i_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_31_treat_df, "Y", "i_31")

fault_binerrs_M_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_9=fault_binerrs_all$M_9, M_8=fault_binerrs_all$M_8, M_7=fault_binerrs_all$M_7)
results[["M_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_9_treat_df, "Y", "M_9")

fault_binerrs_i_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_34=fault_binerrs_all$i_34, i_34=fault_binerrs_all$i_34, i_36=fault_binerrs_all$i_36)
results[["i_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_34_treat_df, "Y", "i_34")

fault_binerrs_M_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, M_8=fault_binerrs_all$M_8, M_7=fault_binerrs_all$M_7)
results[["M_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_M_8_treat_df, "Y", "M_8")

fault_binerrs_i_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_33=fault_binerrs_all$i_33, i_32=fault_binerrs_all$i_32)
results[["i_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_33_treat_df, "Y", "i_33")

fault_binerrs_sum_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_7=fault_binerrs_all$sum_7, sum_5=fault_binerrs_all$sum_5, sum_6=fault_binerrs_all$sum_6)
results[["sum_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_7_treat_df, "Y", "sum_7")

fault_binerrs_i_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_36=fault_binerrs_all$i_36, i_35=fault_binerrs_all$i_35)
results[["i_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_36_treat_df, "Y", "i_36")

fault_binerrs_lu_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, lu_0=fault_binerrs_all$lu_0)
results[["lu_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_lu_0_treat_df, "Y", "lu_0")

fault_binerrs_i_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_35=fault_binerrs_all$i_35)
results[["i_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_35_treat_df, "Y", "i_35")

fault_binerrs_sum_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_6=fault_binerrs_all$sum_6)
results[["sum_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_6_treat_df, "Y", "sum_6")

fault_binerrs_sum_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_5=fault_binerrs_all$sum_5, sum_5=fault_binerrs_all$sum_5, sum_6=fault_binerrs_all$sum_6)
results[["sum_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_5_treat_df, "Y", "sum_5")

fault_binerrs_i_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_38=fault_binerrs_all$i_38)
results[["i_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_38_treat_df, "Y", "i_38")

fault_binerrs_sum_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_4=fault_binerrs_all$sum_4, sum_3=fault_binerrs_all$sum_3, sum_1=fault_binerrs_all$sum_1, sum_1=fault_binerrs_all$sum_1)
results[["sum_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_4_treat_df, "Y", "sum_4")

fault_binerrs_i_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_37=fault_binerrs_all$i_37, i_34=fault_binerrs_all$i_34, i_36=fault_binerrs_all$i_36)
results[["i_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_37_treat_df, "Y", "i_37")

fault_binerrs_i_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_39=fault_binerrs_all$i_39, i_38=fault_binerrs_all$i_38)
results[["i_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_39_treat_df, "Y", "i_39")

fault_binerrs_recp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, recp_0=fault_binerrs_all$recp_0, j_21=fault_binerrs_all$j_21, j_21=fault_binerrs_all$j_21)
results[["recp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_recp_0_treat_df, "Y", "recp_0")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_ii_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_0=fault_binerrs_all$ii_0, j_24=fault_binerrs_all$j_24)
results[["ii_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_0_treat_df, "Y", "ii_0")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_5=fault_binerrs_all$i_5)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_ii_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_2=fault_binerrs_all$ii_2, ii_2=fault_binerrs_all$ii_2, ii_3=fault_binerrs_all$ii_3)
results[["ii_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_2_treat_df, "Y", "ii_2")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_ii_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_1=fault_binerrs_all$ii_1, ii_0=fault_binerrs_all$ii_0)
results[["ii_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_1_treat_df, "Y", "ii_1")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21, i_20=fault_binerrs_all$i_20)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_ii_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_4=fault_binerrs_all$ii_4, ii_2=fault_binerrs_all$ii_2, ii_3=fault_binerrs_all$ii_3)
results[["ii_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_4_treat_df, "Y", "ii_4")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_ii_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_3=fault_binerrs_all$ii_3)
results[["ii_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_3_treat_df, "Y", "ii_3")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_ii_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_6=fault_binerrs_all$ii_6)
results[["ii_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_6_treat_df, "Y", "ii_6")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22, i_22=fault_binerrs_all$i_22, i_23=fault_binerrs_all$i_23)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_ii_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_5=fault_binerrs_all$ii_5, ii_5=fault_binerrs_all$ii_5, ii_9=fault_binerrs_all$ii_9)
results[["ii_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_5_treat_df, "Y", "ii_5")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_ii_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_8=fault_binerrs_all$ii_8)
results[["ii_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_8_treat_df, "Y", "ii_8")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24, i_22=fault_binerrs_all$i_22, i_23=fault_binerrs_all$i_23)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_ii_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_7=fault_binerrs_all$ii_7, ii_6=fault_binerrs_all$ii_6)
results[["ii_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_7_treat_df, "Y", "ii_7")

fault_binerrs_i_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_27=fault_binerrs_all$i_27, i_27=fault_binerrs_all$i_27, i_30=fault_binerrs_all$i_30)
results[["i_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_27_treat_df, "Y", "i_27")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26, i_25=fault_binerrs_all$i_25)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

fault_binerrs_ii_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_9=fault_binerrs_all$ii_9, ii_7=fault_binerrs_all$ii_7, ii_8=fault_binerrs_all$ii_8, ii_6=fault_binerrs_all$ii_6)
results[["ii_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_9_treat_df, "Y", "ii_9")

fault_binerrs_N_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_20=fault_binerrs_all$N_20, N_18=fault_binerrs_all$N_18, N_19=fault_binerrs_all$N_19)
results[["N_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_20_treat_df, "Y", "N_20")

fault_binerrs_i_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_29=fault_binerrs_all$i_29, i_29=fault_binerrs_all$i_29, i_30=fault_binerrs_all$i_30)
results[["i_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_29_treat_df, "Y", "i_29")

fault_binerrs_i_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_28=fault_binerrs_all$i_28)
results[["i_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_28_treat_df, "Y", "i_28")

return(results)

}
