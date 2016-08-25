/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item;

import com.sv.visionplus.master.customer.*;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.master.item.model.MBrand;
import com.sv.visionplus.master.item.model.MCategory;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.controller.SystemService;

/**
 *
 * @author Mohan
 */
public class PCItem extends AbstractObjectCreator<MItem> {

    /**
     * Creates new form PCCustomer
     */
    public PCItem() {
        initComponents();
    }

    public List<MBrand> listBrand() {
        return this.systemService.listBrand();
    }
    public List<MCategory> listCategory() {
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIndexNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new com.sv.visionplus.util.component.textfield.CStringField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cDoubleField1 = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCostPrice = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtReOrderQty = new com.sv.visionplus.util.component.textfield.CIntegerField();
        brandCombo = new javax.swing.JComboBox();
        categoryCombo = new javax.swing.JComboBox();

        jLabel1.setText("Index No.:");

        jLabel2.setText("Code :");

        jLabel3.setText("Brand :");

        jLabel4.setText("Category :");

        jLabel5.setText("Name :");

        jLabel6.setText("Sale Price :");

        jLabel7.setText("Cost Price :");

        jLabel8.setText("Re-Order Qty:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReOrderQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brandCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cDoubleField1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(brandCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cDoubleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtReOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        brandCombo.setEditable(false);
        categoryCombo.setEditable(false);
        txtCode.setCValueEditable(false);
        txtName.setCValueEditable(false);
        cDoubleField1.setCValueEditable(false);
        txtCostPrice.setCValueEditable(false);
        txtReOrderQty.setCValueEditable(false);
    }

    @Override
    public void setNewMode() {
        this.item = new MItem();

        txtIndexNo.setCValueEditable(false);
        brandCombo.setEditable(true);
        categoryCombo.setEditable(true);
        txtCode.setCValueEditable(true);
        txtName.setCValueEditable(true);
        cDoubleField1.setCValueEditable(true);
        txtCostPrice.setCValueEditable(true);
        txtReOrderQty.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        brandCombo.setEditable(true);
        categoryCombo.setEditable(true);
        txtCode.setCValueEditable(true);
        txtName.setCValueEditable(true);
        cDoubleField1.setCValueEditable(true);
        txtCostPrice.setCValueEditable(true);
        txtReOrderQty.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        brandCombo.setSelectedIndex(0);
        categoryCombo.setSelectedIndex(0);
        txtCode.resetCValue();
        txtName.resetCValue();
        cDoubleField1.resetCValue();
        txtCostPrice.resetCValue();
        txtReOrderQty.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.item.setIndexNo(txtIndexNo.getCValue());
        try {
            this.item.setBrand(FormatterUtil.getInstance().parseInteger(brandCombo.getSelectedItem().toString()));
            this.item.setCategory(FormatterUtil.getInstance().parseInteger(categoryCombo.getSelectedItem().toString()));
            this.item.setSalePrice(cDoubleField1.getCValue());
            this.item.setCostPrice(txtCostPrice.getCValue());
            this.item.setReorderQty(txtReOrderQty.getCValue());
        } catch (ParseException ex) {
            Logger.getLogger(PCItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.item.setCode(txtCode.getCValue());
        this.item.setName(txtName.getCValue());

    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.item.getIndexNo());
        brandCombo.setSelectedItem(this.item.getBrand());
        categoryCombo.addItem(this.item.getCategory());
        txtName.setCValue(this.item.getName());
        cDoubleField1.setCValue(this.item.getSalePrice());
        txtCostPrice.setCValue(this.item.getCostPrice());
        txtReOrderQty.setCValue(this.item.getReorderQty());
    }

    @Override
    protected void setValueAbstract(MItem object) {
        this.item = object;
    }

    @Override
    protected MItem getValueAbstract() {
        return this.item;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox brandCombo;
    private com.sv.visionplus.util.component.textfield.CDoubleField cDoubleField1;
    private javax.swing.JComboBox categoryCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.sv.visionplus.util.component.textfield.CStringField txtCode;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCostPrice;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtReOrderQty;
    // End of variables declaration//GEN-END:variables
    private MItem item;
    private ItemFormDAO itemDao;
    private SystemService systemService;

}
