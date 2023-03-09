genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_col_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_10=fault_binerrs_all$col_10, col_8=fault_binerrs_all$col_8, col_9=fault_binerrs_all$col_9)
results[["col_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_10_treat_df, "Y", "col_10")

fault_binerrs_col_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_11=fault_binerrs_all$col_11)
results[["col_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_11_treat_df, "Y", "col_11")

fault_binerrs_determinant_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, determinant_0=fault_binerrs_all$determinant_0)
results[["determinant_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_determinant_0_treat_df, "Y", "determinant_0")

fault_binerrs_determinant_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, determinant_1=fault_binerrs_all$determinant_1, determinant_0=fault_binerrs_all$determinant_0, determinant_1=fault_binerrs_all$determinant_1)
results[["determinant_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_determinant_1_treat_df, "Y", "determinant_1")

fault_binerrs_j_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_11=fault_binerrs_all$j_11, j_9=fault_binerrs_all$j_9, j_10=fault_binerrs_all$j_10)
results[["j_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_11_treat_df, "Y", "j_11")

fault_binerrs_j_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_10=fault_binerrs_all$j_10, j_9=fault_binerrs_all$j_9, j_10=fault_binerrs_all$j_10)
results[["j_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_10_treat_df, "Y", "j_10")

fault_binerrs_j_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_13=fault_binerrs_all$j_13, j_12=fault_binerrs_all$j_12, j_13=fault_binerrs_all$j_13)
results[["j_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_13_treat_df, "Y", "j_13")

fault_binerrs_j_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_12=fault_binerrs_all$j_12)
results[["j_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_12_treat_df, "Y", "j_12")

fault_binerrs_j_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_15=fault_binerrs_all$j_15, j_11=fault_binerrs_all$j_11, j_14=fault_binerrs_all$j_14)
results[["j_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_15_treat_df, "Y", "j_15")

fault_binerrs_j_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_14=fault_binerrs_all$j_14, j_12=fault_binerrs_all$j_12, j_13=fault_binerrs_all$j_13)
results[["j_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_14_treat_df, "Y", "j_14")

fault_binerrs_determinant_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, determinant_2=fault_binerrs_all$determinant_2, determinant_0=fault_binerrs_all$determinant_0, determinant_1=fault_binerrs_all$determinant_1)
results[["determinant_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_determinant_2_treat_df, "Y", "determinant_2")

fault_binerrs_temp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, temp_0=fault_binerrs_all$temp_0, max_5=fault_binerrs_all$max_5)
results[["temp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_temp_0_treat_df, "Y", "temp_0")

fault_binerrs_singular_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, singular_0=fault_binerrs_all$singular_0)
results[["singular_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_singular_0_treat_df, "Y", "singular_0")

fault_binerrs_max_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_4=fault_binerrs_all$max_4, max_3=fault_binerrs_all$max_3)
results[["max_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_4_treat_df, "Y", "max_4")

fault_binerrs_max_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_3=fault_binerrs_all$max_3, max_0=fault_binerrs_all$max_0, max_2=fault_binerrs_all$max_2)
results[["max_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_3_treat_df, "Y", "max_3")

fault_binerrs_max_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_5=fault_binerrs_all$max_5, max_4=fault_binerrs_all$max_4)
results[["max_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_5_treat_df, "Y", "max_5")

fault_binerrs_max_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_0=fault_binerrs_all$max_0)
results[["max_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_0_treat_df, "Y", "max_0")

fault_binerrs_max_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_2=fault_binerrs_all$max_2, max_1=fault_binerrs_all$max_1, max_0=fault_binerrs_all$max_0)
results[["max_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_2_treat_df, "Y", "max_2")

fault_binerrs_max_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, max_1=fault_binerrs_all$max_1)
results[["max_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_max_1_treat_df, "Y", "max_1")

fault_binerrs_singularityThreshold_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, singularityThreshold_0=fault_binerrs_all$singularityThreshold_0, singularityThreshold_0=fault_binerrs_all$singularityThreshold_0, singularityThreshold_0=fault_binerrs_all$singularityThreshold_0)
results[["singularityThreshold_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_singularityThreshold_0_treat_df, "Y", "singularityThreshold_0")

fault_binerrs_row_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_7=fault_binerrs_all$row_7, row_6=fault_binerrs_all$row_6, row_7=fault_binerrs_all$row_7)
results[["row_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_7_treat_df, "Y", "row_7")

fault_binerrs_row_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_8=fault_binerrs_all$row_8, row_6=fault_binerrs_all$row_6, row_7=fault_binerrs_all$row_7)
results[["row_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_8_treat_df, "Y", "row_8")

fault_binerrs_row_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_5=fault_binerrs_all$row_5, row_3=fault_binerrs_all$row_3, row_4=fault_binerrs_all$row_4)
results[["row_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_5_treat_df, "Y", "row_5")

fault_binerrs_row_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_6=fault_binerrs_all$row_6, row_6=fault_binerrs_all$row_6, row_7=fault_binerrs_all$row_7)
results[["row_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_6_treat_df, "Y", "row_6")

fault_binerrs_row_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_9=fault_binerrs_all$row_9, col_2=fault_binerrs_all$col_2)
results[["row_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_9_treat_df, "Y", "row_9")

fault_binerrs_row_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_18=fault_binerrs_all$row_18, row_16=fault_binerrs_all$row_16, row_17=fault_binerrs_all$row_17)
results[["row_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_18_treat_df, "Y", "row_18")

fault_binerrs_luDiag_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, luDiag_1=fault_binerrs_all$luDiag_1)
results[["luDiag_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_luDiag_1_treat_df, "Y", "luDiag_1")

fault_binerrs_row_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_0=fault_binerrs_all$row_0)
results[["row_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_0_treat_df, "Y", "row_0")

fault_binerrs_luDiag_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, luDiag_0=fault_binerrs_all$luDiag_0, col_2=fault_binerrs_all$col_2, col_2=fault_binerrs_all$col_2)
results[["luDiag_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_luDiag_0_treat_df, "Y", "luDiag_0")

fault_binerrs_row_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_3=fault_binerrs_all$row_3, row_3=fault_binerrs_all$row_3, row_4=fault_binerrs_all$row_4)
results[["row_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_3_treat_df, "Y", "row_3")

fault_binerrs_row_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_14=fault_binerrs_all$row_14, row_13=fault_binerrs_all$row_13, row_14=fault_binerrs_all$row_14)
results[["row_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_14_treat_df, "Y", "row_14")

fault_binerrs_row_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_4=fault_binerrs_all$row_4, row_3=fault_binerrs_all$row_3, row_4=fault_binerrs_all$row_4)
results[["row_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_4_treat_df, "Y", "row_4")

fault_binerrs_row_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_15=fault_binerrs_all$row_15, row_13=fault_binerrs_all$row_13, row_14=fault_binerrs_all$row_14)
results[["row_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_15_treat_df, "Y", "row_15")

fault_binerrs_row_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_1=fault_binerrs_all$row_1, row_0=fault_binerrs_all$row_0, row_1=fault_binerrs_all$row_1)
results[["row_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_1_treat_df, "Y", "row_1")

fault_binerrs_row_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_16=fault_binerrs_all$row_16, row_16=fault_binerrs_all$row_16, row_17=fault_binerrs_all$row_17)
results[["row_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_16_treat_df, "Y", "row_16")

fault_binerrs_row_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_2=fault_binerrs_all$row_2, row_0=fault_binerrs_all$row_0, row_1=fault_binerrs_all$row_1)
results[["row_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_2_treat_df, "Y", "row_2")

fault_binerrs_row_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_17=fault_binerrs_all$row_17, row_16=fault_binerrs_all$row_16, row_17=fault_binerrs_all$row_17)
results[["row_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_17_treat_df, "Y", "row_17")

fault_binerrs_row_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_10=fault_binerrs_all$row_10, row_9=fault_binerrs_all$row_9, row_10=fault_binerrs_all$row_10)
results[["row_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_10_treat_df, "Y", "row_10")

fault_binerrs_col_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_18=fault_binerrs_all$col_18, col_17=fault_binerrs_all$col_17, col_18=fault_binerrs_all$col_18)
results[["col_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_18_treat_df, "Y", "col_18")

fault_binerrs_row_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_11=fault_binerrs_all$row_11, row_9=fault_binerrs_all$row_9, row_10=fault_binerrs_all$row_10)
results[["row_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_11_treat_df, "Y", "row_11")

fault_binerrs_col_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_19=fault_binerrs_all$col_19, col_17=fault_binerrs_all$col_17, col_18=fault_binerrs_all$col_18)
results[["col_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_19_treat_df, "Y", "col_19")

fault_binerrs_row_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_12=fault_binerrs_all$row_12, row_2=fault_binerrs_all$row_2, row_11=fault_binerrs_all$row_11)
results[["row_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_12_treat_df, "Y", "row_12")

fault_binerrs_col_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_16=fault_binerrs_all$col_16, col_14=fault_binerrs_all$col_14, col_15=fault_binerrs_all$col_15)
results[["col_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_16_treat_df, "Y", "col_16")

fault_binerrs_row_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, row_13=fault_binerrs_all$row_13)
results[["row_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_row_13_treat_df, "Y", "row_13")

fault_binerrs_col_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_17=fault_binerrs_all$col_17, col_17=fault_binerrs_all$col_17, col_18=fault_binerrs_all$col_18)
results[["col_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_17_treat_df, "Y", "col_17")

fault_binerrs_col_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_14=fault_binerrs_all$col_14, col_14=fault_binerrs_all$col_14, col_15=fault_binerrs_all$col_15)
results[["col_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_14_treat_df, "Y", "col_14")

fault_binerrs_col_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_15=fault_binerrs_all$col_15, col_14=fault_binerrs_all$col_14, col_15=fault_binerrs_all$col_15)
results[["col_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_15_treat_df, "Y", "col_15")

fault_binerrs_col_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_12=fault_binerrs_all$col_12, col_11=fault_binerrs_all$col_11, col_12=fault_binerrs_all$col_12)
results[["col_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_12_treat_df, "Y", "col_12")

fault_binerrs_col_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_13=fault_binerrs_all$col_13, col_11=fault_binerrs_all$col_11, col_12=fault_binerrs_all$col_12)
results[["col_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_13_treat_df, "Y", "col_13")

fault_binerrs_i_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_10=fault_binerrs_all$i_10, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_10_treat_df, "Y", "i_10")

fault_binerrs_i_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_12=fault_binerrs_all$i_12, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_12_treat_df, "Y", "i_12")

fault_binerrs_i_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_11=fault_binerrs_all$i_11, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_11_treat_df, "Y", "i_11")

fault_binerrs_i_14_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_14=fault_binerrs_all$i_14, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_14"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_14_treat_df, "Y", "i_14")

fault_binerrs_i_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_13=fault_binerrs_all$i_13, i_12=fault_binerrs_all$i_12, i_13=fault_binerrs_all$i_13)
results[["i_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_13_treat_df, "Y", "i_13")

fault_binerrs_i_16_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_16=fault_binerrs_all$i_16, i_15=fault_binerrs_all$i_15, i_16=fault_binerrs_all$i_16)
results[["i_16"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_16_treat_df, "Y", "i_16")

fault_binerrs_i_15_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_15=fault_binerrs_all$i_15)
results[["i_15"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_15_treat_df, "Y", "i_15")

fault_binerrs_i_18_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_18=fault_binerrs_all$i_18, i_18=fault_binerrs_all$i_18, i_19=fault_binerrs_all$i_19)
results[["i_18"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_18_treat_df, "Y", "i_18")

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_15=fault_binerrs_all$i_15, i_16=fault_binerrs_all$i_16)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19, i_18=fault_binerrs_all$i_18, i_19=fault_binerrs_all$i_19)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_col_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_6=fault_binerrs_all$col_6, col_5=fault_binerrs_all$col_5, col_6=fault_binerrs_all$col_6)
results[["col_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_6_treat_df, "Y", "col_6")

fault_binerrs_col_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_5=fault_binerrs_all$col_5, col_5=fault_binerrs_all$col_5, col_6=fault_binerrs_all$col_6)
results[["col_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_5_treat_df, "Y", "col_5")

fault_binerrs_nColB_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nColB_0=fault_binerrs_all$nColB_0, b2_0=fault_binerrs_all$b2_0)
results[["nColB_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nColB_0_treat_df, "Y", "nColB_0")

fault_binerrs_col_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_4=fault_binerrs_all$col_4, col_0=fault_binerrs_all$col_0, col_3=fault_binerrs_all$col_3)
results[["col_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_4_treat_df, "Y", "col_4")

fault_binerrs_b_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_0=fault_binerrs_all$b_0)
results[["b_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_0_treat_df, "Y", "b_0")

fault_binerrs_col_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_3=fault_binerrs_all$col_3, col_2=fault_binerrs_all$col_2)
results[["col_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_3_treat_df, "Y", "col_3")

fault_binerrs_col_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_2=fault_binerrs_all$col_2, col_1=fault_binerrs_all$col_1)
results[["col_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_2_treat_df, "Y", "col_2")

fault_binerrs_col_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_1=fault_binerrs_all$col_1, col_0=fault_binerrs_all$col_0, col_3=fault_binerrs_all$col_3)
results[["col_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_1_treat_df, "Y", "col_1")

fault_binerrs_col_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_0=fault_binerrs_all$col_0, col_0=fault_binerrs_all$col_0, col_3=fault_binerrs_all$col_3)
results[["col_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_0_treat_df, "Y", "col_0")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_tmp_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_1=fault_binerrs_all$tmp_1)
results[["tmp_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_1_treat_df, "Y", "tmp_1")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_luICol_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, luICol_1=fault_binerrs_all$luICol_1)
results[["luICol_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_luICol_1_treat_df, "Y", "luICol_1")

fault_binerrs_tmp_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_0=fault_binerrs_all$tmp_0)
results[["tmp_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_0_treat_df, "Y", "tmp_0")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1, j_0=fault_binerrs_all$j_0, j_1=fault_binerrs_all$j_1)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_col_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_9=fault_binerrs_all$col_9, col_8=fault_binerrs_all$col_8, col_9=fault_binerrs_all$col_9)
results[["col_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_9_treat_df, "Y", "col_9")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_3=fault_binerrs_all$j_3, j_4=fault_binerrs_all$j_4)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_col_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_8=fault_binerrs_all$col_8, col_8=fault_binerrs_all$col_8, col_9=fault_binerrs_all$col_9)
results[["col_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_8_treat_df, "Y", "col_8")

fault_binerrs_tmp_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_2=fault_binerrs_all$tmp_2, tmp_0=fault_binerrs_all$tmp_0, tmp_1=fault_binerrs_all$tmp_1)
results[["tmp_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_2_treat_df, "Y", "tmp_2")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_col_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, col_7=fault_binerrs_all$col_7, col_5=fault_binerrs_all$col_5, col_6=fault_binerrs_all$col_6)
results[["col_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_col_7_treat_df, "Y", "col_7")

fault_binerrs_luICol_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, luICol_0=fault_binerrs_all$luICol_0)
results[["luICol_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_luICol_0_treat_df, "Y", "luICol_0")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5, j_3=fault_binerrs_all$j_3, j_4=fault_binerrs_all$j_4)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_bpCol_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, bpCol_1=fault_binerrs_all$bpCol_1)
results[["bpCol_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_bpCol_1_treat_df, "Y", "bpCol_1")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8, j_6=fault_binerrs_all$j_6, j_7=fault_binerrs_all$j_7)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7, j_6=fault_binerrs_all$j_6, j_7=fault_binerrs_all$j_7)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_j_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_9=fault_binerrs_all$j_9)
results[["j_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_9_treat_df, "Y", "j_9")

fault_binerrs_bpCol_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, bpCol_0=fault_binerrs_all$bpCol_0)
results[["bpCol_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_bpCol_0_treat_df, "Y", "bpCol_0")

fault_binerrs_pRow_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, pRow_0=fault_binerrs_all$pRow_0)
results[["pRow_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_pRow_0_treat_df, "Y", "pRow_0")

fault_binerrs_largest_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_4=fault_binerrs_all$largest_4, largest_0=fault_binerrs_all$largest_0, largest_3=fault_binerrs_all$largest_3)
results[["largest_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_4_treat_df, "Y", "largest_4")

fault_binerrs_largest_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_3=fault_binerrs_all$largest_3, largest_2=fault_binerrs_all$largest_2, largest_1=fault_binerrs_all$largest_1)
results[["largest_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_3_treat_df, "Y", "largest_3")

fault_binerrs_largest_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_2=fault_binerrs_all$largest_2, sum_6=fault_binerrs_all$sum_6)
results[["largest_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_2_treat_df, "Y", "largest_2")

fault_binerrs_largest_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_1=fault_binerrs_all$largest_1, largest_0=fault_binerrs_all$largest_0, largest_3=fault_binerrs_all$largest_3)
results[["largest_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_1_treat_df, "Y", "largest_1")

fault_binerrs_largest_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, largest_0=fault_binerrs_all$largest_0)
results[["largest_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_largest_0_treat_df, "Y", "largest_0")

fault_binerrs_matrix_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, matrix_0=fault_binerrs_all$matrix_0)
results[["matrix_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_matrix_0_treat_df, "Y", "matrix_0")

fault_binerrs_sum_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_3=fault_binerrs_all$sum_3)
results[["sum_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_3_treat_df, "Y", "sum_3")

fault_binerrs_matrix_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, matrix_1=fault_binerrs_all$matrix_1)
results[["matrix_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_matrix_1_treat_df, "Y", "matrix_1")

fault_binerrs_sum_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_2=fault_binerrs_all$sum_2, sum_0=fault_binerrs_all$sum_0, sum_1=fault_binerrs_all$sum_1)
results[["sum_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_2_treat_df, "Y", "sum_2")

fault_binerrs_sum_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_1=fault_binerrs_all$sum_1, sum_0=fault_binerrs_all$sum_0, sum_1=fault_binerrs_all$sum_1)
results[["sum_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_1_treat_df, "Y", "sum_1")

fault_binerrs_sum_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_0=fault_binerrs_all$sum_0)
results[["sum_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_0_treat_df, "Y", "sum_0")

fault_binerrs_i_30_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_30=fault_binerrs_all$i_30, i_30=fault_binerrs_all$i_30, i_31=fault_binerrs_all$i_31)
results[["i_30"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_30_treat_df, "Y", "i_30")

fault_binerrs_i_32_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_32=fault_binerrs_all$i_32, i_30=fault_binerrs_all$i_30, i_31=fault_binerrs_all$i_31)
results[["i_32"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_32_treat_df, "Y", "i_32")

fault_binerrs_i_31_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_31=fault_binerrs_all$i_31, i_30=fault_binerrs_all$i_30, i_31=fault_binerrs_all$i_31)
results[["i_31"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_31_treat_df, "Y", "i_31")

fault_binerrs_sum_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_6=fault_binerrs_all$sum_6, sum_5=fault_binerrs_all$sum_5)
results[["sum_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_6_treat_df, "Y", "sum_6")

fault_binerrs_sum_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_5=fault_binerrs_all$sum_5, sum_3=fault_binerrs_all$sum_3, sum_4=fault_binerrs_all$sum_4)
results[["sum_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_5_treat_df, "Y", "sum_5")

fault_binerrs_sum_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, sum_4=fault_binerrs_all$sum_4, sum_3=fault_binerrs_all$sum_3, sum_4=fault_binerrs_all$sum_4)
results[["sum_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_sum_4_treat_df, "Y", "sum_4")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_0=fault_binerrs_all$i_0, i_1=fault_binerrs_all$i_1)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_m_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_1=fault_binerrs_all$m_1)
results[["m_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_1_treat_df, "Y", "m_1")

fault_binerrs_m_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_0=fault_binerrs_all$m_0, matrix_1=fault_binerrs_all$matrix_1)
results[["m_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_0_treat_df, "Y", "m_0")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_3=fault_binerrs_all$i_3, i_4=fault_binerrs_all$i_4)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_m_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_3=fault_binerrs_all$m_3)
results[["m_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_3_treat_df, "Y", "m_3")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_m_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_2=fault_binerrs_all$m_2)
results[["m_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_2_treat_df, "Y", "m_2")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_9=fault_binerrs_all$i_9, i_10=fault_binerrs_all$i_10)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_m_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_5=fault_binerrs_all$m_5)
results[["m_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_5_treat_df, "Y", "m_5")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8, i_6=fault_binerrs_all$i_6, i_7=fault_binerrs_all$i_7)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_m_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_4=fault_binerrs_all$m_4)
results[["m_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_4_treat_df, "Y", "m_4")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_m_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_7=fault_binerrs_all$m_7)
results[["m_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_7_treat_df, "Y", "m_7")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20, i_18=fault_binerrs_all$i_18, i_19=fault_binerrs_all$i_19)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_m_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_6=fault_binerrs_all$m_6, m_5=fault_binerrs_all$m_5)
results[["m_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_6_treat_df, "Y", "m_6")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23, i_21=fault_binerrs_all$i_21, i_22=fault_binerrs_all$i_22)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22, i_21=fault_binerrs_all$i_21, i_22=fault_binerrs_all$i_22)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_m_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, m_8=fault_binerrs_all$m_8, m_7=fault_binerrs_all$m_7)
results[["m_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_m_8_treat_df, "Y", "m_8")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25, i_24=fault_binerrs_all$i_24, i_25=fault_binerrs_all$i_25)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_i_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_27=fault_binerrs_all$i_27, i_27=fault_binerrs_all$i_27, i_28=fault_binerrs_all$i_28)
results[["i_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_27_treat_df, "Y", "i_27")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26, i_24=fault_binerrs_all$i_24, i_25=fault_binerrs_all$i_25)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

fault_binerrs_b2_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b2_0=fault_binerrs_all$b2_0)
results[["b2_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b2_0_treat_df, "Y", "b2_0")

fault_binerrs_i_29_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_29=fault_binerrs_all$i_29, i_27=fault_binerrs_all$i_27, i_28=fault_binerrs_all$i_28)
results[["i_29"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_29_treat_df, "Y", "i_29")

fault_binerrs_i_28_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_28=fault_binerrs_all$i_28, i_27=fault_binerrs_all$i_27, i_28=fault_binerrs_all$i_28)
results[["i_28"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_28_treat_df, "Y", "i_28")

return(results)

}
