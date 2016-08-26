/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.checking;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.resource.InvoiceStatus.InvoiceStatus;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCChecking extends AbstractObjectCreator<TInvoice> {

    /**
     * Creates new form PCInvoice
     */
    public PCChecking(AbstractTransactionForm transactionForm) {
        initComponents();
        model = (DefaultTableModel) tblItem.getModel();
        this.transactionForm = transactionForm;
        setTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmboSelectStatus = new javax.swing.JComboBox();
        cmboChangeStatus = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtInvoiceNo = new com.sv.visionplus.util.component.textfield.CIntegerField();

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Receipt No", "Description", "No of Items", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);

        jLabel1.setText("Select Order Status :");

        jLabel2.setText("Change Status :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cmboSelectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmboChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboSelectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel3.setText("Reciept No :");

        jButton1.setText("S");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtInvoiceNo.setCValueEditable(false);
        cmboChangeStatus.removeAllItems();
        cmboSelectStatus.removeAllItems();
        model.setRowCount(0);
    }

    @Override
    public void setNewMode() {
        txtInvoiceNo.setCValueEditable(true);
        cmboChangeStatus.setEditable(true);
        cmboSelectStatus.setEditable(true);
        model.setRowCount(0);
        setComboValue();

    }

    @Override
    public void setEditMode() {
        txtInvoiceNo.setCValueEditable(true);
        cmboChangeStatus.setEditable(true);
        cmboSelectStatus.setEditable(true);
    }

    @Override
    public void resetFields() {
        txtInvoiceNo.resetCValue();
        cmboChangeStatus.removeAllItems();
        cmboSelectStatus.removeAllItems();
        model.setRowCount(0);
    }

    @Override
    public void initObject() throws VPException {
        this.invoice.setStatus(cmboSelectStatus.getSelectedItem().toString());
    }

    @Override
    public void initInterface() throws VPException {
        
    }

    @Override
    protected void setValueAbstract(TInvoice object) {
        this.invoice = object;
    }

    @Override
    protected TInvoice getValueAbstract() {
        return this.invoice;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmboChangeStatus;
    private javax.swing.JComboBox cmboSelectStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtInvoiceNo;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<TInvoice> transactionForm;
    private DefaultTableModel model;
    private TInvoice invoice;

    private void setComboValue() {
        cmboChangeStatus.addItem(InvoiceStatus.PENDING);
        cmboChangeStatus.addItem(InvoiceStatus.ISSUED_TO_FACTORY);
        cmboChangeStatus.addItem(InvoiceStatus.RESERVED_FROM_FACTORY);
        cmboChangeStatus.addItem(InvoiceStatus.ISSUED_TO_CUSTOMER);

        cmboSelectStatus.addItem(InvoiceStatus.PENDING);
        cmboSelectStatus.addItem(InvoiceStatus.ISSUED_TO_FACTORY);
        cmboSelectStatus.addItem(InvoiceStatus.RESERVED_FROM_FACTORY);
        cmboSelectStatus.addItem(InvoiceStatus.ISSUED_TO_CUSTOMER);
    }

    private void setTableData() {
        CheckingService service=new  CheckingService();
        try {
            TInvoice t = service.select(1);
            model.setRowCount(0);
            Object[] data={
                t.getIndexNo(),
                t.getCustomer(),
                t.getStatus(),
                t.getTransaction()
            };
            model.addRow(data);
            
            
            
        } catch (VPException ex) {
            Logger.getLogger(PCChecking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
