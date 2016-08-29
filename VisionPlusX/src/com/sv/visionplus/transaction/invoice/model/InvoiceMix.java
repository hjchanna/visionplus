/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.model;

import com.sv.visionplus.master.customer.model.MCustomer;

/**
 * Date : Aug 26, 2016 Time : 10:16:01 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class InvoiceMix {

    private TInvoice invoice;
    private TTransaction transaction;
    private TPatientInformation patientInformation;
    private MCustomer customer;
    private TInvoiceItem invoiceItem;
    private Status status;

    public TInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TInvoice invoice) {
        this.invoice = invoice;
    }

    public TTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(TTransaction transaction) {
        this.transaction = transaction;
    }

    public TPatientInformation getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(TPatientInformation patientInformation) {
        this.patientInformation = patientInformation;
    }

    public MCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(MCustomer customer) {
        this.customer = customer;
    }

    public TInvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(TInvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
