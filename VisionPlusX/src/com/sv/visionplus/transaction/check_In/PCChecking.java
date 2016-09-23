/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.resource.InvoiceStatus.InvoiceStatus;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.check_In.model.MCustomer;
import com.sv.visionplus.transaction.check_In.model.MFactory;
import com.sv.visionplus.transaction.check_In.model.TInvoice;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCChecking extends AbstractObjectCreator<TInvoice> {

    private int value = 2;
    private Integer count = 1;

    /**
     * Creates new form PCInvoice
     */
    public PCChecking(AbstractTransactionForm transactionForm) {
        initComponents();
        model = (DefaultTableModel) tblItem.getModel();
        this.transactionForm = transactionForm;
        this.value = 2;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmboChangeStatus = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new com.sv.visionplus.util.component.textfield.CDateField();
        cmboFactory = new javax.swing.JComboBox();
        chxBoxReturn = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtInvoiceNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        chxBoxAllSelect = new javax.swing.JCheckBox();
        btnStatus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "InvoiceNo", "Customer Name", "Status", "No of Items", "Amount", " ", "Factory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(20);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(20);
            tblItem.getColumnModel().getColumn(3).setMinWidth(100);
            tblItem.getColumnModel().getColumn(7).setMinWidth(0);
            tblItem.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        cmboChangeStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboChangeStatusItemStateChanged(evt);
            }
        });

        jLabel2.setText("Change Status :");

        jLabel4.setText("Date :");

        chxBoxReturn.setText("Return");
        chxBoxReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxBoxReturnActionPerformed(evt);
            }
        });

        jLabel1.setText("Factory :");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmboChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chxBoxReturn))
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmboFactory, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboFactory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chxBoxReturn)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Invoice No :");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chxBoxAllSelect.setText("All Select");
        chxBoxAllSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxBoxAllSelectActionPerformed(evt);
            }
        });

        btnStatus.setText("Issue");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        jLabel5.setText("Count :");

        lblCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chxBoxAllSelect)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStatus)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chxBoxAllSelect)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStatus)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chxBoxAllSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxBoxAllSelectActionPerformed
        if (value == 2) {

            if (chxBoxAllSelect.isSelected()) {
                setCheckBox(true);

            } else {
                setCheckBox(false);

            }
        }
    }//GEN-LAST:event_chxBoxAllSelectActionPerformed

    private void cmboChangeStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboChangeStatusItemStateChanged
        if (value == 2) {
            String status = cmboChangeStatus.getSelectedItem().toString();
            if (InvoiceStatus.RESERVED_FROM_CUSTOMER.equals(status)) {
                btnStatus.setText("Issue To Factory");
                chxBoxReturn.setEnabled(true);
                getInvoice(status);
            } else if (InvoiceStatus.ISSUED_TO_FACTORY.equals(status)) {
                btnStatus.setText("Reserved From Factory");
                chxBoxReturn.setEnabled(true);
                getInvoice(status);

            } else if (InvoiceStatus.RESERVED_FROM_FACTORY.equals(status)) {
                chxBoxReturn.setEnabled(true);
                if (chxBoxReturn.isSelected()) {
                    btnStatus.setText("Reserved From Factory");
                } else {
                    btnStatus.setText("Issue To Customer");
                }
                getInvoice(status);

            } else if (InvoiceStatus.ISSUED_TO_CUSTOMER.equals(status)) {
                btnStatus.setText("Reserved From Customer");
                chxBoxReturn.setSelected(true);
                chxBoxReturn.setEnabled(false);
                getInvoice(status);

            } else {
            }

        }
    }//GEN-LAST:event_cmboChangeStatusItemStateChanged

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        if (model.getRowCount() > 0) {
            ArrayList<String> idList = new ArrayList<>();
            for (int i = 0; i < tblItem.getRowCount(); i++) {
                if ("true" == model.getValueAt(i, 6).toString()) {

                    idList.add(model.getValueAt(i, 1).toString());
                }
            }
            int updateCount = setUpdate(idList);
            if (updateCount > 0) {

                JOptionPane.showMessageDialog(this, updateCount + " invoices done");
                resetFields();
            } else {

                JOptionPane.showMessageDialog(this, "Update was failed");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No invoice Selected");
        }
    }//GEN-LAST:event_btnStatusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (value == 2) {
            String status = cmboChangeStatus.getSelectedItem().toString();
            if (!"All".equals(cmboFactory.getSelectedItem().toString())) {
                String factoryId = cmboFactory.getSelectedItem().toString().split("-")[0];
                List<TInvoice> Invoices = InvoiceDAO.getInstance().searchInvoice(status, factoryId);
                addData(Invoices);
            } else {
                getInvoice(status);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String invoiceNo = txtInvoiceNo.getText();
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).toString().equals(invoiceNo)) {
                    model.setValueAt(true, i, 6);
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chxBoxReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxBoxReturnActionPerformed
        String status = cmboChangeStatus.getSelectedItem().toString();
        if (InvoiceStatus.RESERVED_FROM_CUSTOMER.equals(status)) {
            if (chxBoxReturn.isSelected()) {
                btnStatus.setText("Issue to Customer");
            } else {
                btnStatus.setText("Issue To Factory");
            }
        } else if (InvoiceStatus.ISSUED_TO_FACTORY.equals(status)) {
            btnStatus.setText("Reserved From Factory");
        } else if (InvoiceStatus.RESERVED_FROM_FACTORY.equals(status)) {
            if (chxBoxReturn.isSelected()) {
                btnStatus.setText("Issue to Factory");
            } else {
                btnStatus.setText("Issue To Customer");
            }
        } else if (InvoiceStatus.ISSUED_TO_CUSTOMER.equals(status)) {
            btnStatus.setText("Reserved From Customer");
        } else {
        }
    }//GEN-LAST:event_chxBoxReturnActionPerformed

    @Override
    public void setIdealMode() {
        txtInvoiceNo.setCValueEditable(false);
        cmboChangeStatus.removeAllItems();
        model.setRowCount(0);
    }

    @Override
    public void setNewMode() {
        invoice = new TInvoice();

        txtInvoiceNo.setCValueEditable(true);
        cmboChangeStatus.setEditable(true);
        model.setRowCount(0);
        setComboValue();
        setFactory();

    }

    @Override
    public void setEditMode() {
        txtInvoiceNo.setCValueEditable(true);
        cmboChangeStatus.setEditable(true);
    }

    @Override
    public void resetFields() {
        txtInvoiceNo.resetCValue();
        cmboChangeStatus.removeAllItems();
        cmboFactory.removeAllItems();
        chxBoxAllSelect.setSelected(false);
        chxBoxReturn.setSelected(false);
        txtDate.resetCValue();
        model.setRowCount(0);
        model.setRowCount(0);
        btnStatus.setText("Issue to Factory");
    }

    @Override
    public void initObject() throws VPException {
        this.invoice.setStatus(cmboChangeStatus.getSelectedItem().toString());
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
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatus;
    private javax.swing.JCheckBox chxBoxAllSelect;
    private javax.swing.JCheckBox chxBoxReturn;
    private javax.swing.JComboBox cmboChangeStatus;
    private javax.swing.JComboBox cmboFactory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JTable tblItem;
    private com.sv.visionplus.util.component.textfield.CDateField txtDate;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtInvoiceNo;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<TInvoice> transactionForm;
    private DefaultTableModel model;
    private TInvoice invoice;
    private List<TInvoice> searchInvoice = null;

    private void setComboValue() {
        cmboChangeStatus.addItem(InvoiceStatus.RESERVED_FROM_CUSTOMER);
        cmboChangeStatus.addItem(InvoiceStatus.ISSUED_TO_FACTORY);
        cmboChangeStatus.addItem(InvoiceStatus.RESERVED_FROM_FACTORY);
        cmboChangeStatus.addItem(InvoiceStatus.ISSUED_TO_CUSTOMER);

    }

    private void setFactory() {
        List<MFactory> allFactorys = FactoryDAO.getInstance().allFactorys();
        cmboFactory.removeAllItems();
        for (MFactory factory : allFactorys) {
            cmboFactory.addItem(factory.getIndexNo() + "-" + factory.getName());
        }
        cmboFactory.addItem("All");
    }

    private void getInvoice(String status) {
        searchInvoice = InvoiceDAO.getInstance().searchInvoice(status);

        addData(searchInvoice);
        lblCount.setText(searchInvoice.size() + "");
    }

    private void addData(List<TInvoice> searchInvoices) {
        model.setRowCount(0);
        count = 1;
        for (TInvoice selectInvoice : searchInvoices) {
            addData(selectInvoice);
        }
    }

    private int setUpdate(ArrayList<String> idList) {
        String status = cmboChangeStatus.getSelectedItem().toString();
        String factory = cmboFactory.getSelectedItem().toString();
        if (!"All".equals(factory)) {
            Integer fac = Integer.parseInt(factory.split("-")[0]);
            if (InvoiceStatus.RESERVED_FROM_CUSTOMER.equals(status)) {
                if (chxBoxReturn.isSelected()) {
                    int reply = JOptionPane.showConfirmDialog(null, "Do you want to return Customer  ? ", "Comfirm", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        return updateInvoice(idList, 1, InvoiceStatus.ISSUED_TO_CUSTOMER, txtDate.getCValue());
                    }
                } else {
                    return updateInvoice(idList, fac, InvoiceStatus.ISSUED_TO_FACTORY, txtDate.getCValue());
                }
            } else if (InvoiceStatus.ISSUED_TO_FACTORY.equals(status)) {

                return updateInvoice(idList, fac, InvoiceStatus.RESERVED_FROM_FACTORY, txtDate.getCValue());

            } else if (InvoiceStatus.RESERVED_FROM_FACTORY.equals(status)) {

                if (chxBoxReturn.isSelected()) {
                    int reply = JOptionPane.showConfirmDialog(null, "Do you want to return Factory  ? ", "Comfirm", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        return updateInvoice(idList, fac, InvoiceStatus.ISSUED_TO_FACTORY, txtDate.getCValue());
                    }
                } else {
                    return updateInvoice(idList, fac, InvoiceStatus.ISSUED_TO_CUSTOMER, txtDate.getCValue());
                }

            } else if (InvoiceStatus.ISSUED_TO_CUSTOMER.equals(status)) {

                return updateInvoice(idList, fac, InvoiceStatus.RESERVED_FROM_CUSTOMER, txtDate.getCValue());

            } else {
                JOptionPane.showMessageDialog(this, "Some Error... Refersh the App");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a Factory..");
        }
        return 0;
    }

    private void addData(TInvoice invoice) {
        System.out.println(invoice.getCustomer() + " cust id");
        MCustomer searchCustomer = CustomerDAO.getInstance().searchCustomer(invoice.getCustomer());
        int itemSize = InvoiceItemDAO.getInstance().searchInvoiceItem(invoice.getIndexNo());

        Object[] rowdata = {
            count,
            invoice.getIndexNo(),
            searchCustomer.getName(),
            invoice.getStatus(),
            itemSize,
            invoice.getAmount(),
            false,
            invoice.getFactory()
        };
        model.addRow(rowdata);
        count++;
    }

    private void setCheckBox(boolean res) {
        for (int i = 0; i < tblItem.getRowCount(); i++) {
            model.setValueAt(res, i, 6);
        }
    }

    private int updateInvoice(ArrayList<String> idList, Integer factory, String status, Date date) {
        TInvoice invoice = new TInvoice();
        invoice.setFactory(factory);
        invoice.setStatus(status);
        invoice.setInvoiceDate(date);
        return InvoiceDAO.getInstance().updateInvoice(invoice, idList);

    }
}
