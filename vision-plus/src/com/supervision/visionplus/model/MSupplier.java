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
public class MSupplier{
    private Integer indexNo;
    private String name;
    private String contactNo;
    private String email;

    public MSupplier() {
    }

    public MSupplier(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public MSupplier(Integer indexNo, String name, String contactNo, String email) {
        this.indexNo = indexNo;
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
