/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.model;

/**
 * Date : Aug 18, 2016 Time : 2:59:51 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class MBrand {

    private Integer indexNo;
    private String name;

    public MBrand() {
    }

    public MBrand(Integer indexNo, String name) {
        this.indexNo = indexNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    
}
