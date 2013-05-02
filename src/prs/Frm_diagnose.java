package prs;

import TableUtitlity.PopupTable;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frm_diagnose extends javax.swing.JInternalFrame {

    String BHT;
    String disease_Grroup;
    String Diag_date;
    String Diag_time;
    Object dis_type;
    String admitdate;
    Boolean trancode = true;
    int mdclgl;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String sysdate = df.format(new Date());
    com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) dbconnector.c;

    public Frm_diagnose() {

        initComponents();
        try {
            this.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose WHERE sys_date ='" + sysdate + "' ORDER BY bhtno LIMIT 100");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblPID = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblsex = new javax.swing.JLabel();
        txtage = new javax.swing.JLabel();
        lblreligen = new javax.swing.JLabel();
        txtadmitdate = new javax.swing.JLabel();
        txtregidate = new javax.swing.JLabel();
        txtward = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblinsname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblDname = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txtbht = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        txtdate = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txttime = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cmbD_type = new javax.swing.JComboBox();
        txt_hospid = new javax.swing.JTextField();
        txtDcode = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        chkmdclegle = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        btnfindBHT = new javax.swing.JButton();
        btnfindDiagnosedate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbldgcode = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldiagnose = new javax.swing.JTable();
        lblrecords = new javax.swing.JLabel();

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

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.GridLayout(7, 1));

        lblPID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPID.setForeground(new java.awt.Color(102, 0, 0));
        lblPID.setText("PID");
        jPanel5.add(lblPID);

        lblname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 0, 0));
        lblname.setText("Name");
        jPanel5.add(lblname);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        lblsex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsex.setForeground(new java.awt.Color(102, 0, 0));
        lblsex.setText("Sex");
        jPanel3.add(lblsex);

        txtage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtage.setForeground(new java.awt.Color(102, 0, 0));
        txtage.setText("Age :");
        jPanel3.add(txtage);

        jPanel5.add(jPanel3);

        lblreligen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblreligen.setForeground(new java.awt.Color(102, 0, 0));
        lblreligen.setText("Religion :");
        jPanel5.add(lblreligen);

        txtadmitdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtadmitdate.setForeground(new java.awt.Color(102, 0, 0));
        txtadmitdate.setText("Admitted Date :");
        jPanel5.add(txtadmitdate);

        txtregidate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtregidate.setForeground(new java.awt.Color(102, 0, 0));
        txtregidate.setText("Registry Date");
        jPanel5.add(txtregidate);

        txtward.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtward.setForeground(new java.awt.Color(102, 0, 0));
        txtward.setText("Ward");
        jPanel5.add(txtward);

        jPanel14.setLayout(new java.awt.GridLayout(2, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Diagnose Entry");
        jPanel14.add(jLabel2);

        lblinsname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinsname.setForeground(new java.awt.Color(0, 0, 204));
        jPanel14.add(lblinsname);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jPanel11.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

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
        jPanel11.add(btnSave);

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel11.add(btnRemove);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel11.add(btnExit);

        lblDname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDname.setForeground(new java.awt.Color(102, 0, 0));

        jPanel16.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("BHT Number : ");
        jPanel16.add(jLabel3);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Diagnose Date : ");
        jPanel16.add(jLabel17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Time : ");
        jPanel16.add(jLabel7);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Discharge Type : ");
        jPanel16.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Disease Code : ");
        jPanel16.add(jLabel5);

        jPanel17.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        txtbht.setBackground(new java.awt.Color(244, 244, 204));
        txtbht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        txtbht.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbhtActionPerformed(evt);
            }
        });
        txtbht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbhtFocusLost(evt);
            }
        });
        txtbht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbhtKeyReleased(evt);
            }
        });
        jPanel17.add(txtbht);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

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
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdateFocusLost(evt);
            }
        });
        jPanel7.add(txtdate);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("YYYY-MM-DD");
        jPanel7.add(jLabel9);

        jPanel17.add(jPanel7);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        try {
            txttime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA:AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttimeFocusGained(evt);
            }
        });
        jPanel6.add(txttime);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("HH:MM");
        jPanel6.add(jLabel1);

        jPanel17.add(jPanel6);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        cmbD_type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbD_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbD_typeActionPerformed(evt);
            }
        });
        cmbD_type.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbD_typeFocusLost(evt);
            }
        });
        jPanel9.add(cmbD_type);

        txt_hospid.setBackground(new java.awt.Color(240, 240, 240));
        txt_hospid.setForeground(new java.awt.Color(153, 153, 153));
        txt_hospid.setBorder(null);
        txt_hospid.setEnabled(false);
        txt_hospid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hospidActionPerformed(evt);
            }
        });
        jPanel9.add(txt_hospid);

        jPanel17.add(jPanel9);

        txtDcode.setBackground(new java.awt.Color(244, 244, 204));
        txtDcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        txtDcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDcodeKeyReleased(evt);
            }
        });
        jPanel17.add(txtDcode);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        chkmdclegle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkmdclegle.setText("Medicolegal ");
        chkmdclegle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkmdclegleActionPerformed(evt);
            }
        });
        jPanel8.add(chkmdclegle);

        jPanel17.add(jPanel8);

        jPanel4.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        btnfindBHT.setForeground(new java.awt.Color(252, 4, 4));
        btnfindBHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        btnfindBHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindBHTActionPerformed(evt);
            }
        });
        jPanel4.add(btnfindBHT);

        btnfindDiagnosedate.setForeground(new java.awt.Color(252, 4, 4));
        btnfindDiagnosedate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        btnfindDiagnosedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindDiagnosedateActionPerformed(evt);
            }
        });
        jPanel4.add(btnfindDiagnosedate);
        jPanel4.add(jLabel8);

        lbldgcode.setForeground(new java.awt.Color(153, 153, 153));
        lbldgcode.setText("DT");
        jPanel4.add(lbldgcode);

        jButton2.setForeground(new java.awt.Color(252, 4, 4));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbldiagnose.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbldiagnose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbldiagnoseMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbldiagnose);

        lblrecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrecords.setText("count");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblrecords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblrecords))
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfT = new SimpleDateFormat("HH:mm");
        txtdate.setText(df.format(new Date()));
        txttime.setText(dfT.format(new Date()));
        this.setTitle("Diagnose. User = " + dbconnector.uname);
        lblinsname.setText(voidmodule.Out_fieldResulr("SELECT DEPNAME from deptinfo"));
        voidmodule.fillcombo(cmbD_type, "SELECT DISTINCT type from discharge_types ORDER BY dis_code");
        txtdate.setText("YYYY-MM-DD");
    }//GEN-LAST:event_formInternalFrameOpened
    public void registrydate(String PID) {
        String Fbht = null;
        String dgroup = null;
        String hospid = null;
        String dgcode = null;
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT admissions.`bhtno` AS BHT_No,"
                    + "admissions.`age_Y` AS y,"
                    + "admissions.`age_M` AS m,"
                    + "admissions.`age_D` AS d,"
                    + "admissions.`adm_date` AS admdate,"
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
                lblPID.setText(rs.getString("PIDno"));
                lblname.setText("Name : " + rs.getString("Title") + " " + rs.getString("Initial") + " " + rs.getString("Name"));
                lblsex.setText("Sex : " + rs.getString("Sex"));
                txtage.setText("Age : " + rs.getString("y") + "-" + rs.getString("m") + "-" + rs.getString("d"));
                admitdate = rs.getString("admdate");
                txtadmitdate.setText("Admitted Date : " + admitdate);
                lblreligen.setText("Religion : " + rs.getString("Religion"));
                txtregidate.setText("Registed Date : " + rs.getString("Registry_date"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }



        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT d_group ,dis_code ,dis_date ,dis_time ,med_legel,hospid  from diagnose WHERE bhtno ='" + Fbht + "'");


            while (rs.next()) {
                dgroup = rs.getString("d_group");
                txtDcode.setText(dgroup);
                txtdate.setText(rs.getString("dis_date"));
                txttime.setText(rs.getString("dis_time"));
                txt_hospid.setText(rs.getString("hospid"));
                dgcode = (rs.getString("dis_code"));
                lbldgcode.setText(dgcode);
                cmbD_type.setSelectedItem(voidmodule.Out_fieldResulr("SELECT type from discharge_types WHERE dis_code ='" + dgcode + "'"));



                int Imdclgl = Integer.parseInt(rs.getString("med_legel"));
                if (Imdclgl == 1) {
                    chkmdclegle.setSelected(true);
                } else {
                    chkmdclegle.setSelected(false);
                }
            }
            String Dname = voidmodule.Out_fieldResulr("SELECT d_disease from icd10_deasease WHERE d_Group ='" + dgroup + "'");
            lblDname.setText(Dname);
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        trancode = true;
        currentdetails();
    }

    void currentdetails() {
        String bht = txtbht.getText();
        com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) dbconnector.conn();
        String sql4 = "SELECT a.`bhtno`, a.`w_num` as ward, a.`adm_date` as curdate1, a.`adm_time`as curtime1 FROM admissions a where a.`bhtno` = '" + bht + "'   union all SELECT i.`bhtno`, i.`to_w_num` as ward, i.`trans_date`as curdate1, i.`trans_time` as curtime1 FROM intertransfer i where i.`bhtno` = '" + bht + "' order by curdate1, curtime1 asc";
        try {
            //  Object dblastFromSql = wans_javalib.DBFunctions.dblastFromSql(con, sql4);
            ResultSet rs = dbconnector.Sql_OutResultset(sql4);

            while (rs.next()) {
                txtward.setText("Ward : " + rs.getString("ward"));
            }


        } catch (SQLException ex) {
            Logger.getLogger(Frm_wardtrans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void registrydate_null() {

        lblPID.setText(null);
        lblname.setText(null);
        lblsex.setText(null);
        txtage.setText(null);
        txtadmitdate.setText(null);
        txtward.setText(null);
        lblreligen.setText(null);
        txtregidate.setText(null);
        btnfindBHT.requestFocus();
    }
    private void txtbhtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbhtKeyReleased
    }//GEN-LAST:event_txtbhtKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean bhtOK = isKeyFound("SELECT * FROM admissions a WHERE a.`bhtno`='" + txtbht.getText() + "'");
        boolean dGroupOK = isKeyFound("SELECT * FROM icd10_deasease i WHERE i.`d_Group`='" + txtDcode.getText() + "'");
        boolean oK_DateTime = isOK_DateTime(txtdate.getText());
        boolean oK_DateTime1 = isOK_Time(txttime.getText());
        if (bhtOK == true && dGroupOK == true && oK_DateTime == true && oK_DateTime1 == true) {
            save();
        } else {
            MessageBox.ok("Incorrect Data Found \nPlease enter correctly ");
            txtbht.requestFocus();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == 10) {
            save();
        }
    }//GEN-LAST:event_btnSaveKeyPressed
    void save() {
        this.varible();
        String pidadd = "PID";
        if (!lblPID.getText().equals(pidadd)) {
            try {
                int Count = voidmodule.RCount("SELECT bhtno from diagnose WHERE bhtno ='" + BHT + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        try {
                            //SELECT d.`bhtno`, d.`d_group`, d.`dis_code`, d.`dis_date`, d.`dis_time`, d.`med_legel` FROM diagnose d;
                            dbconnector.insertquery("UPDATE diagnose SET  d_group = '" + disease_Grroup + "',dis_code = '" + dis_type + "',dis_date = '" + Diag_date + "',dis_time = '" + Diag_time + "',med_legel = '" + mdclgl + "',hospid = '" + hospid + "'WHERE bhtno ='" + BHT + "'");

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
                            dbconnector.insertquery("INSERT INTO diagnose VALUES ('" + BHT + "','" + disease_Grroup + "','" + dis_type + "','" + sysdate + "','" + Diag_date + "','" + Diag_time + "','" + mdclgl + "','" + hospid + "')");
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
                txtdate.requestFocus();
            } catch (SQLException ex) {
                Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            MessageBox.ok("No  PID Number ");
        }
        txtbht.requestFocus();
        voidmodule.U_transaction("user", "save_update diagnose  " + BHT);
    }
    Integer hospid = 0;

    void varible() {

        BHT = txtbht.getText().toString();
        Object dg = cmbD_type.getSelectedItem();
        disease_Grroup = txtDcode.getText();
        dis_type = voidmodule.Out_fieldResulr("SELECT dis_code from discharge_types WHERE type ='" + dg + "'");
        Diag_date = txtdate.getText();
        Diag_time = txttime.getText();
        if ("".equals(txt_hospid.getText())) {
            hospid = 0;
        } else {
            hospid = Integer.parseInt(txt_hospid.getText());
        }

        if (chkmdclegle.isSelected() == true) {
            mdclgl = 1;
        } else {
            mdclgl = 0;
        }


    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        String Fbht = txtbht.getText();
        int i = MessageBox.yesno("Do You Want to Delete   " + Fbht);
        if (i == 0) {
            try {

                dbconnector.insertquery("DELETE FROM diagnose WHERE bhtno ='" + Fbht + "'");
                voidmodule.U_transaction("user", "Removed   diagnose" + Fbht);
                try {
                    this.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose ORDER BY bhtno LIMIT 100");
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

    private void tbldiagnoseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldiagnoseMouseReleased
        int SelectedRow = tbldiagnose.getSelectedRow();
        Object Fbht = tbldiagnose.getValueAt(SelectedRow, 0).toString();
        txtbht.setText(Fbht.toString());
        trancode = false;
        registrydate(Fbht.toString());



    }//GEN-LAST:event_tbldiagnoseMouseReleased
    //"SELECT * FROM admissions a WHERE a.`bhtno`='" + bht + "'" 

    private boolean isOK_DateTime(String datetime) {
        boolean b = false;
        try {
            Date dateFromString = wans_javalib.wans_Formats.getDateFromString(datetime);
            if (dateFromString == null) {
                b = false;
            } else {
                b = true;
            }

        } catch (Exception e) {
            b = false;
        }
        return b;
    }

    private boolean isOK_Time(String datetime) {
        boolean b = false;
        try {
            int hourX = Integer.parseInt(datetime.substring(0, 2));
            int minuteX = Integer.parseInt(datetime.substring(3, 5));
//            DateFormat sdf = new SimpleDateFormat("hh:mm");
//            Date parse = sdf.parse(datetime);
//            System.out.println("" + parse);
            if (hourX < 24 && minuteX < 60) {
                b = true;
            } else {
                b = false;
            }

        } catch (Exception e) {
            b = false;
        }
        return b;
    }

    private boolean isKeyFound(String sql) {
        boolean b = false;
        Object ob = null;
        try {
            ob = wans_javalib.DBFunctions.dblookupFromSql(con, sql);

        } catch (SQLException ex) {
            Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ob != null) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    private void txtDcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDcodeKeyReleased

        String Dgroup = txtDcode.getText();
        Frm_findDiagnose open = new Frm_findDiagnose(this);
        MDI.addFrame(open);
        open.setVisible(true);
        try {

            open.settblmdl("SELECT icd10_immr.`d_Group` AS immr_d_Group,"
                    + "icd10_block.`d_Chapter` AS Chapter,"
                    + "icd10_block.`d_block` AS block,"
                    + "icd10_block.`d_Title` AS Title,"
                    + "icd10_subblock.`d_Subblock` AS Subblock,"
                    + "icd10_subblock.`d_SubTitle` AS SubTitle FROM"
                    + "`icd10_subblock` icd10_subblock INNER JOIN `icd10_deasease` icd10_deasease ON icd10_subblock.`d_Subblock` = icd10_deasease.`d_Subblock`"
                    + "INNER JOIN `icd10_block` icd10_block ON icd10_subblock.`d_block` = icd10_block.`d_block`"
                    + "INNER JOIN `icd10_immr` icd10_immr ON icd10_deasease.`d_immrNo` = icd10_immr.`d_immrNo`"
                    + "WHERE icd10_deasease.`d_Group` ='" + Dgroup + "'");

            open.txtgroup.setText(Dgroup);
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDcodeKeyReleased

    private void cmbD_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbD_typeActionPerformed
        if (trancode) {


            Object dg = cmbD_type.getSelectedItem();
            lbldgcode.setText(voidmodule.Out_fieldResulr("SELECT dis_code from discharge_types WHERE type ='" + dg + "'"));
            txt_hospid.setText("");
            String text = lbldgcode.getText();
            if ("3".equals(text)) {


                String sql = "SELECT `sno`, `name` FROM `immr`.`hospital`";
                ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con, sql);
                int colomnwiths[] = {20, 150};
                JPopupMenu pop = new JPopupMenu();
                TableUtitlity.PopupTable p = new PopupTable(resultSet, colomnwiths);
                p.addTableToPopup(pop, txt_hospid, "sno");
            }
        }
    }//GEN-LAST:event_cmbD_typeActionPerformed

    private void txtdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusGained
        DateFormat df = new SimpleDateFormat("yyyy");
        String year = df.format(new Date());
        txtdate.setText(year + "-MM-DD");
        txtdate.setSelectionStart(5);
    }//GEN-LAST:event_txtdateFocusGained

    private void txttimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimeFocusGained
        txttime.setSelectionStart(0);
    }//GEN-LAST:event_txttimeFocusGained

    private void txtdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusLost
        this.varible();
        String dicdate = txtdate.getText();
        try {
            String sql = "SELECT Datediff('" + dicdate + "',adm_date)as Inpatientdays from admissions WHERE bhtno ='" + BHT + "'";

            int Phouse = Integer.parseInt(voidmodule.Out_fieldResulr(sql));

            if (Phouse < 0) {
                MessageBox.ok("Incorrect Diagnose Date. .. ");
                btnSave.setEnabled(false);
            } else {
                btnSave.setEnabled(true);
            }

        } catch (NumberFormatException ex) {
            // MessageBox.ok("Incorrect Date\n(" + ex+")");
        }
    }//GEN-LAST:event_txtdateFocusLost

    private void txtbhtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbhtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbhtActionPerformed

    private void btnfindDiagnosedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindDiagnosedateActionPerformed
        try {
            String Ddate = txtdate.getText();
            this.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose WHERE dis_date ='" + Ddate + "' ORDER BY bhtno ");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfindDiagnosedateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String DCode = txtDcode.getText();
            this.settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose WHERE d_group ='" + DCode + "' ORDER BY bhtno ");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnfindBHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindBHTActionPerformed
        String PID = lblPID.getText();
        String bht = txtbht.getText();
        frmPIDsearch open = new frmPIDsearch(this);
        MDI.addFrame(open);
        open.setVisible(true);
        open.txtpidNum.setText(bht);
        open.lblttle.setText("Please Type BHT Number Here");
        open.obj1 = false;
        open.obj0 = true;
        open.obj2 = true;
        open.obj3 = true;

    }//GEN-LAST:event_btnfindBHTActionPerformed

    private void txtbhtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbhtFocusLost
        txtbht.setText(txtbht.getText().toUpperCase());
        String BHT = txtbht.getText();
        Object lookbht = null;

        if ("".equals(BHT)) {
        } else {
            try {

                String sql = "SELECT bhtno from admissions WHERE bhtno = '" + BHT + "'";
                lookbht = wans_javalib.DBFunctions.dblookupFromSql(con, sql);
                registrydate(lookbht.toString());
            } catch (Exception ex) {
                //      MessageBox.ok("Incorrect BHT Number");
                registrydate_null();
            }
            try {
                settblmdl("SELECT bhtno AS BHT_No,d_group AS D_Group,dis_code AS Discharge_Code,dis_date AS Discharge_Date,dis_time AS Discharge_Time,med_legel AS Medicolegel,hospid AS Hos_Code from diagnose WHERE bhtno ='" + lookbht.toString() + "' ORDER BY bhtno");
            } catch (SQLException ex1) {
                Logger.getLogger(Frm_diagnose.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
       
    }//GEN-LAST:event_txtbhtFocusLost

    private void cmbD_typeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbD_typeFocusLost
    }//GEN-LAST:event_cmbD_typeFocusLost

    private void chkmdclegleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkmdclegleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkmdclegleActionPerformed

    private void txt_hospidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hospidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hospidActionPerformed
    public void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {100, 100, 160, 160, 160, 80, 100};
        wans_javalib.Tables.setTableModel(executeQuery, tbldiagnose, Tblmod, columnWidth);
        int RCount = voidmodule.RCount(query);
        if (RCount == 0) {
            DefaultTableModel addabl = (DefaultTableModel) tbldiagnose.getModel();
            while (tbldiagnose.getRowCount() > 0) {
                addabl.removeRow(0);
            }
        }
        lblrecords.setText("Number Of Records : " + RCount);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnfindBHT;
    private javax.swing.JButton btnfindDiagnosedate;
    private javax.swing.JCheckBox chkmdclegle;
    private javax.swing.JComboBox cmbD_type;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblDname;
    public javax.swing.JLabel lblPID;
    private javax.swing.JLabel lbldgcode;
    private javax.swing.JLabel lblinsname;
    public javax.swing.JLabel lblname;
    private javax.swing.JLabel lblrecords;
    public javax.swing.JLabel lblreligen;
    public javax.swing.JLabel lblsex;
    private javax.swing.JTable tbldiagnose;
    public javax.swing.JTextField txtDcode;
    private javax.swing.JTextField txt_hospid;
    public javax.swing.JLabel txtadmitdate;
    private javax.swing.JLabel txtage;
    public javax.swing.JFormattedTextField txtbht;
    public javax.swing.JFormattedTextField txtdate;
    public javax.swing.JLabel txtregidate;
    private javax.swing.JFormattedTextField txttime;
    public javax.swing.JLabel txtward;
    // End of variables declaration//GEN-END:variables
}
