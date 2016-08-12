/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.model;

/**
 *
 * @author KAZA
 */
public class TChequeDetails{
    private TInvoice indexNo;
    private String chequeNo;
    private Double amount;
    private TInvoice mBankBranch;
    private TInvoice tPayment;

    public TChequeDetails() {
    }

    public TChequeDetails(TInvoice indexNo) {
        this.indexNo = indexNo;
    }

    public TChequeDetails(TInvoice indexNo, String chequeNo, Double amount, TInvoice mBankBranch, TInvoice tPayment) {
        this.indexNo = indexNo;
        this.chequeNo = chequeNo;
        this.amount = amount;
        this.mBankBranch = mBankBranch;
        this.tPayment = tPayment;
    }
    

    public TInvoice getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(TInvoice indexNo) {
        this.indexNo = indexNo;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TInvoice getMBankBranch() {
        return mBankBranch;
    }

    public void setMBankBranch(TInvoice mBankBranch) {
        this.mBankBranch = mBankBranch;
    }

    public TInvoice getTPayment() {
        return tPayment;
    }

    public void setTPayment(TInvoice tPayment) {
        this.tPayment = tPayment;
    }

}
