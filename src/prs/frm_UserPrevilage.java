package prs;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class frm_UserPrevilage extends javax.swing.JInternalFrame {

    Object user = null;

    public frm_UserPrevilage() {
        initComponents();

        this.setTitle("User Privileges - User : " + dbconnector.uname + "....");
        lbltitle.setText("User Privileges");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbprivilage = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCname = new javax.swing.JTextField();
        txtMindex = new javax.swing.JTextField();
        txtCindex = new javax.swing.JTextField();
        lbltitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tbprivilage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Code", "Ward No", "Description", "No of Beds", "Incharge"
            }
        ));
        tbprivilage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbprivilageMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbprivilage);
        tbprivilage.getColumnModel().getColumn(1).setMinWidth(125);
        tbprivilage.getColumnModel().getColumn(1).setPreferredWidth(125);
        tbprivilage.getColumnModel().getColumn(1).setMaxWidth(125);
        tbprivilage.getColumnModel().getColumn(3).setMinWidth(80);
        tbprivilage.getColumnModel().getColumn(3).setPreferredWidth(80);
        tbprivilage.getColumnModel().getColumn(3).setMaxWidth(80);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel12.add(btnsave);

        btnremove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel12.add(btnremove);

        txtexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        txtexit.setText("Exit");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });
        jPanel12.add(txtexit);

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Command Name : ");
        jPanel2.add(jLabel1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Menu Index No : ");
        jPanel2.add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Component Index No : ");
        jPanel2.add(jLabel5);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0));

        txtCname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCnameKeyPressed(evt);
            }
        });
        jPanel3.add(txtCname);

        txtMindex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMindex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMindexKeyPressed(evt);
            }
        });
        jPanel3.add(txtMindex);

        txtCindex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCindex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCindexKeyPressed(evt);
            }
        });
        jPanel3.add(txtCindex);

        lbltitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle.setText("User Privileges");

        jLabel2.setText("ToolBar Menu Idex No  =  222");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbltitle)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("All Privileges", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {

            settblmdl("SELECT cmmd_Name as Command_Name,menu_index as Menu_Index,comp_index AS Component_Index from privilage  ORDER BY menu_index,comp_index");
        } catch (SQLException ex) {
            Logger.getLogger(frm_UserPrevilage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setTitle("User Privileges = " + dbconnector.uname);

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtCindexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCindexKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCindexKeyPressed

    private void txtMindexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMindexKeyPressed
        if (evt.getKeyCode() == 10) {
            btnsave.requestFocus();
        }
    }//GEN-LAST:event_txtMindexKeyPressed

    private void txtCnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnameKeyPressed
        if (evt.getKeyCode() == 10) {
        }
    }//GEN-LAST:event_txtCnameKeyPressed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_txtexitActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        String Cname = txtCname.getText();

        int i = MessageBox.yesno("Do You Want to Remove Item  " + user);
        if (i == 0) {
            try {
                dbconnector.insertquery("DELETE FROM privilage WHERE cmmd_Name ='" + Cname + "'");
                settblmdl("SELECT cmmd_Name as Command_Name,menu_index as Menu_Index,comp_index AS Component_Index  from privilage ORDER BY menu_index,comp_index");
                voidmodule.U_transaction("user", "Delete " + user);
                JOptionPane.showMessageDialog(null, "Updates are Completed..");
            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String Cname = txtCname.getText();
        String Mindex = txtMindex.getText();
        String Cindex = txtCindex.getText();
        try {
            int Count = voidmodule.RCount("SELECT cmmd_Name from privilage WHERE cmmd_Name ='" + Cname + "'");
            if (Count > 0) {
                int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                if (i == 0) {
                    dbconnector.insertquery("UPDATE privilage SET menu_index = '" + Mindex + "',comp_index = '" + Cindex + "'WHERE cmmd_Name ='" + Cname + "'");

                } else {
                }
            } else {
                dbconnector.insertquery("INSERT INTO privilage VALUES ('" + Cname + "','" + Mindex + "','" + Cindex + "')");
                JOptionPane.showMessageDialog(null, "Records Saved");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            settblmdl("SELECT cmmd_Name as Command_Name,menu_index as Menu_Index,comp_index AS Component_Index  from privilage ORDER BY menu_index,comp_index");
        } catch (SQLException ex) {
            Logger.getLogger(frm_UserPrevilage.class.getName()).log(Level.SEVERE, null, ex);
        }
        voidmodule.U_transaction("user", "save_update privilage " + Cname);
        txtMindex.setText(null);
        txtCindex.setText(null);
        JOptionPane.showMessageDialog(null, "Updates are Completed..");
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tbprivilageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprivilageMouseReleased
        int SelectedRow = tbprivilage.getSelectedRow();
        String Cname = tbprivilage.getValueAt(SelectedRow, 0).toString();
        String Mindex = tbprivilage.getValueAt(SelectedRow, 1).toString();
        String Cindex = tbprivilage.getValueAt(SelectedRow, 2).toString();




        txtCname.setText(Cname);
        txtMindex.setText(Mindex);
        txtCindex.setText(Cindex);


        btnsave.setText("Update");
    }//GEN-LAST:event_tbprivilageMouseReleased
    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {400, 100, 100 };
        wans_javalib.Tables.setTableModel(executeQuery, tbprivilage, Tblmod, columnWidth);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tbprivilage;
    private javax.swing.JTextField txtCindex;
    private javax.swing.JTextField txtCname;
    private javax.swing.JTextField txtMindex;
    private javax.swing.JButton txtexit;
    // End of variables declaration//GEN-END:variables
}
