/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.MSupplier;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Date : Aug 15, 2016 Time : 10:20:20 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface SupplierService {

    public boolean addSupplier(MSupplier supplier) throws ClassNotFoundException, SQLException;

    public boolean deleteSupplier(String id) throws ClassNotFoundException, SQLException;

    public boolean updateSupplier(MSupplier supplier) throws ClassNotFoundException, SQLException;

    public ArrayList<MSupplier> searchSupplier(String id) throws ClassNotFoundException, SQLException;

    public ArrayList<MSupplier> getAllSupplier() throws ClassNotFoundException, SQLException;

}
