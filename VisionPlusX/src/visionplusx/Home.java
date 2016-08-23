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
        
        addBand("Bank Branch", getImageUrl(MASTER_ITEM));
        addButton("Bank Branch", getImageUrl(MASTER_ITEM), DefaultMainframe.ElementPriority.TOP, null);
    }

}
