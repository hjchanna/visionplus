package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.transaction.grn.dialog.supplier.model.MSupplier;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.grn.dialog.item.PCItem;
import com.sv.visionplus.transaction.grn.dialog.supplier.PCSupplier;
import com.sv.visionplus.transaction.grn.model.TGrn;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidura Prageeth
 */
public class PCGrn extends AbstractObjectCreator<TGrn> {

    public PCGrn(AbstractTransactionForm transactionForm) {
        initComponents();
        this.transactionForm = transactionForm;
        tableModel = (DefaultTableModel) tableItem.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSupplierName = new com.sv.visionplus.util.component.textfield.CStringField();
        txtContactNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtEmail = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel1 = new javax.swing.JLabel();
        txtAddress = new com.sv.visionplus.util.component.textfield.CStringField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableItem = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtCode = new com.sv.visionplus.util.component.textfield.CStringField();
        txtDescription = new com.sv.visionplus.util.component.textfield.CStringField();
        txtSalesPrice = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtQty = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        jToggleButton2 = new javax.swing.JToggleButton();
        txtGrnNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        txtRefrenceNo = new com.sv.visionplus.util.component.textfield.CStringField();
        txtGrnDate = new org.jdesktop.swingx.JXDatePicker();

        jLabel6.setText("Date.:");

        jToggleButton1.setText("Payment Details");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ref No :");

        jLabel3.setText("Grn No.:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Supplier Details"));

        jLabel2.setText("Name :");

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Contact No : ");

        jLabel8.setText("Email :");

        txtContactNo.setText("");

        jLabel1.setText("Address :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jLabel8)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "Sales Price", "Qty", "Amount"
            }
        ));
        jScrollPane3.setViewportView(tableItem);

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalesPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addGap(133, 133, 133))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnAdd)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Total Amount : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jToggleButton2.setText("Search");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtGrnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRefrenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jToggleButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jToggleButton2)
                        .addComponent(jToggleButton1)
                        .addComponent(txtRefrenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtGrnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PCSupplier supplier = new PCSupplier(null, true);
        supplier.setFrame(this);
        supplier.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PCItem item = new PCItem(null, true);
        item.setFrame(this);
        item.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Integer qtyText = Integer.parseInt(txtQty.getText());
        String itemCode = txtCode.getText();
        boolean itemIsNotExists = true;
        int row = 0;

        // check item is exists
        for (int i = 0; i < tableItem.getRowCount(); i++) {
            String code = (String) tableItem.getValueAt(i, 0);
            if (code.equals(itemCode)) {
                itemIsNotExists = true;
                row = i;
                break;
            }
        }

        if (qtyText > 0) {
            if (itemIsNotExists) {
                Double unitPrice = Double.parseDouble(txtSalesPrice.getText());
                Integer qty = qtyText;
                double totalCashAmount = 0;

                Double amount = unitPrice * qty;

                Object[] rd = {txtCode.getText(), txtDescription.getText(), txtSalesPrice.getText(), txtQty.getText(), amount};
                tableModel.addRow(rd);

//                for (int i = 0; i < tableItem.getRowCount(); i++) {
//                    String amounts = (String) tableModel.getValueAt(i, 7);
//                    totalCashAmount += Double.parseDouble(amounts);
//                    txtTotalAmount.setText(Double.toString(totalCashAmount));
//                }
                getTotalAmount();
                txtCode.requestFocus();

            } else {

            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
      
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        btnAdd.doClick();
    }//GEN-LAST:event_txtQtyActionPerformed

    @Override
    public void setIdealMode() {
        txtGrnNo.setCValueEditable(false);
        txtRefrenceNo.setCValueEditable(false);
        txtGrnDate.setEditable(false);
        txtGrnDate.setDate(new Date());
        txtSupplierName.setCValueEditable(false);
        txtContactNo.setCValueEditable(false);
        txtEmail.setCValueEditable(false);
        txtCode.setCValueEditable(false);
        txtDescription.setCValueEditable(false);
        txtQty.setCValueEditable(false);
        txtSalesPrice.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.supplier = new MSupplier();
        this.item = new MItem();

        txtGrnNo.setCValueEditable(true);
        txtRefrenceNo.setCValueEditable(true);
        txtGrnDate.setEditable(true);
        txtSupplierName.setCValueEditable(true);
        txtContactNo.setCValueEditable(false);
        txtEmail.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
        txtCode.setCValueEditable(true);
        txtDescription.setCValueEditable(true);
        txtQty.setCValueEditable(true);
        txtSalesPrice.setCValueEditable(true);

    }

    @Override
    public void setEditMode() {

        txtGrnNo.setCValueEditable(false);
        txtRefrenceNo.setCValueEditable(true);
        txtGrnDate.setEditable(true);
        txtSupplierName.setCValueEditable(true);
        txtContactNo.setCValueEditable(false);
        txtEmail.setCValueEditable(false);
        txtAddress.setCValueEditable(false);
        txtCode.setCValueEditable(true);
        txtDescription.setCValueEditable(true);
        txtQty.setCValueEditable(true);
        txtSalesPrice.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtGrnNo.resetCValue();
        txtRefrenceNo.resetCValue();
        txtGrnDate.setDate(new Date());
        txtSupplierName.resetCValue();
        txtContactNo.resetCValue();
        txtAddress.resetCValue();
        txtEmail.resetCValue();
        txtCode.resetCValue();
        txtDescription.resetCValue();
        txtQty.resetCValue();
        txtSalesPrice.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.supplier.setName(txtSupplierName.getCValue());
        this.supplier.setContactNo(FormatterUtil.getInstance().formatInteger(txtContactNo.getCValue()));
        this.supplier.setEmail(txtEmail.getCValue());

        this.item.setSalePrice(txtSalesPrice.getCValue());
        //add Model Date
        this.grn.setAmount(txtTotalAmount.getCValue());
        try {
            this.grn.setDate(FormatterUtil.getInstance().parseDate(txtGrnDate.getDate().toString()));
        } catch (ParseException ex) {
            Logger.getLogger(PCGrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.grn.setSupplier(this.supplier.getIndexNo());
    }

    @Override
    public void initInterface() throws VPException {
        txtSupplierName.setCValue(this.supplier.getName());
        try {
            txtContactNo.setCValue(FormatterUtil.getInstance().parseInteger(this.supplier.getContactNo()));
        } catch (ParseException ex) {
            Logger.getLogger(PCGrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtEmail.setCValue(this.supplier.getEmail());

        txtCode.setCValue(this.item.getCode());
        txtDescription.setCValue(this.item.getName());
        txtSalesPrice.setCValue(this.item.getSalePrice());
    }

    @Override
    protected void setValueAbstract(TGrn object) {
        this.grn = object;
    }

    @Override
    protected TGrn getValueAbstract() {
        return this.grn;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tableItem;
    private com.sv.visionplus.util.component.textfield.CStringField txtAddress;
    private com.sv.visionplus.util.component.textfield.CStringField txtCode;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtContactNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtDescription;
    private com.sv.visionplus.util.component.textfield.CStringField txtEmail;
    private org.jdesktop.swingx.JXDatePicker txtGrnDate;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtGrnNo;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtQty;
    private com.sv.visionplus.util.component.textfield.CStringField txtRefrenceNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtSalesPrice;
    private com.sv.visionplus.util.component.textfield.CStringField txtSupplierName;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel tableModel;
    private TGrn grn;
    private final AbstractTransactionForm transactionForm;
    private MSupplier supplier;
    private MItem item;

    public void setSupplier(MSupplier supplier) {
        this.supplier = supplier;
        txtSupplierName.setCValue(supplier.getName());
        txtContactNo.setCValue(Integer.parseInt(supplier.getContactNo()));
        txtEmail.setCValue(supplier.getEmail());
        txtAddress.setCValue(supplier.getAddress());
    }

    public void setItem(MItem item) {
        txtCode.setText(item.getCode());
        txtDescription.setText(item.getName());
        txtSalesPrice.setText(Double.toString(item.getSalePrice()));
        txtQty.requestFocus();
    }

    public void getTotalAmount() {
        double totalCashAmount = 0;

        for (int i = 0; i < tableItem.getRowCount(); i++) {
            String cashAmountString = tableModel.getValueAt(i, 4).toString();
            totalCashAmount += Double.parseDouble(cashAmountString);
        }
        txtTotalAmount.setCValue(totalCashAmount);

    }

}
