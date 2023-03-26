genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_col_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_10=fault_binerrs_all$col_10, col_9=fault_binerrs_all$col_9)
results[["col_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_10_treat_df, "Y", "col_10")

fault_binerrs_i_50_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_50=fault_binerrs_all$i_50)
results[["i_50"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_50_treat_df, "Y", "i_50")

fault_binerrs_col_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_11=fault_binerrs_all$col_11, col_2=fault_binerrs_all$col_2, col_10=fault_binerrs_all$col_10)
results[["col_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_11_treat_df, "Y", "col_11")

fault_binerrs_i_52_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_52=fault_binerrs_all$i_52)
results[["i_52"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_52_treat_df, "Y", "i_52")

fault_binerrs_j_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_20=fault_binerrs_all$j_20)
results[["j_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_20_treat_df, "Y", "j_20")

fault_binerrs_i_51_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_51=fault_binerrs_all$i_51, i_49=fault_binerrs_all$i_49, i_50=fault_binerrs_all$i_50)
results[["i_51"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_51_treat_df, "Y", "i_51")

fault_binerrs_i_54_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_54=fault_binerrs_all$i_54, i_54=fault_binerrs_all$i_54, i_55=fault_binerrs_all$i_55)
results[["i_54"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_54_treat_df, "Y", "i_54")

fault_binerrs_j_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_22=fault_binerrs_all$j_22, j_22=fault_binerrs_all$j_22, j_23=fault_binerrs_all$j_23)
results[["j_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_22_treat_df, "Y", "j_22")

fault_binerrs_i_53_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_53=fault_binerrs_all$i_53, i_52=fault_binerrs_all$i_52)
results[["i_53"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_53_treat_df, "Y", "i_53")

fault_binerrs_j_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_21=fault_binerrs_all$j_21, j_20=fault_binerrs_all$j_20)
results[["j_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_21_treat_df, "Y", "j_21")

fault_binerrs_j_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_24=fault_binerrs_all$j_24, j_22=fault_binerrs_all$j_22, j_23=fault_binerrs_all$j_23)
results[["j_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_24_treat_df, "Y", "j_24")

fault_binerrs_i_56_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_56=fault_binerrs_all$i_56, i_54=fault_binerrs_all$i_54, i_55=fault_binerrs_all$i_55)
results[["i_56"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_56_treat_df, "Y", "i_56")

fault_binerrs_j_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_23=fault_binerrs_all$j_23)
results[["j_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_23_treat_df, "Y", "j_23")

fault_binerrs_i_55_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_55=fault_binerrs_all$i_55)
results[["i_55"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_55_treat_df, "Y", "i_55")

fault_binerrs_j_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_25=fault_binerrs_all$j_25, j_19=fault_binerrs_all$j_19, j_24=fault_binerrs_all$j_24)
results[["j_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_25_treat_df, "Y", "j_25")

fault_binerrs_row_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_29=fault_binerrs_all$row_29, row_29=fault_binerrs_all$row_29, row_30=fault_binerrs_all$row_30)
results[["row_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_29_treat_df, "Y", "row_29")

fault_binerrs_row_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_25=fault_binerrs_all$row_25)
results[["row_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_25_treat_df, "Y", "row_25")

fault_binerrs_row_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_26=fault_binerrs_all$row_26, row_24=fault_binerrs_all$row_24, row_25=fault_binerrs_all$row_25)
results[["row_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_26_treat_df, "Y", "row_26")

fault_binerrs_row_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_27=fault_binerrs_all$row_27)
results[["row_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_27_treat_df, "Y", "row_27")

fault_binerrs_row_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_28=fault_binerrs_all$row_28, row_27=fault_binerrs_all$row_27)
results[["row_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_28_treat_df, "Y", "row_28")

fault_binerrs_row_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_21=fault_binerrs_all$row_21, row_4=fault_binerrs_all$row_4, row_20=fault_binerrs_all$row_20)
results[["row_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_21_treat_df, "Y", "row_21")

fault_binerrs_row_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_22=fault_binerrs_all$row_22)
results[["row_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_22_treat_df, "Y", "row_22")

fault_binerrs_row_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_23=fault_binerrs_all$row_23, row_22=fault_binerrs_all$row_22)
results[["row_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_23_treat_df, "Y", "row_23")

fault_binerrs_row_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_24=fault_binerrs_all$row_24, row_24=fault_binerrs_all$row_24, row_25=fault_binerrs_all$row_25)
results[["row_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_24_treat_df, "Y", "row_24")

fault_binerrs_row_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_20=fault_binerrs_all$row_20, row_18=fault_binerrs_all$row_18, row_19=fault_binerrs_all$row_19)
results[["row_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_20_treat_df, "Y", "row_20")

fault_binerrs_i_41_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_41=fault_binerrs_all$i_41, i_39=fault_binerrs_all$i_39, i_40=fault_binerrs_all$i_40)
results[["i_41"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_41_treat_df, "Y", "i_41")

fault_binerrs_i_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_40=fault_binerrs_all$i_40)
results[["i_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_40_treat_df, "Y", "i_40")

fault_binerrs_i_43_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_43=fault_binerrs_all$i_43, i_42=fault_binerrs_all$i_42)
results[["i_43"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_43_treat_df, "Y", "i_43")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11, j_10=fault_binerrs_all$j_10)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_i_42_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_42=fault_binerrs_all$i_42)
results[["i_42"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_42_treat_df, "Y", "i_42")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_i_45_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_45=fault_binerrs_all$i_45)
results[["i_45"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_45_treat_df, "Y", "i_45")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_i_44_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_44=fault_binerrs_all$i_44, i_44=fault_binerrs_all$i_44, i_45=fault_binerrs_all$i_45)
results[["i_44"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_44_treat_df, "Y", "i_44")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12, j_12=fault_binerrs_all$j_12, j_13=fault_binerrs_all$j_13)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_i_47_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_47=fault_binerrs_all$i_47)
results[["i_47"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_47_treat_df, "Y", "i_47")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_i_46_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_46=fault_binerrs_all$i_46, i_44=fault_binerrs_all$i_44, i_45=fault_binerrs_all$i_45)
results[["i_46"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_46_treat_df, "Y", "i_46")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_12=fault_binerrs_all$j_12, j_13=fault_binerrs_all$j_13)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_i_49_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_49=fault_binerrs_all$i_49, i_49=fault_binerrs_all$i_49, i_50=fault_binerrs_all$i_50)
results[["i_49"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_49_treat_df, "Y", "i_49")

fault_binerrs_j_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_17=fault_binerrs_all$j_17, j_17=fault_binerrs_all$j_17, j_18=fault_binerrs_all$j_18)
results[["j_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_17_treat_df, "Y", "j_17")

fault_binerrs_i_48_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_48=fault_binerrs_all$i_48, i_47=fault_binerrs_all$i_47)
results[["i_48"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_48_treat_df, "Y", "i_48")

fault_binerrs_j_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_16=fault_binerrs_all$j_16, j_15=fault_binerrs_all$j_15)
results[["j_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_16_treat_df, "Y", "j_16")

fault_binerrs_j_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_19=fault_binerrs_all$j_19, j_17=fault_binerrs_all$j_17, j_18=fault_binerrs_all$j_18)
results[["j_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_19_treat_df, "Y", "j_19")

fault_binerrs_j_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_18=fault_binerrs_all$j_18)
results[["j_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_18_treat_df, "Y", "j_18")

fault_binerrs_singular_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, singular_0=fault_binerrs_all$singular_0)
results[["singular_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_singular_0_treat_df, "Y", "singular_0")

fault_binerrs_max_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_4=fault_binerrs_all$max_4, max_3=fault_binerrs_all$max_3)
results[["max_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_4_treat_df, "Y", "max_4")

fault_binerrs_max_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_3=fault_binerrs_all$max_3, max_0=fault_binerrs_all$max_0, max_2=fault_binerrs_all$max_2)
results[["max_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_3_treat_df, "Y", "max_3")

fault_binerrs_max_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_5=fault_binerrs_all$max_5, max_4=fault_binerrs_all$max_4)
results[["max_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_5_treat_df, "Y", "max_5")

fault_binerrs_max_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_0=fault_binerrs_all$max_0, col_3=fault_binerrs_all$col_3)
results[["max_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_0_treat_df, "Y", "max_0")

fault_binerrs_max_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_2=fault_binerrs_all$max_2, max_1=fault_binerrs_all$max_1, max_0=fault_binerrs_all$max_0)
results[["max_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_2_treat_df, "Y", "max_2")

fault_binerrs_max_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_1=fault_binerrs_all$max_1)
results[["max_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_1_treat_df, "Y", "max_1")

fault_binerrs_row_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_30=fault_binerrs_all$row_30)
results[["row_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_30_treat_df, "Y", "row_30")

fault_binerrs_row_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_31=fault_binerrs_all$row_31, row_29=fault_binerrs_all$row_29, row_30=fault_binerrs_all$row_30)
results[["row_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_31_treat_df, "Y", "row_31")

fault_binerrs_col_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_32=fault_binerrs_all$col_32)
results[["col_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_32_treat_df, "Y", "col_32")

fault_binerrs_col_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_33=fault_binerrs_all$col_33, col_32=fault_binerrs_all$col_32)
results[["col_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_33_treat_df, "Y", "col_33")

fault_binerrs_col_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_30=fault_binerrs_all$col_30, col_29=fault_binerrs_all$col_29)
results[["col_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_30_treat_df, "Y", "col_30")

fault_binerrs_col_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_31=fault_binerrs_all$col_31, col_31=fault_binerrs_all$col_31, col_33=fault_binerrs_all$col_33)
results[["col_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_31_treat_df, "Y", "col_31")

fault_binerrs_col_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_29=fault_binerrs_all$col_29)
results[["col_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_29_treat_df, "Y", "col_29")

fault_binerrs_col_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_27=fault_binerrs_all$col_27)
results[["col_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_27_treat_df, "Y", "col_27")

fault_binerrs_col_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_28=fault_binerrs_all$col_28, col_26=fault_binerrs_all$col_26, col_27=fault_binerrs_all$col_27)
results[["col_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_28_treat_df, "Y", "col_28")

fault_binerrs_col_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_25=fault_binerrs_all$col_25, col_24=fault_binerrs_all$col_24)
results[["col_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_25_treat_df, "Y", "col_25")

fault_binerrs_col_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_26=fault_binerrs_all$col_26, col_26=fault_binerrs_all$col_26, col_27=fault_binerrs_all$col_27)
results[["col_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_26_treat_df, "Y", "col_26")

fault_binerrs_col_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_23=fault_binerrs_all$col_23, col_20=fault_binerrs_all$col_20, col_22=fault_binerrs_all$col_22)
results[["col_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_23_treat_df, "Y", "col_23")

fault_binerrs_col_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_24=fault_binerrs_all$col_24)
results[["col_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_24_treat_df, "Y", "col_24")

fault_binerrs_col_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_21=fault_binerrs_all$col_21)
results[["col_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_21_treat_df, "Y", "col_21")

fault_binerrs_col_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_22=fault_binerrs_all$col_22, col_21=fault_binerrs_all$col_21)
results[["col_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_22_treat_df, "Y", "col_22")

fault_binerrs_col_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_20=fault_binerrs_all$col_20, col_20=fault_binerrs_all$col_20, col_22=fault_binerrs_all$col_22)
results[["col_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_20_treat_df, "Y", "col_20")

fault_binerrs_row_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_18=fault_binerrs_all$row_18, row_18=fault_binerrs_all$row_18, row_19=fault_binerrs_all$row_19)
results[["row_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_18_treat_df, "Y", "row_18")

fault_binerrs_row_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_19=fault_binerrs_all$row_19)
results[["row_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_19_treat_df, "Y", "row_19")

fault_binerrs_row_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_14=fault_binerrs_all$row_14)
results[["row_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_14_treat_df, "Y", "row_14")

fault_binerrs_row_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_15=fault_binerrs_all$row_15, row_13=fault_binerrs_all$row_13, row_14=fault_binerrs_all$row_14)
results[["row_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_15_treat_df, "Y", "row_15")

fault_binerrs_row_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_16=fault_binerrs_all$row_16, col_8=fault_binerrs_all$col_8)
results[["row_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_16_treat_df, "Y", "row_16")

fault_binerrs_row_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_17=fault_binerrs_all$row_17, row_16=fault_binerrs_all$row_16)
results[["row_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_17_treat_df, "Y", "row_17")

fault_binerrs_row_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_10=fault_binerrs_all$row_10, row_7=fault_binerrs_all$row_7, row_9=fault_binerrs_all$row_9)
results[["row_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_10_treat_df, "Y", "row_10")

fault_binerrs_col_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_18=fault_binerrs_all$col_18, m_23=fault_binerrs_all$m_23)
results[["col_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_18_treat_df, "Y", "col_18")

fault_binerrs_row_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_11=fault_binerrs_all$row_11, col_3=fault_binerrs_all$col_3)
results[["row_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_11_treat_df, "Y", "row_11")

fault_binerrs_col_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_19=fault_binerrs_all$col_19, col_18=fault_binerrs_all$col_18)
results[["col_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_19_treat_df, "Y", "col_19")

fault_binerrs_row_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_12=fault_binerrs_all$row_12, row_11=fault_binerrs_all$row_11)
results[["row_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_12_treat_df, "Y", "row_12")

fault_binerrs_col_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_16=fault_binerrs_all$col_16, col_15=fault_binerrs_all$col_15)
results[["col_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_16_treat_df, "Y", "col_16")

fault_binerrs_row_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_13=fault_binerrs_all$row_13, row_13=fault_binerrs_all$row_13, row_14=fault_binerrs_all$row_14)
results[["row_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_13_treat_df, "Y", "row_13")

fault_binerrs_col_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_17=fault_binerrs_all$col_17, col_14=fault_binerrs_all$col_14, col_16=fault_binerrs_all$col_16)
results[["col_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_17_treat_df, "Y", "col_17")

fault_binerrs_col_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_14=fault_binerrs_all$col_14, col_14=fault_binerrs_all$col_14, col_16=fault_binerrs_all$col_16)
results[["col_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_14_treat_df, "Y", "col_14")

fault_binerrs_col_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_15=fault_binerrs_all$col_15)
results[["col_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_15_treat_df, "Y", "col_15")

fault_binerrs_col_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_12=fault_binerrs_all$col_12)
results[["col_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_12_treat_df, "Y", "col_12")

fault_binerrs_col_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_13=fault_binerrs_all$col_13, col_12=fault_binerrs_all$col_12)
results[["col_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_13_treat_df, "Y", "col_13")

fault_binerrs_col_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_6=fault_binerrs_all$col_6, col_4=fault_binerrs_all$col_4, col_5=fault_binerrs_all$col_5)
results[["col_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_6_treat_df, "Y", "col_6")

fault_binerrs_col_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_5=fault_binerrs_all$col_5)
results[["col_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_5_treat_df, "Y", "col_5")

fault_binerrs_col_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_4=fault_binerrs_all$col_4, col_4=fault_binerrs_all$col_4, col_5=fault_binerrs_all$col_5)
results[["col_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_4_treat_df, "Y", "col_4")

fault_binerrs_col_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_3=fault_binerrs_all$col_3)
results[["col_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_3_treat_df, "Y", "col_3")

fault_binerrs_col_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_2=fault_binerrs_all$col_2, col_2=fault_binerrs_all$col_2, col_10=fault_binerrs_all$col_10)
results[["col_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_2_treat_df, "Y", "col_2")

fault_binerrs_col_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_1=fault_binerrs_all$col_1, col_0=fault_binerrs_all$col_0)
results[["col_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_1_treat_df, "Y", "col_1")

fault_binerrs_col_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_0=fault_binerrs_all$col_0)
results[["col_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_0_treat_df, "Y", "col_0")

fault_binerrs_col_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_9=fault_binerrs_all$col_9, col_8=fault_binerrs_all$col_8)
results[["col_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_9_treat_df, "Y", "col_9")

fault_binerrs_col_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_8=fault_binerrs_all$col_8, col_7=fault_binerrs_all$col_7)
results[["col_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_8_treat_df, "Y", "col_8")

fault_binerrs_col_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_7=fault_binerrs_all$col_7, col_6=fault_binerrs_all$col_6)
results[["col_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_7_treat_df, "Y", "col_7")

fault_binerrs_bpCol_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, bpCol_1=fault_binerrs_all$bpCol_1)
results[["bpCol_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_bpCol_1_treat_df, "Y", "bpCol_1")

fault_binerrs_col_40_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_40=fault_binerrs_all$col_40, col_37=fault_binerrs_all$col_37, col_39=fault_binerrs_all$col_39)
results[["col_40"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_40_treat_df, "Y", "col_40")

fault_binerrs_bpCol_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, bpCol_0=fault_binerrs_all$bpCol_0)
results[["bpCol_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_bpCol_0_treat_df, "Y", "bpCol_0")

fault_binerrs_largest_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_4=fault_binerrs_all$largest_4, largest_0=fault_binerrs_all$largest_0, largest_3=fault_binerrs_all$largest_3)
results[["largest_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_4_treat_df, "Y", "largest_4")

fault_binerrs_largest_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_3=fault_binerrs_all$largest_3, largest_2=fault_binerrs_all$largest_2, largest_1=fault_binerrs_all$largest_1)
results[["largest_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_3_treat_df, "Y", "largest_3")

fault_binerrs_largest_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_2=fault_binerrs_all$largest_2, sum_6=fault_binerrs_all$sum_6)
results[["largest_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_2_treat_df, "Y", "largest_2")

fault_binerrs_largest_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_1=fault_binerrs_all$largest_1)
results[["largest_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_1_treat_df, "Y", "largest_1")

fault_binerrs_largest_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_0=fault_binerrs_all$largest_0, largest_0=fault_binerrs_all$largest_0, largest_3=fault_binerrs_all$largest_3)
results[["largest_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_0_treat_df, "Y", "largest_0")

fault_binerrs_col_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_38=fault_binerrs_all$col_38)
results[["col_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_38_treat_df, "Y", "col_38")

fault_binerrs_col_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_39=fault_binerrs_all$col_39, col_38=fault_binerrs_all$col_38)
results[["col_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_39_treat_df, "Y", "col_39")

fault_binerrs_col_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_36=fault_binerrs_all$col_36, col_35=fault_binerrs_all$col_35)
results[["col_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_36_treat_df, "Y", "col_36")

fault_binerrs_col_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_37=fault_binerrs_all$col_37, col_37=fault_binerrs_all$col_37, col_39=fault_binerrs_all$col_39)
results[["col_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_37_treat_df, "Y", "col_37")

fault_binerrs_col_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_34=fault_binerrs_all$col_34, col_31=fault_binerrs_all$col_31, col_33=fault_binerrs_all$col_33)
results[["col_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_34_treat_df, "Y", "col_34")

fault_binerrs_col_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_35=fault_binerrs_all$col_35, m_30=fault_binerrs_all$m_30)
results[["col_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_35_treat_df, "Y", "col_35")

fault_binerrs_m_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_1=fault_binerrs_all$m_1, m_0=fault_binerrs_all$m_0)
results[["m_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_1_treat_df, "Y", "m_1")

fault_binerrs_m_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_0=fault_binerrs_all$m_0, matrix_1=fault_binerrs_all$matrix_1)
results[["m_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_0_treat_df, "Y", "m_0")

fault_binerrs_m_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_3=fault_binerrs_all$m_3)
results[["m_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_3_treat_df, "Y", "m_3")

fault_binerrs_m_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_2=fault_binerrs_all$m_2, m_2=fault_binerrs_all$m_2, m_6=fault_binerrs_all$m_6)
results[["m_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_2_treat_df, "Y", "m_2")

fault_binerrs_m_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_5=fault_binerrs_all$m_5, m_4=fault_binerrs_all$m_4, m_3=fault_binerrs_all$m_3)
results[["m_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_5_treat_df, "Y", "m_5")

fault_binerrs_m_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_4=fault_binerrs_all$m_4, m_3=fault_binerrs_all$m_3)
results[["m_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_4_treat_df, "Y", "m_4")

fault_binerrs_m_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_7=fault_binerrs_all$m_7, m_2=fault_binerrs_all$m_2, m_6=fault_binerrs_all$m_6)
results[["m_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_7_treat_df, "Y", "m_7")

fault_binerrs_m_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_6=fault_binerrs_all$m_6, m_5=fault_binerrs_all$m_5)
results[["m_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_6_treat_df, "Y", "m_6")

fault_binerrs_m_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_9=fault_binerrs_all$m_9, m_8=fault_binerrs_all$m_8)
results[["m_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_9_treat_df, "Y", "m_9")

fault_binerrs_m_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_8=fault_binerrs_all$m_8)
results[["m_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_8_treat_df, "Y", "m_8")

fault_binerrs_m_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_11=fault_binerrs_all$m_11, m_11=fault_binerrs_all$m_11, m_12=fault_binerrs_all$m_12)
results[["m_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_11_treat_df, "Y", "m_11")

fault_binerrs_m_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_12=fault_binerrs_all$m_12)
results[["m_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_12_treat_df, "Y", "m_12")

fault_binerrs_m_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_10=fault_binerrs_all$m_10)
results[["m_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_10_treat_df, "Y", "m_10")

fault_binerrs_m_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_15=fault_binerrs_all$m_15, m_14=fault_binerrs_all$m_14)
results[["m_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_15_treat_df, "Y", "m_15")

fault_binerrs_m_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_16=fault_binerrs_all$m_16)
results[["m_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_16_treat_df, "Y", "m_16")

fault_binerrs_m_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_13=fault_binerrs_all$m_13, m_11=fault_binerrs_all$m_11, m_12=fault_binerrs_all$m_12)
results[["m_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_13_treat_df, "Y", "m_13")

fault_binerrs_m_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_14=fault_binerrs_all$m_14)
results[["m_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_14_treat_df, "Y", "m_14")

fault_binerrs_m_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_19=fault_binerrs_all$m_19, m_18=fault_binerrs_all$m_18)
results[["m_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_19_treat_df, "Y", "m_19")

fault_binerrs_m_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_17=fault_binerrs_all$m_17, m_16=fault_binerrs_all$m_16)
results[["m_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_17_treat_df, "Y", "m_17")

fault_binerrs_m_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_18=fault_binerrs_all$m_18)
results[["m_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_18_treat_df, "Y", "m_18")

fault_binerrs_determinant_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, determinant_0=fault_binerrs_all$determinant_0, determinant_0=fault_binerrs_all$determinant_0, determinant_1=fault_binerrs_all$determinant_1)
results[["determinant_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_determinant_0_treat_df, "Y", "determinant_0")

fault_binerrs_determinant_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, determinant_1=fault_binerrs_all$determinant_1)
results[["determinant_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_determinant_1_treat_df, "Y", "determinant_1")

fault_binerrs_determinant_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, determinant_2=fault_binerrs_all$determinant_2, determinant_0=fault_binerrs_all$determinant_0, determinant_1=fault_binerrs_all$determinant_1)
results[["determinant_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_determinant_2_treat_df, "Y", "determinant_2")

fault_binerrs_temp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, temp_0=fault_binerrs_all$temp_0, max_5=fault_binerrs_all$max_5)
results[["temp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_temp_0_treat_df, "Y", "temp_0")

fault_binerrs_m_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_31=fault_binerrs_all$m_31, m_30=fault_binerrs_all$m_30)
results[["m_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_31_treat_df, "Y", "m_31")

fault_binerrs_singularityThreshold_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, singularityThreshold_0=fault_binerrs_all$singularityThreshold_0, singularityThreshold_0=fault_binerrs_all$singularityThreshold_0, singularityThreshold_0=fault_binerrs_all$singularityThreshold_0)
results[["singularityThreshold_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_singularityThreshold_0_treat_df, "Y", "singularityThreshold_0")

fault_binerrs_m_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_30=fault_binerrs_all$m_30, m_28=fault_binerrs_all$m_28, m_29=fault_binerrs_all$m_29)
results[["m_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_30_treat_df, "Y", "m_30")

fault_binerrs_m_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_22=fault_binerrs_all$m_22)
results[["m_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_22_treat_df, "Y", "m_22")

fault_binerrs_m_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_23=fault_binerrs_all$m_23, m_21=fault_binerrs_all$m_21, m_22=fault_binerrs_all$m_22)
results[["m_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_23_treat_df, "Y", "m_23")

fault_binerrs_m_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_20=fault_binerrs_all$m_20, m_19=fault_binerrs_all$m_19)
results[["m_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_20_treat_df, "Y", "m_20")

fault_binerrs_m_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_21=fault_binerrs_all$m_21, m_21=fault_binerrs_all$m_21, m_22=fault_binerrs_all$m_22)
results[["m_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_21_treat_df, "Y", "m_21")

fault_binerrs_m_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_26=fault_binerrs_all$m_26, m_25=fault_binerrs_all$m_25)
results[["m_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_26_treat_df, "Y", "m_26")

fault_binerrs_m_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_27=fault_binerrs_all$m_27, m_26=fault_binerrs_all$m_26)
results[["m_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_27_treat_df, "Y", "m_27")

fault_binerrs_m_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_24=fault_binerrs_all$m_24, m_23=fault_binerrs_all$m_23)
results[["m_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_24_treat_df, "Y", "m_24")

fault_binerrs_m_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_25=fault_binerrs_all$m_25)
results[["m_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_25_treat_df, "Y", "m_25")

fault_binerrs_row_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_7=fault_binerrs_all$row_7, row_7=fault_binerrs_all$row_7, row_9=fault_binerrs_all$row_9)
results[["row_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_7_treat_df, "Y", "row_7")

fault_binerrs_row_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_8=fault_binerrs_all$row_8)
results[["row_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_8_treat_df, "Y", "row_8")

fault_binerrs_row_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_5=fault_binerrs_all$row_5)
results[["row_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_5_treat_df, "Y", "row_5")

fault_binerrs_m_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_28=fault_binerrs_all$m_28, m_28=fault_binerrs_all$m_28, m_29=fault_binerrs_all$m_29)
results[["m_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_28_treat_df, "Y", "m_28")

fault_binerrs_row_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_6=fault_binerrs_all$row_6, row_5=fault_binerrs_all$row_5)
results[["row_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_6_treat_df, "Y", "row_6")

fault_binerrs_m_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_29=fault_binerrs_all$m_29)
results[["m_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_29_treat_df, "Y", "m_29")

fault_binerrs_row_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_9=fault_binerrs_all$row_9, row_8=fault_binerrs_all$row_8)
results[["row_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_9_treat_df, "Y", "row_9")

fault_binerrs_luDiag_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, luDiag_1=fault_binerrs_all$luDiag_1)
results[["luDiag_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_luDiag_1_treat_df, "Y", "luDiag_1")

fault_binerrs_row_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_0=fault_binerrs_all$row_0)
results[["row_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_0_treat_df, "Y", "row_0")

fault_binerrs_luDiag_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, luDiag_0=fault_binerrs_all$luDiag_0, col_8=fault_binerrs_all$col_8, col_8=fault_binerrs_all$col_8)
results[["luDiag_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_luDiag_0_treat_df, "Y", "luDiag_0")

fault_binerrs_row_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_3=fault_binerrs_all$row_3)
results[["row_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_3_treat_df, "Y", "row_3")

fault_binerrs_row_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_4=fault_binerrs_all$row_4, row_2=fault_binerrs_all$row_2, row_3=fault_binerrs_all$row_3)
results[["row_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_4_treat_df, "Y", "row_4")

fault_binerrs_row_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_1=fault_binerrs_all$row_1, row_0=fault_binerrs_all$row_0)
results[["row_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_1_treat_df, "Y", "row_1")

fault_binerrs_row_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_2=fault_binerrs_all$row_2, row_2=fault_binerrs_all$row_2, row_3=fault_binerrs_all$row_3)
results[["row_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_2_treat_df, "Y", "row_2")

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

fault_binerrs_i_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_16=fault_binerrs_all$i_16, i_15=fault_binerrs_all$i_15)
results[["i_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_16_treat_df, "Y", "i_16")

fault_binerrs_i_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_15=fault_binerrs_all$i_15)
results[["i_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_15_treat_df, "Y", "i_15")

fault_binerrs_i_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_18=fault_binerrs_all$i_18)
results[["i_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_18_treat_df, "Y", "i_18")

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_17=fault_binerrs_all$i_17, i_19=fault_binerrs_all$i_19)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19, i_18=fault_binerrs_all$i_18)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_nColB_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_0=fault_binerrs_all$nColB_0, nColB_0=fault_binerrs_all$nColB_0, nColB_1=fault_binerrs_all$nColB_1)
results[["nColB_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_0_treat_df, "Y", "nColB_0")

fault_binerrs_b_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_0=fault_binerrs_all$b_0, b_0=fault_binerrs_all$b_0, b_0=fault_binerrs_all$b_0)
results[["b_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_0_treat_df, "Y", "b_0")

fault_binerrs_nColB_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_1=fault_binerrs_all$nColB_1)
results[["nColB_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_1_treat_df, "Y", "nColB_1")

fault_binerrs_nColB_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_2=fault_binerrs_all$nColB_2, nColB_2=fault_binerrs_all$nColB_2, nColB_3=fault_binerrs_all$nColB_3)
results[["nColB_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_2_treat_df, "Y", "nColB_2")

fault_binerrs_nColB_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_3=fault_binerrs_all$nColB_3)
results[["nColB_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_3_treat_df, "Y", "nColB_3")

fault_binerrs_nColB_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_4=fault_binerrs_all$nColB_4, nColB_2=fault_binerrs_all$nColB_2, nColB_3=fault_binerrs_all$nColB_3)
results[["nColB_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_4_treat_df, "Y", "nColB_4")

fault_binerrs_nColB_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_5=fault_binerrs_all$nColB_5, nColB_5=fault_binerrs_all$nColB_5, nColB_8=fault_binerrs_all$nColB_8)
results[["nColB_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_5_treat_df, "Y", "nColB_5")

fault_binerrs_nColB_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_6=fault_binerrs_all$nColB_6, nColB_6=fault_binerrs_all$nColB_6, nColB_7=fault_binerrs_all$nColB_7)
results[["nColB_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_6_treat_df, "Y", "nColB_6")

fault_binerrs_nColB_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_7=fault_binerrs_all$nColB_7)
results[["nColB_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_7_treat_df, "Y", "nColB_7")

fault_binerrs_nColB_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_8=fault_binerrs_all$nColB_8, nColB_6=fault_binerrs_all$nColB_6, nColB_7=fault_binerrs_all$nColB_7)
results[["nColB_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_8_treat_df, "Y", "nColB_8")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_nColB_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_9=fault_binerrs_all$nColB_9, nColB_5=fault_binerrs_all$nColB_5, nColB_8=fault_binerrs_all$nColB_8)
results[["nColB_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_9_treat_df, "Y", "nColB_9")

fault_binerrs_tmp_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_1=fault_binerrs_all$tmp_1)
results[["tmp_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_1_treat_df, "Y", "tmp_1")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_2=fault_binerrs_all$j_2, j_3=fault_binerrs_all$j_3)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_luICol_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, luICol_1=fault_binerrs_all$luICol_1)
results[["luICol_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_luICol_1_treat_df, "Y", "luICol_1")

fault_binerrs_tmp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_0=fault_binerrs_all$tmp_0)
results[["tmp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_0_treat_df, "Y", "tmp_0")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_2=fault_binerrs_all$j_2, j_3=fault_binerrs_all$j_3)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_tmp_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_2=fault_binerrs_all$tmp_2, tmp_0=fault_binerrs_all$tmp_0, tmp_1=fault_binerrs_all$tmp_1)
results[["tmp_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_2_treat_df, "Y", "tmp_2")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_luICol_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, luICol_0=fault_binerrs_all$luICol_0)
results[["luICol_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_luICol_0_treat_df, "Y", "luICol_0")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6, j_5=fault_binerrs_all$j_5)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7, j_7=fault_binerrs_all$j_7, j_8=fault_binerrs_all$j_8)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9, j_7=fault_binerrs_all$j_7, j_8=fault_binerrs_all$j_8)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_pRow_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, pRow_0=fault_binerrs_all$pRow_0)
results[["pRow_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_pRow_0_treat_df, "Y", "pRow_0")

fault_binerrs_matrix_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, matrix_0=fault_binerrs_all$matrix_0)
results[["matrix_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_matrix_0_treat_df, "Y", "matrix_0")

fault_binerrs_sum_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_3=fault_binerrs_all$sum_3, sum_3=fault_binerrs_all$sum_3, sum_4=fault_binerrs_all$sum_4)
results[["sum_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_3_treat_df, "Y", "sum_3")

fault_binerrs_matrix_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, matrix_1=fault_binerrs_all$matrix_1)
results[["matrix_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_matrix_1_treat_df, "Y", "matrix_1")

fault_binerrs_sum_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_2=fault_binerrs_all$sum_2, sum_0=fault_binerrs_all$sum_0, sum_1=fault_binerrs_all$sum_1)
results[["sum_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_2_treat_df, "Y", "sum_2")

fault_binerrs_sum_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_1=fault_binerrs_all$sum_1)
results[["sum_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_1_treat_df, "Y", "sum_1")

fault_binerrs_sum_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_0=fault_binerrs_all$sum_0, sum_0=fault_binerrs_all$sum_0, sum_1=fault_binerrs_all$sum_1)
results[["sum_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_0_treat_df, "Y", "sum_0")

fault_binerrs_i_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_30=fault_binerrs_all$i_30)
results[["i_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_30_treat_df, "Y", "i_30")

fault_binerrs_i_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_32=fault_binerrs_all$i_32)
results[["i_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_32_treat_df, "Y", "i_32")

fault_binerrs_i_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_31=fault_binerrs_all$i_31, i_29=fault_binerrs_all$i_29, i_30=fault_binerrs_all$i_30)
results[["i_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_31_treat_df, "Y", "i_31")

fault_binerrs_i_34_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_34=fault_binerrs_all$i_34, i_34=fault_binerrs_all$i_34, i_35=fault_binerrs_all$i_35)
results[["i_34"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_34_treat_df, "Y", "i_34")

fault_binerrs_i_33_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_33=fault_binerrs_all$i_33, i_32=fault_binerrs_all$i_32)
results[["i_33"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_33_treat_df, "Y", "i_33")

fault_binerrs_i_36_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_36=fault_binerrs_all$i_36, i_34=fault_binerrs_all$i_34, i_35=fault_binerrs_all$i_35)
results[["i_36"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_36_treat_df, "Y", "i_36")

fault_binerrs_sum_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_6=fault_binerrs_all$sum_6, sum_5=fault_binerrs_all$sum_5)
results[["sum_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_6_treat_df, "Y", "sum_6")

fault_binerrs_i_35_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_35=fault_binerrs_all$i_35)
results[["i_35"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_35_treat_df, "Y", "i_35")

fault_binerrs_sum_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_5=fault_binerrs_all$sum_5, sum_3=fault_binerrs_all$sum_3, sum_4=fault_binerrs_all$sum_4)
results[["sum_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_5_treat_df, "Y", "sum_5")

fault_binerrs_i_38_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_38=fault_binerrs_all$i_38, i_37=fault_binerrs_all$i_37)
results[["i_38"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_38_treat_df, "Y", "i_38")

fault_binerrs_sum_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_4=fault_binerrs_all$sum_4)
results[["sum_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_4_treat_df, "Y", "sum_4")

fault_binerrs_i_37_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_37=fault_binerrs_all$i_37)
results[["i_37"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_37_treat_df, "Y", "i_37")

fault_binerrs_i_39_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_39=fault_binerrs_all$i_39, i_39=fault_binerrs_all$i_39, i_40=fault_binerrs_all$i_40)
results[["i_39"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_39_treat_df, "Y", "i_39")

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

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_5=fault_binerrs_all$i_5)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20, i_17=fault_binerrs_all$i_17, i_19=fault_binerrs_all$i_19)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23, i_23=fault_binerrs_all$i_23, i_25=fault_binerrs_all$i_25)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22, i_21=fault_binerrs_all$i_21)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25, i_24=fault_binerrs_all$i_24)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_i_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_27=fault_binerrs_all$i_27)
results[["i_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_27_treat_df, "Y", "i_27")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26, i_23=fault_binerrs_all$i_23, i_25=fault_binerrs_all$i_25)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

fault_binerrs_i_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_29=fault_binerrs_all$i_29, i_29=fault_binerrs_all$i_29, i_30=fault_binerrs_all$i_30)
results[["i_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_29_treat_df, "Y", "i_29")

fault_binerrs_b2_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b2_0=fault_binerrs_all$b2_0)
results[["b2_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b2_0_treat_df, "Y", "b2_0")

fault_binerrs_i_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_28=fault_binerrs_all$i_28, i_27=fault_binerrs_all$i_27)
results[["i_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_28_treat_df, "Y", "i_28")

return(results)

}
