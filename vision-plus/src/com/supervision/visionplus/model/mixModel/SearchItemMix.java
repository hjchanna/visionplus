/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supervision.visionplus.model.mixModel;

/**
 * Date : Aug 22, 2016
 * Time : 4:00:31 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class SearchItemMix {
    
    private String code;
    private String brand;
    private String category;
    private String description;
    private String salePrice;
    private String costprice;
    private String reOrderQty;

    public SearchItemMix() {
    }

    public SearchItemMix(String code, String brand, String category, String description, String salePrice, String costprice, String reOrderQty) {
        this.code = code;
        this.brand = brand;
        this.category = category;
        this.description = description;
        this.salePrice = salePrice;
        this.costprice = costprice;
        this.reOrderQty = reOrderQty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getCostprice() {
        return costprice;
    }

    public void setCostprice(String costprice) {
        this.costprice = costprice;
    }

    public String getReOrderQty() {
        return reOrderQty;
    }

    public void setReOrderQty(String reOrderQty) {
        this.reOrderQty = reOrderQty;
    }

    
    
    

}
