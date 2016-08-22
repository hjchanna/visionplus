/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.app.transaction.invoice.ui;

import com.supervision.visionplus.model.TInvoiceItem;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Mohan
 */
public class ItemListRenderer implements ListCellRenderer<TInvoiceItem> {

    @Override
    public Component getListCellRendererComponent(JList<? extends TInvoiceItem> list, TInvoiceItem value, int index, boolean isSelected, boolean cellHasFocus) {
        return new InvoiceItemCell((value instanceof TInvoiceItem ? value : null), isSelected);
    }
}
