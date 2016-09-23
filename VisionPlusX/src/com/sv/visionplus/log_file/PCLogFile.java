/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.log_file;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.log_file.model.LogFileModel;
import com.sv.visionplus.stock.stock_adjustment.model.MItem;
import com.sv.visionplus.system.exception.VPException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCLogFile extends AbstractObjectCreator<LogFileModel> {
    private DefaultTableModel model;
    /**
     * Creates new form PCInvoice
     */
    public PCLogFile(AbstractTransactionForm transactionForm) {
        initComponents();

        this.transactionForm = transactionForm;
        model=(DefaultTableModel) tblLog.getModel();
        setLog();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblLog = new javax.swing.JTable();

        tblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Time", "User Name", "Form Name", "Type", "Value "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
       
    }

    @Override
    public void setNewMode() {
        logFile=new LogFileModel();
    }

    @Override
    public void setEditMode() {
        
    }

    @Override
    public void resetFields() {
       
    }

    @Override
    public void initObject() throws VPException {
       logFile=new LogFileModel();
    }

    @Override
    public void initInterface() throws VPException {
        
    }

    @Override
    protected void setValueAbstract(LogFileModel log) {
        this.logFile=log;
    }

    @Override
    protected LogFileModel getValueAbstract() {
        return logFile;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLog;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<MItem> transactionForm;
    private LogFileModel logFile;

    private void setLog() {
        List<LogFileModel> logs = LogFileDAO.getInstance().AllUser();
        setDate(logs);
    }

    private void setDate(List<LogFileModel> logs) {
        model.setRowCount(0);
        for (LogFileModel log : logs) {
            Object[] rowData={
                log.getDate(),
                log.getTime(),
                log.getName(),
                log.getFormName(),
                log.getTransactionType(),
                log.getValue()
            };
            model.addRow(rowData);
        }
    }
}
