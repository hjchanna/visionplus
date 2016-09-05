package com.sv.visionplus.transaction.grn.dialog.item.model;

/**
 * @author Nidura Prageeth
 */
public class ItemMix {

    private String code;
    private String name;
    private String brand;
    private String category;
    private Double salePrice;
    private Double costPrice;

    public ItemMix() {
    }

    public ItemMix(String code, String name, String brand, String category, Double salePrice, Double costPrice) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
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
