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

public class MItem{
    private Integer indexNo;
    private String code;
    private String name;
    private Double salePrice;
    private Double costPrice;

    public MItem() {
    }

    public MItem(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public MItem(Integer indexNo, String code, String name, Double salePrice, Double costPrice) {
        this.indexNo = indexNo;
        this.code = code;
        this.name = name;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
    }
    
    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

}
