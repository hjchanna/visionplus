package com.sv.visionplus.stock.stock_adjustment.model;

import java.util.Date;

/**
 *
 * @author KAZA
 */
public class TStockLedger {
    private Integer indexNo;
    private Integer store;
    private Integer item;
    private Date date;
    private double inQty;
    private double outQty;

    public TStockLedger() {
    }

    public TStockLedger(Integer indexNo, Integer store, Integer item, Date date, double inQty, double outQty) {
        this.indexNo = indexNo;
        this.store = store;
        this.item = item;
        this.date = date;
        this.inQty = inQty;
        this.outQty = outQty;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getInQty() {
        return inQty;
    }

    public void setInQty(double inQty) {
        this.inQty = inQty;
    }

    public double getOutQty() {
        return outQty;
    }

    public void setOutQty(double outQty) {
        this.outQty = outQty;
    }
    
    
}
