/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.TInvoiceItem;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 12:39:03 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface InvoiceItemDetailService {

    public boolean addInvoiceItemDetail(TInvoiceItem invoiceItem);

    public boolean updateInvoiceItemDetail(TInvoiceItem invoiceItem);

    public ArrayList<TInvoiceItem> searchInvoiceItemDetail(String id);

    public ArrayList<TInvoiceItem> getAllInvoiceItemDetail();

}
