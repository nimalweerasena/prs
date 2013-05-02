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

public class Frm_ward extends javax.swing.JInternalFrame {

    public String User = null;

    public Frm_ward() {
        initComponents();

        this.setTitle("Ward Details File - User : " + dbconnector.uname + "....");
        lbltitle.setText("Ward Details File");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblward = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblscode = new javax.swing.JLabel();
        txtwordno = new javax.swing.JTextField();
        txtbeds = new javax.swing.JFormattedTextField();
        txtdescpton = new javax.swing.JTextField();
        txtincharge = new javax.swing.JTextField();
        lbltitle = new javax.swing.JLabel();

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

        tblward.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Code", "Ward No", "Description", "No of Beds", "Incharge"
            }
        ));
        tblward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblwardMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblward);
        tblward.getColumnModel().getColumn(1).setMinWidth(125);
        tblward.getColumnModel().getColumn(1).setPreferredWidth(125);
        tblward.getColumnModel().getColumn(1).setMaxWidth(125);
        tblward.getColumnModel().getColumn(3).setMinWidth(80);
        tblward.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblward.getColumnModel().getColumn(3).setMaxWidth(80);

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

        jPanel2.setLayout(new java.awt.GridLayout(5, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("S Code :");
        jPanel2.add(jLabel5);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ward /Dept/Section :");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Number of Beds :");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Description :");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name of the Incharge :");
        jPanel2.add(jLabel4);

        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        lblscode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblscode.setText("S Code");
        jPanel3.add(lblscode);

        txtwordno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtwordno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtwordnoKeyPressed(evt);
            }
        });
        jPanel3.add(txtwordno);

        txtbeds.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbedsKeyPressed(evt);
            }
        });
        jPanel3.add(txtbeds);

        txtdescpton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdescpton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescptonKeyPressed(evt);
            }
        });
        jPanel3.add(txtdescpton);

        txtincharge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtincharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinchargeKeyPressed(evt);
            }
        });
        jPanel3.add(txtincharge);

        lbltitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle.setText("Ward");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        String scode = lblscode.getText();
        String wordno = txtwordno.getText();
        String beds = txtbeds.getText();
        String descpton = txtdescpton.getText();
        String incharge = txtincharge.getText();



        try {


            int Count = voidmodule.RCount("SELECT w_scode from wards WHERE w_scode ='" + scode + "'");
            if (Count > 0) {
                int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                if (i == 0) {
                    dbconnector.insertquery("UPDATE wards SET  w_num = '" + wordno + "',w_beds = '" + beds + "',w_descriptn = '" + descpton + "',w_incharge = '" + incharge + "'WHERE w_scode ='" + scode + "'");

                } else {
                }
            } else {
                int max = voidmodule.getmax("SELECT w_scode from wards ORDER BY w_scode");
                dbconnector.insertquery("INSERT INTO wards VALUES ('" + max + "','" + wordno + "','" + descpton + "','" + beds + "','" + incharge + "')");
                JOptionPane.showMessageDialog(null, "Records Saved");
            }




            try {
                settblmdl("SELECT w_scode AS S_Code,w_num as Ward,w_descriptn as Descriptn,w_beds as No_Of_Beds,w_incharge as Ward_Incharge from wards ORDER BY w_scode");
            } catch (SQLException ex) {
                Logger.getLogger(Frm_ward.class.getName()).log(Level.SEVERE, null, ex);
            }


        } catch (SQLException ex) {
            Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
        }
voidmodule.U_transaction("user", "save_update wards "+wordno );
txtwordno.setText(null);
        txtbeds.setText(null);
        txtdescpton.setText(null);
        txtincharge.setText(null);

}//GEN-LAST:event_btnsaveActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_txtexitActionPerformed

    private void tblwardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblwardMouseReleased
        int SelectedRow = tblward.getSelectedRow();
        String code = tblward.getValueAt(SelectedRow, 0).toString();
        String Wno = tblward.getValueAt(SelectedRow, 1).toString();
        String dis = tblward.getValueAt(SelectedRow, 2).toString();
        int bed = Integer.parseInt(tblward.getValueAt(SelectedRow, 3).toString());
        String incger = tblward.getValueAt(SelectedRow, 4).toString();
        lblscode.setText(code);
        txtwordno.setText(Wno);
        txtbeds.setText("" + bed);
        txtdescpton.setText(dis);
        txtincharge.setText(incger);
        btnsave.setText("Update");
    }//GEN-LAST:event_tblwardMouseReleased

    private void txtwordnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwordnoKeyPressed
        if (evt.getKeyCode() == 10) {
            txtbeds.requestFocus();
        }
    }//GEN-LAST:event_txtwordnoKeyPressed

    private void txtbedsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbedsKeyPressed
        if (evt.getKeyCode() == 10) {
            txtdescpton.requestFocus();
        }
    }//GEN-LAST:event_txtbedsKeyPressed

    private void txtdescptonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescptonKeyPressed
        if (evt.getKeyCode() == 10) {
            txtincharge.requestFocus();
        }
    }//GEN-LAST:event_txtdescptonKeyPressed

    private void txtinchargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinchargeKeyPressed
        if (evt.getKeyCode() == 10) {
            btnsave.requestFocus();
        }
    }//GEN-LAST:event_txtinchargeKeyPressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            settblmdl("SELECT w_scode AS S_Code,w_num as Ward,w_descriptn as Descriptn,w_beds as No_Of_Beds,w_incharge as Ward_Incharge from wards ORDER BY w_scode");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_ward.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.setTitle("Ward File. User = " + dbconnector.uname);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        String scode = lblscode.getText();
        int i = MessageBox.yesno("Do You Want to Remove Item  " + scode);
        if (i == 0) {
            try {
                dbconnector.insertquery("DELETE FROM wards WHERE w_scode ='" + scode + "'");
                settblmdl("SELECT w_scode AS S_Code,w_num as Ward,w_descriptn as Descriptn,w_beds as No_Of_Beds,w_incharge as Ward_Incharge from wards ORDER BY w_scode");
voidmodule.U_transaction("user", "Delete "+scode );
            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnremoveActionPerformed
    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {60, 150, 350, 60, 200};
        wans_javalib.Tables.setTableModel(executeQuery, tblward, Tblmod, columnWidth);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblscode;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblward;
    private javax.swing.JFormattedTextField txtbeds;
    private javax.swing.JTextField txtdescpton;
    private javax.swing.JButton txtexit;
    private javax.swing.JTextField txtincharge;
    private javax.swing.JTextField txtwordno;
    // End of variables declaration//GEN-END:variables
}
