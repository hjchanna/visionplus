/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MCustomer;
import com.supervision.visionplus.model.TInvoicePatientInfomation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KAZA
 */
public class PatientHistoryDao {
     private static PatientHistoryDao INSTANCE;

    public static final PatientHistoryDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PatientHistoryDao();
        }
        return INSTANCE;
    }
    
    private PatientHistoryDao(){
        
    }

    public Integer addPatientHistory(TInvoicePatientInfomation patientInfomation) throws SQLException {
        String query = "INSERT INTO t_invoice_patient_infomation VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, patientInfomation.getIndexNo());
        stm.setObject(2, patientInfomation.getComplains());
        stm.setObject(3, patientInfomation.getHbRxLeft());
        stm.setObject(4, patientInfomation.getHbRxRight());
        stm.setObject(5, patientInfomation.getHbRxSubLeft());
        stm.setObject(6, patientInfomation.getHbRxSubRight());
        stm.setObject(7, patientInfomation.getAutoRefLeft());
        stm.setObject(8, patientInfomation.getAutoRefRight());
        stm.setObject(9, patientInfomation.getNtcLeft());
        stm.setObject(10, patientInfomation.getNtcRight());
        stm.setObject(11, patientInfomation.getVaWithoutGlassLeft());
        stm.setObject(12, patientInfomation.getVaWithoutGlassRight());
        stm.setObject(13, patientInfomation.getVaWithPhLeft());
        stm.setObject(14, patientInfomation.getVaWithPhRight());
        stm.setObject(15, patientInfomation.getVaWithGlassLeft());
        stm.setObject(16, patientInfomation.getVaWithGlassRight());
        stm.setObject(17, patientInfomation.getDistSphLeft());
        stm.setObject(18, patientInfomation.getDistSphRight());
        stm.setObject(19, patientInfomation.getDistCylLeft());
        stm.setObject(20, patientInfomation.getDistCylRight());
        stm.setObject(21, patientInfomation.getDistAxisLeft());
        stm.setObject(22, patientInfomation.getDistAxisRight());
        stm.setObject(23, patientInfomation.getNearSphLeft());
        stm.setObject(24, patientInfomation.getNearSphRight());
        stm.setObject(25, patientInfomation.getNearCylLeft());
        stm.setObject(26, patientInfomation.getNearCylRight());
        stm.setObject(27, patientInfomation.getNearAxisLeft());
        stm.setObject(28, patientInfomation.getNearAxisRight());
        stm.setObject(29, patientInfomation.getLenseType());
        stm.setObject(30, patientInfomation.getRefractiveError());
        stm.setObject(31, patientInfomation.getRemarks());
        stm.executeUpdate();
         return patientInfomation.getIndexNo();
    }
    
    public TInvoicePatientInfomation searchPatientHistory(Integer indexNo) throws SQLException {
        String query = "SELECT * FROM t_invoice_patient_infomation WHERE index_no=" + indexNo + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return new TInvoicePatientInfomation(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getString(18), rst.getString(19), rst.getString(20), rst.getString(21), rst.getString(22), rst.getString(23), rst.getString(24), rst.getString(25), rst.getString(26), rst.getString(27), rst.getString(28), rst.getString(29), rst.getString(30), rst.getString(31));
        }
        return null;

    }
}
