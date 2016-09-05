/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.stock.stock_transfer;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.stock.stock_transfer.model.MBrand;
import com.sv.visionplus.stock.stock_transfer.model.MCategory;
import com.sv.visionplus.stock.stock_transfer.model.MItem;
import com.sv.visionplus.stock.stock_transfer.model.Store;
import com.sv.visionplus.stock.stock_transfer.model.TStockLedger;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohan
 */
public class PCStockTransfer extends AbstractObjectCreator<MItem> {

    /**
     * Creates new form PCInvoice
     */
    public PCStockTransfer(AbstractTransactionForm transactionForm) {
        initComponents();

        this.transactionForm = transactionForm;
        model = (DefaultTableModel) tblItem.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmboFrom = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmboTo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        txtQty = new com.sv.visionplus.util.component.textfield.CIntegerField();
        btnTransfer = new javax.swing.JButton();
        cmboSelectionType = new javax.swing.JComboBox();
        txtdescription = new com.sv.visionplus.util.component.textfield.CStringField();
        btnSearch = new javax.swing.JButton();
        cStringField1 = new com.sv.visionplus.util.component.textfield.CStringField();
        cStringField2 = new com.sv.visionplus.util.component.textfield.CStringField();

        jLabel3.setText("From :");

        cmboFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboFromItemStateChanged(evt);
            }
        });

        jLabel4.setText("To :");

        jLabel1.setText("No of Item :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmboTo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Item Code", "Name", "Brand", "Catrgory", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(0);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnTransfer.setText("Transfer >>");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        cmboSelectionType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Code", "Name", "Brand", "Category" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnTransfer)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmboSelectionType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cStringField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cStringField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboSelectionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cStringField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cStringField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransfer)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmboFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboFromItemStateChanged
        setItem();
    }//GEN-LAST:event_cmboFromItemStateChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String type = cmboSelectionType.getSelectedItem().toString();
        String desc = txtdescription.getCValue();
        if (!"".equals(desc)) {
            searchItem(type, desc);
        } else {
            setItem();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        if (tblItem.getSelectedRowCount() == 1) {
            txtdescription.setCValue(model.getValueAt(tblItem.getSelectedRow(), 1).toString());
            cmboSelectionType.setSelectedItem("Item Code");
        }
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        TStockLedger ledger=new TStockLedger();
        ledger.setDate(FormatterUtil.getInstance().formatDate(new Date()));
        ledger.setForm("Stock Transfer");
//        ledger.setIndexNo(0); //auto Increment
        ledger.setItem(Integer.parseInt(model.getValueAt(tblItem.getSelectedRow(), 0).toString())); 
        ledger.setQty(Integer.parseInt(txtQty.getText()));
//        ledger.setStore(WIDTH);
    }//GEN-LAST:event_btnTransferActionPerformed

    @Override
    public void setIdealMode() {
        cmboFrom.setEnabled(false);
        cmboTo.setEnabled(false);
        cmboSelectionType.setEnabled(false);
        txtdescription.setCValueEditable(false);
        model.setRowCount(0);
        btnTransfer.setEnabled(false);
        txtQty.setCValueEditable(false);
        btnSearch.setEnabled(false);

    }

    @Override
    public void setNewMode() {
        cmboFrom.setEnabled(true);
        cmboTo.setEnabled(true);
        loadStore();
        cmboSelectionType.setEnabled(true);
        txtdescription.setCValueEditable(true);
        model.setRowCount(0);
        btnTransfer.setEnabled(true);
        txtQty.setCValueEditable(true);
        btnSearch.setEnabled(true);

    }

    @Override
    public void setEditMode() {
        cmboFrom.setEnabled(true);
        cmboTo.setEnabled(true);
        loadStore();
        cmboSelectionType.setEnabled(true);
        txtdescription.setCValueEditable(true);
        model.setRowCount(0);
        btnTransfer.setEnabled(true);
        txtQty.setCValueEditable(true);
        btnSearch.setEnabled(true);

    }

    @Override
    public void resetFields() {
        cmboFrom.setEnabled(false);
        cmboTo.setEnabled(false);
        cmboSelectionType.setEnabled(false);
        txtdescription.setCValueEditable(false);
        model.setRowCount(0);
        btnTransfer.setEnabled(false);
        txtQty.setCValueEditable(false);
        btnSearch.setEnabled(false);

    }

    @Override
    public void initObject() throws VPException {

    }

    @Override
    public void initInterface() throws VPException {

    }

    @Override
    protected void setValueAbstract(MItem item) {
    }

    @Override
    protected MItem getValueAbstract() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTransfer;
    private com.sv.visionplus.util.component.textfield.CStringField cStringField1;
    private com.sv.visionplus.util.component.textfield.CStringField cStringField2;
    private javax.swing.JComboBox cmboFrom;
    private javax.swing.JComboBox cmboSelectionType;
    private javax.swing.JComboBox cmboTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtQty;
    private com.sv.visionplus.util.component.textfield.CStringField txtdescription;
    // End of variables declaration//GEN-END:variables
    private AbstractTransactionForm<TInvoice> transactionForm;
    DefaultTableModel model;

    private void loadStore() {
        List<Store> allStore = StoreDAO.getInstance().allStore();
        System.out.println(allStore.size());
        for (Store store : allStore) {
            cmboFrom.addItem(store.getIndexNo() + " :" + store.getName());
            cmboTo.addItem(store.getIndexNo() + " :" + store.getName());
        }

    }

    private void addData(List<TStockLedger> searchItem) {
        model.setRowCount(0);
        for (TStockLedger stock : searchItem) {

            MItem item = ItemDAO.getInstance().searchItem(stock.getItem());
            MBrand brand = BrandDAO.getInstance().searchBrand(item.getBrand());
            MCategory category = CategoryDAO.getInstance().searchCategory(item.getCategory());

            Object[] rowData = {
                item.getIndexNo(),
                item.getCode(),
                item.getName(),
                brand.getName(),
                category.getName(),
                stock.getQty()
            };
            model.addRow(rowData);
        }
    }

    private void searchItem(String type, String desc) {
        if ("Item Code".equals(type)) {
            removeRow(1, desc);
        }
        if ("Name".equals(type)) {
            removeRow(2, desc);
        }
        if ("Brand".equals(type)) {
            removeRow(3, desc);
        }
        if ("Category".equals(type)) {
            removeRow(4, desc);
        }
    }

    private void removeRow(int i, String desc) {
        if (model.getRowCount() > 0) {
            for (int j = 0; j < model.getRowCount(); j++) {
                if (!model.getValueAt(j, i).toString().equals(desc)) {
                    model.removeRow(j);
                }
            }
        }
    }

    private void setItem() {
        String from = cmboFrom.getSelectedItem().toString();
        if (from != null) {
            int storeId = Integer.parseInt(from.substring(0, 1));
            List<TStockLedger> searchItem = StockLedgerDAO.getInstance().searchItem(storeId);
            addData(searchItem);

        }
    }
}
