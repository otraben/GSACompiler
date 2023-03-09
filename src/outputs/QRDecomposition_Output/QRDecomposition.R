genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_j_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_20=fault_binerrs_all$j_20, j_19=fault_binerrs_all$j_19, j_20=fault_binerrs_all$j_20)
results[["j_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_20_treat_df, "Y", "j_20")

fault_binerrs_j_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_22=fault_binerrs_all$j_22)
results[["j_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_22_treat_df, "Y", "j_22")

fault_binerrs_j_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_21=fault_binerrs_all$j_21, j_19=fault_binerrs_all$j_19, j_20=fault_binerrs_all$j_20)
results[["j_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_21_treat_df, "Y", "j_21")

fault_binerrs_j_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_24=fault_binerrs_all$j_24, j_22=fault_binerrs_all$j_22, j_23=fault_binerrs_all$j_23)
results[["j_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_24_treat_df, "Y", "j_24")

fault_binerrs_j_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_23=fault_binerrs_all$j_23, j_22=fault_binerrs_all$j_22, j_23=fault_binerrs_all$j_23)
results[["j_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_23_treat_df, "Y", "j_23")

fault_binerrs_X_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, X_0=fault_binerrs_all$X_0)
results[["X_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_X_0_treat_df, "Y", "X_0")

fault_binerrs_j_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_26=fault_binerrs_all$j_26, j_25=fault_binerrs_all$j_25, j_26=fault_binerrs_all$j_26)
results[["j_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_26_treat_df, "Y", "j_26")

fault_binerrs_j_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_25=fault_binerrs_all$j_25)
results[["j_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_25_treat_df, "Y", "j_25")

fault_binerrs_X_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, X_2=fault_binerrs_all$X_2)
results[["X_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_X_2_treat_df, "Y", "X_2")

fault_binerrs_j_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_28=fault_binerrs_all$j_28, j_24=fault_binerrs_all$j_24, j_27=fault_binerrs_all$j_27)
results[["j_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_28_treat_df, "Y", "j_28")

fault_binerrs_X_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, X_1=fault_binerrs_all$X_1)
results[["X_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_X_1_treat_df, "Y", "X_1")

fault_binerrs_j_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_27=fault_binerrs_all$j_27, j_25=fault_binerrs_all$j_25, j_26=fault_binerrs_all$j_26)
results[["j_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_27_treat_df, "Y", "j_27")

fault_binerrs_i_41_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_41=fault_binerrs_all$i_41, i_39=fault_binerrs_all$i_39, i_40=fault_binerrs_all$i_40)
results[["i_41"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_41_treat_df, "Y", "i_41")

fault_binerrs_i_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_40=fault_binerrs_all$i_40, i_39=fault_binerrs_all$i_39, i_40=fault_binerrs_all$i_40)
results[["i_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_40_treat_df, "Y", "i_40")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_i_43_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_43=fault_binerrs_all$i_43, i_42=fault_binerrs_all$i_42, i_43=fault_binerrs_all$i_43)
results[["i_43"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_43_treat_df, "Y", "i_43")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10, j_7=fault_binerrs_all$j_7, j_9=fault_binerrs_all$j_9)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_i_42_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_42=fault_binerrs_all$i_42)
results[["i_42"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_42_treat_df, "Y", "i_42")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13, j_12=fault_binerrs_all$j_12)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12, j_11=fault_binerrs_all$j_11, j_14=fault_binerrs_all$j_14)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_i_44_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_44=fault_binerrs_all$i_44, i_42=fault_binerrs_all$i_42, i_43=fault_binerrs_all$i_43)
results[["i_44"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_44_treat_df, "Y", "i_44")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15, j_11=fault_binerrs_all$j_11, j_14=fault_binerrs_all$j_14)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_13=fault_binerrs_all$j_13)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_j_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_17=fault_binerrs_all$j_17, j_16=fault_binerrs_all$j_16, j_17=fault_binerrs_all$j_17)
results[["j_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_17_treat_df, "Y", "j_17")

fault_binerrs_j_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_16=fault_binerrs_all$j_16)
results[["j_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_16_treat_df, "Y", "j_16")

fault_binerrs_j_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_19=fault_binerrs_all$j_19)
results[["j_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_19_treat_df, "Y", "j_19")

fault_binerrs_j_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_18=fault_binerrs_all$j_18, j_16=fault_binerrs_all$j_16, j_17=fault_binerrs_all$j_17)
results[["j_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_18_treat_df, "Y", "j_18")

fault_binerrs_k_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_10=fault_binerrs_all$k_10, k_9=fault_binerrs_all$k_9, k_10=fault_binerrs_all$k_10)
results[["k_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_10_treat_df, "Y", "k_10")

fault_binerrs_k_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_13=fault_binerrs_all$k_13, k_12=fault_binerrs_all$k_12, k_13=fault_binerrs_all$k_13)
results[["k_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_13_treat_df, "Y", "k_13")

fault_binerrs_k_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_14=fault_binerrs_all$k_14, k_12=fault_binerrs_all$k_12, k_13=fault_binerrs_all$k_13)
results[["k_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_14_treat_df, "Y", "k_14")

fault_binerrs_k_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_11=fault_binerrs_all$k_11, k_6=fault_binerrs_all$k_6, k_10=fault_binerrs_all$k_10)
results[["k_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_11_treat_df, "Y", "k_11")

fault_binerrs_k_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_12=fault_binerrs_all$k_12)
results[["k_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_12_treat_df, "Y", "k_12")

fault_binerrs_k_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_17=fault_binerrs_all$k_17, k_15=fault_binerrs_all$k_15, k_16=fault_binerrs_all$k_16)
results[["k_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_17_treat_df, "Y", "k_17")

fault_binerrs_k_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_15=fault_binerrs_all$k_15)
results[["k_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_15_treat_df, "Y", "k_15")

fault_binerrs_k_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_16=fault_binerrs_all$k_16, k_15=fault_binerrs_all$k_15, k_16=fault_binerrs_all$k_16)
results[["k_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_16_treat_df, "Y", "k_16")

fault_binerrs_s_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_11=fault_binerrs_all$s_11, s_10=fault_binerrs_all$s_10)
results[["s_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_11_treat_df, "Y", "s_11")

fault_binerrs_k_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_1=fault_binerrs_all$k_1, k_0=fault_binerrs_all$k_0, k_4=fault_binerrs_all$k_4)
results[["k_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_1_treat_df, "Y", "k_1")

fault_binerrs_k_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_0=fault_binerrs_all$k_0, k_0=fault_binerrs_all$k_0, k_4=fault_binerrs_all$k_4)
results[["k_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_0_treat_df, "Y", "k_0")

fault_binerrs_k_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_3=fault_binerrs_all$k_3, k_2=fault_binerrs_all$k_2, k_0=fault_binerrs_all$k_0)
results[["k_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_3_treat_df, "Y", "k_3")

fault_binerrs_s_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_10=fault_binerrs_all$s_10, s_8=fault_binerrs_all$s_8, s_9=fault_binerrs_all$s_9)
results[["s_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_10_treat_df, "Y", "s_10")

fault_binerrs_k_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_2=fault_binerrs_all$k_2, k_1=fault_binerrs_all$k_1)
results[["k_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_2_treat_df, "Y", "k_2")

fault_binerrs_k_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_5=fault_binerrs_all$k_5, k_0=fault_binerrs_all$k_0, k_4=fault_binerrs_all$k_4)
results[["k_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_5_treat_df, "Y", "k_5")

fault_binerrs_k_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_4=fault_binerrs_all$k_4, k_3=fault_binerrs_all$k_3)
results[["k_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_4_treat_df, "Y", "k_4")

fault_binerrs_k_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_7=fault_binerrs_all$k_7, k_6=fault_binerrs_all$k_6, k_8=fault_binerrs_all$k_8)
results[["k_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_7_treat_df, "Y", "k_7")

fault_binerrs_k_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_6=fault_binerrs_all$k_6, k_6=fault_binerrs_all$k_6, k_10=fault_binerrs_all$k_10)
results[["k_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_6_treat_df, "Y", "k_6")

fault_binerrs_s_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_1=fault_binerrs_all$s_1, s_0=fault_binerrs_all$s_0, s_1=fault_binerrs_all$s_1)
results[["s_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_1_treat_df, "Y", "s_1")

fault_binerrs_k_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_9=fault_binerrs_all$k_9, k_6=fault_binerrs_all$k_6, k_8=fault_binerrs_all$k_8)
results[["k_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_9_treat_df, "Y", "k_9")

fault_binerrs_s_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_0=fault_binerrs_all$s_0)
results[["s_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_0_treat_df, "Y", "s_0")

fault_binerrs_k_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_8=fault_binerrs_all$k_8, k_7=fault_binerrs_all$k_7)
results[["k_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_8_treat_df, "Y", "k_8")

fault_binerrs_s_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_3=fault_binerrs_all$s_3, s_2=fault_binerrs_all$s_2)
results[["s_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_3_treat_df, "Y", "s_3")

fault_binerrs_s_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_2=fault_binerrs_all$s_2, s_0=fault_binerrs_all$s_0, s_1=fault_binerrs_all$s_1)
results[["s_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_2_treat_df, "Y", "s_2")

fault_binerrs_s_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_5=fault_binerrs_all$s_5, s_4=fault_binerrs_all$s_4, s_5=fault_binerrs_all$s_5)
results[["s_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_5_treat_df, "Y", "s_5")

fault_binerrs_s_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_4=fault_binerrs_all$s_4)
results[["s_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_4_treat_df, "Y", "s_4")

fault_binerrs_s_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_7=fault_binerrs_all$s_7, s_6=fault_binerrs_all$s_6, k_8=fault_binerrs_all$k_8, k_8=fault_binerrs_all$k_8)
results[["s_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_7_treat_df, "Y", "s_7")

fault_binerrs_s_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_6=fault_binerrs_all$s_6, s_4=fault_binerrs_all$s_4, s_5=fault_binerrs_all$s_5)
results[["s_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_6_treat_df, "Y", "s_6")

fault_binerrs_s_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_9=fault_binerrs_all$s_9, s_8=fault_binerrs_all$s_8, s_9=fault_binerrs_all$s_9)
results[["s_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_9_treat_df, "Y", "s_9")

fault_binerrs_s_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_8=fault_binerrs_all$s_8)
results[["s_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_8_treat_df, "Y", "s_8")

fault_binerrs_B_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, B_0=fault_binerrs_all$B_0)
results[["B_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_B_0_treat_df, "Y", "B_0")

fault_binerrs_B_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, B_1=fault_binerrs_all$B_1, B_0=fault_binerrs_all$B_0)
results[["B_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_B_1_treat_df, "Y", "B_1")

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_5=fault_binerrs_all$i_5, i_11=fault_binerrs_all$i_11)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13, i_12=fault_binerrs_all$i_12, i_2=fault_binerrs_all$i_2)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_i_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_16=fault_binerrs_all$i_16, i_14=fault_binerrs_all$i_14, i_15=fault_binerrs_all$i_15)
results[["i_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_16_treat_df, "Y", "i_16")

fault_binerrs_i_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_15=fault_binerrs_all$i_15, i_14=fault_binerrs_all$i_14, i_15=fault_binerrs_all$i_15)
results[["i_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_15_treat_df, "Y", "i_15")

fault_binerrs_i_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_18=fault_binerrs_all$i_18, i_14=fault_binerrs_all$i_14, i_17=fault_binerrs_all$i_17)
results[["i_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_18_treat_df, "Y", "i_18")

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_16=fault_binerrs_all$i_16, i_17=fault_binerrs_all$i_17)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0, k_2=fault_binerrs_all$k_2)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_3=fault_binerrs_all$j_3, j_5=fault_binerrs_all$j_5)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6, j_3=fault_binerrs_all$j_3, j_5=fault_binerrs_all$j_5)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5, j_4=fault_binerrs_all$j_4)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8, j_7=fault_binerrs_all$j_7, j_9=fault_binerrs_all$j_9)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9, j_8=fault_binerrs_all$j_8)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_A_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, A_0=fault_binerrs_all$A_0)
results[["A_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_A_0_treat_df, "Y", "A_0")

fault_binerrs_i_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_30=fault_binerrs_all$i_30, i_28=fault_binerrs_all$i_28, i_29=fault_binerrs_all$i_29)
results[["i_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_30_treat_df, "Y", "i_30")

fault_binerrs_i_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_32=fault_binerrs_all$i_32, i_31=fault_binerrs_all$i_31, i_32=fault_binerrs_all$i_32)
results[["i_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_32_treat_df, "Y", "i_32")

fault_binerrs_i_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_31=fault_binerrs_all$i_31, k_8=fault_binerrs_all$k_8)
results[["i_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_31_treat_df, "Y", "i_31")

fault_binerrs_i_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_34=fault_binerrs_all$i_34, i_33=fault_binerrs_all$i_33, i_27=fault_binerrs_all$i_27)
results[["i_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_34_treat_df, "Y", "i_34")

fault_binerrs_i_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_33=fault_binerrs_all$i_33, i_31=fault_binerrs_all$i_31, i_32=fault_binerrs_all$i_32)
results[["i_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_33_treat_df, "Y", "i_33")

fault_binerrs_nx_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nx_0=fault_binerrs_all$nx_0, B_1=fault_binerrs_all$B_1)
results[["nx_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nx_0_treat_df, "Y", "nx_0")

fault_binerrs_i_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_36=fault_binerrs_all$i_36, i_36=fault_binerrs_all$i_36, i_37=fault_binerrs_all$i_37)
results[["i_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_36_treat_df, "Y", "i_36")

fault_binerrs_i_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_35=fault_binerrs_all$i_35, i_27=fault_binerrs_all$i_27, i_34=fault_binerrs_all$i_34)
results[["i_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_35_treat_df, "Y", "i_35")

fault_binerrs_i_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_38=fault_binerrs_all$i_38, i_36=fault_binerrs_all$i_36, i_37=fault_binerrs_all$i_37)
results[["i_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_38_treat_df, "Y", "i_38")

fault_binerrs_i_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_37=fault_binerrs_all$i_37, i_36=fault_binerrs_all$i_36, i_37=fault_binerrs_all$i_37)
results[["i_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_37_treat_df, "Y", "i_37")

fault_binerrs_i_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_39=fault_binerrs_all$i_39)
results[["i_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_39_treat_df, "Y", "i_39")

fault_binerrs_nrm_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_1=fault_binerrs_all$nrm_1, nrm_0=fault_binerrs_all$nrm_0, nrm_1=fault_binerrs_all$nrm_1)
results[["nrm_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_1_treat_df, "Y", "nrm_1")

fault_binerrs_nrm_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_0=fault_binerrs_all$nrm_0)
results[["nrm_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_0_treat_df, "Y", "nrm_0")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_nrm_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_5=fault_binerrs_all$nrm_5, nrm_4=fault_binerrs_all$nrm_4, nrm_3=fault_binerrs_all$nrm_3)
results[["nrm_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_5_treat_df, "Y", "nrm_5")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3, k_2=fault_binerrs_all$k_2)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_nrm_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_4=fault_binerrs_all$nrm_4, nrm_3=fault_binerrs_all$nrm_3)
results[["nrm_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_4_treat_df, "Y", "nrm_4")

fault_binerrs_nrm_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_3=fault_binerrs_all$nrm_3, nrm_2=fault_binerrs_all$nrm_2)
results[["nrm_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_3_treat_df, "Y", "nrm_3")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_nrm_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_2=fault_binerrs_all$nrm_2, nrm_0=fault_binerrs_all$nrm_0, nrm_1=fault_binerrs_all$nrm_1)
results[["nrm_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_2_treat_df, "Y", "nrm_2")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_nrm_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, nrm_6=fault_binerrs_all$nrm_6, nrm_5=fault_binerrs_all$nrm_5, nrm_3=fault_binerrs_all$nrm_3)
results[["nrm_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_nrm_6_treat_df, "Y", "nrm_6")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21, i_20=fault_binerrs_all$i_20)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20, i_19=fault_binerrs_all$i_19, i_21=fault_binerrs_all$i_21)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23, i_22=fault_binerrs_all$i_22, i_23=fault_binerrs_all$i_23)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22, i_19=fault_binerrs_all$i_19, i_21=fault_binerrs_all$i_21)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24, i_19=fault_binerrs_all$i_19, i_23=fault_binerrs_all$i_23)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_i_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_27=fault_binerrs_all$i_27, i_25=fault_binerrs_all$i_25, i_26=fault_binerrs_all$i_26)
results[["i_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_27_treat_df, "Y", "i_27")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26, i_25=fault_binerrs_all$i_25, i_26=fault_binerrs_all$i_26)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

fault_binerrs_i_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_29=fault_binerrs_all$i_29, i_28=fault_binerrs_all$i_28, i_29=fault_binerrs_all$i_29)
results[["i_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_29_treat_df, "Y", "i_29")

fault_binerrs_i_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_28=fault_binerrs_all$i_28, i_28=fault_binerrs_all$i_28, i_29=fault_binerrs_all$i_29)
results[["i_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_28_treat_df, "Y", "i_28")

return(results)

}
