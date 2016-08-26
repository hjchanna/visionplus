package com.sv.visionplus.transaction.invoice.dialog;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.base.master.AbstractMasterFormService;
import com.sv.visionplus.base.master.AbstractSearchPanel;
import com.sv.visionplus.system.exception.VPException;
import static com.sv.visionplus.transaction.invoice.dialog.AbstractMasterFormGUI.EDIT_MODE;
import static com.sv.visionplus.transaction.invoice.dialog.AbstractMasterFormGUI.IDEAL_MODE;
import static com.sv.visionplus.transaction.invoice.dialog.AbstractMasterFormGUI.NEW_MODE;
import com.sv.visionplus.util.component.table.CTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import visionplusx.Home;

/**
 * @author Nidura Prageeth
 */
public abstract class AbstractMasterFormGUI<T> extends javax.swing.JDialog {

    public AbstractMasterFormGUI() {
        initComponents();

        initOthers();
    }

    //abstractions

    protected abstract CTableModel<T> getTableModel();

    protected abstract AbstractMasterFormDAO<T> getMasterFormDAO();

    protected abstract AbstractObjectCreator<T> getObjectCreator();

    //initalizations
    protected AbstractSearchPanel<T> getSearchPanel() {
        return new AbstractSearchPanel<T>() {
            @Override
            protected CTableModel<T> getTableModel() {
                return AbstractMasterFormGUI.this.getTableModel();
            }

            @Override
            protected void selectionChanged(T object) {
                try {
                    AbstractMasterFormGUI.this.objectCreator.setValue(object);
                } catch (VPException ex) {
                    Logger.getLogger(AbstractMasterFormGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            protected List<T> search(String text) {
                return AbstractMasterFormGUI.this.masterFormService.getSearchResult(text);
            }
        };
    }

    protected AbstractMasterFormService<T> getMasterFormService() {
        return new AbstractMasterFormService<T>() {
            @Override
            protected AbstractMasterFormDAO<T> getMasterFormDAO() {
                return AbstractMasterFormGUI.this.getMasterFormDAO();
            }
        };
    }

    //actions
    private void doNew() {
        setMode(NEW_MODE);
    }

    private void doEdit() {
        setMode(EDIT_MODE);
    }

    private void doDelete() {
        T object = null;
        try {
            object = this.objectCreator.getValue();
        } catch (VPException ex) {
            JOptionPane.showMessageDialog(Home.getInstance(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (object != null) {
            int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to delete ?", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (q == JOptionPane.YES_OPTION) {
                try {
                    this.masterFormService.delete(object);
                    //save success
                    JOptionPane.showMessageDialog(Home.getInstance(), "Successfully Deleted..!!!", "Delete", JOptionPane.INFORMATION_MESSAGE);

                    //set ideal mode
                    setMode(IDEAL_MODE);
                } catch (VPException ex) {
                    JOptionPane.showMessageDialog(Home.getInstance(), ex.getMessage(), "Delete", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void doSave() {
        T object = null;
        try {
            object = this.objectCreator.getValue();
        } catch (VPException ex) {
            JOptionPane.showMessageDialog(Home.getInstance(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (object != null) {
            int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to save chages ?", "Save", JOptionPane.YES_NO_OPTION);

            if (q == JOptionPane.YES_OPTION) {
                try {
                    switch (currentMode) {
                        case NEW_MODE:
                            this.masterFormService.save(object);
                            break;
                        case EDIT_MODE:
                            this.masterFormService.update(object);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    //save success
                    JOptionPane.showMessageDialog(Home.getInstance(), "Successfully Saved..!!!", "Save", JOptionPane.INFORMATION_MESSAGE);

                    //set ideal mode
                    setMode(IDEAL_MODE);
                } catch (VPException ex) {
                    JOptionPane.showMessageDialog(Home.getInstance(), ex.getMessage(), "Save", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void doDiscard() {
        int q = JOptionPane.showConfirmDialog(Home.getInstance(), "Do you sure want to discard changes ?", "Discard", JOptionPane.YES_NO_OPTION);

        if (q == JOptionPane.YES_OPTION) {
            setMode(IDEAL_MODE);
        }
    }

    //util
    private void setMode(String mode) {
        this.currentMode = mode;

        switch (mode) {
            case IDEAL_MODE:
                btnNew.setVisible(true);
                btnEdit.setVisible(true);
                btnDelete.setVisible(true);
                btnSave.setVisible(false);
                btnDiscard.setVisible(false);

                this.objectCreator.setIdealMode();
                break;
            case NEW_MODE:
                btnNew.setVisible(false);
                btnEdit.setVisible(false);
                btnDelete.setVisible(false);
                btnSave.setVisible(true);
                btnDiscard.setVisible(true);

                this.objectCreator.setNewMode();
                this.objectCreator.resetFields();
                break;
            case EDIT_MODE:
                btnNew.setVisible(false);
                btnEdit.setVisible(false);
                btnDelete.setVisible(false);
                btnSave.setVisible(true);
                btnDiscard.setVisible(true);

                this.objectCreator.setEditMode();
                break;
            default:
                throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        this.searchPanel = getSearchPanel();
        this.masterFormService = getMasterFormService();
        this.objectCreator = getObjectCreator();

        //ui creation
        this.pnlObjectCreatorContainer.add(this.objectCreator);
        this.pnlRight.add(this.searchPanel);

        //button actions
        this.btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doNew();
            }
        });
        this.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doEdit();
            }
        });
        this.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doDelete();
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doSave();
            }
        });
        this.btnDiscard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doDiscard();
            }
        });

        //set ideal mode
        setMode(IDEAL_MODE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        split = new javax.swing.JSplitPane();
        pnlLeft = new javax.swing.JPanel();
        pnlObjectCreatorContainer = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDiscard = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        split.setDividerLocation(350);

        pnlObjectCreatorContainer.setLayout(new javax.swing.BoxLayout(pnlObjectCreatorContainer, javax.swing.BoxLayout.LINE_AXIS));

        btnNew.setText("New");

        btnEdit.setText("Edit");

        btnDelete.setText("Delete");

        btnSave.setText("Save");

        btnDiscard.setText("Discard");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlObjectCreatorContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiscard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addComponent(pnlObjectCreatorContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnDiscard))
                .addGap(0, 331, Short.MAX_VALUE))
        );

        split.setLeftComponent(pnlLeft);

        pnlRight.setLayout(new javax.swing.BoxLayout(pnlRight, javax.swing.BoxLayout.LINE_AXIS));
        split.setRightComponent(pnlRight);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(split, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(split)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlObjectCreatorContainer;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JSplitPane split;
    // End of variables declaration//GEN-END:variables
    private AbstractSearchPanel<T> searchPanel;
    private AbstractMasterFormService<T> masterFormService;
    private AbstractObjectCreator<T> objectCreator;
    //
    public String currentMode = null;
    public static final String IDEAL_MODE = "IDEAL";
    public static final String NEW_MODE = "NEW";
    public static final String EDIT_MODE = "EDIT";
}
