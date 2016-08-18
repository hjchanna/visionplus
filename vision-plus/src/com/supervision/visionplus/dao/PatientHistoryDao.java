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
import java.sql.SQLException;

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
}
