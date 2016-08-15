/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.TGrnItem;
import com.supervision.visionplus.model.TInvoice;
//import com.supervision.visionplus.service.GrnDetailService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016
 * Time : 3:29:21 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class GrnDetailDao {

    public static boolean addGrnDetails(ArrayList<TGrnItem> grnItems) throws ClassNotFoundException, SQLException {
        int res = 0 ;
        for (TGrnItem grnItem : grnItems) {
            
            String sql = "INSERT INTO t_grn_item VALUES(?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1,grnItem.getIndexNo());
            stm.setObject(2,grnItem.getTGrn());
            stm.setObject(3,grnItem.getMItem());
            stm.setObject(4,grnItem.getUnitPrice());
            stm.setObject(5,grnItem.getQty());
            stm.setObject(6,grnItem.getValue());
            stm.setObject(7,grnItem.getDiscount());
            stm.setObject(8,grnItem.getNetValue());
            res += stm.executeUpdate();
        }
        if (res == grnItems.size()) {
            return true ;
        }
        return false ;
    }

   
    public static ArrayList<TGrnItem> searchGrnItemsByGrn(String grn) throws ClassNotFoundException, SQLException {
    String sql = "SELECT * FROM t_grn_item WHERE grn=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, grn);
        ResultSet rst = stm.executeQuery();
        ArrayList<TGrnItem> grnItems=new ArrayList<>();
        while(rst.next()){
            TGrnItem grnItem=new TGrnItem(rst.getInt("index_no"), rst.getDouble("unit_price"), rst.getDouble("qty"), rst.getDouble("value"), rst.getDouble("discount"), rst.getDouble("net_value"),rst.getInt("item"), rst.getInt("grn"));
            grnItems.add(grnItem);
        }
        return grnItems;
    }

  
}
