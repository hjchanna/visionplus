/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx;

import com.sv.visionplus.account.money_collection.MoneyCollectionForm;
import com.sv.visionplus.account.payment_voucher.PaymentVoucherForm;
import com.sv.visionplus.master.bank_branch.BankBranchFormGUI;
import com.sv.visionplus.master.customer.CustomerFormGUI;
import com.sv.visionplus.master.factory.FactoryFormGUI;
import com.sv.visionplus.master.item.ItemFormGUI;
import com.sv.visionplus.master.supplier.SupplierFormGUI;
import com.sv.visionplus.master.user.UserFormGUI;
import javax.swing.JPanel;
import static com.sv.visionplus.resource.VPResources.*;
import com.sv.visionplus.stock.stock_adjustment.StockAdjustmentForm;
import com.sv.visionplus.stock.stock_transfer.StockTransferForm;
import com.sv.visionplus.transaction.checking.CheckingForm;
import com.sv.visionplus.transaction.customer_payment.CustomerPaymentForm;
import com.sv.visionplus.transaction.grn.GrnForm;
import com.sv.visionplus.transaction.invoice.InvoiceForm;
import com.sv.visionplus.util.backup.BackupRestore;
import com.sv.visionplus.util.component.main_frame.DefaultMainframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohan
 */
public class Home extends DefaultMainframe {

    private static Home INSTANCE;

    public static Home getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Home();
        }

        return INSTANCE;
    }

    private Home() {
    }

    @Override
    protected JPanel getContentPanel() {
        this.contentPanel = new ContentPanel();

        return contentPanel;
    }

    @Override
    protected void createGUI() {
        createMaster();
    }

    public ActionListener getActionListener(final Class<? extends JPanel> panelClass) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JPanel panel = panelClass.newInstance();
                    Home.this.contentPanel.setView(panel);
                } catch (InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        return actionListener;
    }

    private void createMaster() {
        addTask("Master");

        addBand("Transactors", getImageUrl(MASTER_CUSTOMER));
        addButton("Customer", getImageUrl(MASTER_CUSTOMER), DefaultMainframe.ElementPriority.TOP, getActionListener(CustomerFormGUI.class));
        addButton("Supplier", getImageUrl(MASTER_SUPPLIER), DefaultMainframe.ElementPriority.TOP, getActionListener(SupplierFormGUI.class));
        addButton("User", getImageUrl(MASTER_USER), DefaultMainframe.ElementPriority.TOP, getActionListener(UserFormGUI.class));

        addBand("Item", getImageUrl(MASTER_ITEM));
        addButton("Item", getImageUrl(MASTER_ITEM), DefaultMainframe.ElementPriority.TOP, getActionListener(ItemFormGUI.class));

        addBand("Bank", getImageUrl(MASTER_BRANCH));
        addButton("Bank Branch", getImageUrl(MASTER_BRANCH), DefaultMainframe.ElementPriority.TOP, getActionListener(BankBranchFormGUI.class));
        
        addBand("Factory", getImageUrl(MASTER_BRANCH));
        addButton("Factory", getImageUrl(MASTER_BRANCH), DefaultMainframe.ElementPriority.TOP, getActionListener(FactoryFormGUI.class));

        addTask("Transaction");

        addBand("Transaction", getImageUrl(TRANSACTION_INVOICE));
        addButton("Invoice", getImageUrl(TRANSACTION_INVOICE), DefaultMainframe.ElementPriority.TOP, getActionListener(InvoiceForm.class));
        addButton("GRN", getImageUrl(TRANSACTION_GRN), DefaultMainframe.ElementPriority.TOP, getActionListener(GrnForm.class));

        addBand("Payment", getImageUrl(TRANSACTION_PAYMENT));
        addButton("Customer Payment", getImageUrl(TRANSACTION_PAYMENT), DefaultMainframe.ElementPriority.TOP, getActionListener(CustomerPaymentForm.class));

        addBand("Checking", getImageUrl(TRANSACTION_PAYMENT));
        addButton("Checking", getImageUrl(TRANSACTION_CHECK), DefaultMainframe.ElementPriority.TOP, getActionListener(CheckingForm.class));

        addTask("Account");

        addBand("Account", getImageUrl(ACCOUNT_MONEY));
        addButton("Money Collection", getImageUrl(ACCOUNT_MONEY), DefaultMainframe.ElementPriority.TOP, getActionListener(MoneyCollectionForm.class));
        addButton("Payment Vouchers", getImageUrl(ACCOUNT_VOUCHER), DefaultMainframe.ElementPriority.TOP, getActionListener(PaymentVoucherForm.class));

        addTask("Stock");

        addBand("Stock", getImageUrl(STOCK_TRANSFER));
        addButton("stock Adjustmant", getImageUrl(STOCK_ADJUST), DefaultMainframe.ElementPriority.TOP, getActionListener(StockAdjustmentForm.class));
        addButton("stock transfer", getImageUrl(STOCK_TRANSFER), DefaultMainframe.ElementPriority.TOP, getActionListener(StockTransferForm.class));

        addTask("Backup");

        addBand("Backup", getImageUrl(BACKUP_EXPORT));
        addButton("Export", getImageUrl(BACKUP_EXPORT), DefaultMainframe.ElementPriority.TOP, getActionListener(BackupRestore.class));
        addButton("Import", getImageUrl(BACKUP_IMPORT), DefaultMainframe.ElementPriority.TOP, getActionListener(BackupRestore.class));

    }

    private ContentPanel contentPanel;
}
