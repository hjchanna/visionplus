/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.TInvoice;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 12:34:47 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface InvoiceService {

    public boolean addInvoice(TInvoice invoice) throws ClassNotFoundException ,SQLException;

    public boolean updateInvoice(TInvoice invoice) throws ClassNotFoundException ,SQLException;

    public ArrayList<TInvoice> searchInvoice(String id) throws ClassNotFoundException ,SQLException;

    public ArrayList<TInvoice> getAllInvoice() throws ClassNotFoundException ,SQLException;

}
