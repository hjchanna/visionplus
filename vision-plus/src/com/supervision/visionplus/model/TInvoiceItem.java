/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.model;

/**
 *
 * @author KAZA
 */
public class TInvoiceItem{
    private TInvoice indexNo;
    private Double unitPrice;
    private TInvoice qty;
    private Double value;
    private Double discount;
    private Double netValue;
    private TInvoice mItem;
    private TInvoice tInvoice;

    public TInvoiceItem() {
    }

    public TInvoiceItem(TInvoice indexNo) {
        this.indexNo = indexNo;
    }

    public TInvoiceItem(TInvoice indexNo, Double unitPrice, TInvoice qty, Double value, Double discount, Double netValue, TInvoice mItem, TInvoice tInvoice) {
        this.indexNo = indexNo;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.value = value;
        this.discount = discount;
        this.netValue = netValue;
        this.mItem = mItem;
        this.tInvoice = tInvoice;
    }

    public TInvoice getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(TInvoice indexNo) {
        this.indexNo = indexNo;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public TInvoice getQty() {
        return qty;
    }

    public void setQty(TInvoice qty) {
        this.qty = qty;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getNetValue() {
        return netValue;
    }

    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }

    public TInvoice getMItem() {
        return mItem;
    }

    public void setMItem(TInvoice mItem) {
        this.mItem = mItem;
    }

    public TInvoice getTInvoice() {
        return tInvoice;
    }

    public void setTInvoice(TInvoice tInvoice) {
        this.tInvoice = tInvoice;
    }

}
