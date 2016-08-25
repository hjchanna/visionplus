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
public class Transaction {
    private Integer indexNo;
    private Date date;
    private String type;

    public Transaction() {
    }

    public Transaction(Integer indexNo, Date date, String type) {
        this.indexNo = indexNo;
        this.date = date;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
