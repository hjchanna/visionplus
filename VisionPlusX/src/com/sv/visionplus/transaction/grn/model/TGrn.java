/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn.model;

import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 *
 * @author KAZA
 */
@VPTable("t_grn")
public class TGrn {
    
    private Integer IndexNo;
    private Integer transaction;
    private Integer supplier;
    private Date date;
    private double amount;

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
