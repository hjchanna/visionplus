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
public class TCardDetails{
    private TInvoice indexNo;
    private String cardNo;
    private Double amount;
    private TInvoice mBankBranch;
    private TInvoice tPayment;

    public TCardDetails() {
    }

    public TCardDetails(TInvoice indexNo) {
        this.indexNo = indexNo;
    }

    public TCardDetails(TInvoice indexNo, String cardNo, Double amount, TInvoice mBankBranch, TInvoice tPayment) {
        this.indexNo = indexNo;
        this.cardNo = cardNo;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
