/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.model;

import java.util.Date;


/**
 *
 * @author KAZA
 */
public class TGrn{
    private Integer indexNo;
    private Integer transaction;
    private Date date;
    private Double amount;
    private Integer tPayment;
    private Integer mSupplier;

    public TGrn() {
    }

    public TGrn(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public TGrn(Integer indexNo, Integer transaction, Date date, Double amount, Integer tPayment, Integer mSupplier) {
        this.indexNo = indexNo;
        this.transaction = transaction;
        this.date = date;
        this.amount = amount;
        this.tPayment = tPayment;
        this.mSupplier = mSupplier;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTPayment() {
        return tPayment;
    }

    public void setTPayment(Integer tPayment) {
        this.tPayment = tPayment;
    }

    public Integer getMSupplier() {
        return mSupplier;
    }

    public void setMSupplier(Integer mSupplier) {
        this.mSupplier = mSupplier;
    }

   
}
