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
public class TInvoice{
    private Integer indexNo;
    private Integer transaction;
    private String invoiceDate;
    private Double amount;
    private String status;
    private Integer tInvoicePatientInfomation;
    private Integer tPayment;
    private Integer mCustomer;

    public TInvoice() {
    }

    public TInvoice(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public TInvoice(Integer indexNo, Integer transaction, String invoiceDate, Double amount, String status, Integer tInvoicePatientInfomation, Integer tPayment, Integer mCustomer) {
        this.indexNo = indexNo;
        this.transaction = transaction;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.status = status;
        this.tInvoicePatientInfomation = tInvoicePatientInfomation;
        this.tPayment = tPayment;
        this.mCustomer = mCustomer;
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

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTInvoicePatientInfomation() {
        return tInvoicePatientInfomation;
    }

    public void setTInvoicePatientInfomation(Integer tInvoicePatientInfomation) {
        this.tInvoicePatientInfomation = tInvoicePatientInfomation;
    }

    public Integer getTPayment() {
        return tPayment;
    }

    public void setTPayment(Integer tPayment) {
        this.tPayment = tPayment;
    }

    public Integer getMCustomer() {
        return mCustomer;
    }

    public void setMCustomer(Integer mCustomer) {
        this.mCustomer = mCustomer;
    }

    
}
