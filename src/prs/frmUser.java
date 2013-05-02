//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package prs;

import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;
import org.eclipse.persistence.sessions.Project;
import wans_javalib.wans_MetaData;

public final class frmUser extends javax.swing.JInternalFrame {

    public int rsCount;
    public String FUser = null;

    public frmUser() {
        initComponents();

        String a = voidmodule.readintitution(null);
        this.setTitle(a + "     User Creation");
        this.review();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WardSection = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnnewuser = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cmbtype = new javax.swing.JComboBox();
        txtuser = new javax.swing.JTextField();
        txtpasswrd = new javax.swing.JPasswordField();
        txtverpasswrd = new javax.swing.JPasswordField();
        txthint = new javax.swing.JTextField();
        txtsadmin = new javax.swing.JPasswordField();
        txtspasswrd = new javax.swing.JPasswordField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtemail = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtcontact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkua = new javax.swing.JCheckBox();
        btnApply = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        lblname1 = new javax.swing.JLabel();
        chkupdate = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblitemlist = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblselectlist = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblname2 = new javax.swing.JLabel();
        btnApply1 = new javax.swing.JButton();
        btnexit2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnnewuser.setText("Create New User");
        btnnewuser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnnewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewuserActionPerformed(evt);
            }
        });

        jPanel8.setLayout(new java.awt.GridLayout(7, 0));

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Doctor", "Laboratory", "MRO", "User" }));
        cmbtype.setOpaque(false);
        jPanel8.add(cmbtype);
        jPanel8.add(txtuser);

        txtpasswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswrdActionPerformed(evt);
            }
        });
        txtpasswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswrdFocusLost(evt);
            }
        });
        jPanel8.add(txtpasswrd);

        txtverpasswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtverpasswrdFocusLost(evt);
            }
        });
        jPanel8.add(txtverpasswrd);
        jPanel8.add(txthint);

        txtsadmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsadminFocusLost(evt);
            }
        });
        jPanel8.add(txtsadmin);

        txtspasswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtspasswrdFocusLost(evt);
            }
        });
        jPanel8.add(txtspasswrd);

        jPanel9.setLayout(new java.awt.GridLayout(7, 0));

        jLabel9.setText("Type");
        jPanel9.add(jLabel9);

        jLabel10.setText("User  Name");
        jPanel9.add(jLabel10);

        jLabel11.setText("Passward");
        jPanel9.add(jLabel11);

        jLabel12.setText("Verify Passward");
        jPanel9.add(jLabel12);

        jLabel13.setText("Password Hint");
        jPanel9.add(jLabel13);

        jLabel18.setText("Server admin");
        jPanel9.add(jLabel18);

        jLabel17.setText("Server Passward");
        jPanel9.add(jLabel17);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnnewuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnnewuser, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("To Select User Click Here");

        tbluser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbluser.setForeground(new java.awt.Color(255, 102, 0));
        tbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User List"
            }
        ));
        tbluser.setShowHorizontalLines(false);
        tbluser.setShowVerticalLines(false);
        tbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbluserMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbluser);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.setPreferredSize(new java.awt.Dimension(43, 21));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        jLabel2.setText("e-mail");

        jLabel14.setText("Full Name");

        jLabel16.setText("Contact");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User's Personal Information");

        jLabel15.setText("Address");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addGap(86, 86, 86))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtemail)
                            .addComponent(txtcontact)
                            .addComponent(txtfullname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        WardSection.addTab("Create New User", jPanel2);

        chkua.setText("User Activation");

        btnApply.setText("Apply");
        btnApply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit1.setText("Exit");
        btnexit1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        lblname1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblname1.setForeground(new java.awt.Color(102, 204, 255));
        lblname1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname1.setText("User Name");

        chkupdate.setText("Update");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 464, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblname1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(chkua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkupdate))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblname1)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        WardSection.addTab("Activation", jPanel3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("System Privileges Setting");

        jLabel6.setText("Available Privileges");

        tblitemlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane5.setViewportView(tblitemlist);

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Add ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblselectlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane3.setViewportView(tblselectlist);

        jLabel7.setText("Selected  Privileges");

        lblname2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblname2.setForeground(new java.awt.Color(102, 204, 255));
        lblname2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname2.setText("User Name");

        btnApply1.setText("Apply");
        btnApply1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApply1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApply1ActionPerformed(evt);
            }
        });

        btnexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit2.setText("Exit");
        btnexit2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(btnApply1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApply1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addGap(0, 188, Short.MAX_VALUE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGap(75, 75, 75)))
        );

        WardSection.addTab("Privileges ", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WardSection, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(WardSection, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexit1ActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed

        dbconnector.conn();
        try {
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String sysdate = df.format(date);

            DateFormat df2 = new SimpleDateFormat("HH:mm");
            String time = df2.format(date);



            String user = txtuser.getText();
            String ua = null;
            if (chkua.isSelected() == true) {
                ua = "1";
            } else {
                ua = "0";
            }

            String setupdate = null;
            if (chkupdate.isSelected() == true) {
                setupdate = "1";
            } else {
                setupdate = "0";
            }


            user = txtuser.getText();
            this.labfind("SELECT user from user_general WHERE user ='" + user + "'");
            if (rsCount > 0) {
                int i = MessageBox.yesno(user + "  .. is Already Exist. Do you want to Edit ?");
                if (i == 0) {
                    dbconnector.insertquery("UPDATE user_general SET  user = '" + user + "',mdfDate = '" + sysdate + "', time = '" + time + "', setupdate = '" + setupdate + "',ua = '" + ua + "'WHERE user ='" + user + "'");
                }
            } else {
                dbconnector.insertquery("INSERT INTO user_general VALUES ('" + user + "','" + sysdate + "','" + sysdate + "','" + time + "','" + setupdate + "','" + ua + "')");
            }
        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnnewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewuserActionPerformed
        txtpasswrd.setEditable(true);
        txtverpasswrd.setEditable(true);


        cmbtype.setSelectedItem(null);
        txtuser.setText(null);
        txtpasswrd.setText(null);
        txtverpasswrd.setText(null);
        txthint.setText(null);
        txtfullname.setText(null);
        txtaddress.setText(null);
        txtcontact.setText(null);
        txtemail.setText(null);
}//GEN-LAST:event_btnnewuserActionPerformed

    private void tbluserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserMouseReleased
        txtpasswrd.setEditable(false);
        txtverpasswrd.setEditable(false);

        int SelectedRow = tbluser.getSelectedRow();

        FUser = tbluser.getValueAt(SelectedRow, 0).toString();


        Object type = null;
        String user = null;
        String passwrd = null;
        String verpasswrd = null;
        String spasswrd = null;
        String hint = null;
        String fullname = null;
        String address = null;
        String contact = null;
        String email = null;
        String admin = null;


        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * from user WHERE user ='" + FUser + "'");


            while (rs.next()) {


                type = (rs.getObject("type"));
                user = (rs.getString("user"));
                passwrd = (rs.getString("passwrd"));
                verpasswrd = (rs.getString("verpasswrd"));
                hint = (rs.getString("hint"));
                fullname = (rs.getString("fullname"));
                address = (rs.getString("address"));
                contact = (rs.getString("contact"));
                email = (rs.getString("email"));
                admin = (rs.getString("sadmin"));
                spasswrd = (rs.getString("selpasswrd"));
            }

            cmbtype.setSelectedItem(type);
            txtuser.setText(user);
            txtpasswrd.setText(passwrd);
            txtverpasswrd.setText(verpasswrd);
            txtspasswrd.setText(spasswrd);
            txthint.setText(hint);
            txtfullname.setText(fullname);
            txtaddress.setText(address);
            txtcontact.setText(contact);
            txtemail.setText(email);
            lblname2.setText(user);



            this.setgeneral();


        } catch (Exception ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            settblmdl("SELECT DISTINCT cmmd_Name AS Selected_List  from user_privilage WHERE user ='" + user + "'ORDER BY cmmd_Name");
            settblmdl2("SELECT cmmd_Name AS Aveilable_List  from privilage ORDER BY cmmd_Name");
        } catch (SQLException ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        additemcode();
    }//GEN-LAST:event_tbluserMouseReleased

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        dbconnector.conn();
        try {
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String sysdate = df.format(date);

            DateFormat df2 = new SimpleDateFormat("HH:mm");
            String time = df2.format(date);



            Object type = cmbtype.getSelectedItem();
            String user = txtuser.getText();
            String passwrd = txtpasswrd.getText();
            String verpasswrd = txtverpasswrd.getText();
            String spasswrd = txtspasswrd.getText();
            String hint = txthint.getText();
            String fullname = txtfullname.getText();
            String address = txtaddress.getText();
            String contact = txtcontact.getText();
            String email = txtemail.getText();
            String admin = txtsadmin.getText();



            this.labfind("SELECT user from user WHERE user ='" + user + "'");
            if (rsCount > 0) {
                int i = MessageBox.yesno(user + "  .. is Already Exist. Do you want to Edit ?");
                if (i == 0) {
                    dbconnector.insertquery("UPDATE user SET  type = '" + type + "',user = '" + user + "', passwrd = PASSWORD('" + passwrd + "'), verpasswrd = PASSWORD('" + verpasswrd + "'), hint = '" + hint + "',fullname = '" + fullname + "', address = '" + address + "', contact = '" + contact + "', email = '" + email + "', mdfDate = '" + sysdate + "', time = '" + time + "', sadmin = '" + admin + "', selpasswrd = PASSWORD('" + spasswrd + "')WHERE user ='" + user + "'");
                    voidmodule.U_transaction(user, "Update User   " + user);
                }
            } else {

                dbconnector.insertquery("INSERT INTO user VALUES ('" + type + "','" + user + "',PASSWORD('" + passwrd + "'),PASSWORD('" + verpasswrd + "'),'" + hint + "','" + fullname + "','" + address + "','" + contact + "','" + email + "','" + sysdate + "','" + sysdate + "','" + time + "','" + admin + "',PASSWORD('" + spasswrd + "'))");
                voidmodule.U_transaction(user, "Create new User   " + user);
            }

            this.btnApplyActionPerformed(null);


            cmbtype.setSelectedItem(null);
            txtuser.setText(null);
            txtpasswrd.setText(null);
            txtverpasswrd.setText(null);
            txtspasswrd.setText(null);
            txtsadmin.setText(null);
            txthint.setText(null);
            txtfullname.setText(null);
            txtaddress.setText(null);
            txtcontact.setText(null);
            txtemail.setText(null);

            this.review();


        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
}//GEN-LAST:event_btnsaveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void txtverpasswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtverpasswrdFocusLost
        String passwrd = txtpasswrd.getText();
        String Vpasswrd = txtverpasswrd.getText();
        if (!passwrd.equals(Vpasswrd)) {
            JOptionPane.showMessageDialog(null, "Incorrect passward");
            txtpasswrd.requestFocus();
        }
    }//GEN-LAST:event_txtverpasswrdFocusLost

    private void txtpasswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswrdFocusLost
        String passwrd = txtpasswrd.getText();
        String Vpasswrd = txtverpasswrd.getText();
        if (Vpasswrd.equals("")) {
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect passward");
            txtverpasswrd.requestFocus();
        }
}//GEN-LAST:event_txtpasswrdFocusLost

    private void txtpasswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswrdActionPerformed
        //  cmbdrugs.setSelectedItem(x);
        //  txtdose.requestFocus();
}//GEN-LAST:event_txtpasswrdActionPerformed

    private void txtspasswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtspasswrdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspasswrdFocusLost

    private void txtsadminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsadminFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsadminFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int SelectedRow = tblitemlist.getSelectedRow();
        String name = tblitemlist.getValueAt(SelectedRow, 0).toString();


        DefaultTableModel to = (DefaultTableModel) tblselectlist.getModel();
        to.addRow(new Object[]{name});
        DefaultTableModel from = (DefaultTableModel) tblitemlist.getModel();
        from.removeRow(SelectedRow);
    }//GEN-LAST:event_jButton1ActionPerformed
    void additemcode() {
        String comp = null;
        String selectcomp = null;
        int Rcount = tblselectlist.getRowCount();
        for (int xx = 0; xx < Rcount; xx++) {
            try {
                selectcomp = tblselectlist.getValueAt(xx, 0).toString();

                int RRcount = tblitemlist.getRowCount();
                for (int x = 0; x < RRcount; x++) {
                    comp = tblitemlist.getValueAt(x, 0).toString();
                    if (comp == null ? (selectcomp) == null : comp.equals(selectcomp)) {
                        DefaultTableModel to = (DefaultTableModel) tblitemlist.getModel();
                        to.removeRow(x);
                    }
                }

            } catch (ArrayIndexOutOfBoundsException ex) {
                //   Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void settblmdl(String query) throws SQLException {

        DefaultTableModel addabl = (DefaultTableModel) tblselectlist.getModel();
        while (tblselectlist.getRowCount() > 0) {
            addabl.removeRow(0);
        }
        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {60};
        wans_javalib.Tables.setTableModel(executeQuery, tblselectlist, Tblmod, columnWidth);


    }

    void settblmdl2(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {60};
        wans_javalib.Tables.setTableModel(executeQuery, tblitemlist, Tblmod, columnWidth);

    }

    private void btnApply1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApply1ActionPerformed
        try {
            dbconnector.insertquery("DELETE FROM user_privilage WHERE user ='" + FUser + "'");
            int tblRcount = tblselectlist.getRowCount();
            String user = null;
            String cmmdName = null;
            String menuindex = null;
            String compindex = null;
            for (int xx = 0; xx < tblRcount; xx++) {
                String comp = tblselectlist.getValueAt(xx, 0).toString();
                String strsql = "select * FROM privilage WHERE cmmd_Name ='" + comp + "'";
                ResultSet rs = dbconnector.Sql_OutResultset(strsql);
                while (rs.next()) {
                    cmmdName = rs.getString("cmmd_Name");
                    menuindex = rs.getString("menu_index");
                    compindex = rs.getString("comp_index");
                    dbconnector.insertquery("INSERT INTO user_privilage VALUES ('" + FUser + "','" + cmmdName + "','" + menuindex + "','" + compindex + "')");

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(frm_UserPrevilage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);

        }

        JOptionPane.showMessageDialog(null, "Updates are Completed..");
    }//GEN-LAST:event_btnApply1ActionPerformed

    private void btnexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnexit2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int SelectedRow = tblselectlist.getSelectedRow();
        String name = tblselectlist.getValueAt(SelectedRow, 0).toString();


        DefaultTableModel to = (DefaultTableModel) tblitemlist.getModel();
        to.addRow(new Object[]{name});
        DefaultTableModel from = (DefaultTableModel) tblselectlist.getModel();
        from.removeRow(SelectedRow);
    }//GEN-LAST:event_jButton2ActionPerformed

    void labfind(String query) {

        try {
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            rs.last();
            rsCount = rs.getRow();
        } catch (Exception ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void review() {
        String user = null;
        DefaultTableModel addabl = (DefaultTableModel) tbluser.getModel();
        while (tbluser.getRowCount() > 0) {
            addabl.removeRow(0);
        }
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT user FROM  user ORDER BY user");
            while (rs.next()) {
                user = rs.getString("user");
                addabl.addRow(new Object[]{user});
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setgeneral() {
        String user = null;
        String ua = null;
        String up = null;
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * from user_general WHERE user ='" + FUser + "'");


            while (rs.next()) {
                user = (rs.getString("user"));
                ua = (rs.getString("ua"));
                up = (rs.getString("setupdate"));

            }
            lblname1.setText(user);

            String xy = "1";
            if (ua.equals(xy)) {
                chkua.setSelected(true);
            } else {
                chkua.setSelected(false);
                JOptionPane.showMessageDialog(null, "You Do't have Activated or Incorrect User Name..");
            }
            String upp = "1";
            if (up.equals(upp)) {
                chkupdate.setSelected(true);
            } else {
                chkupdate.setSelected(false);
            }

        } catch (Exception ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane WardSection;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnApply1;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnexit1;
    private javax.swing.JButton btnexit2;
    private javax.swing.JButton btnnewuser;
    private javax.swing.JButton btnsave;
    private javax.swing.JCheckBox chkua;
    private javax.swing.JCheckBox chkupdate;
    private javax.swing.JComboBox cmbtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblname2;
    private javax.swing.JTable tblitemlist;
    private javax.swing.JTable tblselectlist;
    private javax.swing.JTable tbluser;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txthint;
    private javax.swing.JPasswordField txtpasswrd;
    private javax.swing.JPasswordField txtsadmin;
    private javax.swing.JPasswordField txtspasswrd;
    private javax.swing.JTextField txtuser;
    private javax.swing.JPasswordField txtverpasswrd;
    // End of variables declaration//GEN-END:variables
}
