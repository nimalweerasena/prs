package prs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frm_findDiagnose extends javax.swing.JInternalFrame {

    Frm_diagnose frm_Object;

    public Frm_findDiagnose() {
        initComponents();
        this.setTitle("Find Diagnose File - User : " + dbconnector.uname + "....");
        lbltitle.setText("Find Diagnose");
    }

    public Frm_findDiagnose(Frm_diagnose obj) {
        this.frm_Object = obj;
        initComponents();
        this.setTitle("Find Diagnose File - User : " + dbconnector.uname + "....");
        lbltitle.setText("Find Diagnose");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdisease = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtgroup = new javax.swing.JTextField();
        txtdisease1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnapply = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblchaptor = new javax.swing.JLabel();
        lblblock = new javax.swing.JLabel();
        lblttle = new javax.swing.JLabel();
        lblsubblock = new javax.swing.JLabel();
        lblsubblocktitle = new javax.swing.JLabel();
        lblimmr = new javax.swing.JLabel();
        lblimmrNo = new javax.swing.JLabel();

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

        lbltitle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle.setText("Diagnose");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Disease Group :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Disease Name :");

        txtdisease.setBackground(new java.awt.Color(244, 244, 204));
        txtdisease.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdisease.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtdisease.setMaximumSize(new java.awt.Dimension(2147483647, 21));
        txtdisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiseaseActionPerformed(evt);
            }
        });
        txtdisease.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdiseaseKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Search BY >>");

        txtgroup.setBackground(new java.awt.Color(244, 244, 204));
        txtgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgroupActionPerformed(evt);
            }
        });
        txtgroup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtgroupFocusLost(evt);
            }
        });
        txtgroup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgroupKeyReleased(evt);
            }
        });

        txtdisease1.setBackground(new java.awt.Color(244, 244, 204));
        txtdisease1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdisease1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtdisease1.setMaximumSize(new java.awt.Dimension(2147483647, 21));
        txtdisease1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdisease1KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Disease Name Any :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdisease, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(txtgroup)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdisease1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdisease1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnapply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnapply.setText("Apply");
        btnapply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapplyActionPerformed(evt);
            }
        });
        btnapply.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnapplyFocusLost(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(244, 244, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(226, 220, 220));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setLayout(new java.awt.GridLayout(7, 0));

        jLabel4.setText("Chapter :");
        jPanel3.add(jLabel4);

        jLabel5.setText("Block :");
        jPanel3.add(jLabel5);

        jLabel6.setText("Title :");
        jPanel3.add(jLabel6);

        jLabel7.setText("Subblock :");
        jPanel3.add(jLabel7);

        jLabel8.setText("Subblock Title :");
        jPanel3.add(jLabel8);

        jLabel9.setText("IMMR Group :");
        jPanel3.add(jLabel9);

        jLabel10.setText("IMMR No :");
        jPanel3.add(jLabel10);

        jPanel4.setLayout(new java.awt.GridLayout(7, 0));
        jPanel4.add(lblchaptor);
        jPanel4.add(lblblock);
        jPanel4.add(lblttle);
        jPanel4.add(lblsubblock);
        jPanel4.add(lblsubblocktitle);
        jPanel4.add(lblimmr);
        jPanel4.add(lblimmrNo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {75, 250};
        wans_javalib.Tables.setTableModel(executeQuery, jTable1, Tblmod, columnWidth);
      int RCount = voidmodule.RCount(query);
               if (RCount==0) {
                  DefaultTableModel addabl = (DefaultTableModel) jTable1.getModel();
            while (jTable1.getRowCount() > 0) {
                addabl.removeRow(0);
            }
        }
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
     this.setTitle("Diagnose Searching. User = " + dbconnector.uname);
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtdiseaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiseaseKeyReleased
        String name = txtdisease.getText();
        try {
            settblmdl("SELECT d_Group AS D_Group,d_disease AS Disease_Name from icd10_deasease WHERE d_disease LIKE'" + name + "%'ORDER BY d_Group  LIMIT 100 ");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_findDiagnose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtdiseaseKeyReleased

    private void txtgroupKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgroupKeyReleased
        String dgroup = txtgroup.getText();
        try {
            settblmdl("SELECT d_Group AS D_Group,d_disease AS Disease_Name from icd10_deasease WHERE d_Group LIKE'" + dgroup + "%'ORDER BY d_Group  LIMIT 100 ");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_findDiagnose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtgroupKeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int SelectedRow = jTable1.getSelectedRow();
        String Dgroup = jTable1.getValueAt(SelectedRow, 0).toString();
        txtgroup.setText(Dgroup);
    

        String query = ("SELECT icd10_immr.`d_Group` AS immr_d_Group,"
                +"icd10_immr.`d_immrNo` AS immrNo,"
                + "icd10_block.`d_Chapter` AS Chapter,"
                + "icd10_block.`d_block` AS block,"
                + "icd10_block.`d_Title` AS Title,"
                + "icd10_deasease.`d_disease` AS Dname,"
                + "icd10_subblock.`d_Subblock` AS Subblock,"
                + "icd10_subblock.`d_SubTitle` AS SubTitle FROM"
                + "`icd10_subblock` icd10_subblock INNER JOIN `icd10_deasease` icd10_deasease ON icd10_subblock.`d_Subblock` = icd10_deasease.`d_Subblock`"
                + "INNER JOIN `icd10_block` icd10_block ON icd10_subblock.`d_block` = icd10_block.`d_block`"
                + "INNER JOIN `icd10_immr` icd10_immr ON icd10_deasease.`d_immrNo` = icd10_immr.`d_immrNo`"
                + "WHERE icd10_deasease.`d_Group` ='" + Dgroup + "'");

        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);

            while (rs.next()) {
                txtdisease.setText(rs.getString("Dname"));
                lblchaptor.setText(rs.getString("Chapter"));
                lblblock.setText(rs.getString("block"));
                lblttle.setText(rs.getString("Title"));
                lblsubblock.setText(rs.getString("Subblock"));
                lblsubblocktitle.setText(rs.getString("SubTitle"));
                lblimmr.setText(rs.getString("immr_d_Group"));
                lblimmrNo.setText(rs.getString("immrNo"));


            }
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void txtgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgroupActionPerformed

    private void btnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyActionPerformed
        String Dgroup = txtgroup.getText();
        String diseasename = txtdisease.getText();
        frm_Object.txtDcode.setText(Dgroup);
        frm_Object.lblDname.setText(diseasename);
        dispose();
    }//GEN-LAST:event_btnapplyActionPerformed

    private void btnapplyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnapplyFocusLost
        String Dgroup = txtgroup.getText();
        String diseasename = txtdisease.getText();
        frm_Object.txtDcode.setText(Dgroup);
        frm_Object.lblDname.setText(diseasename);
        dispose();
    }//GEN-LAST:event_btnapplyFocusLost

    private void txtgroupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgroupFocusLost

        String Dgroup = txtgroup.getText();

        txtgroup.setText(Dgroup);


        String query = ("SELECT icd10_immr.`d_Group` AS immr_d_Group,"
                + "icd10_block.`d_Chapter` AS Chapter,"
                + "icd10_block.`d_block` AS block,"
                + "icd10_block.`d_Title` AS Title,"
                + "icd10_deasease.`d_disease` AS Dname,"
                + "icd10_subblock.`d_Subblock` AS Subblock,"
                + "icd10_subblock.`d_SubTitle` AS SubTitle FROM"
                + "`icd10_subblock` icd10_subblock INNER JOIN `icd10_deasease` icd10_deasease ON icd10_subblock.`d_Subblock` = icd10_deasease.`d_Subblock`"
                + "INNER JOIN `icd10_block` icd10_block ON icd10_subblock.`d_block` = icd10_block.`d_block`"
                + "INNER JOIN `icd10_immr` icd10_immr ON icd10_deasease.`d_immrNo` = icd10_immr.`d_immrNo`"
                + "WHERE icd10_deasease.`d_Group` ='" + Dgroup + "'");

        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);

            while (rs.next()) {
                txtdisease.setText(rs.getString("Dname"));
                lblchaptor.setText(rs.getString("Chapter"));
                lblblock.setText(rs.getString("block"));
                lblttle.setText(rs.getString("Title"));
                lblsubblock.setText(rs.getString("Subblock"));
                lblsubblocktitle.setText(rs.getString("SubTitle"));
                lblimmr.setText(rs.getString("immr_d_Group"));


            }
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_txtgroupFocusLost

    private void txtdisease1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdisease1KeyReleased
             String name = txtdisease1.getText();
        try {
            settblmdl("SELECT d_Group AS D_Group,d_disease AS Disease_Name from icd10_deasease WHERE d_disease LIKE'%" + name + "%'ORDER BY d_Group  LIMIT 100 ");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_findDiagnose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtdisease1KeyReleased

    private void txtdiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiseaseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblblock;
    private javax.swing.JLabel lblchaptor;
    private javax.swing.JLabel lblimmr;
    private javax.swing.JLabel lblimmrNo;
    private javax.swing.JLabel lblsubblock;
    private javax.swing.JLabel lblsubblocktitle;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblttle;
    private javax.swing.JTextField txtdisease;
    private javax.swing.JTextField txtdisease1;
    public javax.swing.JTextField txtgroup;
    // End of variables declaration//GEN-END:variables
}
