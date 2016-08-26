/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.money_collection.model;

/**
 *
 * @author KAZA
 */
public class MAccount {
    private Integer indexNo;
    private String Description;
    private String type;

    public MAccount() {
    }

    public MAccount(Integer indexNo, String Description, String type) {
        this.indexNo = indexNo;
        this.Description = Description;
        this.type = type;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
