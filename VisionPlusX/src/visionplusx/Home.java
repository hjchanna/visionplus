/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx;

import javax.swing.JPanel;
import static com.sv.visionplus.resource.VPResources.*;
import com.sv.visionplus.util.component.main_frame.DefaultMainframe;

/**
 *
 * @author Mohan
 */
public class Home extends DefaultMainframe {

    @Override
    protected JPanel getContentPanel() {
        ContentPanel contentPanel = new ContentPanel();

        return contentPanel;
    }

    @Override
    protected void createGUI() {
        createMaster();
    }

//    private void createTransaction() {
//        addTask("Transaction");
//        addBand(title, iconURL);
//    }
    
    private void createMaster() {
        addTask("Master");

        addBand("Transactors", getImageUrl(MASTER_CUSTOMER));
        addButton("Customer", getImageUrl(MASTER_CUSTOMER), DefaultMainframe.ElementPriority.TOP, null);
        addButton("Supplier", getImageUrl(MASTER_SUPPLIER), DefaultMainframe.ElementPriority.TOP, null);

        addBand("Item", getImageUrl(MASTER_ITEM));
        addButton("Item", getImageUrl(MASTER_ITEM), DefaultMainframe.ElementPriority.TOP, null);
        
        addBand("Bank", getImageUrl(MASTER_BRANCH));
        addButton("Bank Branch", getImageUrl(MASTER_BRANCH), DefaultMainframe.ElementPriority.TOP, null);
        
        
        addTask("Transaction");
        
        addBand("Transaction", getImageUrl(TRANSACTION_INVOICE));
        addButton("Invoice", getImageUrl(TRANSACTION_INVOICE), DefaultMainframe.ElementPriority.TOP, null);
        addButton("GRN", getImageUrl(TRANSACTION_GRN), DefaultMainframe.ElementPriority.TOP, null);
        
        addBand("Payment", getImageUrl(TRANSACTION_PAYMENT));
        addButton("Customer Payment", getImageUrl(TRANSACTION_PAYMENT), DefaultMainframe.ElementPriority.TOP, null);
        
        addBand("Checking", getImageUrl(TRANSACTION_PAYMENT));
        addButton("Checking", getImageUrl(TRANSACTION_CHECK), DefaultMainframe.ElementPriority.TOP, null);
       
        addTask("Account");
        
        addBand("Account", getImageUrl(ACCOUNT_MONEY));
        addButton("Money Collection", getImageUrl(ACCOUNT_MONEY), DefaultMainframe.ElementPriority.TOP, null);
        addButton("Payment Vouchers", getImageUrl(ACCOUNT_VOUCHER), DefaultMainframe.ElementPriority.TOP, null);
        
        addTask("Stock");
        
        addBand("Stock", getImageUrl(STOCK_TRANSFER));
        addButton("stock Adjustmant", getImageUrl(STOCK_ADJUST), DefaultMainframe.ElementPriority.TOP, null);
        addButton("stock transfer", getImageUrl(STOCK_TRANSFER), DefaultMainframe.ElementPriority.TOP, null);
        
        addTask("Backup");
        
        addBand("Backup", getImageUrl(BACKUP_EXPORT));
        addButton("Export", getImageUrl(BACKUP_EXPORT), DefaultMainframe.ElementPriority.TOP, null);
        addButton("Import", getImageUrl(BACKUP_IMPORT), DefaultMainframe.ElementPriority.TOP, null);
        

    }

}
