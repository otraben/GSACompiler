genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_i_50_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_50=fault_binerrs_all$i_50, i_48=fault_binerrs_all$i_48, i_49=fault_binerrs_all$i_49)
results[["i_50"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_50_treat_df, "Y", "i_50")

fault_binerrs_i_52_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_52=fault_binerrs_all$i_52, i_38=fault_binerrs_all$i_38, i_52=fault_binerrs_all$i_52)
results[["i_52"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_52_treat_df, "Y", "i_52")

fault_binerrs_j_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_20=fault_binerrs_all$j_20, j_18=fault_binerrs_all$j_18, j_20=fault_binerrs_all$j_20)
results[["j_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_20_treat_df, "Y", "j_20")

fault_binerrs_i_51_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_51=fault_binerrs_all$i_51)
results[["i_51"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_51_treat_df, "Y", "i_51")

fault_binerrs_i_54_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_54=fault_binerrs_all$i_54)
results[["i_54"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_54_treat_df, "Y", "i_54")

fault_binerrs_j_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_22=fault_binerrs_all$j_22, j_21=fault_binerrs_all$j_21, j_24=fault_binerrs_all$j_24)
results[["j_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_22_treat_df, "Y", "j_22")

fault_binerrs_i_53_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_53=fault_binerrs_all$i_53, i_51=fault_binerrs_all$i_51, i_52=fault_binerrs_all$i_52)
results[["i_53"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_53_treat_df, "Y", "i_53")

fault_binerrs_j_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_21=fault_binerrs_all$j_21, j_19=fault_binerrs_all$j_19, j_20=fault_binerrs_all$j_20)
results[["j_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_21_treat_df, "Y", "j_21")

fault_binerrs_wantu_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_0=fault_binerrs_all$wantu_0)
results[["wantu_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_0_treat_df, "Y", "wantu_0")

fault_binerrs_i_56_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_56=fault_binerrs_all$i_56, i_54=fault_binerrs_all$i_54, i_55=fault_binerrs_all$i_55)
results[["i_56"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_56_treat_df, "Y", "i_56")

fault_binerrs_j_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_24=fault_binerrs_all$j_24, j_23=fault_binerrs_all$j_23)
results[["j_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_24_treat_df, "Y", "j_24")

fault_binerrs_wantu_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_1=fault_binerrs_all$wantu_1, wantu_0=fault_binerrs_all$wantu_0, wantu_1=fault_binerrs_all$wantu_1)
results[["wantu_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_1_treat_df, "Y", "wantu_1")

fault_binerrs_i_55_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_55=fault_binerrs_all$i_55, i_38=fault_binerrs_all$i_38, i_55=fault_binerrs_all$i_55)
results[["i_55"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_55_treat_df, "Y", "i_55")

fault_binerrs_j_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_23=fault_binerrs_all$j_23, j_21=fault_binerrs_all$j_21, j_24=fault_binerrs_all$j_24)
results[["j_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_23_treat_df, "Y", "j_23")

fault_binerrs_wantu_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_2=fault_binerrs_all$wantu_2, wantu_0=fault_binerrs_all$wantu_0, wantu_1=fault_binerrs_all$wantu_1)
results[["wantu_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_2_treat_df, "Y", "wantu_2")

fault_binerrs_i_58_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_58=fault_binerrs_all$i_58, i_56=fault_binerrs_all$i_56, i_58=fault_binerrs_all$i_58)
results[["i_58"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_58_treat_df, "Y", "i_58")

fault_binerrs_j_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_26=fault_binerrs_all$j_26, j_21=fault_binerrs_all$j_21, j_27=fault_binerrs_all$j_27)
results[["j_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_26_treat_df, "Y", "j_26")

fault_binerrs_X_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, X_0=fault_binerrs_all$X_0)
results[["X_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_X_0_treat_df, "Y", "X_0")

fault_binerrs_wantu_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_3=fault_binerrs_all$wantu_3, wantu_2=fault_binerrs_all$wantu_2)
results[["wantu_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_3_treat_df, "Y", "wantu_3")

fault_binerrs_i_57_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_57=fault_binerrs_all$i_57, i_56=fault_binerrs_all$i_56, i_58=fault_binerrs_all$i_58)
results[["i_57"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_57_treat_df, "Y", "i_57")

fault_binerrs_j_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_25=fault_binerrs_all$j_25, j_22=fault_binerrs_all$j_22, j_24=fault_binerrs_all$j_24)
results[["j_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_25_treat_df, "Y", "j_25")

fault_binerrs_wantu_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_4=fault_binerrs_all$wantu_4, wantu_3=fault_binerrs_all$wantu_3, wantu_4=fault_binerrs_all$wantu_4)
results[["wantu_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_4_treat_df, "Y", "wantu_4")

fault_binerrs_j_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_28=fault_binerrs_all$j_28, j_26=fault_binerrs_all$j_26, j_27=fault_binerrs_all$j_27)
results[["j_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_28_treat_df, "Y", "j_28")

fault_binerrs_cs_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, cs_3=fault_binerrs_all$cs_3, f_8=fault_binerrs_all$f_8, t_27=fault_binerrs_all$t_27)
results[["cs_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_cs_3_treat_df, "Y", "cs_3")

fault_binerrs_i_59_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_59=fault_binerrs_all$i_59, i_57=fault_binerrs_all$i_57, i_58=fault_binerrs_all$i_58)
results[["i_59"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_59_treat_df, "Y", "i_59")

fault_binerrs_j_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_27=fault_binerrs_all$j_27, j_21=fault_binerrs_all$j_21, j_27=fault_binerrs_all$j_27)
results[["j_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_27_treat_df, "Y", "j_27")

fault_binerrs_wantu_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_5=fault_binerrs_all$wantu_5, wantu_3=fault_binerrs_all$wantu_3, wantu_4=fault_binerrs_all$wantu_4)
results[["wantu_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_5_treat_df, "Y", "wantu_5")

fault_binerrs_cs_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, cs_1=fault_binerrs_all$cs_1, t_19=fault_binerrs_all$t_19)
results[["cs_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_cs_1_treat_df, "Y", "cs_1")

fault_binerrs_wantu_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_6=fault_binerrs_all$wantu_6, wantu_5=fault_binerrs_all$wantu_5, wantu_6=fault_binerrs_all$wantu_6)
results[["wantu_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_6_treat_df, "Y", "wantu_6")

fault_binerrs_j_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_29=fault_binerrs_all$j_29, k_46=fault_binerrs_all$k_46)
results[["j_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_29_treat_df, "Y", "j_29")

fault_binerrs_cs_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, cs_2=fault_binerrs_all$cs_2, t_23=fault_binerrs_all$t_23)
results[["cs_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_cs_2_treat_df, "Y", "cs_2")

fault_binerrs_wantu_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_7=fault_binerrs_all$wantu_7, wantu_5=fault_binerrs_all$wantu_5, wantu_6=fault_binerrs_all$wantu_6)
results[["wantu_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_7_treat_df, "Y", "wantu_7")

fault_binerrs_wantu_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_8=fault_binerrs_all$wantu_8, wantu_7=fault_binerrs_all$wantu_7, wantu_8=fault_binerrs_all$wantu_8)
results[["wantu_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_8_treat_df, "Y", "wantu_8")

fault_binerrs_cs_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, cs_0=fault_binerrs_all$cs_0, t_15=fault_binerrs_all$t_15)
results[["cs_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_cs_0_treat_df, "Y", "cs_0")

fault_binerrs_wantu_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_9=fault_binerrs_all$wantu_9, wantu_7=fault_binerrs_all$wantu_7, wantu_8=fault_binerrs_all$wantu_8)
results[["wantu_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_9_treat_df, "Y", "wantu_9")

fault_binerrs_p_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_0=fault_binerrs_all$p_0)
results[["p_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_0_treat_df, "Y", "p_0")

fault_binerrs_p_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_2=fault_binerrs_all$p_2, p_2=fault_binerrs_all$p_2, p_7=fault_binerrs_all$p_7)
results[["p_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_2_treat_df, "Y", "p_2")

fault_binerrs_i_41_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_41=fault_binerrs_all$i_41, i_39=fault_binerrs_all$i_39, i_40=fault_binerrs_all$i_40)
results[["i_41"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_41_treat_df, "Y", "i_41")

fault_binerrs_p_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_1=fault_binerrs_all$p_1, p_0=fault_binerrs_all$p_0)
results[["p_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_1_treat_df, "Y", "p_1")

fault_binerrs_i_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_40=fault_binerrs_all$i_40, i_38=fault_binerrs_all$i_38, i_40=fault_binerrs_all$i_40)
results[["i_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_40_treat_df, "Y", "i_40")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11, j_10=fault_binerrs_all$j_10, j_12=fault_binerrs_all$j_12)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_i_43_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_43=fault_binerrs_all$i_43, i_38=fault_binerrs_all$i_38, i_43=fault_binerrs_all$i_43)
results[["i_43"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_43_treat_df, "Y", "i_43")

fault_binerrs_p_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_4=fault_binerrs_all$p_4, p_3=fault_binerrs_all$p_3)
results[["p_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_4_treat_df, "Y", "p_4")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10, j_9=fault_binerrs_all$j_9, j_2=fault_binerrs_all$j_2)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_i_42_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_42=fault_binerrs_all$i_42, i_38=fault_binerrs_all$i_38, i_43=fault_binerrs_all$i_43)
results[["i_42"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_42_treat_df, "Y", "i_42")

fault_binerrs_p_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_3=fault_binerrs_all$p_3, p_2=fault_binerrs_all$p_2, p_7=fault_binerrs_all$p_7)
results[["p_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_3_treat_df, "Y", "p_3")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13, j_11=fault_binerrs_all$j_11, j_12=fault_binerrs_all$j_12)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_i_45_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_45=fault_binerrs_all$i_45)
results[["i_45"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_45_treat_df, "Y", "i_45")

fault_binerrs_p_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_6=fault_binerrs_all$p_6, p_5=fault_binerrs_all$p_5)
results[["p_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_6_treat_df, "Y", "p_6")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12, j_10=fault_binerrs_all$j_10, j_12=fault_binerrs_all$j_12)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_i_44_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_44=fault_binerrs_all$i_44, i_42=fault_binerrs_all$i_42, i_43=fault_binerrs_all$i_43)
results[["i_44"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_44_treat_df, "Y", "i_44")

fault_binerrs_p_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_5=fault_binerrs_all$p_5, p_3=fault_binerrs_all$p_3, p_4=fault_binerrs_all$p_4)
results[["p_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_5_treat_df, "Y", "p_5")

fault_binerrs_i_47_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_47=fault_binerrs_all$i_47, i_45=fault_binerrs_all$i_45, i_46=fault_binerrs_all$i_46)
results[["i_47"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_47_treat_df, "Y", "i_47")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15, j_10=fault_binerrs_all$j_10, j_15=fault_binerrs_all$j_15)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_p_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_8=fault_binerrs_all$p_8, p_5=fault_binerrs_all$p_5, p_7=fault_binerrs_all$p_7)
results[["p_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_8_treat_df, "Y", "p_8")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_10=fault_binerrs_all$j_10, j_14=fault_binerrs_all$j_14)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_i_46_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_46=fault_binerrs_all$i_46, i_38=fault_binerrs_all$i_38, i_46=fault_binerrs_all$i_46)
results[["i_46"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_46_treat_df, "Y", "i_46")

fault_binerrs_p_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, p_7=fault_binerrs_all$p_7, p_5=fault_binerrs_all$p_5, p_6=fault_binerrs_all$p_6, p_5=fault_binerrs_all$p_5)
results[["p_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_p_7_treat_df, "Y", "p_7")

fault_binerrs_i_49_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_49=fault_binerrs_all$i_49, i_38=fault_binerrs_all$i_38, i_49=fault_binerrs_all$i_49)
results[["i_49"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_49_treat_df, "Y", "i_49")

fault_binerrs_j_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_17=fault_binerrs_all$j_17, j_16=fault_binerrs_all$j_16, j_13=fault_binerrs_all$j_13)
results[["j_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_17_treat_df, "Y", "j_17")

fault_binerrs_j_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_16=fault_binerrs_all$j_16, j_14=fault_binerrs_all$j_14, j_15=fault_binerrs_all$j_15)
results[["j_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_16_treat_df, "Y", "j_16")

fault_binerrs_i_48_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_48=fault_binerrs_all$i_48, k_21=fault_binerrs_all$k_21)
results[["i_48"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_48_treat_df, "Y", "i_48")

fault_binerrs_j_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_19=fault_binerrs_all$j_19, j_18=fault_binerrs_all$j_18, j_19=fault_binerrs_all$j_19)
results[["j_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_19_treat_df, "Y", "j_19")

fault_binerrs_j_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_18=fault_binerrs_all$j_18, j_13=fault_binerrs_all$j_13, j_17=fault_binerrs_all$j_17)
results[["j_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_18_treat_df, "Y", "j_18")

fault_binerrs_t_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_36=fault_binerrs_all$t_36, t_34=fault_binerrs_all$t_34, t_35=fault_binerrs_all$t_35)
results[["t_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_36_treat_df, "Y", "t_36")

fault_binerrs_t_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_37=fault_binerrs_all$t_37, t_36=fault_binerrs_all$t_36, t_34=fault_binerrs_all$t_34)
results[["t_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_37_treat_df, "Y", "t_37")

fault_binerrs_t_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_34=fault_binerrs_all$t_34, t_33=fault_binerrs_all$t_33, t_31=fault_binerrs_all$t_31)
results[["t_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_34_treat_df, "Y", "t_34")

fault_binerrs_t_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_35=fault_binerrs_all$t_35)
results[["t_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_35_treat_df, "Y", "t_35")

fault_binerrs_sk_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sk_0=fault_binerrs_all$sk_0, k_46=fault_binerrs_all$k_46, scale_0=fault_binerrs_all$scale_0)
results[["sk_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sk_0_treat_df, "Y", "sk_0")

fault_binerrs_t_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_32=fault_binerrs_all$t_32)
results[["t_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_32_treat_df, "Y", "t_32")

fault_binerrs_t_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_33=fault_binerrs_all$t_33, t_31=fault_binerrs_all$t_31, t_32=fault_binerrs_all$t_32)
results[["t_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_33_treat_df, "Y", "t_33")

fault_binerrs_t_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_30=fault_binerrs_all$t_30, t_29=fault_binerrs_all$t_29, t_27=fault_binerrs_all$t_27)
results[["t_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_30_treat_df, "Y", "t_30")

fault_binerrs_t_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_31=fault_binerrs_all$t_31, k_53=fault_binerrs_all$k_53)
results[["t_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_31_treat_df, "Y", "t_31")

fault_binerrs_i_72_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_72=fault_binerrs_all$i_72, i_65=fault_binerrs_all$i_65, i_73=fault_binerrs_all$i_73)
results[["i_72"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_72_treat_df, "Y", "i_72")

fault_binerrs_k_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_10=fault_binerrs_all$k_10, k_9=fault_binerrs_all$k_9)
results[["k_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_10_treat_df, "Y", "k_10")

fault_binerrs_i_71_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_71=fault_binerrs_all$i_71, i_69=fault_binerrs_all$i_69, i_70=fault_binerrs_all$i_70)
results[["i_71"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_71_treat_df, "Y", "i_71")

fault_binerrs_i_74_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_74=fault_binerrs_all$i_74, i_72=fault_binerrs_all$i_72, i_73=fault_binerrs_all$i_73)
results[["i_74"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_74_treat_df, "Y", "i_74")

fault_binerrs_i_73_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_73=fault_binerrs_all$i_73, i_65=fault_binerrs_all$i_65, i_73=fault_binerrs_all$i_73)
results[["i_73"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_73_treat_df, "Y", "i_73")

fault_binerrs_k_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_13=fault_binerrs_all$k_13, k_12=fault_binerrs_all$k_12)
results[["k_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_13_treat_df, "Y", "k_13")

fault_binerrs_i_76_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_76=fault_binerrs_all$i_76, i_65=fault_binerrs_all$i_65, i_76=fault_binerrs_all$i_76)
results[["i_76"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_76_treat_df, "Y", "i_76")

fault_binerrs_k_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_14=fault_binerrs_all$k_14, k_13=fault_binerrs_all$k_13, k_12=fault_binerrs_all$k_12)
results[["k_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_14_treat_df, "Y", "k_14")

fault_binerrs_i_75_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_75=fault_binerrs_all$i_75, i_65=fault_binerrs_all$i_65, i_76=fault_binerrs_all$i_76)
results[["i_75"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_75_treat_df, "Y", "i_75")

fault_binerrs_k_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_11=fault_binerrs_all$k_11, k_10=fault_binerrs_all$k_10)
results[["k_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_11_treat_df, "Y", "k_11")

fault_binerrs_i_78_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_78=fault_binerrs_all$i_78)
results[["i_78"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_78_treat_df, "Y", "i_78")

fault_binerrs_wantv_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_0=fault_binerrs_all$wantv_0)
results[["wantv_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_0_treat_df, "Y", "wantv_0")

fault_binerrs_k_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_12=fault_binerrs_all$k_12, k_11=fault_binerrs_all$k_11)
results[["k_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_12_treat_df, "Y", "k_12")

fault_binerrs_i_77_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_77=fault_binerrs_all$i_77, i_75=fault_binerrs_all$i_75, i_76=fault_binerrs_all$i_76)
results[["i_77"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_77_treat_df, "Y", "i_77")

fault_binerrs_wantv_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_1=fault_binerrs_all$wantv_1, wantv_0=fault_binerrs_all$wantv_0, wantv_2=fault_binerrs_all$wantv_2)
results[["wantv_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_1_treat_df, "Y", "wantv_1")

fault_binerrs_k_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_17=fault_binerrs_all$k_17, k_16=fault_binerrs_all$k_16, k_11=fault_binerrs_all$k_11)
results[["k_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_17_treat_df, "Y", "k_17")

fault_binerrs_wantv_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_2=fault_binerrs_all$wantv_2, wantv_1=fault_binerrs_all$wantv_1, wantv_0=fault_binerrs_all$wantv_0)
results[["wantv_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_2_treat_df, "Y", "wantv_2")

fault_binerrs_k_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_18=fault_binerrs_all$k_18, k_17=fault_binerrs_all$k_17)
results[["k_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_18_treat_df, "Y", "k_18")

fault_binerrs_i_79_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_79=fault_binerrs_all$i_79, i_65=fault_binerrs_all$i_65, i_79=fault_binerrs_all$i_79)
results[["i_79"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_79_treat_df, "Y", "i_79")

fault_binerrs_k_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_15=fault_binerrs_all$k_15, k_14=fault_binerrs_all$k_14)
results[["k_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_15_treat_df, "Y", "k_15")

fault_binerrs_wantv_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_3=fault_binerrs_all$wantv_3, wantv_0=fault_binerrs_all$wantv_0, wantv_2=fault_binerrs_all$wantv_2)
results[["wantv_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_3_treat_df, "Y", "wantv_3")

fault_binerrs_k_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_16=fault_binerrs_all$k_16, k_11=fault_binerrs_all$k_11, k_16=fault_binerrs_all$k_16)
results[["k_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_16_treat_df, "Y", "k_16")

fault_binerrs_wantv_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_4=fault_binerrs_all$wantv_4, wantv_3=fault_binerrs_all$wantv_3)
results[["wantv_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_4_treat_df, "Y", "wantv_4")

fault_binerrs_wantv_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_5=fault_binerrs_all$wantv_5, wantv_4=fault_binerrs_all$wantv_4, wantv_5=fault_binerrs_all$wantv_5)
results[["wantv_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_5_treat_df, "Y", "wantv_5")

fault_binerrs_wantv_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_6=fault_binerrs_all$wantv_6, wantv_4=fault_binerrs_all$wantv_4, wantv_5=fault_binerrs_all$wantv_5)
results[["wantv_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_6_treat_df, "Y", "wantv_6")

fault_binerrs_k_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_19=fault_binerrs_all$k_19, k_0=fault_binerrs_all$k_0, k_18=fault_binerrs_all$k_18)
results[["k_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_19_treat_df, "Y", "k_19")

fault_binerrs_wantv_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_7=fault_binerrs_all$wantv_7, wantv_6=fault_binerrs_all$wantv_6, wantv_7=fault_binerrs_all$wantv_7)
results[["wantv_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_7_treat_df, "Y", "wantv_7")

fault_binerrs_wantv_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_8=fault_binerrs_all$wantv_8, wantv_6=fault_binerrs_all$wantv_6, wantv_7=fault_binerrs_all$wantv_7)
results[["wantv_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_8_treat_df, "Y", "wantv_8")

fault_binerrs_tol_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, tol_2=fault_binerrs_all$tol_2, tol_0=fault_binerrs_all$tol_0, tol_1=fault_binerrs_all$tol_1)
results[["tol_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_tol_2_treat_df, "Y", "tol_2")

fault_binerrs_tol_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, tol_0=fault_binerrs_all$tol_0, eps_6=fault_binerrs_all$eps_6)
results[["tol_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_tol_0_treat_df, "Y", "tol_0")

fault_binerrs_tol_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, tol_1=fault_binerrs_all$tol_1, tol_0=fault_binerrs_all$tol_0, tol_1=fault_binerrs_all$tol_1)
results[["tol_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_tol_1_treat_df, "Y", "tol_1")

fault_binerrs_g_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_1=fault_binerrs_all$g_1, sn_2=fault_binerrs_all$sn_2, j_30=fault_binerrs_all$j_30)
results[["g_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_1_treat_df, "Y", "g_1")

fault_binerrs_g_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_0=fault_binerrs_all$g_0, g_0=fault_binerrs_all$g_0, g_2=fault_binerrs_all$g_2)
results[["g_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_0_treat_df, "Y", "g_0")

fault_binerrs_g_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_3=fault_binerrs_all$g_3, g_0=fault_binerrs_all$g_0, g_2=fault_binerrs_all$g_2)
results[["g_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_3_treat_df, "Y", "g_3")

fault_binerrs_g_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, g_2=fault_binerrs_all$g_2, sn_3=fault_binerrs_all$sn_3, j_30=fault_binerrs_all$j_30)
results[["g_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_g_2_treat_df, "Y", "g_2")

fault_binerrs_i_70_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_70=fault_binerrs_all$i_70, i_65=fault_binerrs_all$i_65, i_70=fault_binerrs_all$i_70)
results[["i_70"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_70_treat_df, "Y", "i_70")

fault_binerrs_i_61_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_61=fault_binerrs_all$i_61, i_56=fault_binerrs_all$i_56, i_61=fault_binerrs_all$i_61)
results[["i_61"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_61_treat_df, "Y", "i_61")

fault_binerrs_i_60_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_60=fault_binerrs_all$i_60)
results[["i_60"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_60_treat_df, "Y", "i_60")

fault_binerrs_i_63_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_63=fault_binerrs_all$i_63)
results[["i_63"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_63_treat_df, "Y", "i_63")

fault_binerrs_j_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_31=fault_binerrs_all$j_31, j_21=fault_binerrs_all$j_21, j_31=fault_binerrs_all$j_31)
results[["j_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_31_treat_df, "Y", "j_31")

fault_binerrs_i_62_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_62=fault_binerrs_all$i_62, i_60=fault_binerrs_all$i_60, i_61=fault_binerrs_all$i_61)
results[["i_62"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_62_treat_df, "Y", "i_62")

fault_binerrs_j_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_30=fault_binerrs_all$j_30, j_21=fault_binerrs_all$j_21, j_32=fault_binerrs_all$j_32)
results[["j_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_30_treat_df, "Y", "j_30")

fault_binerrs_i_65_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_65=fault_binerrs_all$i_65, i_63=fault_binerrs_all$i_63, i_64=fault_binerrs_all$i_64)
results[["i_65"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_65_treat_df, "Y", "i_65")

fault_binerrs_j_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_33=fault_binerrs_all$j_33, j_29=fault_binerrs_all$j_29, j_32=fault_binerrs_all$j_32)
results[["j_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_33_treat_df, "Y", "j_33")

fault_binerrs_i_64_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_64=fault_binerrs_all$i_64, i_56=fault_binerrs_all$i_56, i_64=fault_binerrs_all$i_64)
results[["i_64"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_64_treat_df, "Y", "i_64")

fault_binerrs_j_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_32=fault_binerrs_all$j_32, j_31=fault_binerrs_all$j_31)
results[["j_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_32_treat_df, "Y", "j_32")

fault_binerrs_i_67_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_67=fault_binerrs_all$i_67, i_65=fault_binerrs_all$i_65, i_67=fault_binerrs_all$i_67)
results[["i_67"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_67_treat_df, "Y", "i_67")

fault_binerrs_j_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_35=fault_binerrs_all$j_35, j_34=fault_binerrs_all$j_34, j_35=fault_binerrs_all$j_35)
results[["j_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_35_treat_df, "Y", "j_35")

fault_binerrs_i_66_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_66=fault_binerrs_all$i_66, i_65=fault_binerrs_all$i_65, i_67=fault_binerrs_all$i_67)
results[["i_66"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_66_treat_df, "Y", "i_66")

fault_binerrs_j_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_34=fault_binerrs_all$j_34)
results[["j_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_34_treat_df, "Y", "j_34")

fault_binerrs_i_69_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_69=fault_binerrs_all$i_69, i_65=fault_binerrs_all$i_65, i_70=fault_binerrs_all$i_70)
results[["i_69"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_69_treat_df, "Y", "i_69")

fault_binerrs_i_68_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_68=fault_binerrs_all$i_68, i_66=fault_binerrs_all$i_66, i_67=fault_binerrs_all$i_67)
results[["i_68"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_68_treat_df, "Y", "i_68")

fault_binerrs_j_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_36=fault_binerrs_all$j_36, j_34=fault_binerrs_all$j_34, j_35=fault_binerrs_all$j_35)
results[["j_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_36_treat_df, "Y", "j_36")

fault_binerrs_wantv_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_9=fault_binerrs_all$wantv_9, wantv_8=fault_binerrs_all$wantv_8, wantv_13=fault_binerrs_all$wantv_13)
results[["wantv_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_9_treat_df, "Y", "wantv_9")

fault_binerrs_k_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_31=fault_binerrs_all$k_31)
results[["k_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_31_treat_df, "Y", "k_31")

fault_binerrs_k_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_32=fault_binerrs_all$k_32)
results[["k_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_32_treat_df, "Y", "k_32")

fault_binerrs_i_93_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_93=fault_binerrs_all$i_93, i_90=fault_binerrs_all$i_90, i_92=fault_binerrs_all$i_92)
results[["i_93"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_93_treat_df, "Y", "i_93")

fault_binerrs_k_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_30=fault_binerrs_all$k_30, k_29=fault_binerrs_all$k_29, k_24=fault_binerrs_all$k_24)
results[["k_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_30_treat_df, "Y", "k_30")

fault_binerrs_k_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_35=fault_binerrs_all$k_35, k_34=fault_binerrs_all$k_34)
results[["k_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_35_treat_df, "Y", "k_35")

fault_binerrs_k_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_36=fault_binerrs_all$k_36, k_35=fault_binerrs_all$k_35)
results[["k_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_36_treat_df, "Y", "k_36")

fault_binerrs_k_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_33=fault_binerrs_all$k_33, k_32=fault_binerrs_all$k_32, k_37=fault_binerrs_all$k_37)
results[["k_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_33_treat_df, "Y", "k_33")

fault_binerrs_k_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_34=fault_binerrs_all$k_34, k_33=fault_binerrs_all$k_33)
results[["k_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_34_treat_df, "Y", "k_34")

fault_binerrs_k_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_39=fault_binerrs_all$k_39, k_38=fault_binerrs_all$k_38)
results[["k_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_39_treat_df, "Y", "k_39")

fault_binerrs_k_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_37=fault_binerrs_all$k_37, k_36=fault_binerrs_all$k_36)
results[["k_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_37_treat_df, "Y", "k_37")

fault_binerrs_k_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_38=fault_binerrs_all$k_38, k_32=fault_binerrs_all$k_32, k_37=fault_binerrs_all$k_37)
results[["k_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_38_treat_df, "Y", "k_38")

fault_binerrs_f_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_0=fault_binerrs_all$f_0, f_0=fault_binerrs_all$f_0, f_2=fault_binerrs_all$f_2)
results[["f_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_0_treat_df, "Y", "f_0")

fault_binerrs_f_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_2=fault_binerrs_all$f_2, f_1=fault_binerrs_all$f_1, f_0=fault_binerrs_all$f_0)
results[["f_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_2_treat_df, "Y", "f_2")

fault_binerrs_f_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_1=fault_binerrs_all$f_1, sn_0=fault_binerrs_all$sn_0, j_23=fault_binerrs_all$j_23)
results[["f_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_1_treat_df, "Y", "f_1")

fault_binerrs_f_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_4=fault_binerrs_all$f_4, f_4=fault_binerrs_all$f_4, f_5=fault_binerrs_all$f_5)
results[["f_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_4_treat_df, "Y", "f_4")

fault_binerrs_f_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_3=fault_binerrs_all$f_3, f_0=fault_binerrs_all$f_0, f_2=fault_binerrs_all$f_2)
results[["f_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_3_treat_df, "Y", "f_3")

fault_binerrs_f_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_6=fault_binerrs_all$f_6, f_4=fault_binerrs_all$f_4, f_5=fault_binerrs_all$f_5)
results[["f_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_6_treat_df, "Y", "f_6")

fault_binerrs_i_90_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_90=fault_binerrs_all$i_90)
results[["i_90"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_90_treat_df, "Y", "i_90")

fault_binerrs_f_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_5=fault_binerrs_all$f_5, sn_1=fault_binerrs_all$sn_1)
results[["f_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_5_treat_df, "Y", "f_5")

fault_binerrs_f_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_8=fault_binerrs_all$f_8, cs_2=fault_binerrs_all$cs_2, j_30=fault_binerrs_all$j_30, sn_2=fault_binerrs_all$sn_2, j_30=fault_binerrs_all$j_30)
results[["f_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_8_treat_df, "Y", "f_8")

fault_binerrs_i_92_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_92=fault_binerrs_all$i_92, i_91=fault_binerrs_all$i_91)
results[["i_92"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_92_treat_df, "Y", "i_92")

fault_binerrs_f_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_7=fault_binerrs_all$f_7, f_7=fault_binerrs_all$f_7, f_9=fault_binerrs_all$f_9)
results[["f_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_7_treat_df, "Y", "f_7")

fault_binerrs_i_91_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_91=fault_binerrs_all$i_91, i_90=fault_binerrs_all$i_90, i_92=fault_binerrs_all$i_92)
results[["i_91"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_91_treat_df, "Y", "i_91")

fault_binerrs_nrt_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_2=fault_binerrs_all$nrt_2, nrt_0=fault_binerrs_all$nrt_0, nrt_1=fault_binerrs_all$nrt_1)
results[["nrt_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_2_treat_df, "Y", "nrt_2")

fault_binerrs_k_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_20=fault_binerrs_all$k_20, nct_6=fault_binerrs_all$nct_6)
results[["k_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_20_treat_df, "Y", "k_20")

fault_binerrs_i_83_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_83=fault_binerrs_all$i_83, i_81=fault_binerrs_all$i_81, i_82=fault_binerrs_all$i_82)
results[["i_83"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_83_treat_df, "Y", "i_83")

fault_binerrs_nrt_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_1=fault_binerrs_all$nrt_1, nrt_0=fault_binerrs_all$nrt_0, nrt_1=fault_binerrs_all$nrt_1)
results[["nrt_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_1_treat_df, "Y", "nrt_1")

fault_binerrs_k_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_21=fault_binerrs_all$k_21, k_19=fault_binerrs_all$k_19, k_22=fault_binerrs_all$k_22)
results[["k_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_21_treat_df, "Y", "k_21")

fault_binerrs_f_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_9=fault_binerrs_all$f_9, cs_3=fault_binerrs_all$cs_3, j_30=fault_binerrs_all$j_30, sn_3=fault_binerrs_all$sn_3, j_30=fault_binerrs_all$j_30)
results[["f_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_9_treat_df, "Y", "f_9")

fault_binerrs_i_82_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_82=fault_binerrs_all$i_82, i_65=fault_binerrs_all$i_65, i_82=fault_binerrs_all$i_82)
results[["i_82"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_82_treat_df, "Y", "i_82")

fault_binerrs_nrt_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_0=fault_binerrs_all$nrt_0)
results[["nrt_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_0_treat_df, "Y", "nrt_0")

fault_binerrs_i_85_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_85=fault_binerrs_all$i_85, i_65=fault_binerrs_all$i_65, i_85=fault_binerrs_all$i_85)
results[["i_85"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_85_treat_df, "Y", "i_85")

fault_binerrs_i_84_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_84=fault_binerrs_all$i_84, i_65=fault_binerrs_all$i_65, i_85=fault_binerrs_all$i_85)
results[["i_84"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_84_treat_df, "Y", "i_84")

fault_binerrs_k_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_24=fault_binerrs_all$k_24, k_23=fault_binerrs_all$k_23, k_19=fault_binerrs_all$k_19)
results[["k_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_24_treat_df, "Y", "k_24")

fault_binerrs_nrt_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_6=fault_binerrs_all$nrt_6, nrt_5=fault_binerrs_all$nrt_5, nrt_3=fault_binerrs_all$nrt_3)
results[["nrt_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_6_treat_df, "Y", "nrt_6")

fault_binerrs_i_87_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_87=fault_binerrs_all$i_87, i_87=fault_binerrs_all$i_87, i_88=fault_binerrs_all$i_88)
results[["i_87"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_87_treat_df, "Y", "i_87")

fault_binerrs_k_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_25=fault_binerrs_all$k_25)
results[["k_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_25_treat_df, "Y", "k_25")

fault_binerrs_nrt_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_5=fault_binerrs_all$nrt_5, nrt_3=fault_binerrs_all$nrt_3, nrt_4=fault_binerrs_all$nrt_4)
results[["nrt_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_5_treat_df, "Y", "nrt_5")

fault_binerrs_i_86_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_86=fault_binerrs_all$i_86, i_84=fault_binerrs_all$i_84, i_85=fault_binerrs_all$i_85)
results[["i_86"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_86_treat_df, "Y", "i_86")

fault_binerrs_k_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_22=fault_binerrs_all$k_22, k_21=fault_binerrs_all$k_21)
results[["k_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_22_treat_df, "Y", "k_22")

fault_binerrs_nrt_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_4=fault_binerrs_all$nrt_4, nrt_3=fault_binerrs_all$nrt_3, nrt_4=fault_binerrs_all$nrt_4)
results[["nrt_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_4_treat_df, "Y", "nrt_4")

fault_binerrs_i_89_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_89=fault_binerrs_all$i_89, i_87=fault_binerrs_all$i_87, i_88=fault_binerrs_all$i_88)
results[["i_89"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_89_treat_df, "Y", "i_89")

fault_binerrs_nrt_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrt_3=fault_binerrs_all$nrt_3, nrt_2=fault_binerrs_all$nrt_2)
results[["nrt_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrt_3_treat_df, "Y", "nrt_3")

fault_binerrs_k_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_23=fault_binerrs_all$k_23, k_20=fault_binerrs_all$k_20, k_22=fault_binerrs_all$k_22)
results[["k_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_23_treat_df, "Y", "k_23")

fault_binerrs_i_88_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_88=fault_binerrs_all$i_88, i_87=fault_binerrs_all$i_87, i_88=fault_binerrs_all$i_88)
results[["i_88"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_88_treat_df, "Y", "i_88")

fault_binerrs_k_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_28=fault_binerrs_all$k_28, k_27=fault_binerrs_all$k_27)
results[["k_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_28_treat_df, "Y", "k_28")

fault_binerrs_k_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_29=fault_binerrs_all$k_29, k_25=fault_binerrs_all$k_25, k_28=fault_binerrs_all$k_28)
results[["k_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_29_treat_df, "Y", "k_29")

fault_binerrs_k_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_26=fault_binerrs_all$k_26, k_24=fault_binerrs_all$k_24, k_28=fault_binerrs_all$k_28)
results[["k_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_26_treat_df, "Y", "k_26")

fault_binerrs_k_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_27=fault_binerrs_all$k_27, k_24=fault_binerrs_all$k_24, k_27=fault_binerrs_all$k_27)
results[["k_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_27_treat_df, "Y", "k_27")

fault_binerrs_f_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, f_10=fault_binerrs_all$f_10, f_7=fault_binerrs_all$f_7, f_9=fault_binerrs_all$f_9)
results[["f_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_f_10_treat_df, "Y", "f_10")

fault_binerrs_i_81_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_81=fault_binerrs_all$i_81, i_65=fault_binerrs_all$i_65, i_82=fault_binerrs_all$i_82)
results[["i_81"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_81_treat_df, "Y", "i_81")

fault_binerrs_i_80_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_80=fault_binerrs_all$i_80, i_78=fault_binerrs_all$i_78, i_79=fault_binerrs_all$i_79)
results[["i_80"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_80_treat_df, "Y", "i_80")

fault_binerrs_k_53_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_53=fault_binerrs_all$k_53, k_52=fault_binerrs_all$k_52)
results[["k_53"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_53_treat_df, "Y", "k_53")

fault_binerrs_k_54_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_54=fault_binerrs_all$k_54, k_46=fault_binerrs_all$k_46, k_54=fault_binerrs_all$k_54)
results[["k_54"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_54_treat_df, "Y", "k_54")

fault_binerrs_k_51_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_51=fault_binerrs_all$k_51, k_46=fault_binerrs_all$k_46)
results[["k_51"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_51_treat_df, "Y", "k_51")

fault_binerrs_k_52_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_52=fault_binerrs_all$k_52, k_46=fault_binerrs_all$k_46, k_56=fault_binerrs_all$k_56)
results[["k_52"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_52_treat_df, "Y", "k_52")

fault_binerrs_k_57_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_57=fault_binerrs_all$k_57, k_51=fault_binerrs_all$k_51, k_56=fault_binerrs_all$k_56)
results[["k_57"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_57_treat_df, "Y", "k_57")

fault_binerrs_k_58_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_58=fault_binerrs_all$k_58, k_50=fault_binerrs_all$k_50, k_57=fault_binerrs_all$k_57, k_48=fault_binerrs_all$k_48)
results[["k_58"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_58_treat_df, "Y", "k_58")

fault_binerrs_k_55_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_55=fault_binerrs_all$k_55, k_46=fault_binerrs_all$k_46, k_55=fault_binerrs_all$k_55)
results[["k_55"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_55_treat_df, "Y", "k_55")

fault_binerrs_k_56_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_56=fault_binerrs_all$k_56, k_55=fault_binerrs_all$k_55)
results[["k_56"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_56_treat_df, "Y", "k_56")

fault_binerrs_k_59_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_59=fault_binerrs_all$k_59, k_48=fault_binerrs_all$k_48, k_58=fault_binerrs_all$k_58)
results[["k_59"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_59_treat_df, "Y", "k_59")

fault_binerrs_k_50_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_50=fault_binerrs_all$k_50, k_48=fault_binerrs_all$k_48, k_49=fault_binerrs_all$k_49)
results[["k_50"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_50_treat_df, "Y", "k_50")

fault_binerrs_k_42_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_42=fault_binerrs_all$k_42, k_41=fault_binerrs_all$k_41)
results[["k_42"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_42_treat_df, "Y", "k_42")

fault_binerrs_k_43_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_43=fault_binerrs_all$k_43, ks_7=fault_binerrs_all$ks_7)
results[["k_43"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_43_treat_df, "Y", "k_43")

fault_binerrs_k_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_40=fault_binerrs_all$k_40, k_39=fault_binerrs_all$k_39, k_40=fault_binerrs_all$k_40)
results[["k_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_40_treat_df, "Y", "k_40")

fault_binerrs_k_41_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_41=fault_binerrs_all$k_41, k_39=fault_binerrs_all$k_39, k_40=fault_binerrs_all$k_40)
results[["k_41"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_41_treat_df, "Y", "k_41")

fault_binerrs_k_46_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_46=fault_binerrs_all$k_46, k_45=fault_binerrs_all$k_45)
results[["k_46"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_46_treat_df, "Y", "k_46")

fault_binerrs_k_47_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_47=fault_binerrs_all$k_47, k_46=fault_binerrs_all$k_46, k_47=fault_binerrs_all$k_47)
results[["k_47"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_47_treat_df, "Y", "k_47")

fault_binerrs_k_44_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_44=fault_binerrs_all$k_44, k_42=fault_binerrs_all$k_42, k_42=fault_binerrs_all$k_42, k_43=fault_binerrs_all$k_43)
results[["k_44"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_44_treat_df, "Y", "k_44")

fault_binerrs_k_45_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_45=fault_binerrs_all$k_45, k_39=fault_binerrs_all$k_39, k_44=fault_binerrs_all$k_44)
results[["k_45"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_45_treat_df, "Y", "k_45")

fault_binerrs_k_48_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_48=fault_binerrs_all$k_48, k_46=fault_binerrs_all$k_46, k_48=fault_binerrs_all$k_48)
results[["k_48"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_48_treat_df, "Y", "k_48")

fault_binerrs_k_49_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_49=fault_binerrs_all$k_49, k_46=fault_binerrs_all$k_46, k_49=fault_binerrs_all$k_49)
results[["k_49"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_49_treat_df, "Y", "k_49")

fault_binerrs_ek_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ek_0=fault_binerrs_all$ek_0, k_46=fault_binerrs_all$k_46, scale_0=fault_binerrs_all$scale_0)
results[["ek_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ek_0_treat_df, "Y", "ek_0")

fault_binerrs_sp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sp_0=fault_binerrs_all$sp_0, p_5=fault_binerrs_all$p_5, scale_0=fault_binerrs_all$scale_0)
results[["sp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sp_0_treat_df, "Y", "sp_0")

fault_binerrs_wantu_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_11=fault_binerrs_all$wantu_11, wantu_5=fault_binerrs_all$wantu_5, wantu_10=fault_binerrs_all$wantu_10)
results[["wantu_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_11_treat_df, "Y", "wantu_11")

fault_binerrs_wantu_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantu_10=fault_binerrs_all$wantu_10, wantu_7=fault_binerrs_all$wantu_7, wantu_9=fault_binerrs_all$wantu_9, wantu_5=fault_binerrs_all$wantu_5)
results[["wantu_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantu_10_treat_df, "Y", "wantu_10")

fault_binerrs_ks_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_7=fault_binerrs_all$ks_7, ks_6=fault_binerrs_all$ks_6)
results[["ks_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_7_treat_df, "Y", "ks_7")

fault_binerrs_eps_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_2=fault_binerrs_all$eps_2, eps_0=fault_binerrs_all$eps_0, eps_1=fault_binerrs_all$eps_1)
results[["eps_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_2_treat_df, "Y", "eps_2")

fault_binerrs_eps_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_1=fault_binerrs_all$eps_1, eps_0=fault_binerrs_all$eps_0, eps_1=fault_binerrs_all$eps_1)
results[["eps_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_1_treat_df, "Y", "eps_1")

fault_binerrs_eps_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_0=fault_binerrs_all$eps_0)
results[["eps_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_0_treat_df, "Y", "eps_0")

fault_binerrs_eps_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_6=fault_binerrs_all$eps_6)
results[["eps_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_6_treat_df, "Y", "eps_6")

fault_binerrs_eps_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_5=fault_binerrs_all$eps_5, eps_2=fault_binerrs_all$eps_2, eps_4=fault_binerrs_all$eps_4)
results[["eps_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_5_treat_df, "Y", "eps_5")

fault_binerrs_eps_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_4=fault_binerrs_all$eps_4, eps_2=fault_binerrs_all$eps_2, eps_3=fault_binerrs_all$eps_3)
results[["eps_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_4_treat_df, "Y", "eps_4")

fault_binerrs_eps_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, eps_3=fault_binerrs_all$eps_3, eps_2=fault_binerrs_all$eps_2, eps_3=fault_binerrs_all$eps_3)
results[["eps_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_eps_3_treat_df, "Y", "eps_3")

fault_binerrs_t_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_0=fault_binerrs_all$t_0)
results[["t_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_0_treat_df, "Y", "t_0")

fault_binerrs_t_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_2=fault_binerrs_all$t_2, t_0=fault_binerrs_all$t_0, t_1=fault_binerrs_all$t_1)
results[["t_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_2_treat_df, "Y", "t_2")

fault_binerrs_t_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_1=fault_binerrs_all$t_1, t_0=fault_binerrs_all$t_0, t_1=fault_binerrs_all$t_1)
results[["t_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_1_treat_df, "Y", "t_1")

fault_binerrs_t_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_4=fault_binerrs_all$t_4)
results[["t_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_4_treat_df, "Y", "t_4")

fault_binerrs_ks_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_1=fault_binerrs_all$ks_1, p_3=fault_binerrs_all$p_3)
results[["ks_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_1_treat_df, "Y", "ks_1")

fault_binerrs_t_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_3=fault_binerrs_all$t_3, t_2=fault_binerrs_all$t_2, k_8=fault_binerrs_all$k_8, k_8=fault_binerrs_all$k_8)
results[["t_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_3_treat_df, "Y", "t_3")

fault_binerrs_ks_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_2=fault_binerrs_all$ks_2, ks_1=fault_binerrs_all$ks_1, ks_4=fault_binerrs_all$ks_4)
results[["ks_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_2_treat_df, "Y", "ks_2")

fault_binerrs_t_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_6=fault_binerrs_all$t_6, t_4=fault_binerrs_all$t_4, t_6=fault_binerrs_all$t_6)
results[["t_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_6_treat_df, "Y", "t_6")

fault_binerrs_t_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_5=fault_binerrs_all$t_5)
results[["t_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_5_treat_df, "Y", "t_5")

fault_binerrs_ks_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_0=fault_binerrs_all$ks_0)
results[["ks_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_0_treat_df, "Y", "ks_0")

fault_binerrs_t_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_8=fault_binerrs_all$t_8, t_7=fault_binerrs_all$t_7)
results[["t_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_8_treat_df, "Y", "t_8")

fault_binerrs_ks_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_5=fault_binerrs_all$ks_5, ks_1=fault_binerrs_all$ks_1, ks_4=fault_binerrs_all$ks_4)
results[["ks_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_5_treat_df, "Y", "ks_5")

fault_binerrs_t_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_7=fault_binerrs_all$t_7, t_5=fault_binerrs_all$t_5, t_6=fault_binerrs_all$t_6)
results[["t_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_7_treat_df, "Y", "t_7")

fault_binerrs_ks_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_6=fault_binerrs_all$ks_6, ks_5=fault_binerrs_all$ks_5)
results[["ks_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_6_treat_df, "Y", "ks_6")

fault_binerrs_ks_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_3=fault_binerrs_all$ks_3, ks_2=fault_binerrs_all$ks_2)
results[["ks_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_3_treat_df, "Y", "ks_3")

fault_binerrs_t_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_9=fault_binerrs_all$t_9)
results[["t_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_9_treat_df, "Y", "t_9")

fault_binerrs_ks_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, ks_4=fault_binerrs_all$ks_4, ks_3=fault_binerrs_all$ks_3)
results[["ks_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_ks_4_treat_df, "Y", "ks_4")

fault_binerrs_c_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, c_1=fault_binerrs_all$c_1, c_0=fault_binerrs_all$c_0)
results[["c_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_c_1_treat_df, "Y", "c_1")

fault_binerrs_c_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, c_0=fault_binerrs_all$c_0, sp_0=fault_binerrs_all$sp_0, epm1_0=fault_binerrs_all$epm1_0, sp_0=fault_binerrs_all$sp_0, epm1_0=fault_binerrs_all$epm1_0)
results[["c_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_c_0_treat_df, "Y", "c_0")

fault_binerrs_tiny_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, tiny_4=fault_binerrs_all$tiny_4, tiny_2=fault_binerrs_all$tiny_2, tiny_3=fault_binerrs_all$tiny_3)
results[["tiny_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_tiny_4_treat_df, "Y", "tiny_4")

fault_binerrs_tiny_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, tiny_3=fault_binerrs_all$tiny_3, tiny_2=fault_binerrs_all$tiny_2, tiny_3=fault_binerrs_all$tiny_3)
results[["tiny_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_tiny_3_treat_df, "Y", "tiny_3")

fault_binerrs_tiny_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, tiny_5=fault_binerrs_all$tiny_5, tiny_2=fault_binerrs_all$tiny_2, tiny_4=fault_binerrs_all$tiny_4)
results[["tiny_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_tiny_5_treat_df, "Y", "tiny_5")

fault_binerrs_k_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_1=fault_binerrs_all$k_1, k_0=fault_binerrs_all$k_0, k_18=fault_binerrs_all$k_18)
results[["k_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_1_treat_df, "Y", "k_1")

fault_binerrs_tiny_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, tiny_0=fault_binerrs_all$tiny_0)
results[["tiny_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_tiny_0_treat_df, "Y", "tiny_0")

fault_binerrs_k_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_0=fault_binerrs_all$k_0)
results[["k_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_0_treat_df, "Y", "k_0")

fault_binerrs_k_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_3=fault_binerrs_all$k_3, k_2=fault_binerrs_all$k_2)
results[["k_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_3_treat_df, "Y", "k_3")

fault_binerrs_tiny_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, tiny_2=fault_binerrs_all$tiny_2, tiny_0=fault_binerrs_all$tiny_0, tiny_1=fault_binerrs_all$tiny_1)
results[["tiny_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_tiny_2_treat_df, "Y", "tiny_2")

fault_binerrs_k_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_2=fault_binerrs_all$k_2, k_1=fault_binerrs_all$k_1)
results[["k_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_2_treat_df, "Y", "k_2")

fault_binerrs_tiny_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, tiny_1=fault_binerrs_all$tiny_1, tiny_0=fault_binerrs_all$tiny_0, tiny_1=fault_binerrs_all$tiny_1)
results[["tiny_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_tiny_1_treat_df, "Y", "tiny_1")

fault_binerrs_k_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_5=fault_binerrs_all$k_5, k_4=fault_binerrs_all$k_4, k_2=fault_binerrs_all$k_2)
results[["k_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_5_treat_df, "Y", "k_5")

fault_binerrs_k_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_4=fault_binerrs_all$k_4, k_3=fault_binerrs_all$k_3)
results[["k_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_4_treat_df, "Y", "k_4")

fault_binerrs_k_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_7=fault_binerrs_all$k_7, k_6=fault_binerrs_all$k_6, k_8=fault_binerrs_all$k_8)
results[["k_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_7_treat_df, "Y", "k_7")

fault_binerrs_k_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_6=fault_binerrs_all$k_6, k_5=fault_binerrs_all$k_5, k_1=fault_binerrs_all$k_1)
results[["k_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_6_treat_df, "Y", "k_6")

fault_binerrs_k_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_9=fault_binerrs_all$k_9, k_6=fault_binerrs_all$k_6, k_8=fault_binerrs_all$k_8)
results[["k_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_9_treat_df, "Y", "k_9")

fault_binerrs_shift_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, shift_5=fault_binerrs_all$shift_5, shift_4=fault_binerrs_all$shift_4, shift_0=fault_binerrs_all$shift_0)
results[["shift_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_shift_5_treat_df, "Y", "shift_5")

fault_binerrs_k_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_8=fault_binerrs_all$k_8, k_7=fault_binerrs_all$k_7)
results[["k_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_8_treat_df, "Y", "k_8")

fault_binerrs_nct_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_4=fault_binerrs_all$nct_4, nct_3=fault_binerrs_all$nct_3)
results[["nct_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_4_treat_df, "Y", "nct_4")

fault_binerrs_shift_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, shift_1=fault_binerrs_all$shift_1, b_1=fault_binerrs_all$b_1, b_1=fault_binerrs_all$b_1, c_1=fault_binerrs_all$c_1)
results[["shift_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_shift_1_treat_df, "Y", "shift_1")

fault_binerrs_nct_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_5=fault_binerrs_all$nct_5, nct_0=fault_binerrs_all$nct_0, nct_4=fault_binerrs_all$nct_4)
results[["nct_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_5_treat_df, "Y", "nct_5")

fault_binerrs_shift_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, shift_2=fault_binerrs_all$shift_2, shift_1=fault_binerrs_all$shift_1)
results[["shift_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_shift_2_treat_df, "Y", "shift_2")

fault_binerrs_nct_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_6=fault_binerrs_all$nct_6, nct_5=fault_binerrs_all$nct_5)
results[["nct_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_6_treat_df, "Y", "nct_6")

fault_binerrs_shift_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, shift_3=fault_binerrs_all$shift_3, shift_2=fault_binerrs_all$shift_2, shift_1=fault_binerrs_all$shift_1)
results[["shift_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_shift_3_treat_df, "Y", "shift_3")

fault_binerrs_spm1_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, spm1_0=fault_binerrs_all$spm1_0, p_5=fault_binerrs_all$p_5, scale_0=fault_binerrs_all$scale_0)
results[["spm1_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_spm1_0_treat_df, "Y", "spm1_0")

fault_binerrs_shift_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, shift_4=fault_binerrs_all$shift_4, c_1=fault_binerrs_all$c_1, b_2=fault_binerrs_all$b_2, shift_3=fault_binerrs_all$shift_3)
results[["shift_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_shift_4_treat_df, "Y", "shift_4")

fault_binerrs_nct_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_0=fault_binerrs_all$nct_0)
results[["nct_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_0_treat_df, "Y", "nct_0")

fault_binerrs_nct_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_1=fault_binerrs_all$nct_1, nct_0=fault_binerrs_all$nct_0, nct_4=fault_binerrs_all$nct_4)
results[["nct_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_1_treat_df, "Y", "nct_1")

fault_binerrs_nct_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_2=fault_binerrs_all$nct_2, nct_1=fault_binerrs_all$nct_1, nct_2=fault_binerrs_all$nct_2)
results[["nct_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_2_treat_df, "Y", "nct_2")

fault_binerrs_nct_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, nct_3=fault_binerrs_all$nct_3, nct_1=fault_binerrs_all$nct_1, nct_2=fault_binerrs_all$nct_2)
results[["nct_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_nct_3_treat_df, "Y", "nct_3")

fault_binerrs_shift_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, shift_0=fault_binerrs_all$shift_0)
results[["shift_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_shift_0_treat_df, "Y", "shift_0")

fault_binerrs_iter_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, iter_4=fault_binerrs_all$iter_4, iter_0=fault_binerrs_all$iter_0, iter_3=fault_binerrs_all$iter_3)
results[["iter_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_iter_4_treat_df, "Y", "iter_4")

fault_binerrs_iter_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, iter_3=fault_binerrs_all$iter_3, iter_1=fault_binerrs_all$iter_1, iter_2=fault_binerrs_all$iter_2, iter_0=fault_binerrs_all$iter_0)
results[["iter_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_iter_3_treat_df, "Y", "iter_3")

fault_binerrs_iter_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, iter_2=fault_binerrs_all$iter_2)
results[["iter_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_iter_2_treat_df, "Y", "iter_2")

fault_binerrs_iter_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, iter_1=fault_binerrs_all$iter_1, iter_0=fault_binerrs_all$iter_0, iter_3=fault_binerrs_all$iter_3)
results[["iter_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_iter_1_treat_df, "Y", "iter_1")

fault_binerrs_iter_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, iter_0=fault_binerrs_all$iter_0)
results[["iter_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_iter_0_treat_df, "Y", "iter_0")

fault_binerrs_sn_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, sn_1=fault_binerrs_all$sn_1, t_19=fault_binerrs_all$t_19)
results[["sn_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_sn_1_treat_df, "Y", "sn_1")

fault_binerrs_sn_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sn_0=fault_binerrs_all$sn_0, t_15=fault_binerrs_all$t_15)
results[["sn_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sn_0_treat_df, "Y", "sn_0")

fault_binerrs_sn_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, sn_3=fault_binerrs_all$sn_3, g_1=fault_binerrs_all$g_1, t_27=fault_binerrs_all$t_27)
results[["sn_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_sn_3_treat_df, "Y", "sn_3")

fault_binerrs_sn_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, sn_2=fault_binerrs_all$sn_2, t_23=fault_binerrs_all$t_23)
results[["sn_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_sn_2_treat_df, "Y", "sn_2")

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10, k_8=fault_binerrs_all$k_8)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_pp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, pp_0=fault_binerrs_all$pp_0, p_2=fault_binerrs_all$p_2)
results[["pp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_pp_0_treat_df, "Y", "pp_0")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_10=fault_binerrs_all$i_10, i_11=fault_binerrs_all$i_11)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_6=fault_binerrs_all$i_6, i_11=fault_binerrs_all$i_11)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14, i_12=fault_binerrs_all$i_12, i_14=fault_binerrs_all$i_14)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13, k_10=fault_binerrs_all$k_10)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_i_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_16=fault_binerrs_all$i_16, k_11=fault_binerrs_all$k_11)
results[["i_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_16_treat_df, "Y", "i_16")

fault_binerrs_nu_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nu_0=fault_binerrs_all$nu_0)
results[["nu_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nu_0_treat_df, "Y", "nu_0")

fault_binerrs_i_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_15=fault_binerrs_all$i_15, i_13=fault_binerrs_all$i_13, i_14=fault_binerrs_all$i_14)
results[["i_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_15_treat_df, "Y", "i_15")

fault_binerrs_i_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_18=fault_binerrs_all$i_18, i_16=fault_binerrs_all$i_16, i_17=fault_binerrs_all$i_17)
results[["i_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_18_treat_df, "Y", "i_18")

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_15=fault_binerrs_all$i_15, i_17=fault_binerrs_all$i_17)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19, k_13=fault_binerrs_all$k_13)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_b_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_0=fault_binerrs_all$b_0, spm1_0=fault_binerrs_all$spm1_0, sp_0=fault_binerrs_all$sp_0, spm1_0=fault_binerrs_all$spm1_0, sp_0=fault_binerrs_all$sp_0, epm1_0=fault_binerrs_all$epm1_0, epm1_0=fault_binerrs_all$epm1_0)
results[["b_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_0_treat_df, "Y", "b_0")

fault_binerrs_b_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_2=fault_binerrs_all$b_2, b_1=fault_binerrs_all$b_1)
results[["b_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_2_treat_df, "Y", "b_2")

fault_binerrs_b_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_1=fault_binerrs_all$b_1, b_0=fault_binerrs_all$b_0)
results[["b_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_1_treat_df, "Y", "b_1")

fault_binerrs_b_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_3=fault_binerrs_all$b_3, b_2=fault_binerrs_all$b_2, b_1=fault_binerrs_all$b_1)
results[["b_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_3_treat_df, "Y", "b_3")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_2=fault_binerrs_all$j_2, j_4=fault_binerrs_all$j_4)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_scale_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, scale_0=fault_binerrs_all$scale_0, p_5=fault_binerrs_all$p_5, p_5=fault_binerrs_all$p_5, p_5=fault_binerrs_all$p_5, k_46=fault_binerrs_all$k_46, k_46=fault_binerrs_all$k_46)
results[["scale_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_scale_0_treat_df, "Y", "scale_0")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3, k_16=fault_binerrs_all$k_16)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6, j_2=fault_binerrs_all$j_2, j_7=fault_binerrs_all$j_7)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5, j_3=fault_binerrs_all$j_3, j_4=fault_binerrs_all$j_4)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8, j_6=fault_binerrs_all$j_6, j_7=fault_binerrs_all$j_7)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_r_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, r_0=fault_binerrs_all$r_0)
results[["r_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_r_0_treat_df, "Y", "r_0")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7, j_2=fault_binerrs_all$j_2, j_7=fault_binerrs_all$j_7)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_r_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, r_2=fault_binerrs_all$r_2, r_1=fault_binerrs_all$r_1, r_0=fault_binerrs_all$r_0)
results[["r_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_r_2_treat_df, "Y", "r_2")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9, j_8=fault_binerrs_all$j_8, j_2=fault_binerrs_all$j_2)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_r_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, r_1=fault_binerrs_all$r_1, r_0=fault_binerrs_all$r_0, r_2=fault_binerrs_all$r_2)
results[["r_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_r_1_treat_df, "Y", "r_1")

fault_binerrs_r_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, r_3=fault_binerrs_all$r_3, r_0=fault_binerrs_all$r_0, r_2=fault_binerrs_all$r_2)
results[["r_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_r_3_treat_df, "Y", "r_3")

fault_binerrs_wantv_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_14=fault_binerrs_all$wantv_14, wantv_6=fault_binerrs_all$wantv_6, wantv_13=fault_binerrs_all$wantv_13)
results[["wantv_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_14_treat_df, "Y", "wantv_14")

fault_binerrs_wantv_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_13=fault_binerrs_all$wantv_13, wantv_8=fault_binerrs_all$wantv_8, wantv_12=fault_binerrs_all$wantv_12, wantv_6=fault_binerrs_all$wantv_6)
results[["wantv_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_13_treat_df, "Y", "wantv_13")

fault_binerrs_wantv_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_12=fault_binerrs_all$wantv_12, wantv_10=fault_binerrs_all$wantv_10, wantv_11=fault_binerrs_all$wantv_11)
results[["wantv_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_12_treat_df, "Y", "wantv_12")

fault_binerrs_Arg_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, Arg_0=fault_binerrs_all$Arg_0)
results[["Arg_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_Arg_0_treat_df, "Y", "Arg_0")

fault_binerrs_wantv_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_11=fault_binerrs_all$wantv_11, wantv_10=fault_binerrs_all$wantv_10, wantv_11=fault_binerrs_all$wantv_11)
results[["wantv_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_11_treat_df, "Y", "wantv_11")

fault_binerrs_wantv_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, wantv_10=fault_binerrs_all$wantv_10, wantv_9=fault_binerrs_all$wantv_9, wantv_8=fault_binerrs_all$wantv_8)
results[["wantv_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_wantv_10_treat_df, "Y", "wantv_10")

fault_binerrs_i_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_30=fault_binerrs_all$i_30)
results[["i_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_30_treat_df, "Y", "i_30")

fault_binerrs_i_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_32=fault_binerrs_all$i_32, i_30=fault_binerrs_all$i_30, i_31=fault_binerrs_all$i_31)
results[["i_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_32_treat_df, "Y", "i_32")

fault_binerrs_t_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_29=fault_binerrs_all$t_29, t_27=fault_binerrs_all$t_27, t_28=fault_binerrs_all$t_28)
results[["t_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_29_treat_df, "Y", "t_29")

fault_binerrs_i_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_31=fault_binerrs_all$i_31, i_15=fault_binerrs_all$i_15, i_31=fault_binerrs_all$i_31)
results[["i_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_31_treat_df, "Y", "i_31")

fault_binerrs_i_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_34=fault_binerrs_all$i_34, i_33=fault_binerrs_all$i_33, i_22=fault_binerrs_all$i_22)
results[["i_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_34_treat_df, "Y", "i_34")

fault_binerrs_t_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_27=fault_binerrs_all$t_27, f_8=fault_binerrs_all$f_8, g_1=fault_binerrs_all$g_1)
results[["t_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_27_treat_df, "Y", "t_27")

fault_binerrs_i_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_33=fault_binerrs_all$i_33, i_29=fault_binerrs_all$i_29, i_32=fault_binerrs_all$i_32)
results[["i_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_33_treat_df, "Y", "i_33")

fault_binerrs_t_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_28=fault_binerrs_all$t_28)
results[["t_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_28_treat_df, "Y", "t_28")

fault_binerrs_i_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_36=fault_binerrs_all$i_36, i_15=fault_binerrs_all$i_15, i_36=fault_binerrs_all$i_36)
results[["i_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_36_treat_df, "Y", "i_36")

fault_binerrs_i_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_35=fault_binerrs_all$i_35, k_16=fault_binerrs_all$k_16)
results[["i_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_35_treat_df, "Y", "i_35")

fault_binerrs_i_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_38=fault_binerrs_all$i_38, i_37=fault_binerrs_all$i_37, i_34=fault_binerrs_all$i_34)
results[["i_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_38_treat_df, "Y", "i_38")

fault_binerrs_i_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_37=fault_binerrs_all$i_37, i_35=fault_binerrs_all$i_35, i_36=fault_binerrs_all$i_36)
results[["i_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_37_treat_df, "Y", "i_37")

fault_binerrs_i_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_39=fault_binerrs_all$i_39)
results[["i_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_39_treat_df, "Y", "i_39")

fault_binerrs_t_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_25=fault_binerrs_all$t_25, t_23=fault_binerrs_all$t_23, t_24=fault_binerrs_all$t_24)
results[["t_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_25_treat_df, "Y", "t_25")

fault_binerrs_t_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_26=fault_binerrs_all$t_26, t_25=fault_binerrs_all$t_25, t_23=fault_binerrs_all$t_23)
results[["t_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_26_treat_df, "Y", "t_26")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_t_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_23=fault_binerrs_all$t_23)
results[["t_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_23_treat_df, "Y", "t_23")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0, k_1=fault_binerrs_all$k_1)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_t_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_24=fault_binerrs_all$t_24)
results[["t_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_24_treat_df, "Y", "t_24")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3, k_4=fault_binerrs_all$k_4)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_t_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_21=fault_binerrs_all$t_21, t_19=fault_binerrs_all$t_19, t_20=fault_binerrs_all$t_20)
results[["t_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_21_treat_df, "Y", "t_21")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_t_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_22=fault_binerrs_all$t_22, t_21=fault_binerrs_all$t_21, t_19=fault_binerrs_all$t_19)
results[["t_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_22_treat_df, "Y", "t_22")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_t_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_20=fault_binerrs_all$t_20)
results[["t_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_20_treat_df, "Y", "t_20")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_6=fault_binerrs_all$i_6, i_8=fault_binerrs_all$i_8)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_5=fault_binerrs_all$i_5, i_2=fault_binerrs_all$i_2)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8, i_6=fault_binerrs_all$i_6, i_8=fault_binerrs_all$i_8)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21, i_19=fault_binerrs_all$i_19, i_20=fault_binerrs_all$i_20)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_t_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_18=fault_binerrs_all$t_18, t_17=fault_binerrs_all$t_17, t_15=fault_binerrs_all$t_15)
results[["t_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_18_treat_df, "Y", "t_18")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20, i_15=fault_binerrs_all$i_15, i_20=fault_binerrs_all$i_20)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_t_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_19=fault_binerrs_all$t_19)
results[["t_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_19_treat_df, "Y", "t_19")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23, k_16=fault_binerrs_all$k_16)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_t_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_16=fault_binerrs_all$t_16)
results[["t_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_16_treat_df, "Y", "t_16")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22, i_21=fault_binerrs_all$i_21, i_18=fault_binerrs_all$i_18)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_t_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_17=fault_binerrs_all$t_17, t_15=fault_binerrs_all$t_15, t_16=fault_binerrs_all$t_16)
results[["t_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_17_treat_df, "Y", "t_17")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25, i_23=fault_binerrs_all$i_23, i_24=fault_binerrs_all$i_24)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24, i_15=fault_binerrs_all$i_15, i_24=fault_binerrs_all$i_24)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_i_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_27=fault_binerrs_all$i_27, i_15=fault_binerrs_all$i_15, i_27=fault_binerrs_all$i_27)
results[["i_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_27_treat_df, "Y", "i_27")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

fault_binerrs_i_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_29=fault_binerrs_all$i_29, i_25=fault_binerrs_all$i_25, i_28=fault_binerrs_all$i_28)
results[["i_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_29_treat_df, "Y", "i_29")

fault_binerrs_i_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_28=fault_binerrs_all$i_28, i_26=fault_binerrs_all$i_26, i_27=fault_binerrs_all$i_27)
results[["i_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_28_treat_df, "Y", "i_28")

fault_binerrs_epm1_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, epm1_0=fault_binerrs_all$epm1_0, p_5=fault_binerrs_all$p_5, scale_0=fault_binerrs_all$scale_0)
results[["epm1_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_epm1_0_treat_df, "Y", "epm1_0")

fault_binerrs_t_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_14=fault_binerrs_all$t_14, t_13=fault_binerrs_all$t_13)
results[["t_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_14_treat_df, "Y", "t_14")

fault_binerrs_kase_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_2=fault_binerrs_all$kase_2)
results[["kase_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_2_treat_df, "Y", "kase_2")

fault_binerrs_kase_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_1=fault_binerrs_all$kase_1)
results[["kase_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_1_treat_df, "Y", "kase_1")

fault_binerrs_t_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_15=fault_binerrs_all$t_15)
results[["t_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_15_treat_df, "Y", "t_15")

fault_binerrs_t_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_12=fault_binerrs_all$t_12, t_11=fault_binerrs_all$t_11)
results[["t_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_12_treat_df, "Y", "t_12")

fault_binerrs_kase_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_0=fault_binerrs_all$kase_0)
results[["kase_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_0_treat_df, "Y", "kase_0")

fault_binerrs_t_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_13=fault_binerrs_all$t_13, ks_2=fault_binerrs_all$ks_2, ks_2=fault_binerrs_all$ks_2, ks_2=fault_binerrs_all$ks_2, k_40=fault_binerrs_all$k_40, ks_2=fault_binerrs_all$ks_2)
results[["t_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_13_treat_df, "Y", "t_13")

fault_binerrs_t_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_10=fault_binerrs_all$t_10, t_8=fault_binerrs_all$t_8, t_10=fault_binerrs_all$t_10)
results[["t_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_10_treat_df, "Y", "t_10")

fault_binerrs_kase_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_6=fault_binerrs_all$kase_6, kase_1=fault_binerrs_all$kase_1, kase_5=fault_binerrs_all$kase_5)
results[["kase_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_6_treat_df, "Y", "kase_6")

fault_binerrs_t_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_11=fault_binerrs_all$t_11, t_9=fault_binerrs_all$t_9, t_10=fault_binerrs_all$t_10)
results[["t_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_11_treat_df, "Y", "t_11")

fault_binerrs_kase_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_5=fault_binerrs_all$kase_5, kase_2=fault_binerrs_all$kase_2, kase_3=fault_binerrs_all$kase_3, kase_4=fault_binerrs_all$kase_4)
results[["kase_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_5_treat_df, "Y", "kase_5")

fault_binerrs_kase_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_4=fault_binerrs_all$kase_4)
results[["kase_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_4_treat_df, "Y", "kase_4")

fault_binerrs_kase_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, kase_3=fault_binerrs_all$kase_3)
results[["kase_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_kase_3_treat_df, "Y", "kase_3")

return(results)

}
