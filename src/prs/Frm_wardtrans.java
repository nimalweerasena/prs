package prs;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frm_wardtrans extends javax.swing.JInternalFrame {

    String crntdate;
     com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) dbconnector.c;

    public Frm_wardtrans() {
        initComponents();
        lblhoscode.setVisible(false);
        lblsno.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblinsname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPIDview = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtbht = new javax.swing.JTextField();
        lblPID = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblsex = new javax.swing.JLabel();
        txtage = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblsex4 = new javax.swing.JLabel();
        lblreligen = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblsex5 = new javax.swing.JLabel();
        txtregidate = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblsex1 = new javax.swing.JLabel();
        txtadmitdate = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblsex2 = new javax.swing.JLabel();
        txtadmitime = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblsex3 = new javax.swing.JLabel();
        txtward = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbtransward = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        btnBHTnum = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txttransdate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txttranstime = new javax.swing.JFormattedTextField();
        lblsno = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        optinter = new javax.swing.JRadioButton();
        optouet = new javax.swing.JRadioButton();
        lblhoscode = new javax.swing.JLabel();

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

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel12.setLayout(new java.awt.GridLayout(2, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Internal Ward Transferring");
        jPanel12.add(jLabel2);

        lblinsname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinsname.setForeground(new java.awt.Color(0, 0, 255));
        jPanel12.add(lblinsname);

        tblPIDview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPIDview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPIDviewMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPIDview);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel6.setLayout(new java.awt.GridLayout(9, 1));

        txtbht.setBackground(new java.awt.Color(244, 244, 204));
        txtbht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbht.setForeground(new java.awt.Color(102, 0, 0));
        txtbht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        txtbht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbhtFocusGained(evt);
            }
        });
        txtbht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbhtKeyReleased(evt);
            }
        });
        jPanel6.add(txtbht);

        lblPID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPID.setForeground(new java.awt.Color(102, 0, 0));
        lblPID.setText("PID");
        jPanel6.add(lblPID);

        lblname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 0, 0));
        lblname.setText("Name");
        jPanel6.add(lblname);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        lblsex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsex.setForeground(new java.awt.Color(102, 0, 0));
        lblsex.setText("Sex");
        jPanel3.add(lblsex);

        txtage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtage.setForeground(new java.awt.Color(102, 0, 0));
        txtage.setText("Age :");
        jPanel3.add(txtage);

        jPanel6.add(jPanel3);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        lblsex4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsex4.setForeground(new java.awt.Color(102, 0, 0));
        lblsex4.setText("Religion :");
        jPanel8.add(lblsex4);

        lblreligen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblreligen.setForeground(new java.awt.Color(102, 0, 0));
        lblreligen.setText("Religion :");
        jPanel8.add(lblreligen);

        jPanel6.add(jPanel8);

        jPanel10.setLayout(new java.awt.GridLayout(1, 2));

        lblsex5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsex5.setForeground(new java.awt.Color(102, 0, 0));
        lblsex5.setText("Registry Date");
        jPanel10.add(lblsex5);

        txtregidate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtregidate.setForeground(new java.awt.Color(102, 0, 0));
        txtregidate.setText("Registry Date");
        jPanel10.add(txtregidate);

        jPanel6.add(jPanel10);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        lblsex1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsex1.setForeground(new java.awt.Color(102, 0, 0));
        lblsex1.setText("Admitted Date :");
        jPanel4.add(lblsex1);

        txtadmitdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtadmitdate.setForeground(new java.awt.Color(102, 0, 0));
        txtadmitdate.setText("Admitted Date :");
        jPanel4.add(txtadmitdate);

        jPanel6.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        lblsex2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsex2.setForeground(new java.awt.Color(102, 0, 0));
        lblsex2.setText("Admitted Time :");
        jPanel5.add(lblsex2);

        txtadmitime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtadmitime.setForeground(new java.awt.Color(102, 0, 0));
        txtadmitime.setText("Time");
        jPanel5.add(txtadmitime);

        jPanel6.add(jPanel5);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        lblsex3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsex3.setForeground(new java.awt.Color(102, 0, 0));
        lblsex3.setText("Current Ward :");
        jPanel7.add(lblsex3);

        txtward.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtward.setForeground(new java.awt.Color(102, 0, 0));
        txtward.setText("Ward");
        jPanel7.add(txtward);

        jPanel6.add(jPanel7);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Transferred Ward :");

        cmbtransward.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbtransward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtranswardActionPerformed(evt);
            }
        });

        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnBHTnum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBHTnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New.gif"))); // NOI18N
        btnBHTnum.setText("New");
        btnBHTnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBHTnumActionPerformed(evt);
            }
        });
        jPanel9.add(btnBHTnum);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel9.add(btnSave);

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel9.add(btnRemove);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel9.add(btnExit);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Transferred  Date :");

        txttransdate.setBackground(new java.awt.Color(244, 244, 204));
        txttransdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        try {
            txttransdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAA-AA-AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttransdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttransdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttransdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttransdateFocusLost(evt);
            }
        });
        txttransdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttransdateKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Transferred  Time :");

        try {
            txttranstime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA:AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(optinter);
        optinter.setSelected(true);
        optinter.setText("Internal Transfer");
        optinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optinterActionPerformed(evt);
            }
        });
        jPanel11.add(optinter);

        buttonGroup1.add(optouet);
        optouet.setText("Outdoor Transfer");
        optouet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optouetActionPerformed(evt);
            }
        });
        jPanel11.add(optouet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttransdate)
                            .addComponent(txttranstime)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbtransward, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblhoscode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblsno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttransdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttranstime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbtransward, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblsno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblhoscode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbhtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbhtKeyReleased
        String PID = txtbht.getText();
        String bht = txtbht.getText();
        frmPIDsearch open = new frmPIDsearch(this);
        MDI.addFrame(open);
        open.setVisible(true);

        open.txtpidNum.setText(bht);
        open.lblttle.setText("Please Type BHT Number Here");
        open.obj1 = true;
        open.obj0 = true;
        open.obj2 = true;
        open.obj3 = false;

        lblsno.setText(null);

    }//GEN-LAST:event_txtbhtKeyReleased

    private void tblPIDviewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPIDviewMouseReleased
        txtadmitdate.setText(null);
        txtadmitime.setText(null);
        txttransdate.setText(null);
        txttranstime.setText(null);
        cmbtransward.setSelectedItem(null);
        txtward.setText(null);



        int SelectedRow = tblPIDview.getSelectedRow();
        Object sno = tblPIDview.getValueAt(SelectedRow, 0).toString();
        Object Fbht = tblPIDview.getValueAt(SelectedRow, 1).toString();
        lblsno.setText(sno.toString());

        this.registrydate(Fbht.toString());
        btnSave.setText("Update");


    }//GEN-LAST:event_tblPIDviewMouseReleased

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            voidmodule.fillcombo(cmbtransward, "SELECT DISTINCT w_num from wards ORDER BY w_num");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat dfT = new SimpleDateFormat("HH:mm");
            crntdate = df.format(new Date());
            txttransdate.setText(crntdate);
            txttranstime.setText(dfT.format(new Date()));
            txtbht.setText("Enter BHT No Here");
            cmbtransward.setSelectedItem(null);

            this.settblmdl("SELECT sno AS S_No,bhtno AS BHT_No,to_w_num AS Tras_Ward,from_w_num as From_Ward from intertransfer WHERE trans_date ='" + crntdate + "' ORDER BY sno ");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_wardtrans.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (optouet.isSelected()) {
            saveOutdoortrans();
        } else {
            saveIntrans();
        }


    }//GEN-LAST:event_btnSaveActionPerformed


    void saveIntrans() {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sysdate = df.format(new Date());
        String BHTnum = txtbht.getText();
//        String admissiondate = txtadmitdate.getText();
//        String admsntime = txtadmitime.getText();
        String transfdate = txttransdate.getText();
        String transftime = txttranstime.getText();
//        Object fromward = txtward.getText();
        Object toward = cmbtransward.getSelectedItem();
        String sno = lblsno.getText();
        String prevWard = txtward.getText();
        int wordsno = (voidmodule.getmax("SELECT sno from intertransfer WHERE bhtno ='" + BHTnum + "'ORDER BY sno"));
       
        if (!sno.equals("")) {
  
            try {
                dbconnector.insertquery("UPDATE intertransfer SET  sys_date = '" + sysdate + "',trans_date = '" + transfdate + "',trans_time = '" + transftime + "',to_w_num = '" + toward + "',from_w_num = '" + prevWard + "' WHERE sno ='" + sno + "'AND bhtno ='" + BHTnum + "'");
                this.settblmdl("SELECT sno AS S_No,bhtno AS BHT_No,to_w_num AS Tras_Ward,from_w_num as From_Ward from intertransfer WHERE trans_date ='" + crntdate + "' ORDER BY bhtno,sno ");
                JOptionPane.showMessageDialog(null, "Update Completed...");
            } catch (SQLException ex) {
                Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                dbconnector.insertquery("INSERT INTO intertransfer VALUES ('" + wordsno + "','" + BHTnum + "','" + sysdate + "','" + transfdate + "','" + transftime + "','" + prevWard + "','" + toward + "')");

                JOptionPane.showMessageDialog(null, "Records Saved...");
                voidmodule.U_transaction("user", "save_update current ward  " + BHTnum);
                this.settblmdl("SELECT sno AS S_No,bhtno AS BHT_No,to_w_num AS Tras_Ward,from_w_num as From_Ward from intertransfer WHERE trans_date ='" + crntdate + "' ORDER BY bhtno,sno  ");
            } catch (SQLException ex) {
                Logger.getLogger(Frm_wardtrans.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        currentdetails();
    }
    
    void saveOutdoortrans() {
    String BHT = txtbht.getText();
    String disease_Grroup = "";
    String Diag_date = txttransdate.getText();
    String Diag_time = txttranstime.getText();
    String hospid = lblhoscode.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String sysdate = df.format(new Date());
   
        String pidadd = ("PID");
        if (!lblPID.getText().equals(pidadd)) {
            try {
                int Count = voidmodule.RCount("SELECT bhtno from diagnose WHERE bhtno ='" + BHT + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        try {
                            //SELECT d.`bhtno`, d.`d_group`, d.`dis_code`, d.`dis_date`, d.`dis_time`, d.`med_legel` FROM diagnose d;
                            dbconnector.insertquery("UPDATE diagnose SET  dis_code = '" + "3" + "',dis_date = '" + Diag_date + "',dis_time = '" + Diag_time + "',hospid = '" + hospid + "'WHERE bhtno ='" + BHT + "'");

                            this.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose WHERE bhtno ='" + BHT + "' ORDER BY bhtno LIMIT 100");
                        } catch (SQLException ex) {
                            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                    }
                } else {


                    try {
                        String sql = "SELECT `bhtno` FROM `immr`.`admissions` where bhtno = '" + BHT + "'";
                        //    Connection conn = (Connection) dbconnector.conn();
                        Object dblookupFromSql = wans_javalib.DBFunctions.dblookupFromSql(con, sql);
                        if (dblookupFromSql == null) {
                            JOptionPane.showMessageDialog(rootPane, "Invalid BHT Number ");
                        } else {
                            dbconnector.insertquery("INSERT INTO diagnose VALUES ('" + BHT + "','" + disease_Grroup + "','" + "3" + "','" + sysdate + "','" + Diag_date + "','" + Diag_time + "','" + "0" + "','" + hospid + "')");
                            JOptionPane.showMessageDialog(null, "Records Saved");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Record not  Saved \n some invalid data found");
                    }

                    try {

                        this.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose WHERE bhtno ='" + BHT + "' ORDER BY bhtno LIMIT 100");
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                txtbht.requestFocus();
            } catch (SQLException ex) {
                Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            MessageBox.ok("No  PID Number ");
        }
        txtbht.requestFocus();
        voidmodule.U_transaction("user", "save_update diagnose  " + BHT);
    
    }
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        String BHT = txtbht.getText();
        String sno = lblsno.getText();
        int i = MessageBox.yesno("Do You Want to Delete   " + BHT);
        if (i == 0) {
            try {

                dbconnector.insertquery("DELETE FROM intertransfer WHERE bhtno ='" + BHT + "'AND sno ='" + sno + "'");
                voidmodule.U_transaction("user", "Removed   ward No " + BHT);
                try {
                    this.settblmdl("SELECT sno AS S_No,bhtno AS BHT_No,to_w_num AS Tras_Ward,from_w_num as From_Ward from intertransfer WHERE trans_date ='" + crntdate + "' ORDER BY bhtno,sno  ");
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txttransdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttransdateFocusLost
   }//GEN-LAST:event_txttransdateFocusLost

    private void txttransdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttransdateKeyReleased
        String date = txttransdate.getText();
        try {
            this.settblmdl("SELECT sno AS S_No,bhtno AS BHT_No,to_w_num AS Tras_Ward,from_w_num as From_Ward from intertransfer WHERE trans_date ='" + crntdate + "' ORDER BY bhtno,sno  ");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txttransdateKeyReleased

    private void txtbhtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbhtFocusGained
        txtbht.setSelectionStart(0);
    }//GEN-LAST:event_txtbhtFocusGained

    private void txttransdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttransdateFocusGained
        txttransdate.setSelectionStart(4);
        txttransdate.setSelectionColor(Color.red);
    }//GEN-LAST:event_txttransdateFocusGained

    private void btnBHTnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBHTnumActionPerformed
        DefaultTableModel addabl = (DefaultTableModel) tblPIDview.getModel();
        while (tblPIDview.getRowCount() > 0) {
            addabl.removeRow(0);
        }
        lblsno.setText("");
        btnSave.setText("Save");

    }//GEN-LAST:event_btnBHTnumActionPerformed

    private void optinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optinterActionPerformed
        voidmodule.fillcombo(cmbtransward, "SELECT DISTINCT w_num from wards ORDER BY w_num");
    }//GEN-LAST:event_optinterActionPerformed

    private void optouetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optouetActionPerformed
        voidmodule.fillcombo(cmbtransward, "SELECT DISTINCT name from hospital ORDER BY name");
    }//GEN-LAST:event_optouetActionPerformed

    private void cmbtranswardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtranswardActionPerformed
      
        Object hosname = cmbtransward.getSelectedItem();
        String sql = "SELECT sno from hospital WHERE name = '" + hosname + "'";
        lblhoscode.setText(voidmodule.Out_fieldResulr(sql));
    }//GEN-LAST:event_cmbtranswardActionPerformed
    public void registrydate(String PID) {
        String Fbht = null;
        String dgroup = null;
        String sno = lblsno.getText();
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT admissions.`bhtno` AS BHT_No,"
                    + "admissions.`age_Y` AS y,"
                    + "admissions.`age_M` AS m,"
                    + "admissions.`age_D` AS d,"
                    + "admissions.`adm_date` AS admdate,"
                    + "admissions.`adm_time` AS admtime,"
                    + "admissions.`w_num` AS wnum,"
                    + "register.`pid` AS PIDno,"
                    + "register.`title` AS Title,"
                    + "register.`init` AS Initial,"
                    + "register.`name` AS Name, "
                    + "register.`sex` AS Sex, "
                    + "register.`religion` AS Religion, "
                    + "register.`regidate` AS Registry_date FROM"
                    + "`admissions` admissions INNER JOIN `register` register ON admissions.`pidno` = register.`pid` WHERE admissions.`bhtno` LIKE'" + PID + "%'LIMIT 100");


            while (rs.next()) {
                Fbht = (rs.getString("BHT_No"));
                txtbht.setText(Fbht);
                lblPID.setText(rs.getString("PIDno"));
                lblname.setText("Name : " + rs.getString("Title") + " " + rs.getString("Initial") + " " + rs.getString("Name"));
                lblsex.setText("Sex : " + rs.getString("Sex"));
                txtage.setText("Age : " + rs.getString("y") + "-" + rs.getString("m") + "-" + rs.getString("d"));
                lblreligen.setText(rs.getString("Religion"));
                txtregidate.setText(rs.getString("Registry_date"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        //
        currentdetails();
    }

    void currentdetails() {
        String bht = txtbht.getText();
        Connection con = (Connection) dbconnector.conn();
        String sql4 = "SELECT a.`bhtno`, a.`w_num` as ward, a.`adm_date` as curdate1, a.`adm_time`as curtime1 FROM admissions a where a.`bhtno` = '" + bht + "'   union all SELECT i.`bhtno`, i.`to_w_num` as ward, i.`trans_date`as curdate1, i.`trans_time` as curtime1 FROM intertransfer i where i.`bhtno` = '" + bht + "' order by curdate1, curtime1 asc";
        try {
            //  Object dblastFromSql = wans_javalib.DBFunctions.dblastFromSql(con, sql4);
            ResultSet rs = dbconnector.Sql_OutResultset(sql4);

            while (rs.next()) {
                txtward.setText(rs.getString("ward"));
                txtadmitdate.setText(rs.getString("curdate1"));
                txtadmitime.setText(rs.getString("curtime1"));

            }


        } catch (SQLException ex) {
            Logger.getLogger(Frm_wardtrans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void settblmdl(String query) throws SQLException {
        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = (query);
        ResultSet executeQuery = rss.executeQuery(Tblmod);
        int columnWidth[] = {60, 100, 90, 75};
        wans_javalib.Tables.setTableModel(executeQuery, tblPIDview, Tblmod, columnWidth);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBHTnum;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox cmbtransward;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblPID;
    private javax.swing.JLabel lblhoscode;
    private javax.swing.JLabel lblinsname;
    public javax.swing.JLabel lblname;
    public javax.swing.JLabel lblreligen;
    public javax.swing.JLabel lblsex;
    public javax.swing.JLabel lblsex1;
    public javax.swing.JLabel lblsex2;
    public javax.swing.JLabel lblsex3;
    public javax.swing.JLabel lblsex4;
    public javax.swing.JLabel lblsex5;
    private javax.swing.JLabel lblsno;
    private javax.swing.JRadioButton optinter;
    private javax.swing.JRadioButton optouet;
    private javax.swing.JTable tblPIDview;
    public javax.swing.JLabel txtadmitdate;
    public javax.swing.JLabel txtadmitime;
    private javax.swing.JLabel txtage;
    public javax.swing.JTextField txtbht;
    public javax.swing.JLabel txtregidate;
    public javax.swing.JFormattedTextField txttransdate;
    private javax.swing.JFormattedTextField txttranstime;
    public javax.swing.JLabel txtward;
    // End of variables declaration//GEN-END:variables
}
