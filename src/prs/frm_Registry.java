/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

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

/**
 *
 * @author NIMAL
 */
public class frm_Registry extends javax.swing.JInternalFrame {

    String regidate;
    String PIDnum;
    int sno;
    Object Title;
    String Initial;
    String Lname;
    String nic;
    String dob;
    Object sex;
    Object Religion;
    
 

    public frm_Registry() {
        initComponents();
        voidmodule.fillcombo(cmbReligion, "SELECT religion from religion ORDER BY religion");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formatdate = df.format(new Date());
        txtdate.setText(formatdate);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblregistry = new javax.swing.JTable();
        lblrecords = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblinsname = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnPIDnum = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAdmission = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnDateSearch = new javax.swing.JButton();
        btnPIDSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnNewpid7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtdate = new javax.swing.JFormattedTextField();
        lblPID = new javax.swing.JTextField();
        cmbTitle = new javax.swing.JComboBox();
        txtInitial = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtnic = new javax.swing.JFormattedTextField();
        txtdob = new javax.swing.JFormattedTextField();
        cmbsex = new javax.swing.JComboBox();
        cmbReligion = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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

        tblregistry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblregistry.setRowHeight(25);
        tblregistry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblregistryMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblregistry);

        lblrecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(721, 721, 721)
                        .addComponent(lblrecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblrecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblinsname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinsname.setForeground(new java.awt.Color(0, 51, 204));
        lblinsname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblinsname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblinsname.setAutoscrolls(true);
        lblinsname.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loggind.jpg"))); // NOI18N

        jPanel7.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnPIDnum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPIDnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New.gif"))); // NOI18N
        btnPIDnum.setText("New PID ");
        btnPIDnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIDnumActionPerformed(evt);
            }
        });
        jPanel7.add(btnPIDnum);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });
        jPanel7.add(btnSave);

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel7.add(btnRemove);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel7.add(btnExit);

        btnAdmission.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/57.gif"))); // NOI18N
        btnAdmission.setText("Admission>>");
        btnAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmissionActionPerformed(evt);
            }
        });
        jPanel7.add(btnAdmission);

        jPanel6.setLayout(new java.awt.GridLayout(9, 0));

        btnDateSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        btnDateSearch.setText("Search");
        btnDateSearch.setToolTipText("To view the register data for a selected date\nChange the date and press Search");
        btnDateSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateSearchActionPerformed(evt);
            }
        });
        jPanel6.add(btnDateSearch);

        btnPIDSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        btnPIDSearch.setText("Search");
        btnPIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIDSearchActionPerformed(evt);
            }
        });
        jPanel6.add(btnPIDSearch);
        jPanel6.add(jLabel11);
        jPanel6.add(jLabel13);
        jPanel6.add(jLabel14);
        jPanel6.add(jLabel15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("YYYY-MM-DD");
        jPanel6.add(jLabel12);
        jPanel6.add(jLabel18);

        btnNewpid7.setText("Add New");
        btnNewpid7.setToolTipText("when you come across a new religion you can add the record by this");
        btnNewpid7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewpid7ActionPerformed(evt);
            }
        });
        jPanel6.add(btnNewpid7);

        jPanel4.setLayout(new java.awt.GridLayout(9, 0));

        txtdate.setBackground(new java.awt.Color(244, 244, 204));
        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        try {
            txtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAA-AA-AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdateFocusGained(evt);
            }
        });
        jPanel4.add(txtdate);

        lblPID.setBackground(new java.awt.Color(244, 244, 204));
        lblPID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPID.setForeground(new java.awt.Color(153, 51, 0));
        lblPID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        lblPID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPIDKeyReleased(evt);
            }
        });
        jPanel4.add(lblPID);

        cmbTitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr", "Mrs", "Ms", "Dr", "Reve", "Baby" }));
        jPanel4.add(cmbTitle);

        txtInitial.setBackground(new java.awt.Color(244, 244, 204));
        txtInitial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInitial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        txtInitial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInitialKeyReleased(evt);
            }
        });
        jPanel4.add(txtInitial);

        txtLname.setBackground(new java.awt.Color(244, 244, 204));
        txtLname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLnameKeyReleased(evt);
            }
        });
        jPanel4.add(txtLname);

        txtnic.setBackground(new java.awt.Color(244, 244, 204));
        txtnic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        try {
            txtnic.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtnic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnicFocusGained(evt);
            }
        });
        txtnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnicKeyReleased(evt);
            }
        });
        jPanel4.add(txtnic);

        try {
            txtdob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txtdob);

        cmbsex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbsex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jPanel4.add(cmbsex);

        cmbReligion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbReligion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbReligionKeyPressed(evt);
            }
        });
        jPanel4.add(cmbReligion);

        jPanel3.setLayout(new java.awt.GridLayout(9, 0));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Registry Date :");
        jPanel3.add(jLabel17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PID Num :");
        jPanel3.add(jLabel3);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Title :");
        jPanel3.add(jLabel10);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Initial :");
        jPanel3.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Last Name :");
        jPanel3.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("N.I.C. No :");
        jPanel3.add(jLabel6);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Date of Birth :");
        jPanel3.add(jLabel9);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sex :");
        jPanel3.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Religion :");
        jPanel3.add(jLabel8);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("InDoor Patients");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Registration");
        jPanel2.add(jLabel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(274, 274, 274))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(lblinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addGap(2, 2, 2)
                        .addComponent(lblinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPIDnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIDnumActionPerformed
        lblPID.setText("New PID");
        //  String newpid = nf1.format(sno);

        cmbTitle.setSelectedItem(null);
        txtInitial.setText(null);
        txtLname.setText(null);
        txtnic.setText(null);
        txtdob.setText(null);
        cmbsex.setSelectedItem(null);
        cmbReligion.setSelectedItem(null);

        btnSave.setText("Save");

        txtdate.setSelectionStart(0);
        txtdate.setSelectionColor(Color.red);
        txtdate.requestFocus();

        varible();

    }//GEN-LAST:event_btnPIDnumActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblregistryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblregistryMouseReleased
        this.btnPIDnumActionPerformed(null);

        int SelectedRow = tblregistry.getSelectedRow();
        Object pid = tblregistry.getValueAt(SelectedRow, 0).toString();


        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * from register WHERE pid ='" + pid + "'");

            while (rs.next()) {

                txtdate.setText(rs.getString("regidate"));
                lblPID.setText(rs.getString("pid"));
                cmbTitle.setSelectedItem(Title = rs.getString("title"));
                txtInitial.setText(rs.getString("init"));
                txtLname.setText(rs.getString("name"));
                txtnic.setText(rs.getString("nicno"));
                // Date date = (rs.getDate("dob"));
                // java.util.Date dateconverter = new java.util.Date(rs.getDate("dob").getTime());
                // String DateFormat = wans_javalib.wans_Formats.DateFormat(dateconverter, "yyyy-MM-dd");
                //  System.out.println(""+dateconverter);
                // System.out.println(""+rs.getString("dob"));
                try {
                    txtdob.setText(rs.getString("dob"));
                } catch (Exception e) {
                    txtdob.setText("0000-00-00");
                }
                //txtdob.setText(rs.getObject("dob").toString());
                cmbsex.setSelectedItem(sex = rs.getString("sex"));
                cmbReligion.setSelectedItem(Religion = rs.getString("religion"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

        btnSave.setText("Update");

    }//GEN-LAST:event_tblregistryMouseReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtLnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyReleased
        try {
            String Lname = txtLname.getText();
            String initial = txtInitial.getText();
            this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE name LIKE '" + Lname + "%' AND init LIKE '" + initial + "%'LIMIT 1000");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtLnameKeyReleased

    private void btnPIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIDSearchActionPerformed
        String PID = lblPID.getText();
        frmPIDsearch open = new frmPIDsearch(this);
        MDI.addFrame(open);
        open.setVisible(true);
        try {
            open.settblmdl("SELECT pid AS PID_Num, title,init,name AS Name from register WHERE pid LIKE'" + PID + "%'LIMIT 20");
            open.obj0 = false;
            open.obj2 = true;
            open.obj1 = true;
            open.lblttle.setText("Please Type PID Number Here");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPIDSearchActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            String PID = lblPID.getText();
            
                    int Count = 0;
      
            Count = voidmodule.RCount("SELECT bhtno from admissions WHERE pidno ='" + PID + "'");
            if (Count > 0) {
                MessageBox.ok("You can not Delete this Records as Already Admitted");
            } else {
            
            
            int i = MessageBox.yesno("Do You Want to Delete   " + PID);
            if (i == 0) {

                dbconnector.insertquery("DELETE FROM register WHERE pid ='" + PID + "'");
                //   voidmodule.U_transaction(User, "Delete " + icode);

                this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE pid <> '" + PID + "'LIMIT 500");
                voidmodule.U_transaction("user", "Removed register " + PID);
            }
        } 
        }catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        
    

        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cmbReligionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbReligionKeyPressed
        if (evt.getKeyCode() == 10) {
            btnSave.requestFocus();
        }
    }//GEN-LAST:event_cmbReligionKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == 10) {
            save();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void txtnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyReleased
        try {
            String NICNo = txtnic.getText();
            this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE nicno LIKE '" + NICNo + "%'LIMIT 500");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtnicKeyReleased

    private void btnDateSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateSearchActionPerformed
        String regiDate = null;
        try {
            regiDate = txtdate.getText();
        } catch (Exception e) {
            regiDate = null;
        }



        try {
            this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE regidate = '" + regiDate + "'LIMIT 500");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDateSearchActionPerformed

    private void btnNewpid7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewpid7ActionPerformed
        MDI.addFrame(new Frm_religion());
    }//GEN-LAST:event_btnNewpid7ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        try {
            this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE regidate = '" + txtdate.getText() + "'");
        } catch (SQLException ex) {
            //    Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setTitle("InDoor Patients Registration. User = " + dbconnector.uname);
        lblinsname.setText(voidmodule.Out_fieldResulr("SELECT DEPNAME from deptinfo"));
        this.btnPIDnumActionPerformed(null);

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmissionActionPerformed
        //  if (tblregistry.getSelectedRowCount() > 0) {
        varible();
     //   MDI.removeAllFrames();
        Frm_admission open = new Frm_admission(this);
        MDI.addFrame(open);
        try {
            open.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE pidno ='" + PIDnum + "' LIMIT 500");
            open.newbht();
            open.tblvist(PIDnum);
            open.viewregidate(PIDnum);

        } catch (SQLException ex) {

            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
        //   }
    }//GEN-LAST:event_btnAdmissionActionPerformed

    private void lblPIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPIDKeyReleased

        String PID = lblPID.getText();
        frmPIDsearch open = new frmPIDsearch(this);
        MDI.addFrame(open);
        open.setVisible(true);
        try {
            open.settblmdl("SELECT pid AS PID_Num, title,init,name AS Name from register WHERE pid LIKE'" + PID + "%'LIMIT 20");
            open.txtpidNum.setText(PID);
            open.obj0 = false;
            open.obj2 = true;
            open.obj1 = true;
            open.obj3 = true;

            open.lblttle.setText("Please Type PID Number Here");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblPIDKeyReleased

    private void txtnicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicFocusGained
        txtnic.setSelectionStart(0);
        txtnic.setSelectionColor(Color.red);
    }//GEN-LAST:event_txtnicFocusGained

    private void txtdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusGained
        txtdate.setSelectionStart(0);
        txtdate.setSelectionColor(Color.red);
    }//GEN-LAST:event_txtdateFocusGained

    private void txtInitialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInitialKeyReleased
        try {
            String Lname = txtLname.getText();
            String initial = txtInitial.getText();
            this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE name LIKE '" + Lname + "%' AND init LIKE '" + initial + "%'LIMIT 1000");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtInitialKeyReleased

    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {100, 20, 80, 400, 20, 100, 100, 100};
        wans_javalib.Tables.setTableModel(executeQuery, tblregistry, Tblmod, columnWidth);
        int RCount = voidmodule.RCount(query);
        if (RCount==0) {
                  DefaultTableModel addabl = (DefaultTableModel) tblregistry.getModel();
            while (tblregistry.getRowCount() > 0) {
                addabl.removeRow(0);
            }
        }
        lblrecords.setText("Number Of Records : " + RCount);

    }

    void save() {
        try {
            this.varible();
            String Code = MDI.DEPTCODE;
         
            NumberFormat nf1 = new DecimalFormat(Code + "000000");
            String newpid = nf1.format(sno);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String sysdate = df.format(new Date());


            int Count = voidmodule.RCount("SELECT pid from register WHERE pid ='" + PIDnum + "'");
            if (Count > 0) {
                int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                if (i == 0) {
                    try {
                        dbconnector.insertquery("UPDATE register SET  title = '" + Title + "',init = '" + Initial + "',name = '" + Lname + "',sex = '" + sex + "',religion = '" + Religion + "',dob = '" + dob + "',regidate = '" + regidate + "',nicno = '" + nic + "'WHERE pid ='" + PIDnum + "'");
                        this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE pid = '" + PIDnum + "'");
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                }
            } else {
                try {

                    dbconnector.insertquery("INSERT INTO register VALUES ('" + newpid + "','" + sno + "','" + Title + "','" + Initial + "','" + Lname + "','" + sex + "','" + Religion + "','" + dob + "','" + sysdate + "','" + regidate + "','" + nic + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Records Saved");
                try {

                    this.settblmdl("SELECT pid AS PID,title AS Title,init AS Initial,name AS Name,sex AS Sex,religion AS Religion,regidate AS Registed_Date,nicno AS NIC_No from register WHERE pid = '" + newpid + "'");
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.btnPIDnumActionPerformed(null);
            txtdate.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void varible() {
        String fdate = txtdate.getText().substring(0, 4);
        regidate = txtdate.getText().toString();
        PIDnum = lblPID.getText();
        sno = (voidmodule.getmax("SELECT srno from register WHERE year(regidate) ='" + fdate + "'ORDER BY srno"));
        Title = cmbTitle.getSelectedItem();
        Initial = txtInitial.getText();
        Lname = txtLname.getText();
        nic = txtnic.getText();
        if ("    -  -  ".equals(txtdob.getText())) {
            dob = "0000-00-00";
            // dob = null;
        } else {
            dob = txtdob.getText();
        }
        sex = cmbsex.getSelectedItem();
        Religion = cmbReligion.getSelectedItem();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmission;
    private javax.swing.JButton btnDateSearch;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewpid7;
    private javax.swing.JButton btnPIDSearch;
    private javax.swing.JButton btnPIDnum;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbReligion;
    private javax.swing.JComboBox cmbTitle;
    private javax.swing.JComboBox cmbsex;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField lblPID;
    private javax.swing.JLabel lblinsname;
    private javax.swing.JLabel lblrecords;
    private javax.swing.JTable tblregistry;
    private javax.swing.JTextField txtInitial;
    private javax.swing.JTextField txtLname;
    private javax.swing.JFormattedTextField txtdate;
    private javax.swing.JFormattedTextField txtdob;
    private javax.swing.JFormattedTextField txtnic;
    // End of variables declaration//GEN-END:variables
}
