genCFmeansRF_fault_binerrs <- function() {

results <- data.frame(row.names=seq(1,10))

fault_binerrs_d_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, d_0=fault_binerrs_all$d_0)
results[["d_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_d_0_treat_df, "Y", "d_0")

fault_binerrs_bit_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, bit_4=fault_binerrs_all$bit_4, bit_2=fault_binerrs_all$bit_2, bit_3=fault_binerrs_all$bit_3)
results[["bit_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_bit_4_treat_df, "Y", "bit_4")

fault_binerrs_bit_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, bit_2=fault_binerrs_all$bit_2, bit_2=fault_binerrs_all$bit_2, bit_3=fault_binerrs_all$bit_3)
results[["bit_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_bit_2_treat_df, "Y", "bit_2")

fault_binerrs_bit_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, bit_3=fault_binerrs_all$bit_3)
results[["bit_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_bit_3_treat_df, "Y", "bit_3")

fault_binerrs_tmp_imag_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_imag_0=fault_binerrs_all$tmp_imag_0)
results[["tmp_imag_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_imag_0_treat_df, "Y", "tmp_imag_0")

fault_binerrs_tmp_imag_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_imag_1=fault_binerrs_all$tmp_imag_1, ii_0=fault_binerrs_all$ii_0)
results[["tmp_imag_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_imag_1_treat_df, "Y", "tmp_imag_1")

fault_binerrs_Nd_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, Nd_0=fault_binerrs_all$Nd_0, N_0=fault_binerrs_all$N_0)
results[["Nd_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_Nd_0_treat_df, "Y", "Nd_0")

fault_binerrs_t_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, t_0=fault_binerrs_all$t_0, theta_0=fault_binerrs_all$theta_0)
results[["t_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_t_0_treat_df, "Y", "t_0")

fault_binerrs_s2_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, s2_0=fault_binerrs_all$s2_0, t_0=fault_binerrs_all$t_0, t_0=fault_binerrs_all$t_0)
results[["s2_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_s2_0_treat_df, "Y", "s2_0")

fault_binerrs_logN_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, logN_0=fault_binerrs_all$logN_0, N_0=fault_binerrs_all$N_0)
results[["logN_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_logN_0_treat_df, "Y", "logN_0")

fault_binerrs_b_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_10=fault_binerrs_all$b_10, b_4=fault_binerrs_all$b_4, b_9=fault_binerrs_all$b_9)
results[["b_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_10_treat_df, "Y", "b_10")

fault_binerrs_w_imag_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_imag_1=fault_binerrs_all$w_imag_1, tmp_imag_0=fault_binerrs_all$tmp_imag_0)
results[["w_imag_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_imag_1_treat_df, "Y", "w_imag_1")

fault_binerrs_w_imag_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_imag_2=fault_binerrs_all$w_imag_2, w_imag_0=fault_binerrs_all$w_imag_0, w_imag_1=fault_binerrs_all$w_imag_1)
results[["w_imag_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_imag_2_treat_df, "Y", "w_imag_2")

fault_binerrs_w_imag_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_imag_0=fault_binerrs_all$w_imag_0, w_imag_0=fault_binerrs_all$w_imag_0, w_imag_1=fault_binerrs_all$w_imag_1)
results[["w_imag_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_imag_0_treat_df, "Y", "w_imag_0")

fault_binerrs_logn_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, logn_0=fault_binerrs_all$logn_0, n_8=fault_binerrs_all$n_8)
results[["logn_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_logn_0_treat_df, "Y", "logn_0")

fault_binerrs_z1_imag_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, z1_imag_0=fault_binerrs_all$z1_imag_0, j_1=fault_binerrs_all$j_1)
results[["z1_imag_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_z1_imag_0_treat_df, "Y", "z1_imag_0")

fault_binerrs_logn_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, logn_1=fault_binerrs_all$logn_1, logn_0=fault_binerrs_all$logn_0)
results[["logn_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_logn_1_treat_df, "Y", "logn_1")

fault_binerrs_tmp_real_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_real_0=fault_binerrs_all$tmp_real_0)
results[["tmp_real_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_real_0_treat_df, "Y", "tmp_real_0")

fault_binerrs_tmp_real_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, tmp_real_1=fault_binerrs_all$tmp_real_1, ii_0=fault_binerrs_all$ii_0)
results[["tmp_real_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_tmp_real_1_treat_df, "Y", "tmp_real_1")

fault_binerrs_k_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_1=fault_binerrs_all$k_1, k_0=fault_binerrs_all$k_0)
results[["k_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_1_treat_df, "Y", "k_1")

fault_binerrs_k_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_0=fault_binerrs_all$k_0)
results[["k_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_0_treat_df, "Y", "k_0")

fault_binerrs_k_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_3=fault_binerrs_all$k_3)
results[["k_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_3_treat_df, "Y", "k_3")

fault_binerrs_k_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_2=fault_binerrs_all$k_2, k_2=fault_binerrs_all$k_2, k_3=fault_binerrs_all$k_3)
results[["k_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_2_treat_df, "Y", "k_2")

fault_binerrs_theta_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, theta_0=fault_binerrs_all$theta_0)
results[["theta_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_theta_0_treat_df, "Y", "theta_0")

fault_binerrs_k_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_5=fault_binerrs_all$k_5)
results[["k_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_5_treat_df, "Y", "k_5")

fault_binerrs_k_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_4=fault_binerrs_all$k_4, k_2=fault_binerrs_all$k_2, k_3=fault_binerrs_all$k_3)
results[["k_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_4_treat_df, "Y", "k_4")

fault_binerrs_k_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_7=fault_binerrs_all$k_7)
results[["k_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_7_treat_df, "Y", "k_7")

fault_binerrs_k_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_6=fault_binerrs_all$k_6, k_6=fault_binerrs_all$k_6, k_7=fault_binerrs_all$k_7)
results[["k_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_6_treat_df, "Y", "k_6")

fault_binerrs_s_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, s_0=fault_binerrs_all$s_0, theta_0=fault_binerrs_all$theta_0)
results[["s_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_s_0_treat_df, "Y", "s_0")

fault_binerrs_k_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, k_8=fault_binerrs_all$k_8, k_6=fault_binerrs_all$k_6, k_7=fault_binerrs_all$k_7)
results[["k_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_k_8_treat_df, "Y", "k_8")

fault_binerrs_norm_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, norm_0=fault_binerrs_all$norm_0, norm_0=fault_binerrs_all$norm_0, norm_0=fault_binerrs_all$norm_0)
results[["norm_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_norm_0_treat_df, "Y", "norm_0")

fault_binerrs_dual_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_2=fault_binerrs_all$dual_2)
results[["dual_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_2_treat_df, "Y", "dual_2")

fault_binerrs_dual_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_1=fault_binerrs_all$dual_1, dual_1=fault_binerrs_all$dual_1, dual_6=fault_binerrs_all$dual_6)
results[["dual_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_1_treat_df, "Y", "dual_1")

fault_binerrs_dual_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_0=fault_binerrs_all$dual_0)
results[["dual_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_0_treat_df, "Y", "dual_0")

fault_binerrs_dual_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_6=fault_binerrs_all$dual_6, dual_5=fault_binerrs_all$dual_5)
results[["dual_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_6_treat_df, "Y", "dual_6")

fault_binerrs_dual_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_5=fault_binerrs_all$dual_5, dual_3=fault_binerrs_all$dual_3, dual_4=fault_binerrs_all$dual_4)
results[["dual_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_5_treat_df, "Y", "dual_5")

fault_binerrs_dual_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_4=fault_binerrs_all$dual_4)
results[["dual_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_4_treat_df, "Y", "dual_4")

fault_binerrs_dual_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_3=fault_binerrs_all$dual_3, dual_3=fault_binerrs_all$dual_3, dual_4=fault_binerrs_all$dual_4)
results[["dual_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_3_treat_df, "Y", "dual_3")

fault_binerrs_dual_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, dual_7=fault_binerrs_all$dual_7, dual_1=fault_binerrs_all$dual_1, dual_6=fault_binerrs_all$dual_6)
results[["dual_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_dual_7_treat_df, "Y", "dual_7")

fault_binerrs_z1_real_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, z1_real_0=fault_binerrs_all$z1_real_0, j_1=fault_binerrs_all$j_1)
results[["z1_real_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_z1_real_0_treat_df, "Y", "z1_real_0")

fault_binerrs_N_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, N_0=fault_binerrs_all$N_0)
results[["N_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_N_0_treat_df, "Y", "N_0")

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

fault_binerrs_i_17_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_17=fault_binerrs_all$i_17, i_17=fault_binerrs_all$i_17, i_18=fault_binerrs_all$i_18)
results[["i_17"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_17_treat_df, "Y", "i_17")

fault_binerrs_i_19_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_19=fault_binerrs_all$i_19, i_17=fault_binerrs_all$i_17, i_18=fault_binerrs_all$i_18)
results[["i_19"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_19_treat_df, "Y", "i_19")

fault_binerrs_b_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_0=fault_binerrs_all$b_0)
results[["b_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_0_treat_df, "Y", "b_0")

fault_binerrs_b_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_2=fault_binerrs_all$b_2, b_2=fault_binerrs_all$b_2, b_3=fault_binerrs_all$b_3)
results[["b_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_2_treat_df, "Y", "b_2")

fault_binerrs_b_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_1=fault_binerrs_all$b_1, b_0=fault_binerrs_all$b_0)
results[["b_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_1_treat_df, "Y", "b_1")

fault_binerrs_b_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_4=fault_binerrs_all$b_4, b_2=fault_binerrs_all$b_2, b_3=fault_binerrs_all$b_3)
results[["b_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_4_treat_df, "Y", "b_4")

fault_binerrs_b_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_3=fault_binerrs_all$b_3)
results[["b_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_3_treat_df, "Y", "b_3")

fault_binerrs_b_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_6=fault_binerrs_all$b_6, b_5=fault_binerrs_all$b_5)
results[["b_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_6_treat_df, "Y", "b_6")

fault_binerrs_b_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_5=fault_binerrs_all$b_5)
results[["b_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_5_treat_df, "Y", "b_5")

fault_binerrs_j_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_0=fault_binerrs_all$j_0)
results[["j_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_0_treat_df, "Y", "j_0")

fault_binerrs_b_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_8=fault_binerrs_all$b_8)
results[["b_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_8_treat_df, "Y", "b_8")

fault_binerrs_b_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_7=fault_binerrs_all$b_7, b_7=fault_binerrs_all$b_7, b_8=fault_binerrs_all$b_8)
results[["b_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_7_treat_df, "Y", "b_7")

fault_binerrs_j_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_2=fault_binerrs_all$j_2, j_2=fault_binerrs_all$j_2, j_7=fault_binerrs_all$j_7)
results[["j_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_2_treat_df, "Y", "j_2")

fault_binerrs_j_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_1=fault_binerrs_all$j_1)
results[["j_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_1_treat_df, "Y", "j_1")

fault_binerrs_b_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, b_9=fault_binerrs_all$b_9, b_7=fault_binerrs_all$b_7, b_8=fault_binerrs_all$b_8)
results[["b_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_b_9_treat_df, "Y", "b_9")

fault_binerrs_n_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_0=fault_binerrs_all$n_0, nd_0=fault_binerrs_all$nd_0)
results[["n_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_0_treat_df, "Y", "n_0")

fault_binerrs_j_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_4=fault_binerrs_all$j_4, j_4=fault_binerrs_all$j_4, j_5=fault_binerrs_all$j_5)
results[["j_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_4_treat_df, "Y", "j_4")

fault_binerrs_j_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_3=fault_binerrs_all$j_3)
results[["j_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_3_treat_df, "Y", "j_3")

fault_binerrs_n_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_2=fault_binerrs_all$n_2)
results[["n_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_2_treat_df, "Y", "n_2")

fault_binerrs_n_13_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_13=fault_binerrs_all$n_13, n_13=fault_binerrs_all$n_13, n_13=fault_binerrs_all$n_13)
results[["n_13"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_13_treat_df, "Y", "n_13")

fault_binerrs_j_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_6=fault_binerrs_all$j_6, j_4=fault_binerrs_all$j_4, j_5=fault_binerrs_all$j_5)
results[["j_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_6_treat_df, "Y", "j_6")

fault_binerrs_n_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_1=fault_binerrs_all$n_1)
results[["n_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_1_treat_df, "Y", "n_1")

fault_binerrs_wd_imag_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, wd_imag_1=fault_binerrs_all$wd_imag_1, z1_imag_0=fault_binerrs_all$z1_imag_0, z1_real_0=fault_binerrs_all$z1_real_0)
results[["wd_imag_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_wd_imag_1_treat_df, "Y", "wd_imag_1")

fault_binerrs_n_12_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_12=fault_binerrs_all$n_12, n_8=fault_binerrs_all$n_8, n_11=fault_binerrs_all$n_11)
results[["n_12"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_12_treat_df, "Y", "n_12")

fault_binerrs_j_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_5=fault_binerrs_all$j_5)
results[["j_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_5_treat_df, "Y", "j_5")

fault_binerrs_n_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_4=fault_binerrs_all$n_4)
results[["n_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_4_treat_df, "Y", "n_4")

fault_binerrs_wd_imag_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, wd_imag_0=fault_binerrs_all$wd_imag_0, j_0=fault_binerrs_all$j_0)
results[["wd_imag_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_wd_imag_0_treat_df, "Y", "wd_imag_0")

fault_binerrs_n_11_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_11=fault_binerrs_all$n_11, n_9=fault_binerrs_all$n_9, n_10=fault_binerrs_all$n_10)
results[["n_11"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_11_treat_df, "Y", "n_11")

fault_binerrs_j_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_8=fault_binerrs_all$j_8, j_2=fault_binerrs_all$j_2, j_7=fault_binerrs_all$j_7)
results[["j_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_8_treat_df, "Y", "j_8")

fault_binerrs_n_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_3=fault_binerrs_all$n_3)
results[["n_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_3_treat_df, "Y", "n_3")

fault_binerrs_n_10_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_10=fault_binerrs_all$n_10)
results[["n_10"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_10_treat_df, "Y", "n_10")

fault_binerrs_j_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, j_7=fault_binerrs_all$j_7, j_6=fault_binerrs_all$j_6, k_8=fault_binerrs_all$k_8)
results[["j_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_j_7_treat_df, "Y", "j_7")

fault_binerrs_n_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_6=fault_binerrs_all$n_6, n_5=fault_binerrs_all$n_5)
results[["n_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_6_treat_df, "Y", "n_6")

fault_binerrs_n_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_5=fault_binerrs_all$n_5, n_4=fault_binerrs_all$n_4)
results[["n_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_5_treat_df, "Y", "n_5")

fault_binerrs_n_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_8=fault_binerrs_all$n_8, n_8=fault_binerrs_all$n_8, n_11=fault_binerrs_all$n_11)
results[["n_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_8_treat_df, "Y", "n_8")

fault_binerrs_n_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_7=fault_binerrs_all$n_7)
results[["n_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_7_treat_df, "Y", "n_7")

fault_binerrs_n_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, n_9=fault_binerrs_all$n_9, n_9=fault_binerrs_all$n_9, n_10=fault_binerrs_all$n_10)
results[["n_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_n_9_treat_df, "Y", "n_9")

fault_binerrs_jj_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, jj_0=fault_binerrs_all$jj_0)
results[["jj_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_jj_0_treat_df, "Y", "jj_0")

fault_binerrs_nm1_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nm1_0=fault_binerrs_all$nm1_0, n_13=fault_binerrs_all$n_13)
results[["nm1_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nm1_0_treat_df, "Y", "nm1_0")

fault_binerrs_nm1_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nm1_1=fault_binerrs_all$nm1_1, nm1_0=fault_binerrs_all$nm1_0)
results[["nm1_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nm1_1_treat_df, "Y", "nm1_1")

fault_binerrs_direction_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, direction_0=fault_binerrs_all$direction_0, direction_0=fault_binerrs_all$direction_0, direction_0=fault_binerrs_all$direction_0)
results[["direction_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_direction_0_treat_df, "Y", "direction_0")

fault_binerrs_log_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, log_0=fault_binerrs_all$log_0)
results[["log_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_log_0_treat_df, "Y", "log_0")

fault_binerrs_log_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, log_2=fault_binerrs_all$log_2)
results[["log_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_log_2_treat_df, "Y", "log_2")

fault_binerrs_a_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_1=fault_binerrs_all$a_1, a_0=fault_binerrs_all$a_0)
results[["a_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_1_treat_df, "Y", "a_1")

fault_binerrs_log_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, log_1=fault_binerrs_all$log_1, log_1=fault_binerrs_all$log_1, log_2=fault_binerrs_all$log_2)
results[["log_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_log_1_treat_df, "Y", "log_1")

fault_binerrs_a_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_0=fault_binerrs_all$a_0)
results[["a_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_0_treat_df, "Y", "a_0")

fault_binerrs_nd_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, nd_0=fault_binerrs_all$nd_0)
results[["nd_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_nd_0_treat_df, "Y", "nd_0")

fault_binerrs_a_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_3=fault_binerrs_all$a_3)
results[["a_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_3_treat_df, "Y", "a_3")

fault_binerrs_a_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_2=fault_binerrs_all$a_2, a_2=fault_binerrs_all$a_2, a_3=fault_binerrs_all$a_3)
results[["a_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_2_treat_df, "Y", "a_2")

fault_binerrs_a_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, a_4=fault_binerrs_all$a_4, a_2=fault_binerrs_all$a_2, a_3=fault_binerrs_all$a_3)
results[["a_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_a_4_treat_df, "Y", "a_4")

fault_binerrs_nd_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, nd_4=fault_binerrs_all$nd_4, n_1=fault_binerrs_all$n_1)
results[["nd_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_nd_4_treat_df, "Y", "nd_4")

fault_binerrs_nd_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, nd_3=fault_binerrs_all$nd_3, nd_2=fault_binerrs_all$nd_2)
results[["nd_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_nd_3_treat_df, "Y", "nd_3")

fault_binerrs_i_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_1=fault_binerrs_all$i_1, i_0=fault_binerrs_all$i_0)
results[["i_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_1_treat_df, "Y", "i_1")

fault_binerrs_nd_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, nd_2=fault_binerrs_all$nd_2)
results[["nd_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_nd_2_treat_df, "Y", "nd_2")

fault_binerrs_i_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_0=fault_binerrs_all$i_0)
results[["i_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_0_treat_df, "Y", "i_0")

fault_binerrs_nd_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, nd_1=fault_binerrs_all$nd_1, nd_0=fault_binerrs_all$nd_0)
results[["nd_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_nd_1_treat_df, "Y", "nd_1")

fault_binerrs_i_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_3=fault_binerrs_all$i_3)
results[["i_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_3_treat_df, "Y", "i_3")

fault_binerrs_log_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, log_4=fault_binerrs_all$log_4, log_3=fault_binerrs_all$log_3)
results[["log_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_log_4_treat_df, "Y", "log_4")

fault_binerrs_i_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_2=fault_binerrs_all$i_2, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_2_treat_df, "Y", "i_2")

fault_binerrs_log_3_treat_df <- data.frame(Y=fault_binerrs_all$Y, log_3=fault_binerrs_all$log_3, log_1=fault_binerrs_all$log_1, log_2=fault_binerrs_all$log_2)
results[["log_3"]] <- CFmeansForDecileBinsRF(fault_binerrs_log_3_treat_df, "Y", "log_3")

fault_binerrs_i_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_5=fault_binerrs_all$i_5)
results[["i_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_5_treat_df, "Y", "i_5")

fault_binerrs_i_4_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_4=fault_binerrs_all$i_4, i_2=fault_binerrs_all$i_2, i_3=fault_binerrs_all$i_3)
results[["i_4"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_4_treat_df, "Y", "i_4")

fault_binerrs_nd_5_treat_df <- data.frame(Y=fault_binerrs_all$Y, nd_5=fault_binerrs_all$nd_5, nd_4=fault_binerrs_all$nd_4)
results[["nd_5"]] <- CFmeansForDecileBinsRF(fault_binerrs_nd_5_treat_df, "Y", "nd_5")

fault_binerrs_i_7_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_7=fault_binerrs_all$i_7, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_7"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_7_treat_df, "Y", "i_7")

fault_binerrs_ii_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, ii_0=fault_binerrs_all$ii_0)
results[["ii_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_ii_0_treat_df, "Y", "ii_0")

fault_binerrs_i_6_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_6=fault_binerrs_all$i_6, i_5=fault_binerrs_all$i_5)
results[["i_6"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_6_treat_df, "Y", "i_6")

fault_binerrs_i_9_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_9=fault_binerrs_all$i_9, i_7=fault_binerrs_all$i_7, i_8=fault_binerrs_all$i_8)
results[["i_9"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_9_treat_df, "Y", "i_9")

fault_binerrs_i_8_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_8=fault_binerrs_all$i_8)
results[["i_8"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_8_treat_df, "Y", "i_8")

fault_binerrs_diff_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, diff_2=fault_binerrs_all$diff_2, diff_0=fault_binerrs_all$diff_0, diff_1=fault_binerrs_all$diff_1)
results[["diff_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_diff_2_treat_df, "Y", "diff_2")

fault_binerrs_i_21_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_21=fault_binerrs_all$i_21)
results[["i_21"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_21_treat_df, "Y", "i_21")

fault_binerrs_i_20_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_20=fault_binerrs_all$i_20)
results[["i_20"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_20_treat_df, "Y", "i_20")

fault_binerrs_i_23_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_23=fault_binerrs_all$i_23, i_22=fault_binerrs_all$i_22)
results[["i_23"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_23_treat_df, "Y", "i_23")

fault_binerrs_i_22_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_22=fault_binerrs_all$i_22)
results[["i_22"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_22_treat_df, "Y", "i_22")

fault_binerrs_bit_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, bit_0=fault_binerrs_all$bit_0)
results[["bit_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_bit_0_treat_df, "Y", "bit_0")

fault_binerrs_i_25_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_25=fault_binerrs_all$i_25)
results[["i_25"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_25_treat_df, "Y", "i_25")

fault_binerrs_bit_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, bit_1=fault_binerrs_all$bit_1, bit_0=fault_binerrs_all$bit_0)
results[["bit_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_bit_1_treat_df, "Y", "bit_1")

fault_binerrs_i_24_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_24=fault_binerrs_all$i_24, i_24=fault_binerrs_all$i_24, i_26=fault_binerrs_all$i_26)
results[["i_24"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_24_treat_df, "Y", "i_24")

fault_binerrs_diff_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, diff_0=fault_binerrs_all$diff_0, diff_0=fault_binerrs_all$diff_0, diff_1=fault_binerrs_all$diff_1)
results[["diff_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_diff_0_treat_df, "Y", "diff_0")

fault_binerrs_i_27_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_27=fault_binerrs_all$i_27, i_24=fault_binerrs_all$i_24, i_26=fault_binerrs_all$i_26)
results[["i_27"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_27_treat_df, "Y", "i_27")

fault_binerrs_diff_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, diff_1=fault_binerrs_all$diff_1, d_0=fault_binerrs_all$d_0, d_0=fault_binerrs_all$d_0)
results[["diff_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_diff_1_treat_df, "Y", "diff_1")

fault_binerrs_i_26_treat_df <- data.frame(Y=fault_binerrs_all$Y, i_26=fault_binerrs_all$i_26, i_25=fault_binerrs_all$i_25)
results[["i_26"]] <- CFmeansForDecileBinsRF(fault_binerrs_i_26_treat_df, "Y", "i_26")

fault_binerrs_w_real_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_real_0=fault_binerrs_all$w_real_0, w_real_0=fault_binerrs_all$w_real_0, w_real_1=fault_binerrs_all$w_real_1)
results[["w_real_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_real_0_treat_df, "Y", "w_real_0")

fault_binerrs_wd_real_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, wd_real_1=fault_binerrs_all$wd_real_1, z1_real_0=fault_binerrs_all$z1_real_0, z1_imag_0=fault_binerrs_all$z1_imag_0)
results[["wd_real_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_wd_real_1_treat_df, "Y", "wd_real_1")

fault_binerrs_w_real_2_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_real_2=fault_binerrs_all$w_real_2, w_real_0=fault_binerrs_all$w_real_0, w_real_1=fault_binerrs_all$w_real_1)
results[["w_real_2"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_real_2_treat_df, "Y", "w_real_2")

fault_binerrs_w_real_1_treat_df <- data.frame(Y=fault_binerrs_all$Y, w_real_1=fault_binerrs_all$w_real_1, tmp_real_0=fault_binerrs_all$tmp_real_0)
results[["w_real_1"]] <- CFmeansForDecileBinsRF(fault_binerrs_w_real_1_treat_df, "Y", "w_real_1")

fault_binerrs_wd_real_0_treat_df <- data.frame(Y=fault_binerrs_all$Y, wd_real_0=fault_binerrs_all$wd_real_0, j_0=fault_binerrs_all$j_0)
results[["wd_real_0"]] <- CFmeansForDecileBinsRF(fault_binerrs_wd_real_0_treat_df, "Y", "wd_real_0")

return(results)

}

