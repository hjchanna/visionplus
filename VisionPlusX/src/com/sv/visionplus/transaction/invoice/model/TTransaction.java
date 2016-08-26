/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.model;

import com.sv.visionplus.util.database.annotation.VPTable;
import java.util.Date;

/**
 * Date : Aug 26, 2016 Time : 10:13:09 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
@VPTable("t_transaction")
public class TTransaction {

    private Integer indexNo;
    private Date Date;
    private String type;

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
