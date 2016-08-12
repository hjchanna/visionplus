/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.MCustomer;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 12:23:03 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface CustomerService {

    public boolean addCustomer(MCustomer customer);

    public boolean deleteCustomer(String id);

    public boolean updateCustomer(MCustomer customer);

    public ArrayList<MCustomer> searchCustomer(String id);

    public ArrayList<MCustomer> getAllCustomer();

}
