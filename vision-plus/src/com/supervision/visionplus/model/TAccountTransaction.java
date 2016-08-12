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
public class TAccountTransaction{
    private Integer indexNo;
    private Date date;
    private Integer customer;
    private Integer supplier;
    private String description;
    private Double debit;
    private Double credit;
    private Integer mAccount;
    private Integer tTransaction;

    public TAccountTransaction() {
    }

    public TAccountTransaction(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public TAccountTransaction(Integer indexNo, Date date, Integer customer, Integer supplier, String description, Double debit, Double credit, Integer mAccount, Integer tTransaction) {
        this.indexNo = indexNo;
        this.date = date;
        this.customer = customer;
        this.supplier = supplier;
        this.description = description;
        this.debit = debit;
        this.credit = credit;
        this.mAccount = mAccount;
        this.tTransaction = tTransaction;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Integer getMAccount() {
        return mAccount;
    }

    public void setMAccount(Integer mAccount) {
        this.mAccount = mAccount;
    }

    public Integer getTTransaction() {
        return tTransaction;
    }

    public void setTTransaction(Integer tTransaction) {
        this.tTransaction = tTransaction;
    }

}
