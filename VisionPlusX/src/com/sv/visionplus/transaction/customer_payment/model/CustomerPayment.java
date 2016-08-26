/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment.model;

import java.util.Date;

/**
 *
 * @author KAZA
 */
public class CustomerPayment {
    private Integer indexNo;
    private Date date;
    private Integer payment;
    private Integer invoice;

    public CustomerPayment() {
    }

    public CustomerPayment(Integer indexNo, Date date, Integer payment, Integer invoice) {
        this.indexNo = indexNo;
        this.date = date;
        this.payment = payment;
        this.invoice = invoice;
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

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }
    
    
    
}
