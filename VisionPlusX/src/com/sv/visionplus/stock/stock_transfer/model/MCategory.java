package com.sv.visionplus.stock.stock_transfer.model;

/**
 *
 * @author KAZA
 */
public class MCategory {

    private Integer indexNo;
    private String name;

    public MCategory() {
    }

    public MCategory(Integer indexNo, String name) {
        this.indexNo = indexNo;
        this.name = name;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
