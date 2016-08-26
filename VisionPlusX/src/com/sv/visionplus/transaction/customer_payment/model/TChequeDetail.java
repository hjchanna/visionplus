/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.model;

/**
 *
 * @author KAZA
 */
public class TChequeDetail {
    private Integer indexNo;
    private Integer payment;
    private Integer bankBranch;
    private Integer chequeNo;
    private double amount;

    public TChequeDetail() {
    }

    public TChequeDetail(Integer indexNo, Integer payment, Integer bankBranch, Integer chequeNo, double amount) {
        this.indexNo = indexNo;
        this.payment = payment;
        this.bankBranch = bankBranch;
        this.chequeNo = chequeNo;
        this.amount = amount;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(Integer bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Integer getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(Integer chequeNo) {
        this.chequeNo = chequeNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
