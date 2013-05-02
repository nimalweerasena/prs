package prs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmPIDsearch extends javax.swing.JInternalFrame {

    frm_Registry Object;
    Frm_diagnose Object1;
    Frm_admission Object2;
    Frm_wardtrans Object3;
    public boolean obj1;
    public boolean obj3;
    public boolean obj0;
    public boolean obj2;

    public frmPIDsearch() {
        initComponents();
    }

    public frmPIDsearch(frm_Registry fobj) {
        this.Object = fobj;
        initComponents();

    }

    public frmPIDsearch(Frm_diagnose fobj1) {
        this.Object1 = fobj1;
        initComponents();

    }

    public frmPIDsearch(Frm_admission fobj2) {
        this.Object2 = fobj2;
        initComponents();

    }

    public frmPIDsearch(Frm_wardtrans fobj3) {
        this.Object3 = fobj3;
        initComponents();

    }

    void settblmdl(String query) throws SQLException {
        Statement rss = dbconnector.conn().createStatement();
 
        ResultSet executeQuery = rss.executeQuery(query);
            int columnWidth[] = {150, 50, 90, 400};
            wans_javalib.Tables.setTableModel(executeQuery, tblPIDview, query, columnWidth);

        int RCount = voidmodule.RCount(query);
               if (RCount==0) {
                  DefaultTableModel addabl = (DefaultTableModel) tblPIDview.getModel();
            while (tblPIDview.getRowCount() > 0) {
                addabl.removeRow(0);
            }
        }

            lblrecords.setText("Number Of Records : " + RCount);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblttle = new javax.swing.JLabel();
        txtpidNum = new javax.swing.JTextField();
        btnapply = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPIDview = new javax.swing.JTable();
        lblrecords = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        lblttle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblttle.setText("Please Type PID Number Here");
        jPanel1.add(lblttle);

        txtpidNum.setBackground(new java.awt.Color(244, 244, 204));
        txtpidNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpidNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpidNumActionPerformed(evt);
            }
        });
        txtpidNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpidNumKeyReleased(evt);
            }
        });
        jPanel1.add(txtpidNum);

        btnapply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        tblPIDview.setBackground(new java.awt.Color(244, 244, 204));
        tblPIDview.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblPIDview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tblPIDview.setRowHeight(25);
        tblPIDview.setShowHorizontalLines(false);
        tblPIDview.setShowVerticalLines(false);
        tblPIDview.setSurrendersFocusOnKeystroke(true);
        tblPIDview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPIDviewMouseReleased(evt);
            }
        });
        tblPIDview.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPIDviewKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPIDview);

        lblrecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblrecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnexit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpidNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpidNumKeyReleased
        try {
            String PID = txtpidNum.getText();
            if (obj0 == false || obj2 == false) {

                this.settblmdl("SELECT pid AS PID_Num, title,init,name AS Name from register WHERE pid LIKE'" + PID + "%'LIMIT 100");

            } else if (obj3 == false) {
                this.settblmdl("SELECT admissions.`bhtno` AS BHT_No,"
                        + "register.`title` AS Title,"
                        + "register.`init` AS Initial,"
                        + "register.`name` AS Name FROM"
                        + "`admissions` admissions INNER JOIN `register` register ON admissions.`pidno` = register.`pid` WHERE admissions.`bhtno` LIKE'" + PID + "%'LIMIT 100");
            } else if (obj1 == false) {
                this.settblmdl("SELECT admissions.`bhtno` AS BHT_No,"
                        + "register.`title` AS Title,"
                        + "register.`init` AS Initial,"
                        + "register.`name` AS Name FROM"
                        + "`admissions` admissions INNER JOIN `register` register ON admissions.`pidno` = register.`pid`     LEFT OUTER JOIN `diagnose` diagnose ON admissions.`bhtno` = diagnose.`bhtno`Where  ifnull(diagnose.`bhtno`,'null') = 'null' AND admissions.`bhtno` LIKE'" + PID + "%'LIMIT 500");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmPIDsearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtpidNumKeyReleased

    private void tblPIDviewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPIDviewKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPIDviewKeyReleased

    private void tblPIDviewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPIDviewMouseReleased
        int SelectedRow = tblPIDview.getSelectedRow();
        txtpidNum.setText(tblPIDview.getValueAt(SelectedRow, 0).toString());


    }//GEN-LAST:event_tblPIDviewMouseReleased

    private void btnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyActionPerformed
        String SetpID = txtpidNum.getText();

        if (obj0 == false) {
            Object.lblPID.setText(SetpID);
            try {
                Object.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE PID LIKE'" + SetpID + "%' LIMIT 500");

            } catch (SQLException ex) {
                Logger.getLogger(frmPIDsearch.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (obj1 == false) {
            Object1.txtbht.setText(SetpID);
            Object1.registrydate(SetpID);
            Object1.txtdate.requestFocus();
            try {
                Object1.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel from diagnose WHERE bhtno LIKE'" + SetpID + "%' ORDER BY bhtno LIMIT 500");
            } catch (SQLException ex) {
                Logger.getLogger(Frm_findDiagnose.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (obj2 == false) {
            Object2.lblPID.setText(SetpID);
            try {
                Object2.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE pidno LIKE'" + SetpID + "%' LIMIT 500");
                Object2.newbht();
                Object2.tblvist(SetpID);
                Object2.viewregidate(SetpID);


            } catch (SQLException ex) {
                Logger.getLogger(frmPIDsearch.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (obj3 == false) {
            try {
                Object3.txtbht.setText(SetpID);
                Object3.settblmdl("SELECT sno AS S_No,bhtno AS BHT_No,to_w_num AS Tras_Ward,from_w_num as From_Ward from intertransfer WHERE bhtno LIKE'" + SetpID + "%'  ORDER BY sno ");
                Object3.registrydate(SetpID);
                Object3.txttransdate.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(frmPIDsearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dispose();
    }//GEN-LAST:event_btnapplyActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed

        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtpidNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpidNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpidNumActionPerformed

    private void btnapplyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnapplyFocusLost
        btnapplyActionPerformed(null);
    }//GEN-LAST:event_btnapplyFocusLost

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        this.setTitle("Search From. User = " + dbconnector.uname);
    }//GEN-LAST:event_formInternalFrameOpened
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapply;
    private javax.swing.JButton btnexit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblrecords;
    public javax.swing.JLabel lblttle;
    private javax.swing.JTable tblPIDview;
    public javax.swing.JTextField txtpidNum;
    // End of variables declaration//GEN-END:variables
}
