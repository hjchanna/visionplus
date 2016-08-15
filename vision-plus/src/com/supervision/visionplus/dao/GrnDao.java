/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.TGrn;
import com.supervision.visionplus.model.TInvoice;
//import com.supervision.visionplus.service.GrnService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016
 * Time : 2:10:41 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class GrnDao{

    public static boolean addGrn(TGrn grn) throws ClassNotFoundException , SQLException{
        String sql = "INSERT INTO t_grn VALUES(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, grn.getIndexNo());
        stm.setObject(2, grn.getTransaction());
        stm.setObject(3, grn.getMSupplier());
        stm.setObject(4, grn.getTPayment());
        stm.setObject(5, grn.getDate());
        stm.setObject(6, grn.getAmount());
        
        return  stm.executeUpdate()>0;
    }

    public static boolean updateGrn(TGrn grn) throws ClassNotFoundException , SQLException{
        String sql = "UPDATE T_grn SET transaction=?,supplier=?,payment=?,date=?,amount=? WHERE index_no=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, grn.getTransaction());
        stm.setObject(2, grn.getMSupplier());
        stm.setObject(3, grn.getTPayment());
        stm.setObject(4, grn.getDate());
        stm.setObject(5, grn.getAmount());
        stm.setObject(6, grn.getIndexNo());
        return  stm.executeUpdate()>0;
    }

    public static ArrayList<TGrn> searchGrn(String index_no) throws ClassNotFoundException , SQLException{
        String sql = "SELECT * FROM t_grn WHERE index_no=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, index_no);
        ResultSet rst = stm.executeQuery();
        ArrayList<TGrn> grns=new ArrayList<>();
        while(rst.next()){
            TGrn grn = new TGrn(rst.getInt("index_no"), rst.getInt("transaction"),rst.getDate("date"), rst.getDouble("amount"), rst.getInt("payment"), rst.getInt("supplier"));
            grns.add(grn);
        }
        return grns;
        
    }

}
