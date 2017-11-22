/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairtracker.views;

import guitypes.TabAbstractPanel;
import guitypes.TabManager;

import java.awt.Graphics;


import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import repairtracker.RTProperties;
import repairtracker.helpers.PropertiesReader;
import repairtracker.helpers.TextPropsDecorator;




/**
 *
 * @author user
 */
public class TemplateEditor extends TabAbstractPanel {
    private static Logger LOGGER=LogManager.getLogger(TemplateEditor.class.getName()); 
    String TEMPLATE_CURRENT="";
    String TPL_PATH="";
    String TPL_NAME="";
    Boolean SAVED=true;
    Boolean LOADED=false;
    /**
     * Creates new form TemplateEditor
     */
    public TemplateEditor() {
        this(java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("TEMPLATES EDITOR"),"templates");
    }
    
    public TemplateEditor(String name, String tpl_path) {
        initComponents();
        TextPropsDecorator.decorate(TEMPLATE_EDITOR);
        TPL_PATH=tpl_path;
        TPL_NAME=name;
        if (name.length()>0) THIS_COMPONENT.setText(TPL_NAME+" ("+TEMPLATE_CURRENT+")");
        LIST_TEMPLATES.setModel(PropertiesReader.getFilesAsListModel(TPL_PATH));
        if (LIST_TEMPLATES.getModel().getSize()>0) {
            LIST_TEMPLATES.setSelectedIndex(0);
            loadTemplate();
        }
        SAVED=true;
    }
    
    private void loadTemplate() {
    TEMPLATE_EDITOR.setText(PropertiesReader.getFileAsString(TPL_PATH+RTProperties.FS+LIST_TEMPLATES.getSelectedValue()));
    TEMPLATE_VIEW.setText(PropertiesReader.getFileAsString(TPL_PATH+RTProperties.FS+LIST_TEMPLATES.getSelectedValue()));
            TEMPLATE_NAME.setText(LIST_TEMPLATES.getSelectedValue());
            TEMPLATE_CURRENT=LIST_TEMPLATES.getSelectedValue();
            SAVED=true;
            THIS_COMPONENT.setText(TPL_NAME+" ("+TEMPLATE_CURRENT+")");
            TabManager.updateTitle(this);
            LOADED=true;
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LIST_TEMPLATES = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TEMPLATE_EDITOR = new javax.swing.JTextArea();
        TEMPLATE_NAME = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TEMPLATE_VIEW = new javax.swing.JEditorPane();

        THIS_COMPONENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16/icons8-web-design-16.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("repairtracker/views/Bundle"); // NOI18N
        THIS_COMPONENT.setText(bundle.getString("TemplateEditor.THIS_COMPONENT.text")); // NOI18N

        MENU.setText(bundle.getString("TemplateEditor.MENU.text")); // NOI18N

        LIST_TEMPLATES.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LIST_TEMPLATES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LIST_TEMPLATESMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(LIST_TEMPLATES);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TemplateEditor.jPanel2.border.title"))); // NOI18N

        TEMPLATE_EDITOR.setColumns(20);
        TEMPLATE_EDITOR.setRows(5);
        TEMPLATE_EDITOR.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TEMPLATE_EDITORCaretUpdate(evt);
            }
        });
        TEMPLATE_EDITOR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TEMPLATE_EDITORFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(TEMPLATE_EDITOR);

        TEMPLATE_NAME.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TEMPLATE_NAMEFocusLost(evt);
            }
        });
        TEMPLATE_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMPLATE_NAMEActionPerformed(evt);
            }
        });

        jLabel1.setText(bundle.getString("TemplateEditor.jLabel1.text")); // NOI18N

        TEMPLATE_VIEW.setContentType("text/html"); // NOI18N
        TEMPLATE_VIEW.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TEMPLATE_VIEWCaretUpdate(evt);
            }
        });
        jScrollPane3.setViewportView(TEMPLATE_VIEW);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(TEMPLATE_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEMPLATE_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LIST_TEMPLATESMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIST_TEMPLATESMousePressed
        if (evt.getClickCount()==2) {
            Object a=LIST_TEMPLATES.getSelectedValue();
            if (askForSave()==true) {
                LIST_TEMPLATES.setModel(PropertiesReader.getFilesAsListModel(TPL_PATH));
                LIST_TEMPLATES.setSelectedValue(a,true);
                loadTemplate();
            }
        }
    }//GEN-LAST:event_LIST_TEMPLATESMousePressed

    private void TEMPLATE_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMPLATE_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEMPLATE_NAMEActionPerformed

    private void TEMPLATE_NAMEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TEMPLATE_NAMEFocusLost
        TabManager.updateTitle(this);
        SAVED=false;
    }//GEN-LAST:event_TEMPLATE_NAMEFocusLost

    private void TEMPLATE_EDITORFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TEMPLATE_EDITORFocusLost
        TEMPLATE_NAMEFocusLost(evt);
    }//GEN-LAST:event_TEMPLATE_EDITORFocusLost

    private void TEMPLATE_EDITORCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TEMPLATE_EDITORCaretUpdate
        if (LOADED) TEMPLATE_VIEW.setText(TEMPLATE_EDITOR.getText());
    }//GEN-LAST:event_TEMPLATE_EDITORCaretUpdate

    private void TEMPLATE_VIEWCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TEMPLATE_VIEWCaretUpdate
       //if (LOADED) TEMPLATE_EDITOR.setText(TEMPLATE_VIEW.getText());
    }//GEN-LAST:event_TEMPLATE_VIEWCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> LIST_TEMPLATES;
    public static javax.swing.JMenu MENU;
    private javax.swing.JTextArea TEMPLATE_EDITOR;
    private javax.swing.JTextField TEMPLATE_NAME;
    private javax.swing.JEditorPane TEMPLATE_VIEW;
    private javax.swing.JLabel THIS_COMPONENT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables


    private Boolean askForSave(){
        Boolean ask=true;
    if (SAVED==false) {
            int dialogResult=JOptionPane.showConfirmDialog(this,java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("DO YOU WANT TO SAVE CHANGES?"),java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("SAVE CHANGES: ")+THIS_COMPONENT.getText(),JOptionPane.WARNING_MESSAGE);
                        
                        if(dialogResult == JOptionPane.YES_OPTION){
                            save();
                            ask=SAVED;
                        } 
        }
    return ask;
    }
    @Override
    public void close() {
        
        if (askForSave()) TabManager.removeTab(this);
        
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
    public void print(Graphics g){
    }
    
    @Override
    public void print(){
    }
    
    @Override
    public Boolean isSaved() {
        return SAVED;
    }
    
    @Override
    public void newItem() {
        if (askForSave()) {
            LIST_TEMPLATES.setModel(PropertiesReader.getFilesAsListModel(TPL_PATH));
            TEMPLATE_CURRENT="";
            TEMPLATE_EDITOR.setText("");
            TEMPLATE_NAME.setText(java.util.ResourceBundle.getBundle("repairtracker/views/Bundle").getString("UNNAMED"));
            THIS_COMPONENT.setText(TPL_NAME+" ("+TEMPLATE_CURRENT+")");
            SAVED=true;
        }
        LIST_TEMPLATES.setModel(PropertiesReader.getFilesAsListModel(TPL_PATH+RTProperties.FS));
        
    }
    
    
    @Override
    public void save(){
        

        if (TEMPLATE_NAME.getText().length()>0) {
            if (TEMPLATE_CURRENT.isEmpty()) {
                TEMPLATE_CURRENT=TEMPLATE_NAME.getText();
               }
            PropertiesReader.savePropertiesFile(TPL_PATH+RTProperties.FS+TEMPLATE_CURRENT, TEMPLATE_EDITOR.getText());
            if (!TEMPLATE_CURRENT.equalsIgnoreCase(TEMPLATE_NAME.getText())) {
                PropertiesReader.renameFile(TPL_PATH+RTProperties.FS+TEMPLATE_CURRENT, TPL_PATH+RTProperties.FS+TEMPLATE_NAME.getText());
                
            }
        }
        //String a=TEMPLATE_NAME.getText();
        //LIST_TEMPLATES.setModel(PropertiesReader.getFilesAsListModel(TPL_PATH+RTProperties.FS));
        //LIST_TEMPLATES
                
        
        
    LOGGER.info("Save pressed");
    SAVED=true;
    TabManager.updateTitle(this);
    }
}
