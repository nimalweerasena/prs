package prs;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frm_ICD10 extends javax.swing.JInternalFrame {

 

    public Frm_ICD10() {
        initComponents();

        this.setTitle("ICD 10 Disease Group - User : " + dbconnector.uname + "....");
        lbltitle.setText("ICD 10 Disease Group");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblblock = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbchapter = new javax.swing.JComboBox();
        cmbblock = new javax.swing.JComboBox();
        txttitle = new javax.swing.JTextField();
        lbltitle = new javax.swing.JLabel();
        lblblocklrecords = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblsubblock = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        btnsubsave = new javax.swing.JButton();
        btnsubremove = new javax.swing.JButton();
        txtsubexit = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        cmbblock1 = new javax.swing.JComboBox();
        cmbsubblock = new javax.swing.JComboBox();
        txtsubtitle = new javax.swing.JTextField();
        lbltitle4 = new javax.swing.JLabel();
        lblsubrecords = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDGroup = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        btnDiseasesave = new javax.swing.JButton();
        btnDiseaseremove = new javax.swing.JButton();
        txtDiseaseexit = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtimmrno = new javax.swing.JTextField();
        cmbsubblock2 = new javax.swing.JComboBox();
        cmbntfcble = new javax.swing.JComboBox();
        txtdGroup = new javax.swing.JTextField();
        txtdName = new javax.swing.JTextField();
        lbltitle2 = new javax.swing.JLabel();
        lblsubrecords1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblIMMRDGroup = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnIMMRsave = new javax.swing.JButton();
        btnIMMRremove = new javax.swing.JButton();
        txtIMMRexit = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        txtimmrno1 = new javax.swing.JTextField();
        txtdIMMRGroup = new javax.swing.JComboBox();
        txtdIMMRName = new javax.swing.JTextField();
        lbltitle5 = new javax.swing.JLabel();
        lblsubrecords2 = new javax.swing.JLabel();

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

        tblblock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Code", "Ward No", "Description", "No of Beds", "Incharge"
            }
        ));
        tblblock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblblockMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblblock);
        tblblock.getColumnModel().getColumn(1).setMinWidth(125);
        tblblock.getColumnModel().getColumn(1).setPreferredWidth(125);
        tblblock.getColumnModel().getColumn(1).setMaxWidth(125);
        tblblock.getColumnModel().getColumn(3).setMinWidth(80);
        tblblock.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblblock.getColumnModel().getColumn(3).setMaxWidth(80);

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
        jLabel1.setText("Chapter");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Block Group");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tytle");
        jPanel2.add(jLabel3);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0));

        cmbchapter.setEditable(true);
        jPanel3.add(cmbchapter);

        cmbblock.setEditable(true);
        jPanel3.add(cmbblock);

        txttitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttitleKeyPressed(evt);
            }
        });
        jPanel3.add(txttitle);

        lbltitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle.setText("ICD 10 Block Group");

        lblblocklrecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblblocklrecords.setText("counter");

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
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblblocklrecords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblblocklrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Block (Group)", jPanel1);

        tblsubblock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Code", "Ward No", "Description", "No of Beds", "Incharge"
            }
        ));
        tblsubblock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblsubblockMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblsubblock);
        tblsubblock.getColumnModel().getColumn(1).setMinWidth(125);
        tblsubblock.getColumnModel().getColumn(1).setPreferredWidth(125);
        tblsubblock.getColumnModel().getColumn(1).setMaxWidth(125);
        tblsubblock.getColumnModel().getColumn(3).setMinWidth(80);
        tblsubblock.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblsubblock.getColumnModel().getColumn(3).setMaxWidth(80);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnsubsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsubsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsubsave.setText("Save");
        btnsubsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubsaveActionPerformed(evt);
            }
        });
        jPanel18.add(btnsubsave);

        btnsubremove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsubremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnsubremove.setText("Remove");
        btnsubremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubremoveActionPerformed(evt);
            }
        });
        jPanel18.add(btnsubremove);

        txtsubexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsubexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        txtsubexit.setText("Exit");
        txtsubexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubexitActionPerformed(evt);
            }
        });
        jPanel18.add(txtsubexit);

        jPanel19.setLayout(new java.awt.GridLayout(3, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Block");
        jPanel19.add(jLabel5);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Sub Block");
        jPanel19.add(jLabel4);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Sub Tytle");
        jPanel19.add(jLabel21);

        jPanel20.setLayout(new java.awt.GridLayout(3, 0));

        cmbblock1.setEditable(true);
        jPanel20.add(cmbblock1);

        cmbsubblock.setEditable(true);
        jPanel20.add(cmbsubblock);

        txtsubtitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsubtitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsubtitleKeyPressed(evt);
            }
        });
        jPanel20.add(txtsubtitle);

        lbltitle4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle4.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle4.setText("ICD 10 Sub Block Group");

        lblsubrecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsubrecords.setText("counter");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(lbltitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsubrecords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(lbltitle4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sub Block Group", jPanel17);

        tblDGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Code", "Ward No", "Description", "No of Beds", "Incharge"
            }
        ));
        tblDGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDGroupMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblDGroup);
        tblDGroup.getColumnModel().getColumn(1).setMinWidth(125);
        tblDGroup.getColumnModel().getColumn(1).setPreferredWidth(125);
        tblDGroup.getColumnModel().getColumn(1).setMaxWidth(125);
        tblDGroup.getColumnModel().getColumn(3).setMinWidth(80);
        tblDGroup.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblDGroup.getColumnModel().getColumn(3).setMaxWidth(80);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnDiseasesave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDiseasesave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnDiseasesave.setText("Save");
        btnDiseasesave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiseasesaveActionPerformed(evt);
            }
        });
        jPanel14.add(btnDiseasesave);

        btnDiseaseremove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDiseaseremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnDiseaseremove.setText("Remove");
        btnDiseaseremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiseaseremoveActionPerformed(evt);
            }
        });
        jPanel14.add(btnDiseaseremove);

        txtDiseaseexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDiseaseexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        txtDiseaseexit.setText("Exit");
        txtDiseaseexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiseaseexitActionPerformed(evt);
            }
        });
        jPanel14.add(txtDiseaseexit);

        jPanel8.setLayout(new java.awt.GridLayout(5, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("IMMR  Number");
        jPanel8.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Sub Block");
        jPanel8.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("NOtificable Disease");
        jPanel8.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Disease Droup");
        jPanel8.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Disease Name");
        jPanel8.add(jLabel15);

        jPanel9.setLayout(new java.awt.GridLayout(5, 0));

        txtimmrno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtimmrno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtimmrnoKeyPressed(evt);
            }
        });
        jPanel9.add(txtimmrno);

        cmbsubblock2.setEditable(true);
        jPanel9.add(cmbsubblock2);

        cmbntfcble.setEditable(true);
        cmbntfcble.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        jPanel9.add(cmbntfcble);

        txtdGroup.setBackground(new java.awt.Color(244, 244, 204));
        txtdGroup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdGroup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdGroupKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdGroupKeyReleased(evt);
            }
        });
        jPanel9.add(txtdGroup);

        txtdName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdNameKeyPressed(evt);
            }
        });
        jPanel9.add(txtdName);

        lbltitle2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle2.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle2.setText("ICD 10 Disease Group");

        lblsubrecords1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsubrecords1.setText("counter");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(lbltitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsubrecords1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbltitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubrecords1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Disease (Group)", jPanel7);

        tblIMMRDGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Code", "Ward No", "Description", "No of Beds", "Incharge"
            }
        ));
        tblIMMRDGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIMMRDGroupMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tblIMMRDGroup);
        tblIMMRDGroup.getColumnModel().getColumn(1).setMinWidth(125);
        tblIMMRDGroup.getColumnModel().getColumn(1).setPreferredWidth(125);
        tblIMMRDGroup.getColumnModel().getColumn(1).setMaxWidth(125);
        tblIMMRDGroup.getColumnModel().getColumn(3).setMinWidth(80);
        tblIMMRDGroup.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblIMMRDGroup.getColumnModel().getColumn(3).setMaxWidth(80);

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnIMMRsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIMMRsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnIMMRsave.setText("Save");
        btnIMMRsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMMRsaveActionPerformed(evt);
            }
        });
        jPanel21.add(btnIMMRsave);

        btnIMMRremove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIMMRremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnIMMRremove.setText("Remove");
        btnIMMRremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMMRremoveActionPerformed(evt);
            }
        });
        jPanel21.add(btnIMMRremove);

        txtIMMRexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIMMRexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        txtIMMRexit.setText("Exit");
        txtIMMRexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIMMRexitActionPerformed(evt);
            }
        });
        jPanel21.add(txtIMMRexit);

        jPanel22.setLayout(new java.awt.GridLayout(3, 0));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("IMMR  Number");
        jPanel22.add(jLabel22);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Disease Droup");
        jPanel22.add(jLabel25);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Disease Name");
        jPanel22.add(jLabel26);

        jPanel23.setLayout(new java.awt.GridLayout(3, 0));

        txtimmrno1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtimmrno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtimmrno1KeyPressed(evt);
            }
        });
        jPanel23.add(txtimmrno1);

        txtdIMMRGroup.setEditable(true);
        jPanel23.add(txtdIMMRGroup);

        txtdIMMRName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdIMMRName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdIMMRNameKeyPressed(evt);
            }
        });
        jPanel23.add(txtdIMMRName);

        lbltitle5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle5.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle5.setText("IMMR Disease Group (Local)");

        lblsubrecords2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsubrecords2.setText("counter");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(lbltitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsubrecords2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lbltitle5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubrecords2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("IMMR Group ", jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            settblmdl(lblblocklrecords, tblblock, "SELECT d_Chapter AS Chapter,d_block as Block_Group,d_Title as Title from icd10_block ORDER BY d_block");
            settblmdl(lblsubrecords, tblsubblock, "SELECT d_block AS Block,d_Subblock as Sub_Block_Group,d_SubTitle as Sub_Title from icd10_subblock ORDER BY d_Subblock");
            settblmdl_disease(tblDGroup, "SELECT d_immrNo AS IMMR_No,d_Subblock as Sub_Block_Group,d_NtfblDise as Notificable ,d_Group as Disease_Group ,d_disease as Disease_Name  from icd10_deasease ORDER BY d_Group");
            settblmdl(lblsubrecords2, tblIMMRDGroup, "SELECT d_immrNo AS IMMR_No,d_Group as Disease_Group,d_disease as Disease_Name from icd10_immr ORDER BY d_immrNo");

        } catch (SQLException ex) {
            Logger.getLogger(Frm_ICD10.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setTitle("ICD 10 Disease Group. User = " + dbconnector.uname);
        voidmodule.fillcombo(cmbchapter, "SELECT DISTINCT  d_Chapter from icd10_block ORDER BY d_Chapter");
        voidmodule.fillcombo(cmbblock, "SELECT DISTINCT d_block from icd10_block ORDER BY d_block");
        voidmodule.fillcombo(cmbblock1, "SELECT DISTINCT d_block from icd10_subblock ORDER BY d_block");
        voidmodule.fillcombo(cmbsubblock, "SELECT DISTINCT  d_Subblock from icd10_subblock ORDER BY d_Subblock");
        voidmodule.fillcombo(cmbsubblock2, "SELECT DISTINCT  d_Subblock from icd10_deasease ORDER BY d_Subblock");
        voidmodule.fillcombo(txtdIMMRGroup, "SELECT DISTINCT  d_Group from icd10_immr ORDER BY d_Group");

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtdGroupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdGroupKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdGroupKeyPressed

    private void txtimmrnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimmrnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimmrnoKeyPressed

    private void txtDiseaseexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiseaseexitActionPerformed
      dispose();
    }//GEN-LAST:event_txtDiseaseexitActionPerformed

    private void btnDiseaseremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiseaseremoveActionPerformed
        Object dGroup = txtdGroup.getText();
        int i = MessageBox.yesno("Do You Want to Remove Item  " + dGroup);
        if (i == 0) {
            try {
                dbconnector.insertquery("DELETE FROM icd10_deasease WHERE d_Group ='" + dGroup + "'");
                settblmdl_disease(tblDGroup, "SELECT d_immrNo AS IMMR_No,d_Subblock as Sub_Block_Group,d_NtfblDise as Notificable ,d_Group as Disease_Group ,d_disease as Disease_Name  from icd10_deasease ORDER BY d_Group");
            } catch (SQLException ex) {

                voidmodule.U_transaction("user", "Delete " + dGroup);
            } catch (Exception ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnDiseaseremoveActionPerformed

    private void btnDiseasesaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiseasesaveActionPerformed
        try {
            String immrno = txtimmrno.getText();
            Object subblock2 = cmbsubblock2.getSelectedItem();
            Object ntfcble = cmbntfcble.getSelectedItem();
            String dGroup = txtdGroup.getText();
            String dName = txtdName.getText();
            try {
                int Count = voidmodule.RCount("SELECT d_Subblock from icd10_deasease WHERE d_Group ='" + dGroup + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE icd10_deasease SET  d_immrNo = '" + immrno + "',d_Subblock = '" + subblock2 + "',d_NtfblDise = '" + ntfcble + "',d_disease = '" + dName + "'WHERE d_Group ='" + dGroup + "'");

                    } else {
                    }
                } else {

                    dbconnector.insertquery("INSERT INTO icd10_deasease VALUES ('" + immrno + "','" + subblock2 + "','" + ntfcble + "','" + dGroup + "','" + dName + "')");
                    JOptionPane.showMessageDialog(null, "Records Saved");
                }



            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }
            settblmdl_disease(tblDGroup, "SELECT d_immrNo AS IMMR_No,d_Subblock as Sub_Block_Group,d_NtfblDise as Notificable ,d_Group as Disease_Group ,d_disease as Disease_Name  from icd10_deasease ORDER BY d_Group");

            voidmodule.U_transaction("user", "ICD 10 Block " + dGroup);

            cmbntfcble.setSelectedItem(null);
            txtdGroup.setText(null);
            txtdName.setText(null);

        } catch (SQLException ex) {
            Logger.getLogger(Frm_ICD10.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDiseasesaveActionPerformed

    private void tblDGroupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDGroupMouseReleased

        int SelectedRow = tblDGroup.getSelectedRow();
        String immrno = tblDGroup.getValueAt(SelectedRow, 0).toString();
        Object subblock2 = tblDGroup.getValueAt(SelectedRow, 1).toString();
        Object ntfcble = tblDGroup.getValueAt(SelectedRow, 2).toString();
        String dGroup = tblDGroup.getValueAt(SelectedRow, 3).toString();
        String dName = tblDGroup.getValueAt(SelectedRow, 4).toString();
        txtimmrno.setText(immrno);
        cmbsubblock2.setSelectedItem(subblock2);
        cmbntfcble.setSelectedItem(ntfcble);
        txtdGroup.setText(dGroup);
        txtdName.setText(dName);

        btnDiseasesave.setText("Update");

    }//GEN-LAST:event_tblDGroupMouseReleased

    private void txttitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttitleKeyPressed
   }//GEN-LAST:event_txttitleKeyPressed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_txtexitActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        Object block = cmbblock.getSelectedItem();
        int i = MessageBox.yesno("Do You Want to Remove Item  " + block);
        if (i == 0) {
            try {
                dbconnector.insertquery("DELETE FROM icd10_block WHERE d_block ='" + block + "'");
                settblmdl(lblblocklrecords, tblsubblock, "SELECT d_block AS Block,d_Subblock as Sub_Block_Group,d_SubTitle as Sub_Title from icd10_subblock ORDER BY d_Subblock");
                voidmodule.U_transaction("user", "Delete " + block);
            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            Object chapter = cmbchapter.getSelectedItem();
            Object block = cmbblock.getSelectedItem();
            String title = txttitle.getText();
            try {
                int Count = voidmodule.RCount("SELECT d_block from icd10_block WHERE d_block ='" + block + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE icd10_block SET  d_Chapter = '" + chapter + "',d_Title = '" + title + "'WHERE d_block ='" + block + "'");

                    } else {
                    }
                } else {

                    dbconnector.insertquery("INSERT INTO icd10_block VALUES ('" + chapter + "','" + block + "','" + title + "')");
                    JOptionPane.showMessageDialog(null, "Records Saved");
                }



            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }
            settblmdl(lblblocklrecords, tblblock, "SELECT d_Chapter AS Chapter,d_block as Block_Group,d_Title as Title from icd10_block ORDER BY d_block");

            voidmodule.U_transaction("user", "ICD 10 Block " + block);
            cmbchapter.setSelectedItem(null);
            cmbblock.setSelectedItem(null);
            txttitle.setText(null);

        } catch (SQLException ex) {
            Logger.getLogger(Frm_ICD10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblblockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblblockMouseReleased
        int SelectedRow = tblblock.getSelectedRow();
        String chapter = tblblock.getValueAt(SelectedRow, 0).toString();
        String block = tblblock.getValueAt(SelectedRow, 1).toString();
        String title = tblblock.getValueAt(SelectedRow, 2).toString();
        cmbchapter.setSelectedItem(chapter);
        cmbblock.setSelectedItem(block);
        txttitle.setText(title);

        btnsave.setText("Update");
    }//GEN-LAST:event_tblblockMouseReleased

    private void tblsubblockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsubblockMouseReleased
        int SelectedRow = tblsubblock.getSelectedRow();
        String chapter = tblsubblock.getValueAt(SelectedRow, 0).toString();
        String block = tblsubblock.getValueAt(SelectedRow, 1).toString();
        String title = tblsubblock.getValueAt(SelectedRow, 2).toString();
        cmbblock1.setSelectedItem(chapter);
        cmbsubblock.setSelectedItem(block);
        txtsubtitle.setText(title);

        btnsubsave.setText("Update");
    }//GEN-LAST:event_tblsubblockMouseReleased

    private void btnsubsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubsaveActionPerformed
        try {
            Object block1 = cmbblock1.getSelectedItem();
            Object subblock = cmbsubblock.getSelectedItem();
            String subtitle = txtsubtitle.getText();
            try {
                int Count = voidmodule.RCount("SELECT d_Subblock from icd10_subblock WHERE d_Subblock ='" + subblock + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE icd10_subblock SET  d_block = '" + block1 + "',d_SubTitle = '" + subtitle + "'WHERE d_Subblock ='" + subblock + "'");

                    } else {
                    }
                } else {

                    dbconnector.insertquery("INSERT INTO icd10_subblock VALUES ('" + block1 + "','" + subblock + "','" + subtitle + "')");
                    JOptionPane.showMessageDialog(null, "Records Saved");
                }



            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }
            settblmdl(lblsubrecords, tblsubblock, "SELECT d_block AS Block,d_Subblock as Sub_Block_Group,d_SubTitle as Sub_Title from icd10_subblock ORDER BY d_Subblock");

            voidmodule.U_transaction("user", "ICD 10 Block " + subblock);
            cmbchapter.setSelectedItem(null);
            cmbblock.setSelectedItem(null);
            txttitle.setText(null);

        } catch (SQLException ex) {
            Logger.getLogger(Frm_ICD10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsubsaveActionPerformed

    private void btnsubremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubremoveActionPerformed
        Object subblock = cmbsubblock.getSelectedItem();
        int i = MessageBox.yesno("Do You Want to Remove Item  " + subblock);
        if (i == 0) {
            try {
                dbconnector.insertquery("DELETE FROM icd10_subblock WHERE d_Subblock ='" + subblock + "'");
                settblmdl(lblsubrecords, tblsubblock, "SELECT d_block AS Block,d_Subblock as Sub_Block_Group,d_SubTitle as Sub_Title from icd10_subblock ORDER BY d_Subblock");
            } catch (SQLException ex) {

                voidmodule.U_transaction("user", "Delete " + subblock);
            } catch (Exception ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnsubremoveActionPerformed

    private void txtsubexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubexitActionPerformed
     dispose();
    }//GEN-LAST:event_txtsubexitActionPerformed

    private void txtsubtitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubtitleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtitleKeyPressed

    private void txtdNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdNameKeyPressed

    private void txtdGroupKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdGroupKeyReleased
        try {
            String dGroup = txtdGroup.getText();
            settblmdl_disease(tblDGroup, "SELECT d_immrNo AS IMMR_No,d_Subblock as Sub_Block_Group,d_NtfblDise as Notificable ,d_Group as Disease_Group ,d_disease as Disease_Name  from icd10_deasease WHERE d_Group LIKE '" + dGroup + "%' ORDER BY d_Group");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_ICD10.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtdGroupKeyReleased

    private void tblIMMRDGroupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIMMRDGroupMouseReleased
        int SelectedRow = tblIMMRDGroup.getSelectedRow();
        String immrno = tblIMMRDGroup.getValueAt(SelectedRow, 0).toString();
        Object subblock2 = tblIMMRDGroup.getValueAt(SelectedRow, 1).toString();
        String name = tblIMMRDGroup.getValueAt(SelectedRow, 2).toString();
        txtimmrno1.setText(immrno);
        txtdIMMRGroup.setSelectedItem(subblock2);
        txtdIMMRName.setText(name);

        btnIMMRsave.setText("Update");
    }//GEN-LAST:event_tblIMMRDGroupMouseReleased

    private void btnIMMRsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMMRsaveActionPerformed
        try {
            String immrno1 = txtimmrno1.getText();
            Object dIMMRGroup = txtdIMMRGroup.getSelectedItem();
            String dIMMRName = txtdIMMRName.getText();
            try {
                int Count = voidmodule.RCount("SELECT d_immrNo from icd10_immr WHERE d_immrNo ='" + immrno1 + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE icd10_immr SET  d_Group = '" + dIMMRGroup + "',d_disease = '" + dIMMRName + "'WHERE d_immrNo ='" + immrno1 + "'");

                    } else {
                    }
                } else {

                    dbconnector.insertquery("INSERT INTO icd10_immr VALUES ('" + immrno1 + "','" + dIMMRGroup + "','" + dIMMRName + "')");
                    JOptionPane.showMessageDialog(null, "Records Saved");
                }



            } catch (SQLException ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }
            settblmdl(lblsubrecords2, tblIMMRDGroup, "SELECT d_immrNo AS IMMR_No,d_Group as Disease_Group,d_disease as Disease_Name from icd10_immr ORDER BY d_immrNo");

            voidmodule.U_transaction("user", "IMMR Nomber" + immrno1);

            txtimmrno1.setText(null);
            txtdIMMRGroup.setSelectedItem(null);
            txtdIMMRName.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(Frm_ICD10.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnIMMRsaveActionPerformed

    private void btnIMMRremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMMRremoveActionPerformed
        Object IMMRNo = txtimmrno1.getText();
        int i = MessageBox.yesno("Do You Want to Remove Item  " + IMMRNo);
        if (i == 0) {
            try {
                dbconnector.insertquery("DELETE FROM icd10_immr WHERE d_immrNo ='" + IMMRNo + "'");
                settblmdl(lblsubrecords2, tblIMMRDGroup, "SELECT d_immrNo AS IMMR_No,d_Group as Disease_Group,d_disease as Disease_Name from icd10_immr ORDER BY d_immrNo");
            } catch (SQLException ex) {

                voidmodule.U_transaction("user", "Delete " + IMMRNo);
            } catch (Exception ex) {
                Logger.getLogger(Frm_religion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnIMMRremoveActionPerformed

    private void txtIMMRexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIMMRexitActionPerformed
       dispose();
    }//GEN-LAST:event_txtIMMRexitActionPerformed

    private void txtimmrno1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimmrno1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimmrno1KeyPressed

    private void txtdIMMRNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdIMMRNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdIMMRNameKeyPressed
    void settblmdl(JLabel lbl, JTable table, String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {60, 150, 350};
        wans_javalib.Tables.setTableModel(executeQuery, table, Tblmod, columnWidth);
        int RCount = voidmodule.RCount(query);
        lbl.setText("Number Of Records : " + RCount);
        lbl.setText("Number Of Records : " + RCount);
    }

    void settblmdl_disease(JTable table, String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {60, 150, 150, 150, 350};
        wans_javalib.Tables.setTableModel(executeQuery, table, Tblmod, columnWidth);
        int RCount = voidmodule.RCount(query);
        lblsubrecords1.setText("Number Of Records : " + RCount);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiseaseremove;
    private javax.swing.JButton btnDiseasesave;
    private javax.swing.JButton btnIMMRremove;
    private javax.swing.JButton btnIMMRsave;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsubremove;
    private javax.swing.JButton btnsubsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbblock;
    private javax.swing.JComboBox cmbblock1;
    private javax.swing.JComboBox cmbchapter;
    private javax.swing.JComboBox cmbntfcble;
    private javax.swing.JComboBox cmbsubblock;
    private javax.swing.JComboBox cmbsubblock2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblblocklrecords;
    private javax.swing.JLabel lblsubrecords;
    private javax.swing.JLabel lblsubrecords1;
    private javax.swing.JLabel lblsubrecords2;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbltitle2;
    private javax.swing.JLabel lbltitle4;
    private javax.swing.JLabel lbltitle5;
    private javax.swing.JTable tblDGroup;
    private javax.swing.JTable tblIMMRDGroup;
    private javax.swing.JTable tblblock;
    private javax.swing.JTable tblsubblock;
    private javax.swing.JButton txtDiseaseexit;
    private javax.swing.JButton txtIMMRexit;
    private javax.swing.JTextField txtdGroup;
    private javax.swing.JComboBox txtdIMMRGroup;
    private javax.swing.JTextField txtdIMMRName;
    private javax.swing.JTextField txtdName;
    private javax.swing.JButton txtexit;
    private javax.swing.JTextField txtimmrno;
    private javax.swing.JTextField txtimmrno1;
    private javax.swing.JButton txtsubexit;
    private javax.swing.JTextField txtsubtitle;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}
