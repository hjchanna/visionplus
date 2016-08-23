package visionplusx;

import javax.swing.JMenuItem;

//XXX:KASUN
public class Home extends javax.swing.JFrame {

    private static Home instance;

    public static Home getInstance() {
        //TODO:singleton instance
        if (instance==null) {
            instance=new Home();
        }
        return instance;
    }

    public Home() {
        initComponents();

        initOthers();
    }

    private void bindForm(JMenuItem menuItem, Class formClass) {
        //TODO:add action listener to the menu item to create new instance of form using reflection,
//        pnlLoad.removeAll();
//        pnlLoad.add(formClass);
//        revalidate();
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        //bindForm method call for each menu item
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLoad = new javax.swing.JPanel();
        menubar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlLoadLayout = new javax.swing.GroupLayout(pnlLoad);
        pnlLoad.setLayout(pnlLoadLayout);
        pnlLoadLayout.setHorizontalGroup(
            pnlLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlLoadLayout.setVerticalGroup(
            pnlLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        menubar.add(jMenu1);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JPanel pnlLoad;
    // End of variables declaration//GEN-END:variables
}
