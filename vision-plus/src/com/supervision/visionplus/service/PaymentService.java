
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.TPayment;
import java.sql.SQLException;

/**
 * Date : Aug 12, 2016 Time : 2:05:05 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface PaymentService {

    public boolean addPayment(TPayment payment) throws ClassNotFoundException,SQLException;
    
}
