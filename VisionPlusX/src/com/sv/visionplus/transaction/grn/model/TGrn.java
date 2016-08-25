/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn.model;

import java.util.Date;

/**
 *
 * @author KAZA
 */
public class TGrn {
    private Integer IndexNo;
    private Integer transaction;
    private Integer supplier;
    private Integer payment;
    private Date date;
    private double amount;

    public TGrn() {
    }

    public TGrn(Integer IndexNo, Integer transaction, Integer supplier, Integer payment, Date date, double amount) {
        this.IndexNo = IndexNo;
        this.transaction = transaction;
        this.supplier = supplier;
        this.payment = payment;
        this.date = date;
        this.amount = amount;
    }

    public Integer getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(Integer IndexNo) {
        this.IndexNo = IndexNo;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
