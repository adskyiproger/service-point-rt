/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairtracker.views;

import guitypes.TabAbstractPanel;
import guitypes.TabManager;
import repairtracker.RTProperties;

/**
 *
 * @author pigeon
 */
public class RepairTrackerGUI extends javax.swing.JFrame {

    /**
     * Creates new form RepairTrackerGUI
     */
    TabManager tabManager;
    Dashboard DASHBOARD;
    public RepairTrackerGUI() {
        DASHBOARD=new Dashboard();
        initComponents();
        tabManager=new TabManager(MAIN_PANEL);
        TabManager.insertTab(DASHBOARD);
        setTitle(RTProperties.APP_NAME+" "+RTProperties.APP_VERSION);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        STATUS = new javax.swing.JLabel();
        MAIN_PANEL = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        MAIN_MENU = new javax.swing.JMenuBar();
        MENU_FILE = new javax.swing.JMenu();
        MENU_SAVE = new javax.swing.JMenuItem();
        MENU_SAVEALL = new javax.swing.JMenuItem();
        MENU_SETTINGS = new javax.swing.JMenuItem();
        MENU_EXIT = new javax.swing.JMenuItem();
        MENU_ISSUES = new javax.swing.JMenu();
        MENU_NEWISSUE = new javax.swing.JMenuItem();
        MENU_HELP = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("repairtracker/views/Bundle"); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("RepairTrackerGUI.jPanel2.border.title"))); // NOI18N

        STATUS.setText(bundle.getString("RepairTrackerGUI.STATUS.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(STATUS)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(STATUS)
                .addGap(12, 12, 12))
        );

        jToolBar1.setRollover(true);

        jButton1.setText(bundle.getString("RepairTrackerGUI.jButton1.text")); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        MENU_FILE.setText(bundle.getString("RepairTrackerGUI.MENU_FILE.text")); // NOI18N

        MENU_SAVE.setText(bundle.getString("RepairTrackerGUI.MENU_SAVE.text")); // NOI18N
        MENU_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_SAVEActionPerformed(evt);
            }
        });
        MENU_FILE.add(MENU_SAVE);

        MENU_SAVEALL.setText(bundle.getString("RepairTrackerGUI.MENU_SAVEALL.text")); // NOI18N
        MENU_FILE.add(MENU_SAVEALL);

        MENU_SETTINGS.setText(bundle.getString("RepairTrackerGUI.MENU_SETTINGS.text")); // NOI18N
        MENU_FILE.add(MENU_SETTINGS);

        MENU_EXIT.setText(bundle.getString("RepairTrackerGUI.MENU_EXIT.text")); // NOI18N
        MENU_EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_EXITActionPerformed(evt);
            }
        });
        MENU_FILE.add(MENU_EXIT);

        MAIN_MENU.add(MENU_FILE);

        MENU_ISSUES.setText(bundle.getString("RepairTrackerGUI.MENU_ISSUES.text")); // NOI18N

        MENU_NEWISSUE.setText(bundle.getString("RepairTrackerGUI.MENU_NEWISSUE.text")); // NOI18N
        MENU_NEWISSUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_NEWISSUEActionPerformed(evt);
            }
        });
        MENU_ISSUES.add(MENU_NEWISSUE);

        MAIN_MENU.add(MENU_ISSUES);

        MENU_HELP.setText(bundle.getString("RepairTrackerGUI.MENU_HELP.text")); // NOI18N
        MAIN_MENU.add(MENU_HELP);

        setJMenuBar(MAIN_MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_PANEL)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENU_NEWISSUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_NEWISSUEActionPerformed
        TabManager.insertTab(new IssueEditor());
    }//GEN-LAST:event_MENU_NEWISSUEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MENU_NEWISSUEActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MENU_EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_EXITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MENU_EXITActionPerformed

    private void MENU_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_SAVEActionPerformed
        ((TabAbstractPanel)MAIN_PANEL.getSelectedComponent()).save();
    }//GEN-LAST:event_MENU_SAVEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RepairTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepairTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepairTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepairTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepairTrackerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MAIN_MENU;
    private javax.swing.JTabbedPane MAIN_PANEL;
    private javax.swing.JMenuItem MENU_EXIT;
    private javax.swing.JMenu MENU_FILE;
    private javax.swing.JMenu MENU_HELP;
    private javax.swing.JMenu MENU_ISSUES;
    private javax.swing.JMenuItem MENU_NEWISSUE;
    private javax.swing.JMenuItem MENU_SAVE;
    private javax.swing.JMenuItem MENU_SAVEALL;
    private javax.swing.JMenuItem MENU_SETTINGS;
    public static javax.swing.JLabel STATUS;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
