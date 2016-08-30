/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item;

import com.sv.visionplus.master.customer.*;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.customer.model.MCustomer;
import com.sv.visionplus.master.item.brand.BrandFormDAO;
import com.sv.visionplus.master.item.brand.BrandService;
import com.sv.visionplus.master.item.brand.PCBrand;
import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.master.item.category.CategoryService;
import com.sv.visionplus.master.item.category.MCategory;
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
        getAllBrands();
        getAllCategory();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        comboBrand = new javax.swing.JComboBox();
        comboCategory = new javax.swing.JComboBox();
        radioStock = new javax.swing.JRadioButton();
        radioNonStock = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Index No.:");

        jLabel2.setText("Code :");

        jLabel3.setText("Brand :");

        jLabel4.setText("Category :");

        jLabel5.setText("Name :");

        jLabel6.setText("Sale Price :");

        jLabel7.setText("Cost Price :");

        jLabel8.setText("Re-Order Qty:");

        buttonGroup1.add(radioStock);
        radioStock.setSelected(true);
        radioStock.setText("Stock Item");
        radioStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStockActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNonStock);
        radioNonStock.setText("Non-Stock Item");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioStock)
                        .addGap(45, 45, 45)
                        .addComponent(radioNonStock))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtReOrderQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCostPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(cDoubleField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIndexNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(56, Short.MAX_VALUE))
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
                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioStock)
                    .addComponent(radioNonStock))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioStockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new PCBrand(null, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void setIdealMode() {
        txtIndexNo.setCValueEditable(false);
        comboBrand.setEditable(false);
        comboCategory.setEditable(false);
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
        comboBrand.setEditable(true);
        comboCategory.setEditable(true);
        txtCode.setCValueEditable(true);
        txtName.setCValueEditable(true);
        cDoubleField1.setCValueEditable(true);
        txtCostPrice.setCValueEditable(true);
        txtReOrderQty.setCValueEditable(true);
    }

    @Override
    public void setEditMode() {
        txtIndexNo.setCValueEditable(false);
        comboBrand.setEditable(true);
        comboCategory.setEditable(true);
        txtCode.setCValueEditable(true);
        txtName.setCValueEditable(true);
        cDoubleField1.setCValueEditable(true);
        txtCostPrice.setCValueEditable(true);
        txtReOrderQty.setCValueEditable(true);
    }

    @Override
    public void resetFields() {
        txtIndexNo.resetCValue();
        txtCode.resetCValue();
        txtName.resetCValue();
        cDoubleField1.resetCValue();
        txtCostPrice.resetCValue();
        txtReOrderQty.resetCValue();
    }

    @Override
    public void initObject() throws VPException {
        this.item.setIndexNo(txtIndexNo.getCValue());
        this.item.setSalePrice(cDoubleField1.getCValue());
        this.item.setCostPrice(txtCostPrice.getCValue());
        this.item.setReorderQty(txtReOrderQty.getCValue());
        this.item.setCode(txtCode.getCValue());
        this.item.setName(txtName.getCValue());
        
        this.item.setCategory(1);
        this.item.setBrand(1);
        
        if(radioStock.isSelected()){
            this.item.setIsstockItem(true);
        }else{
            this.item.setIsstockItem(false);
        }
    }

    @Override
    public void initInterface() throws VPException {
        txtIndexNo.setCValue(this.item.getIndexNo());
        txtCode.setCValue(this.item.getCode());
        comboBrand.setSelectedItem(this.item.getBrand());
        comboCategory.addItem(this.item.getCategory());
        txtName.setCValue(this.item.getName());
        cDoubleField1.setCValue(this.item.getSalePrice());
        txtCostPrice.setCValue(this.item.getCostPrice());
        txtReOrderQty.setCValue(this.item.getReorderQty());
        
        if(this.item.getIsstockItem()==true){
            radioStock.setSelected(true);
        }else{
            radioNonStock.setSelected(true);
        }
    }

    @Override
    protected void setValueAbstract(MItem item) {
        this.item = item;
    }

    @Override
    protected MItem getValueAbstract() {
        return this.item;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.sv.visionplus.util.component.textfield.CDoubleField cDoubleField1;
    private javax.swing.JComboBox comboBrand;
    private javax.swing.JComboBox comboCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioNonStock;
    private javax.swing.JRadioButton radioStock;
    private com.sv.visionplus.util.component.textfield.CStringField txtCode;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCostPrice;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtIndexNo;
    private com.sv.visionplus.util.component.textfield.CStringField txtName;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtReOrderQty;
    // End of variables declaration//GEN-END:variables
    private MItem item;
    private MBrand brand;
   
    
    void getAllBrands(){
        List<MBrand> allBrands = BrandService.getInstance().getAllBrands();
        for (MBrand allBrand : allBrands) {
            comboBrand.addItem(allBrand.getName());
        }
    }
    void getAllCategory(){
        List<MCategory> allCategory = CategoryService.getInstance().getAllCategory();
        for (MCategory allCategory1 : allCategory) {
            comboCategory.addItem(allCategory1.getName());
        }
    
    }

}
