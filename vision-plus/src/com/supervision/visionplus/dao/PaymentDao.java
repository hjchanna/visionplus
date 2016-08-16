/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.TPayment;
//import com.supervision.visionplus.service.PaymentService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Date : Aug 12, 2016
 * Time : 2:06:27 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class PaymentDao {

    public static boolean addPayment(TPayment payment) throws ClassNotFoundException , SQLException{
        String sql = "INSERT INTO t_payment VALUES(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, payment.getIndexNo());
        stm.setObject(2, payment.getTransaction());
        stm.setObject(3, payment.getTotalAmount());
        stm.setObject(4, payment.getCashAmount());
        stm.setObject(5, payment.getChequeAmount());
        stm.setObject(6, payment.getCardAmount());
        
        return  stm.executeUpdate()>0;
    }

}
