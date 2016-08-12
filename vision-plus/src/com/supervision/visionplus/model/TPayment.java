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
public class TPayment {
    private Integer indexNo;
    private Integer transaction;
    private Double totalAmount;
    private Double cashAmount;
    private Double chequeAmount;
    private Double cardAmount;
   
    public TPayment() {
    }

    public TPayment(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public TPayment(Integer indexNo, Integer transaction, Double totalAmount, Double cashAmount, Double chequeAmount, Double cardAmount) {
        this.indexNo = indexNo;
        this.transaction = transaction;
        this.totalAmount = totalAmount;
        this.cashAmount = cashAmount;
        this.chequeAmount = chequeAmount;
        this.cardAmount = cardAmount;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Double getChequeAmount() {
        return chequeAmount;
    }

    public void setChequeAmount(Double chequeAmount) {
        this.chequeAmount = chequeAmount;
    }

    public Double getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(Double cardAmount) {
        this.cardAmount = cardAmount;
    }

    
   
}
