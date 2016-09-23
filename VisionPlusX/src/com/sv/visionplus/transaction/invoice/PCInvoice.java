/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.resource.IdGenerater.IdGenerater;
import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.resource.InvoiceStatus.InvoiceStatus;
import com.sv.visionplus.resource.SplitConfig.SplitConfig;
import com.sv.visionplus.resource.ui.ItemListRenderer;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.dialog.Item.ItemDialog;
import com.sv.visionplus.transaction.invoice.dialog.Item.SearchItemMixModel;
import com.sv.visionplus.transaction.invoice.dialog.customer.CustomerDialog;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;
import com.sv.visionplus.transaction.invoice.model.Status;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.transaction.invoice.model.TPatientInformation;
import com.sv.visionplus.transaction.invoice.model.TStockLedger;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import visionplusx.Home;
import visionplusx.logFile.LogFileModel;

/**
 *
 * @author Mohan
 */
public class PCInvoice extends AbstractObjectCreator<InvoiceMix> {

    /**
     * Creates new form PCInvoice
     */
    public PCInvoice(AbstractTransactionForm transactionForm) {
        initComponents();
        initOthers();

        this.transactionForm = transactionForm;
    }

//    action
    private void doView() {
//        AbstractMasterFormGUI form = new AbstractMasterFormGUI(){};
//        form.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        //button action
        this.btnAddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doView();
            }
        });

        //list model
        itemListModel = new DefaultListModel<>();
        lstItem.setModel(itemListModel);

        lstItem.setCellRenderer(new ItemListRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtDate = new com.sv.visionplus.util.component.textfield.CDateField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnAddCustomer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNic = new com.sv.visionplus.util.component.textfield.CStringField();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtAge = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstItem = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        headacheCheckBox = new javax.swing.JCheckBox();
        dischargeCheckBox = new javax.swing.JCheckBox();
        otherChechBox = new javax.swing.JCheckBox();
        irritationCheckBox = new javax.swing.JCheckBox();
        visionNDCheckBox = new javax.swing.JCheckBox();
        tearingCheckBox = new javax.swing.JCheckBox();
        itchingCheckBox = new javax.swing.JCheckBox();
        redCheckBox = new javax.swing.JCheckBox();
        txtOther = new com.sv.visionplus.util.component.textfield.CStringField();
        txtAutoRefLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtAutoRefRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNtcLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtNtcRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithoutGlassLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithoutGlassRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithPhLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithPhRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithGlassLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtVaWithGlassRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxSubLeft = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxRight = new com.sv.visionplus.util.component.textfield.CStringField();
        txtHbRxSubRight = new com.sv.visionplus.util.component.textfield.CStringField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientEyeDetailTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        myopiaRadio = new javax.swing.JRadioButton();
        presbyopiaRadio = new javax.swing.JRadioButton();
        hypermtropiaRadio = new javax.swing.JRadioButton();
        astimatismRadio = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtRemarks = new com.sv.visionplus.util.component.textfield.CStringField();

        jSplitPane3.setDividerLocation(512);
        jSplitPane3.setResizeWeight(0.5);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Information"));

        jLabel1.setText("Invoice No.:");

        jLabel2.setText("Date :");

        jButton10.setText("+");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton10)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Information"));

        jLabel3.setText("Name :");

        jLabel4.setText("NIC :");

        jLabel5.setText("Address :");

        txtaAddress.setColumns(20);
        txtaAddress.setRows(5);
        jScrollPane1.setViewportView(txtaAddress);

        jLabel6.setText("Contact No. :");

        btnAddCustomer.setText("+");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        jLabel7.setText("Age :");

        txtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNicKeyPressed(evt);
            }
        });

        txtContactNo.setText("");

        txtAge.setText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCustomer)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAddCustomer)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Item Information"));

        jScrollPane3.setViewportView(lstItem);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Amount :");

        jButton11.setText("Remove");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        lblAmount.setText("0.00");
        lblAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAmount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel11)
                    .addComponent(jButton11)
                    .addComponent(lblAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane3.setLeftComponent(jPanel5);

        jLabel9.setText("VA With P/H ");

        jLabel8.setText("Auto Ref :");

        jLabel10.setText("VA With Glass");

        jLabel13.setText("VA Without Glass");

        jLabel16.setText("Hb Rx :");

        jLabel17.setText("NTC :");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Complains"));

        headacheCheckBox.setText("Headache");

        dischargeCheckBox.setText("Discharge");

        otherChechBox.setText("Other");
        otherChechBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherChechBoxActionPerformed(evt);
            }
        });

        irritationCheckBox.setText("Irritation");

        visionNDCheckBox.setText("Vision-N/D");

        tearingCheckBox.setText("Tearing");

        itchingCheckBox.setText("Itching");

        redCheckBox.setText("Red");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(visionNDCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(headacheCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itchingCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dischargeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(irritationCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tearingCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(otherChechBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dischargeCheckBox)
                        .addComponent(irritationCheckBox)
                        .addComponent(tearingCheckBox)
                        .addComponent(otherChechBox))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(visionNDCheckBox)
                        .addComponent(redCheckBox)
                        .addComponent(headacheCheckBox)
                        .addComponent(itchingCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVaWithPhLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithGlassLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAutoRefLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNtcLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHbRxLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithoutGlassLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHbRxSubLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHbRxSubRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithoutGlassRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithPhRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAutoRefRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNtcRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHbRxRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaWithGlassRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHbRxLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHbRxRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHbRxSubLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHbRxSubRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutoRefLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutoRefRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNtcLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNtcRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVaWithoutGlassLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaWithoutGlassRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVaWithPhLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(txtVaWithPhRight, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVaWithGlassLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVaWithGlassRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        patientEyeDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"      DIST", null, null, null, null, null, null},
                {"      NEAR", null, null, null, null, null, null}
            },
            new String [] {
                "", "SPH", "CYL", "AXIS", "SPH", "CYL", "AXIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientEyeDetailTable.setRowHeight(25);
        jScrollPane2.setViewportView(patientEyeDetailTable);

        buttonGroup1.add(myopiaRadio);
        myopiaRadio.setText("Myopia");
        myopiaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myopiaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(presbyopiaRadio);
        presbyopiaRadio.setText("Presbyopia");
        presbyopiaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presbyopiaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(hypermtropiaRadio);
        hypermtropiaRadio.setText("Hypermtropia");
        hypermtropiaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypermtropiaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(astimatismRadio);
        astimatismRadio.setText("Astimatism");
        astimatismRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astimatismRadioActionPerformed(evt);
            }
        });

        jLabel14.setText("Remark :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(myopiaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(presbyopiaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hypermtropiaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(astimatismRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(txtRemarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myopiaRadio)
                    .addComponent(presbyopiaRadio)
                    .addComponent(hypermtropiaRadio)
                    .addComponent(astimatismRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane3.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (0 > lstItem.getSelectedIndex()) {
            JOptionPane.showMessageDialog(this, "Select a Item to Delete...");
        } else {
            SearchItemMixModel model = selectedItemList.get(lstItem.getSelectedIndex());
            double qty = model.getTotal_qty();
            double value = 0.00;
            value -= (qty * model.getSale_price());
            value += (qty * model.getDicsount());

            lblAmount.setText((Double.parseDouble(lblAmount.getText()) + value) + "");

            selectedItemList.remove(lstItem.getSelectedIndex());
            itemListModel.removeElementAt(lstItem.getSelectedIndex());

        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ItemDialog dialog = new ItemDialog(null, true);
        dialog.setFrame(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        CustomerDialog dialog = new CustomerDialog(null, true);
        dialog.setFrame(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void otherChechBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherChechBoxActionPerformed
        if (otherChechBox.isSelected()) {
            txtOther.setCValueEditable(true);
        } else {
            txtOther.setCValueEditable(false);
        }
    }//GEN-LAST:event_otherChechBoxActionPerformed

    private void myopiaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myopiaRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myopiaRadioActionPerformed

    private void presbyopiaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presbyopiaRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presbyopiaRadioActionPerformed

    private void hypermtropiaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypermtropiaRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hypermtropiaRadioActionPerformed

    private void astimatismRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astimatismRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_astimatismRadioActionPerformed

    private void txtNicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicKeyPressed

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        txtDate.setCValueEditable(false);
        txtName.setCValueEditable(false);
        txtNic.setCValueEditable(false);
        txtaAddress.setEditable(false);
        txtContactNo.setCValueEditable(false);
        txtAge.setCValueEditable(false);
        txtOther.setCValueEditable(false);
        txtRemarks.setCValueEditable(false);
        txtHbRxLeft.setCValueEditable(false);
        txtHbRxRight.setCValueEditable(false);
        txtHbRxSubLeft.setCValueEditable(false);
        txtHbRxSubRight.setCValueEditable(false);
        txtAutoRefLeft.setCValueEditable(false);
        txtAutoRefRight.setCValueEditable(false);
        txtNtcLeft.setCValueEditable(false);
        txtNtcRight.setCValueEditable(false);
        txtVaWithoutGlassLeft.setCValueEditable(false);
        txtVaWithoutGlassRight.setCValueEditable(false);
        txtVaWithPhLeft.setCValueEditable(false);
        txtVaWithPhRight.setCValueEditable(false);
        txtVaWithGlassLeft.setCValueEditable(false);
        txtVaWithGlassRight.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.invoice = new TInvoice();
        this.invoiceMix = new InvoiceMix();
        this.customer = null;
        this.status = new Status();
        this.patientInformation = new TPatientInformation();
        this.invoiceItem = new TInvoiceItem();
        this.logFile = new LogFileModel();
        this.stockLedger = new TStockLedger();

        txtIndexNo.setCValueEditable(false);
        txtDate.setCValueEditable(true);
        txtName.setCValueEditable(true);
        txtNic.setCValueEditable(true);
        txtaAddress.setEditable(true);
        txtContactNo.setCValueEditable(true);
        txtAge.setCValueEditable(true);
        txtOther.setCValueEditable(false);
        txtRemarks.setCValueEditable(true);
        txtHbRxLeft.setCValueEditable(true);
        txtHbRxRight.setCValueEditable(true);
        txtHbRxSubLeft.setCValueEditable(true);
        txtHbRxSubRight.setCValueEditable(true);
        txtAutoRefLeft.setCValueEditable(true);
        txtAutoRefRight.setCValueEditable(true);
        txtNtcLeft.setCValueEditable(true);
        txtNtcRight.setCValueEditable(true);
        txtVaWithoutGlassLeft.setCValueEditable(true);
        txtVaWithoutGlassRight.setCValueEditable(true);
        txtVaWithPhLeft.setCValueEditable(true);
        txtVaWithPhRight.setCValueEditable(true);
        txtVaWithGlassLeft.setCValueEditable(true);
        txtVaWithGlassRight.setCValueEditable(true);
        txtIndexNo.setCValue(IdGenerater.getInstance().getLastId("t_invoice","index_no"));

    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        txtDate.setCValueEditable(true);
        txtName.setCValueEditable(true);
        txtNic.setCValueEditable(true);
        txtaAddress.setEditable(true);
        txtContactNo.setCValueEditable(true);
        txtAge.setCValueEditable(true);
        txtOther.setCValueEditable(true);
        txtRemarks.setCValueEditable(true);
        txtHbRxLeft.setCValueEditable(true);
        txtHbRxRight.setCValueEditable(true);
        txtHbRxSubLeft.setCValueEditable(true);
        txtHbRxSubRight.setCValueEditable(true);
        txtAutoRefLeft.setCValueEditable(true);
        txtAutoRefRight.setCValueEditable(true);
        txtNtcLeft.setCValueEditable(true);
        txtNtcRight.setCValueEditable(true);
        txtVaWithoutGlassLeft.setCValueEditable(true);
        txtVaWithoutGlassRight.setCValueEditable(true);
        txtVaWithPhLeft.setCValueEditable(true);
        txtVaWithPhRight.setCValueEditable(true);
        txtVaWithGlassLeft.setCValueEditable(true);
        txtVaWithGlassRight.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtDate.resetCValue();
        txtName.resetCValue();
        txtNic.resetCValue();
        txtaAddress.setText("");
        txtContactNo.resetCValue();
        txtAge.resetCValue();
        txtOther.resetCValue();
        txtRemarks.resetCValue();
        txtHbRxLeft.resetCValue();
        txtHbRxRight.resetCValue();
        txtHbRxSubLeft.resetCValue();
        txtHbRxSubRight.resetCValue();
        txtAutoRefLeft.resetCValue();
        txtAutoRefRight.resetCValue();
        txtNtcLeft.resetCValue();
        txtNtcRight.resetCValue();
        txtVaWithoutGlassLeft.resetCValue();
        txtVaWithoutGlassRight.resetCValue();
        txtVaWithPhLeft.resetCValue();
        txtVaWithPhRight.resetCValue();
        txtVaWithGlassLeft.resetCValue();
        txtVaWithGlassRight.resetCValue();

        selectedItemList = new ArrayList<>();
        itemListModel.setSize(0);
        lblAmount.setText("0.00");
        txtIndexNo.setCValue(IdGenerater.getInstance().getLastId("t_invoice","index_no"));
    }

    @Override
    public void initObject() throws VPException {
//        set Invoice Detail
        if (null == customer) {
            invoice.setCustomer(1);//set defaule Customer

        } else {
            invoice.setCustomer(customer.getIndexNo());
        }
        invoice.setAmount(Double.parseDouble(lblAmount.getText()));
        invoice.setFactory(1);
//        invoice.setIndexNo(0);//auto increment
        invoice.setInvoiceDate(txtDate.getCValue());
        invoice.setIsDelete(false);
        invoice.setStatus(InvoiceStatus.RESERVED_FROM_CUSTOMER);

        invoiceMix.setInvoice(invoice);

//        set PatientInformation
//            patientInfomation.setIndexNo();  //aut increment
        patientInformation.setAutoRefLeft(txtAutoRefLeft.getText());
        patientInformation.setAutoRefRight(txtAutoRefRight.getText());

        String complains = "";
        if (visionNDCheckBox.isSelected()) {
            complains += "VISION-N/D" + SplitConfig.spritComplains;
        }
        if (redCheckBox.isSelected()) {
            complains += "RED" + SplitConfig.spritComplains;
        }
        if (headacheCheckBox.isSelected()) {
            complains += "HEADACHE" + SplitConfig.spritComplains;
        }
        if (itchingCheckBox.isSelected()) {
            complains += "ITCHING" + SplitConfig.spritComplains;
        }
        if (dischargeCheckBox.isSelected()) {
            complains += "DISCHARGE" + SplitConfig.spritComplains;
        }
        if (irritationCheckBox.isSelected()) {
            complains += "IRRITATION" + SplitConfig.spritComplains;
        }
        if (tearingCheckBox.isSelected()) {
            complains += "TEARING" + SplitConfig.spritComplains;
        }
        if (otherChechBox.isSelected()) {
            String otherComplains = txtOther.getText();
            if (otherComplains != null ? otherComplains.isEmpty() : true) {
                otherComplains = "OTHER COMPLAINS";
            }
            complains += otherComplains + SplitConfig.spritComplains;
        }
        patientInformation.setComplains(complains);
        patientInformation.setHbRxLeft(txtHbRxLeft.getText());
        patientInformation.setHbRxRight(txtHbRxRight.getText());
        patientInformation.setHbRxSubLeft(txtHbRxSubLeft.getText());
        patientInformation.setHbRxSubRight(txtHbRxSubRight.getText());
        patientInformation.setLenseType("");
        patientInformation.setNtcLeft(txtNtcLeft.getText());
        patientInformation.setNtcRight(txtNtcRight.getText());

        String refractiveError = "";
        if (myopiaRadio.isSelected()) {
            refractiveError = "MYOPIA";
        } else if (presbyopiaRadio.isSelected()) {
            refractiveError = "PREABYOPIA";
        } else if (hypermtropiaRadio.isSelected()) {
            refractiveError = "HYPERMTROPIA";
        } else if (astimatismRadio.isSelected()) {
            refractiveError = "ASTIMATISM";
        } else {
            refractiveError = "";
        }
        patientInformation.setRefractiveError(refractiveError);
        patientInformation.setRemarks(txtRemarks.getText());
        patientInformation.setVaWithGlassLeft(txtVaWithGlassLeft.getText());
        patientInformation.setVaWithGlassRight(txtVaWithGlassRight.getText());
        patientInformation.setVaWithPhLeft(txtVaWithPhLeft.getText());
        patientInformation.setVaWithPhRight(txtVaWithPhRight.getText());
        patientInformation.setVaWithoutGlassLeft(txtVaWithoutGlassLeft.getText());
        patientInformation.setVaWithoutGlassRight(txtVaWithGlassRight.getText());

        //table Date add to model
        patientInformation.setDistSphLeft(patientEyeDetailTable.getValueAt(0, 1) + "");
        patientInformation.setDistCylLeft(patientEyeDetailTable.getValueAt(0, 2) + "");
        patientInformation.setDistAxisLeft(patientEyeDetailTable.getValueAt(0, 3) + "");
        patientInformation.setDistSphRight(patientEyeDetailTable.getValueAt(0, 4) + "");
        patientInformation.setDistCylRight(patientEyeDetailTable.getValueAt(0, 5) + "");
        patientInformation.setDistAxisRight(patientEyeDetailTable.getValueAt(0, 6) + "");

        patientInformation.setNearSphLeft(patientEyeDetailTable.getValueAt(1, 1) + "");
        patientInformation.setNearCylLeft(patientEyeDetailTable.getValueAt(1, 2) + "");
        patientInformation.setNearAxisLeft(patientEyeDetailTable.getValueAt(1, 3) + "");
        patientInformation.setNearSphRight(patientEyeDetailTable.getValueAt(1, 4) + "");
        patientInformation.setNearCylRight(patientEyeDetailTable.getValueAt(1, 5) + "");
        patientInformation.setNearAxisRight(patientEyeDetailTable.getValueAt(1, 6) + "");
        invoiceMix.setPatientInformation(patientInformation);

//        invoiceItem.setIndexNo(WIDTH); //Auto incerment 
        List<TInvoiceItem> invoiceItemList = new ArrayList<>();
        for (SearchItemMixModel item : selectedItemList) {
            invoiceItem.setDiscount(item.getDicsount());
//            invoiceItem.setIndexNo(); // auto Increment
            invoiceItem.setItem(item.getItem());
//            invoiceItem.setInvoice(0);// not definded yet
            invoiceItem.setQty(item.getTotal_qty());
            invoiceItem.setUnitPrice(item.getSale_price());
            invoiceItem.setValue(item.getTotal_qty() * item.getSale_price());
            invoiceItem.setNetValue(invoiceItem.getValue() - (item.getTotal_qty() * item.getDicsount()));

            invoiceItemList.add(invoiceItem);
            invoiceItem = new TInvoiceItem();

        }

        invoiceMix.setInvoiceItem(invoiceItemList);

//        status.setIndexNo(0);  //auto Incerment
        status.setDate(new Date());
        status.setInvoice(0);
        status.setName(InvoiceStatus.RESERVED_FROM_CUSTOMER);
        invoiceMix.setStatus(status);

//        logFile save
        logFile.setDate(new Date());
        logFile.setFormName("Invoice Form");
//        logFile.setIndexNo(0);//autoincrement
        logFile.setRemarks("SaveInvoice");
        logFile.setTime(FormatterUtil.getInstance().getTime());
        logFile.setTransactionType("Save");
        logFile.setUser(Home.getInstance().getUser().getIndexNo());
        logFile.setUserName(Home.getInstance().getUser().getName());
        logFile.setValue(invoice.getAmount());
        invoiceMix.setLogFile(logFile);

        List<TStockLedger> stockLedgerList = new ArrayList<>();
        for (SearchItemMixModel item : selectedItemList) {
            if (item.isIsstock_item()) {

                stockLedger.setDate(new Date());
                stockLedger.setForm("Invoice");
                //          stockLedger.setIndexNo(0);//auto incerment
                stockLedger.setItem(item.getItem());
                //(-) Qty
                stockLedger.setQty(item.getTotal_qty() - item.getTotal_qty() - item.getTotal_qty());
                stockLedger.setStore(item.getStore_id());

                stockLedgerList.add(stockLedger);
                stockLedger = new TStockLedger();
            }

        }
        invoiceMix.setStockLedgerList(stockLedgerList);

    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(InvoiceMix invoiceMix) {
        this.invoiceMix = invoiceMix;
    }

    @Override
    protected InvoiceMix getValueAbstract() {
        return this.invoiceMix;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton astimatismRadio;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox dischargeCheckBox;
    private javax.swing.JCheckBox headacheCheckBox;
    private javax.swing.JRadioButton hypermtropiaRadio;
    private javax.swing.JCheckBox irritationCheckBox;
    private javax.swing.JCheckBox itchingCheckBox;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JList lstItem;
    private javax.swing.JRadioButton myopiaRadio;
    private javax.swing.JCheckBox otherChechBox;
    private javax.swing.JTable patientEyeDetailTable;
    private javax.swing.JRadioButton presbyopiaRadio;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JCheckBox tearingCheckBox;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtAge;
    private com.sv.visionplus.util.component.textfield.CStringField txtAutoRefLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtAutoRefRight;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CDateField txtDate;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxSubLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtHbRxSubRight;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CStringField txtNic;
    private com.sv.visionplus.util.component.textfield.CStringField txtNtcLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtNtcRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtOther;
    private com.sv.visionplus.util.component.textfield.CStringField txtRemarks;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithGlassLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithGlassRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithPhLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithPhRight;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithoutGlassLeft;
    private com.sv.visionplus.util.component.textfield.CStringField txtVaWithoutGlassRight;
    private javax.swing.JTextArea txtaAddress;
    private javax.swing.JCheckBox visionNDCheckBox;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<InvoiceMix> transactionForm;
    private InvoiceMix invoiceMix;
    private MCustomer customer;
    private TInvoice invoice;
    private Status status;
    private TPatientInformation patientInformation;
    private TInvoiceItem invoiceItem;
    private LogFileModel logFile;
    private List<SearchItemMixModel> selectedItemList = new ArrayList<>();
    private DefaultListModel itemListModel;
    private TStockLedger stockLedger;

    public void setCustomer(MCustomer customer) {
        this.customer = new MCustomer();
        this.customer = customer;
        txtName.setCValue(customer.getName());
        txtaAddress.setText(customer.getAddress());
        txtContactNo.setText(customer.getContactNo());
        txtNic.setText(customer.getNic());

        if (!(txtNic.getText()).isEmpty()) {
            int birthYear = Integer.parseInt("19" + customer.getNic().substring(0, 2));
            int year = Integer.parseInt(FormatterUtil.getInstance().formatDate(new Date()).substring(0, 4));
            txtAge.setCValue(year - birthYear);
        } else {
            txtAge.setCValue(-1);
        }
    }

    public void setItem(SearchItemMixModel mixModel) {
        selectedItemList.add(mixModel);
        itemListModel.addElement(mixModel);

        double value = 0.00;

        value = mixModel.getTotal_qty() * mixModel.getSale_price();
        value -= (mixModel.getTotal_qty() * mixModel.getDicsount());
        value = Double.parseDouble(lblAmount.getText()) + value;
        lblAmount.setText(value + "");
        value = 0.00;
    }

}
