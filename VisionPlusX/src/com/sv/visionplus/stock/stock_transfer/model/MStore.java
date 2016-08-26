package com.sv.visionplus.stock.stock_transfer.model;

/**
 *
 * @author KAZA
 */
public class MStore {
    private Integer IndexNo;
    private String name;

    public MStore() {
    }

    public MStore(Integer IndexNo, String name) {
        this.IndexNo = IndexNo;
        this.name = name;
    }

    public Integer getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(Integer IndexNo) {
        this.IndexNo = IndexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
