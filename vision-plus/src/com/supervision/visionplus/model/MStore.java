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
public class MStore{
    private Integer indexNo;
    private String name;

    public MStore() {
    }
    

    public MStore(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public MStore(Integer indexNo, String name) {
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
