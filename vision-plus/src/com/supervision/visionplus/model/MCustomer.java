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
public class MCustomer{
    private Integer indexNo;
    private String name;
    private String nic;
    private String address;
    private String contactNo;

    public MCustomer() {
    }

    public MCustomer(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public MCustomer(Integer indexNo, String name, String nic, String address, String contactNo) {
        this.indexNo = indexNo;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.contactNo = contactNo;
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

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
