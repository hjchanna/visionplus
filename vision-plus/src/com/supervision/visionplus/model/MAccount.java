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

public class MAccount{
    private Integer indexNo;
    private String description;
    private String type;

    public MAccount() {
    }

    public MAccount(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public MAccount(Integer indexNo, String description, String type) {
        this.indexNo = indexNo;
        this.description = description;
        this.type = type;
    }

    
    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
}
