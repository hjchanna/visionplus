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
public class MUser{
    private Integer indexNo;
    private String name;
    private String userName;
    private String password;
    private String type;

    public MUser() {
    }

    public MUser(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public MUser(Integer indexNo, String name, String userName, String password, String type) {
        this.indexNo = indexNo;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.type = type;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
