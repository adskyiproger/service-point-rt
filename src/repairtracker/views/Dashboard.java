/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairtracker.views;

import guitypes.TabAbstractPanel;
import guitypes.TabManager;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import repairtracker.models.Issue;
import repairtracker.models.IssueAttribute;
import repairtracker.models.IssueFilter;

/**
 *
 * @author pigeon
 */
public class Dashboard extends TabAbstractPanel {

    /**
     * Creates new form Dashboard
     */
    private static Logger LOGGER=LogManager.getLogger(Dashboard.class.getName()); 
    private static java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("repairtracker/views/Bundle"); // NOI18N
    public Dashboard() {
        
        initComponents();
        LIST_ISSUES.setModel(new IssueFilter().getModel());
        
        LIST_ISSUES.getColumnModel().removeColumn(LIST_ISSUES.getColumnModel().getColumn(7));
        LIST_ISSUES.getColumnModel().removeColumn(LIST_ISSUES.getColumnModel().getColumn(6));
        LIST_ISSUES.getColumnModel().removeColumn(LIST_ISSUES.getColumnModel().getColumn(0));
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement(java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("ISSUE_STATUS_SELECT"));
        for (String l : java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("ISSUE_STATUS").split(","))
            model.addElement(l);
        
        FILTER_STATUS.setModel(model);
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
        for (String l : java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("IssueEditor.DATE_FIELD").split(","))
            model1.addElement(l);
        FILTER_DATEFIELD.setModel(model1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        THIS_COMPONENT = new javax.swing.JLabel();
        MENU = new javax.swing.JMenu();
        SEARCH_FOR = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        FILTER_STATUS = new javax.swing.JComboBox<>();
        FILTER_CLIENT = new javax.swing.JTextField();
        FILTER_TICKET = new javax.swing.JTextField();
        FILTER_STARTDATE = new com.toedter.calendar.JDateChooser();
        FILTER_ENDDATE = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FILTER_DO = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        FILTER_USEDATE = new javax.swing.JCheckBox();
        FILTER_DATEFIELD = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LIST_ISSUES = new javax.swing.JTable();

        THIS_COMPONENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16/icons8-search-16.png"))); // NOI18N
        THIS_COMPONENT.setText(bundle.getString("JLABEL1")); // NOI18N

        SEARCH_FOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_FORActionPerformed(evt);
            }
        });
        MENU.add(SEARCH_FOR);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("repairtracker/views/Bundle"); // NOI18N
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("Dashboard.jPanel5.border.title"))); // NOI18N

        FILTER_STATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select status", "New", "In progress", "Completed" }));
        FILTER_STATUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FILTER_STATUSActionPerformed(evt);
            }
        });

        FILTER_CLIENT.setText(bundle.getString("CLIENT NAME")); // NOI18N
        FILTER_CLIENT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FILTER_CLIENTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FILTER_CLIENTFocusLost(evt);
            }
        });

        FILTER_TICKET.setText(bundle.getString("TICKET #")); // NOI18N
        FILTER_TICKET.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FILTER_TICKETFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FILTER_TICKETFocusLost(evt);
            }
        });

        FILTER_STARTDATE.setDate(new Date());

        FILTER_ENDDATE.setDate(new Date());

        jLabel1.setText(bundle.getString("START DATE")); // NOI18N

        jLabel2.setText(bundle.getString("END DATE")); // NOI18N

        FILTER_DO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16/icons8-search-16.png"))); // NOI18N
        FILTER_DO.setText(bundle.getString("SHOW ISSUES")); // NOI18N
        FILTER_DO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FILTER_DOActionPerformed(evt);
            }
        });

        jButton1.setText(bundle.getString("CLEAR")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        FILTER_USEDATE.setText(bundle.getString("USE DATE")); // NOI18N

        FILTER_DATEFIELD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Start date", "End date" }));

        jLabel3.setText(bundle.getString("Dashboard.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(FILTER_CLIENT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILTER_TICKET)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILTER_STATUS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(FILTER_USEDATE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILTER_DATEFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILTER_STARTDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILTER_ENDDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILTER_DO))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {FILTER_DO, jButton1});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FILTER_STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FILTER_TICKET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FILTER_CLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FILTER_STARTDATE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FILTER_ENDDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(FILTER_USEDATE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(FILTER_DATEFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FILTER_DO)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        LIST_ISSUES.setAutoCreateRowSorter(true);
        LIST_ISSUES.setModel(new IssueFilter().getModel());
        LIST_ISSUES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LIST_ISSUESMousePressed(evt);
            }
        });
        LIST_ISSUES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LIST_ISSUESKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(LIST_ISSUES);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCH_FORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_FORActionPerformed
        TabManager.insertTab(this);
    }//GEN-LAST:event_SEARCH_FORActionPerformed

    private void LIST_ISSUESMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIST_ISSUESMousePressed
        if (evt.getClickCount()==2) {
            TabManager.insertTab(new IssueEditor((int) LIST_ISSUES.getModel().getValueAt(LIST_ISSUES.getSelectedRow(),0)));
        }
    }//GEN-LAST:event_LIST_ISSUESMousePressed

    private void FILTER_STATUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FILTER_STATUSActionPerformed
        
    }//GEN-LAST:event_FILTER_STATUSActionPerformed

    private void FILTER_CLIENTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FILTER_CLIENTFocusGained
        if (FILTER_CLIENT.getText().equalsIgnoreCase(bundle.getString("CLIENT NAME"))==true)
            FILTER_CLIENT.setText("");
    }//GEN-LAST:event_FILTER_CLIENTFocusGained

    private void FILTER_CLIENTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FILTER_CLIENTFocusLost
        if (FILTER_CLIENT.getText().equalsIgnoreCase("")==true)
            FILTER_CLIENT.setText(bundle.getString("CLIENT NAME"));
    }//GEN-LAST:event_FILTER_CLIENTFocusLost

    private void FILTER_DOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FILTER_DOActionPerformed
        String client="";
        int issue=-1;
        IssueFilter ISSUE_FILTER=new IssueFilter();
        
        if (FILTER_CLIENT.getText().equalsIgnoreCase(bundle.getString("CLIENT NAME"))==false) 
            ISSUE_FILTER.setClient(FILTER_CLIENT.getText());
        if (FILTER_TICKET.getText().equalsIgnoreCase(bundle.getString("TICKET #"))==false)
            try {
                issue=Integer.parseInt(FILTER_TICKET.getText());
                ISSUE_FILTER.setIsseID(issue);
            } catch (NumberFormatException ex) {
                    issue=-1;
                    LOGGER.error(ex.getMessage(),ex);
            }
        
        if (FILTER_USEDATE.isSelected())
           ISSUE_FILTER.setDate(FILTER_STARTDATE.getDate(),FILTER_ENDDATE.getDate(),FILTER_DATEFIELD.getSelectedIndex());
        
        if (FILTER_STATUS.getSelectedIndex()>0)
            ISSUE_FILTER.setStatus(FILTER_STATUS.getSelectedIndex()-1);
        LIST_ISSUES.setModel(ISSUE_FILTER.getModel());
        LIST_ISSUES.getColumnModel().removeColumn(LIST_ISSUES.getColumnModel().getColumn(0));
        
    }//GEN-LAST:event_FILTER_DOActionPerformed

    private void FILTER_TICKETFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FILTER_TICKETFocusLost
        if (FILTER_TICKET.getText().equalsIgnoreCase("")==true)
        FILTER_TICKET.setText(bundle.getString("TICKET #"));
    }//GEN-LAST:event_FILTER_TICKETFocusLost

    private void FILTER_TICKETFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FILTER_TICKETFocusGained
        if (FILTER_TICKET.getText().equalsIgnoreCase(bundle.getString("TICKET #"))==true)
        FILTER_TICKET.setText("");
    }//GEN-LAST:event_FILTER_TICKETFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FILTER_TICKET.setText(bundle.getString("TICKET #"));
        FILTER_CLIENT.setText(bundle.getString("CLIENT NAME"));
        FILTER_STATUS.setSelectedIndex(0);
        FILTER_STARTDATE.setDate(new Date());
        FILTER_ENDDATE.setDate(new Date());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LIST_ISSUESKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LIST_ISSUESKeyPressed
        if (evt.getKeyCode() == 10 && LIST_ISSUES.getSelectedRow() > 0) {
            TabManager.insertTab(new IssueEditor(Integer.parseInt(LIST_ISSUES.getModel().getValueAt(LIST_ISSUES.getSelectedRow(), 0).toString())));
        }
    }//GEN-LAST:event_LIST_ISSUESKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FILTER_CLIENT;
    private javax.swing.JComboBox<String> FILTER_DATEFIELD;
    private javax.swing.JButton FILTER_DO;
    private com.toedter.calendar.JDateChooser FILTER_ENDDATE;
    private com.toedter.calendar.JDateChooser FILTER_STARTDATE;
    private javax.swing.JComboBox<String> FILTER_STATUS;
    private javax.swing.JTextField FILTER_TICKET;
    private javax.swing.JCheckBox FILTER_USEDATE;
    private javax.swing.JTable LIST_ISSUES;
    private static javax.swing.JMenu MENU;
    private javax.swing.JMenuItem SEARCH_FOR;
    private javax.swing.JLabel THIS_COMPONENT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void close() {
        //TabManager.removeTab(this);
        JOptionPane.showMessageDialog(this,java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("CLOSE_MESSAGE"),java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("CLOSE_TITLE"),JOptionPane.WARNING_MESSAGE);
    }
     @Override
    public Icon getIcon() {
        return THIS_COMPONENT.getIcon();
    }
    public static JMenu getMenu(){
           return MENU; 
    }
    
    @Override
    public String toString() {
        return THIS_COMPONENT.getText();
    }
    
    
    @Override
    public void print(){
    }
    
    @Override
    public void save(){
    LOGGER.info("Save pressed");
    }
    
    @Override
    public Boolean isSaved() {
        return true;
    }
    
    @Override
    public void newItem() {
        TabManager.insertTab(new IssueEditor());
    }
}
