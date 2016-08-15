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
public class TGrnItem{
    private Integer indexNo;
    private Double unitPrice;
    private Double qty;
    private Double value;
    private Double discount;
    private Double netValue;
    private Integer mItem;
    private Integer tGrn;

    public TGrnItem() {
    }

    public TGrnItem(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public TGrnItem(Integer indexNo, Double unitPrice, Double qty, Double value, Double discount, Double netValue, Integer mItem, Integer tGrn) {
        this.indexNo = indexNo;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.value = value;
        this.discount = discount;
        this.netValue = netValue;
        this.mItem = mItem;
        this.tGrn = tGrn;
    }

    
    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
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

    public Integer getMItem() {
        return mItem;
    }

    public void setMItem(Integer mItem) {
        this.mItem = mItem;
    }

    public Integer getTGrn() {
        return tGrn;
    }

    public void setTGrn(Integer tGrn) {
        this.tGrn = tGrn;
    }

   
}
