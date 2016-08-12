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
public class TStockLedger{
    private Integer indexNo;
    private Date date;
    private Double inQty;
    private Double outQty;
    private Integer store;
    private Integer mItem;

    public TStockLedger() {
    }

    public TStockLedger(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public TStockLedger(Integer indexNo, Date date, Double inQty, Double outQty, Integer store, Integer mItem) {
        this.indexNo = indexNo;
        this.date = date;
        this.inQty = inQty;
        this.outQty = outQty;
        this.store = store;
        this.mItem = mItem;
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

    public Double getInQty() {
        return inQty;
    }

    public void setInQty(Double inQty) {
        this.inQty = inQty;
    }

    public Double getOutQty() {
        return outQty;
    }

    public void setOutQty(Double outQty) {
        this.outQty = outQty;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getMItem() {
        return mItem;
    }

    public void setMItem(Integer mItem) {
        this.mItem = mItem;
    }

}
