/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection.model;

import java.util.Date;

/**
 *
 * @author KAZA
 */
public class TAccountTransaction {
    private Integer indexNo;
    private Date date;
    private Integer account;
    private Integer customer;
    private Integer supplier;
    private String description;
    private double debit;
    private double credit;
    private Integer transaction;

    public TAccountTransaction() {
    }

    public TAccountTransaction(Integer indexNo, Date date, Integer account, Integer customer, Integer supplier, String description, double debit, double credit, Integer transaction) {
        this.indexNo = indexNo;
        this.date = date;
        this.account = account;
        this.customer = customer;
        this.supplier = supplier;
        this.description = description;
        this.debit = debit;
        this.credit = credit;
        this.transaction = transaction;
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

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
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

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }
    
    
}
