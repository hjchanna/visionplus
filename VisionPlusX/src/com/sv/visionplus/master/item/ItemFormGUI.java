/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormGUI;
import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.util.component.table.CTableColumn;
import com.sv.visionplus.util.component.table.CTableModel;

/**
 *
 * @author Mohan
 */
public class ItemFormGUI extends AbstractMasterFormGUI<MItem>{

    @Override
    protected CTableModel<MItem> getTableModel() {
        return new CTableModel<>(
                new CTableColumn("Code", "code"),
                new CTableColumn("Brand", "brand"),
                new CTableColumn("Category", "category"),
                new CTableColumn("Description", "name"),
                new CTableColumn("Sale Price", "salePrice"),
                new CTableColumn("Cost Price", "costPrice"),
                new CTableColumn("Re-Order Qty", "reOrderQty")
        );
    }

    @Override
    protected AbstractMasterFormDAO<MItem> getMasterFormDAO() {
        return new ItemFormDAO();
    }

    @Override
    protected AbstractObjectCreator<MItem> getObjectCreator() {
        return new PCItem();
    }
    
}
