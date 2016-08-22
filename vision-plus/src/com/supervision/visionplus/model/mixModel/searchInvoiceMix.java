/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.model.mixModel;

import java.util.Date;

/**
 *
 * @author KAZA
 */
public class SearchInvoiceMix {
    private String invoiceNo;
    private String date;
    private String name;
    private String address;
    private String contactNO;

    public SearchInvoiceMix() {
    }

    public SearchInvoiceMix(String invoiceNo, String date, String name, String address, String contactNO) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.name = name;
        this.address = address;
        this.contactNO = contactNO;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNO() {
        return contactNO;
    }

    public void setContactNO(String contactNO) {
        this.contactNO = contactNO;
    }
    
    
}
