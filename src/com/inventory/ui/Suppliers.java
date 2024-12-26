/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory.ui;

import com.inventory.dao.SupplierDAO;
import com.inventory.dto.SupplierDTO;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Suppliers extends javax.swing.JPanel {


    public Suppliers() {
        initComponents();
        supplierCodeTxt.setVisible(false);
        loadDatas();
//        editBttn.setVisible(false);
//        editLab.setVisible(false);
//        deleteBttn.setVisible(false);
//        deleteLab.setVisible(false); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        inputPanel = new javax.swing.JPanel();
        suppliersNameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        locationTxt = new javax.swing.JTextField();
        suppliersNameLab = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addBttn = new javax.swing.JLabel();
        editBttn = new javax.swing.JLabel();
        deleteBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        supplierCodeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        editLab = new javax.swing.JLabel();
        deleteLab = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchTxt = new javax.swing.JTextField();
        searchByLab = new javax.swing.JLabel();

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        inputPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        suppliersNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersNameTxtActionPerformed(evt);
            }
        });

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        locationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtActionPerformed(evt);
            }
        });

        suppliersNameLab.setText("Supplier's name");

        jLabel3.setText("Location");

        jLabel5.setText("Phone");

        addBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/addPeople.png"))); // NOI18N
        addBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBttnMouseClicked(evt);
            }
        });

        editBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/editPeople.png"))); // NOI18N
        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });

        deleteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/deletelarge.png"))); // NOI18N
        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear.png"))); // NOI18N
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });

        supplierCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierCodeTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Add");

        editLab.setText("Edit");

        deleteLab.setText("Delete");

        jLabel9.setText("Clear");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBttn)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(editLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(editBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(deleteBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearBttn))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(deleteLab, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(supplierCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(inputPanelLayout.createSequentialGroup()
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(suppliersNameLab)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(locationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(suppliersNameTxt)
                                .addComponent(phoneTxt)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suppliersNameLab)
                    .addComponent(suppliersNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supplierCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBttn)
                            .addComponent(editBttn)
                            .addComponent(deleteBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editLab)
                                .addComponent(deleteLab)
                                .addComponent(jLabel9))))
                    .addComponent(clearBttn))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SUPPLIERS", inputPanel);

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("SUPPLIERS");

        searchTxt.setToolTipText("Search using Full Name Location, Phone OR Supplier Code");
        searchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchTxtMouseReleased(evt);
            }
        });
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        searchByLab.setText("SEARCH");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchByLab)
                        .addGap(18, 18, 18)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchByLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 940, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        supplierCodeTxt.setText("");
        suppliersNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
    }//GEN-LAST:event_mainPanelMouseClicked

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        String text=searchTxt.getText();
        loadSearchSuppliersDatas(text);
        table.getColumn("sid").setMaxWidth(0);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void searchTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTxtMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtMouseReleased

    private void supplierCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierCodeTxtActionPerformed

    private void locationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void suppliersNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliersNameTxtActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        if(evt.isPopupTrigger()){
            popUpMenu.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tableMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        int column = table.getColumnCount();
        Object[] val = new Object[column];
        for(int i = 0; i < column; i++) {
            val[i]=table.getValueAt(row, i);
        }
        supplierCodeTxt.setText(val[0].toString());
        suppliersNameTxt.setText((String) val[1]);
        locationTxt.setText((String) val[2]);
        phoneTxt.setText((String) val[3]);
    }//GEN-LAST:event_tableMouseClicked

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Select a table data first!");
        }else{
            if(suppliersNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please fill all the fields!");
            }else{

                SupplierDTO supplierdto=new SupplierDTO();
                supplierdto.setSupplierCode(supplierCodeTxt.getText());
                supplierdto.setFullName(suppliersNameTxt.getText());
                supplierdto.setLocation(locationTxt.getText());
                supplierdto.setPhone(phoneTxt.getText());
                new SupplierDAO().editSupplierDAO(supplierdto);
                loadDatas();
                //table.getColumn("sid").setMaxWidth(0);
            }
        }
    }//GEN-LAST:event_editBttnMouseClicked

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Select a table data first!");
        }else{
            new SupplierDAO().deleteSupplierDAO(table.getValueAt(table.getSelectedRow(),0).toString());
            loadDatas();
        }
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void addBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBttnMouseClicked

        if(suppliersNameTxt.getText().equals("") || locationTxt.getText().equals("") || phoneTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please fill all the fields!");
        }else{

            SupplierDTO supplierdto = new SupplierDTO();
            supplierdto.setFullName(suppliersNameTxt.getText());
            supplierdto.setLocation(locationTxt.getText());
            supplierdto.setPhone(phoneTxt.getText());
            new SupplierDAO().addSupplierDAO(supplierdto);
            loadDatas();
        }
    }//GEN-LAST:event_addBttnMouseClicked

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        supplierCodeTxt.setText("");
        suppliersNameTxt.setText("");
        locationTxt.setText("");
        phoneTxt.setText("");
    }//GEN-LAST:event_clearBttnMouseClicked

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    public void loadDatas(){
            try{
                SupplierDAO supplierDAO=new SupplierDAO();
                table.setModel(supplierDAO.buildTableModel(supplierDAO.getQueryResult()));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }

    public void loadSearchSuppliersDatas(String text){
            try{
                SupplierDAO supplierDAO=new SupplierDAO();
                table.setModel(supplierDAO.buildTableModel(supplierDAO.getSearchSuppliersQueryResult(text)));
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBttn;
    private javax.swing.JLabel clearBttn;
    private javax.swing.JLabel deleteBttn;
    private javax.swing.JLabel deleteLab;
    private javax.swing.JLabel editBttn;
    private javax.swing.JLabel editLab;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField locationTxt;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField supplierCodeTxt;
    private javax.swing.JLabel suppliersNameLab;
    private javax.swing.JTextField suppliersNameTxt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
