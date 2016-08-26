package com.sv.visionplus.stock.stock_transfer.model;

/**
 *
 * @author KAZA
 */
public class MItem {
    private Integer indexNo;
    private Integer brand;
    private Integer category;
    private String code;
    private String name;
    private double salesPrice;
    private double costPrice;
    private Integer reOrderLevel;

    public MItem() {
    }

    public MItem(Integer indexNo, Integer brand, Integer category, String code, String name, double salesPrice, double costPrice, Integer reOrderLevel) {
        this.indexNo = indexNo;
        this.brand = brand;
        this.category = category;
        this.code = code;
        this.name = name;
        this.salesPrice = salesPrice;
        this.costPrice = costPrice;
        this.reOrderLevel = reOrderLevel;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
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

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getReOrderLevel() {
        return reOrderLevel;
    }

    public void setReOrderLevel(Integer reOrderLevel) {
        this.reOrderLevel = reOrderLevel;
    }
    
     
    
}
