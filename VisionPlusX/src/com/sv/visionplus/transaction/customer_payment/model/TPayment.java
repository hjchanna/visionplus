/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.model;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("t_payment")
public class TPayment {

    @VPId
    private Integer indexNo;
    private Integer transaction;
    private double totalAmont;
    private double cashAmont;
    private double cardAmont;
    private double chequeAmont;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }

    public double getTotalAmont() {
        return totalAmont;
    }

    public void setTotalAmont(double totalAmont) {
        this.totalAmont = totalAmont;
    }

    public double getCashAmont() {
        return cashAmont;
    }

    public void setCashAmont(double cashAmont) {
        this.cashAmont = cashAmont;
    }

    public double getCardAmont() {
        return cardAmont;
    }

    public void setCardAmont(double cardAmont) {
        this.cardAmont = cardAmont;
    }

    public double getChequeAmont() {
        return chequeAmont;
    }

    public void setChequeAmont(double chequeAmont) {
        this.chequeAmont = chequeAmont;
    }

}
