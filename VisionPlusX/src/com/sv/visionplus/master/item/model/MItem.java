/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item.model;

/**
 * Date : Aug 24, 2016 Time : 12:12:44 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class MItem {

    private Integer index_no;
    private Integer brand;
    private Integer category;
    private String code;
    private String name;
    private Double salePrice;
    private Double costPrice;
    private Integer reorderQty;

    public Integer getIndex_no() {
        return index_no;
    }

    public void setIndex_no(Integer index_no) {
        this.index_no = index_no;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
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

    public Integer getReorderQty() {
        return reorderQty;
    }

    public void setReorderQty(Integer reorderQty) {
        this.reorderQty = reorderQty;
    }

}