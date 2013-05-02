package prs;

import TableUtitlity.PopupTable;
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
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frm_admission extends javax.swing.JInternalFrame {

    String admissiondate;
    String admsntime;
    String BHTnum;
    String newBHTNo;
    String PIDnum;
    int sno;
    int wordsno;
    Object type;
    String Address1;
    String Address2;
    String Address3;
    int Y;
    int M;
    int D;
    Object status;
    String guardin;
    Object pstation;
    Object ward;
    boolean isRecordValid = true;
    Integer hospid = 0;
    com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) dbconnector.c;
    frm_Registry frm_Registry;

    public Frm_admission() {
        initComponents();
        lblBHT1.setText("Type BHT No");
    }

    public Frm_admission(frm_Registry obj) {
        this.frm_Registry = obj;
        initComponents();
        lblBHT1.setText("Type BHT No");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtdate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txttime = new javax.swing.JFormattedTextField();
        lblBHT = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        cmbaddtype = new javax.swing.JComboBox();
        lbladdtype = new javax.swing.JLabel();
        txthc = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txty = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        txtm = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        txtd = new javax.swing.JFormattedTextField();
        cmbstatus = new javax.swing.JComboBox();
        txtguardin = new javax.swing.JTextField();
        txtpstation = new javax.swing.JComboBox();
        cmbward = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        btnBHTnum = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPID = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lblsex = new javax.swing.JLabel();
        lblreligen = new javax.swing.JLabel();
        txtregidate = new javax.swing.JLabel();
        txtadmtdate = new javax.swing.JLabel();
        lblinsname = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblvisits = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbladmission = new javax.swing.JTable();
        lblrecords = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblBHT1 = new javax.swing.JFormattedTextField();
        btnAdmission = new javax.swing.JButton();

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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(7, 0));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel6);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Admission Date :");
        jPanel3.add(jLabel17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("BHT Num :");
        jPanel3.add(jLabel3);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Abmission Type :");
        jPanel3.add(jLabel10);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address 1 :");
        jPanel3.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Address 2 :");
        jPanel3.add(jLabel5);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Address 3 :");
        jPanel3.add(jLabel12);

        jPanel4.setLayout(new java.awt.GridLayout(7, 0));

        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("YYYY-MM-DD");
        jPanel13.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel13.add(jLabel9);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("hh:mm");
        jPanel13.add(jLabel11);

        jPanel4.add(jPanel13);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

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
        txtdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdateKeyReleased(evt);
            }
        });
        jPanel10.add(txtdate);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Time :");
        jPanel10.add(jLabel7);

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
        jPanel10.add(txttime);

        jPanel4.add(jPanel10);

        lblBHT.setBackground(new java.awt.Color(244, 244, 204));
        lblBHT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        try {
            lblBHT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-AAAAAAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lblBHT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBHT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblBHTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblBHTFocusLost(evt);
            }
        });
        lblBHT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblBHTKeyReleased(evt);
            }
        });
        jPanel4.add(lblBHT);

        cmbaddtype.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbaddtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbaddtypeItemStateChanged(evt);
            }
        });
        cmbaddtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbaddtypeActionPerformed(evt);
            }
        });
        cmbaddtype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbaddtypeFocusLost(evt);
            }
        });

        lbladdtype.setText("Type Code");

        txthc.setEditable(false);
        txthc.setForeground(new java.awt.Color(153, 0, 51));
        txthc.setText("H/C");
        txthc.setBorder(null);
        txthc.setEnabled(false);
        txthc.setOpaque(false);
        txthc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cmbaddtype, 0, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbladdtype, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbladdtype, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cmbaddtype, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txthc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel2);

        txtAddress1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txtAddress1);

        txtAddress2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txtAddress2);

        txtAddress3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txtAddress3);

        jPanel6.setLayout(new java.awt.GridLayout(6, 0));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(jLabel20);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Age :");
        jPanel6.add(jLabel16);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Status :");
        jPanel6.add(jLabel19);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Guardian :");
        jPanel6.add(jLabel18);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Police Station :");
        jPanel6.add(jLabel15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ward :");
        jPanel6.add(jLabel1);

        jPanel7.setLayout(new java.awt.GridLayout(6, 0));

        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(jLabel21);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("YYY");
        jLabel25.setAutoscrolls(true);
        jPanel14.add(jLabel25);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("MM");
        jLabel27.setAutoscrolls(true);
        jPanel14.add(jLabel27);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel14.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("DD");
        jLabel29.setAutoscrolls(true);
        jPanel14.add(jLabel29);

        jPanel7.add(jPanel14);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Years");
        jPanel8.add(jLabel14);

        txty.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txty.setToolTipText("Ex:018 (3 digits)");
        txty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtyFocusLost(evt);
            }
        });
        jPanel8.add(txty);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Months");
        jPanel8.add(jLabel23);

        txtm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtm.setToolTipText("Ex:08 (2 digits)");
        txtm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmFocusLost(evt);
            }
        });
        jPanel8.add(txtm);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Days");
        jPanel8.add(jLabel24);

        txtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtd.setToolTipText("Ex:08 (2 digits)");
        txtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdFocusLost(evt);
            }
        });
        jPanel8.add(txtd);

        jPanel7.add(jPanel8);

        cmbstatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "S" }));
        cmbstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstatusActionPerformed(evt);
            }
        });
        jPanel7.add(cmbstatus);

        txtguardin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel7.add(txtguardin);

        txtpstation.setEditable(true);
        jPanel7.add(txtpstation);

        cmbward.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(cmbward);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnBHTnum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBHTnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New.gif"))); // NOI18N
        btnBHTnum.setText("New BHT ");
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
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
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

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Patients Admission");

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.GridLayout(6, 1));

        lblPID.setBackground(new java.awt.Color(244, 244, 204));
        lblPID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPID.setForeground(new java.awt.Color(102, 0, 0));
        lblPID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        lblPID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPIDKeyReleased(evt);
            }
        });
        jPanel5.add(lblPID);

        lblname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 0, 0));
        lblname.setText("Name");
        jPanel5.add(lblname);

        lblsex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsex.setForeground(new java.awt.Color(102, 0, 0));
        lblsex.setText("Sex");
        jPanel5.add(lblsex);

        lblreligen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblreligen.setForeground(new java.awt.Color(102, 0, 0));
        lblreligen.setText("Religion :");
        jPanel5.add(lblreligen);

        txtregidate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtregidate.setForeground(new java.awt.Color(102, 0, 0));
        txtregidate.setText("Registry Date");
        jPanel5.add(txtregidate);

        txtadmtdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtadmtdate.setForeground(new java.awt.Color(102, 0, 0));
        txtadmtdate.setText("Admitted Date :");
        jPanel5.add(txtadmtdate);

        lblinsname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinsname.setForeground(new java.awt.Color(0, 0, 255));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblvisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number of Visits"
            }
        ));
        tblvisits.setRequestFocusEnabled(false);
        tblvisits.setRowHeight(20);
        tblvisits.setShowHorizontalLines(false);
        jScrollPane3.setViewportView(tblvisits);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1001, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(719, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(387, 387, 387)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(629, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(469, 469, 469)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(424, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        tbladmission.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tbladmission.setRowHeight(25);
        tbladmission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbladmissionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbladmission);

        lblrecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrecords.setText("counter");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblBHT1.setBackground(new java.awt.Color(244, 244, 204));
        lblBHT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        lblBHT1.setForeground(new java.awt.Color(153, 153, 153));
        lblBHT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBHT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblBHT1FocusGained(evt);
            }
        });

        btnAdmission.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/56.gif"))); // NOI18N
        btnAdmission.setText("Registration");
        btnAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmissionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(716, 716, 716)
                                .addComponent(lblrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblBHT1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(btnAdmission, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblBHT1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdmission)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {100, 125, 160, 155, 140, 80, 170, 60, 60, 60, 100, 100, 100, 100};
        wans_javalib.Tables.setTableModel(executeQuery, tbladmission, Tblmod, columnWidth);
        int RCount = voidmodule.RCount(query);
        if (RCount == 0) {
            DefaultTableModel addabl = (DefaultTableModel) tbladmission.getModel();
            while (tbladmission.getRowCount() > 0) {
                addabl.removeRow(0);
            }
        }
        lblrecords.setText("Number Of Records : " + RCount);

    }

    public void tblvist(Object PID) throws SQLException {
        String query = "SELECT bhtno AS Previous_Visits from admissions WHERE pidno ='" + PID + "'";
        Statement rss = dbconnector.conn().createStatement();
        ResultSet executeQuery = rss.executeQuery(query);

        int columnWidth[] = {50};
        wans_javalib.Tables.setTableModel(executeQuery, tblvisits, query, columnWidth);

    }
    private void tbladmissionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbladmissionMouseReleased
        int SelectedRow = tbladmission.getSelectedRow();
        Object BHT = tbladmission.getValueAt(SelectedRow, 1).toString();
        String PID = lblPID.getText();
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT pidno from admissions WHERE bhtno ='" + BHT + "'");
            while (rs.next()) {
                PID = (rs.getString("pidno"));
                lblPID.setText(PID);
            }
            Clickent(BHT);
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        this.viewregidate(PID);
        try {
            tblvist(PID);

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tbladmissionMouseReleased
    void retreveData(Object BHT) {
        String PID;

        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * from admissions WHERE bhtno ='" + BHT + "'");

            while (rs.next()) {

                txtdate.setText(rs.getString("adm_date"));
                txtadmtdate.setText("Admitted Date : " + rs.getString("adm_date"));
                txttime.setText(rs.getString("adm_time"));
                PID = (rs.getString("pidno"));
                lblPID.setText(PID);
                lblBHT.setText(rs.getString("bhtno"));
                lbladdtype.setText(rs.getString("adm_type"));
                cmbaddtype.setSelectedItem(voidmodule.Out_fieldResulr("SELECT  item  from admision_items WHERE it_code ='" + rs.getString("adm_type") + "'"));

                txtAddress1.setText(rs.getString("adr1"));
                txtAddress2.setText(rs.getString("adr2"));
                txtAddress3.setText(rs.getString("adr3"));
                txty.setText(rs.getString("age_Y"));
                txtm.setText(rs.getString("age_M"));
                txtd.setText(rs.getString("age_D"));
                txtpstation.setSelectedItem(rs.getString("police"));
                cmbstatus.setSelectedItem(rs.getString("status"));
                txtguardin.setText(rs.getString("guardian"));
                cmbward.setSelectedItem(rs.getString("w_num"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void btnBHTnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBHTnumActionPerformed

        if (lblPID.getText().equals(MDI.DEPTCODE) || (lblPID.getText().equals(""))) {
            MessageBox.ok("No PID Number");
        } else {
            try {
                newbht();
                voidmodule.U_transaction("user", "addnew admission bht ");
            } catch (SQLException ex) {
                Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        txtdate.requestFocus();
    }//GEN-LAST:event_btnBHTnumActionPerformed
    void newbht() throws SQLException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfT = new SimpleDateFormat("HH:mm");
        DateFormat dfyy = new SimpleDateFormat("yy");
        String fdate = txtdate.getText().substring(0, 4);
        lblBHT.setText(null);
//        txtdate.setText(df.format(new Date()));
//        txttime.setText(dfT.format(new Date()));

        String yy = txtdate.getText().substring(2, 4);
        String Code = MDI.DEPTCODE;
        NumberFormat nf1 = new DecimalFormat("000000");
        String Autobht = MDI.Autobht();
        sno = (voidmodule.getmax("SELECT srno from admissions WHERE year(adm_date) ='" + fdate + "'ORDER BY srno"));
        if (Autobht.equals("1")) {
            lblBHT.setEditable(true);
            lblBHT.setText(Code + "I-" + yy + nf1.format(sno));
            lblBHT.requestFocus();
            lblBHT.setSelectionStart(6);
        } else {

            lblBHT.setText(nf1.format(sno));
            lblBHT.setEditable(false);
        }
        cmbaddtype.setSelectedItem(null);
        txtAddress1.setText(null);
        txtAddress2.setText(null);
        txtAddress3.setText(null);
        txty.setText("0");
        txtm.setText("0");
        txtd.setText("0");
        cmbstatus.setSelectedItem(null);
        txtguardin.setText(null);
        txtpstation.setSelectedItem(null);
        cmbward.setSelectedItem(null);

        btnSave.setText("Save");


        //    varible();
    }

    void varible() throws SQLException {

        DateFormat dfyy = new SimpleDateFormat("yy");

        admissiondate = txtdate.getText().toString();
        String fdate = admissiondate.substring(0, 4);
        String yy = admissiondate.substring(2, 4);
        String Code = MDI.DEPTCODE;
        NumberFormat nf1 = new DecimalFormat(Code + "I-" + yy + "000000");
        admsntime = txttime.getText();
        BHTnum = lblBHT.getText();
        PIDnum = lblPID.getText();
        newBHTNo = "";
        sno = (voidmodule.getmax("SELECT srno from admissions WHERE year(adm_date) ='" + fdate + "'ORDER BY srno"));

        String Autobht = MDI.Autobht();
        if (Autobht.equals("1")) {
            lblBHT.setEditable(true);
            newBHTNo = lblBHT.getText();
        } else {
            lblBHT.setText(nf1.format(sno));
            lblBHT.setEditable(false);
            newBHTNo = lblBHT.getText();
        }

        type = lbladdtype.getText();
        Address1 = txtAddress1.getText();
        Address2 = txtAddress2.getText();
        Address3 = txtAddress3.getText();
        pstation = txtpstation.getSelectedItem();
        status = cmbstatus.getSelectedItem();
        guardin = txtguardin.getText();
        ward = cmbward.getSelectedItem();
        if (txthc.getText().equals("")) {
            hospid = 0;
        } else {
            hospid = Integer.parseInt(txthc.getText());
        }
    }

    public void viewregidate(String PID) {
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT title,init,name,sex,religion,regidate from register WHERE pid ='" + PID + "'");
            while (rs.next()) {
                lblPID.setText(PID);
                lblname.setText("Name : " + rs.getString("title") + " " + rs.getString("init") + " " + rs.getString("name"));
                lblsex.setText("Sex : " + rs.getString("sex"));
                lblreligen.setText("Religion : " + rs.getString("religion"));
                txtregidate.setText("Registed Date : " + rs.getString("regidate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean bhtOK = isKeyFound("SELECT pid FROM register a WHERE a.`pid`='" + lblPID.getText() + "'");
        boolean oK_DateTime = isOK_DateTime(txtdate.getText());
        boolean oK_DateTime1 = isOK_Time(txttime.getText());
        if (bhtOK == true && oK_DateTime == true && oK_DateTime1 == true) {
            try {
                save();
            } catch (SQLException ex) {
                MessageBox.ok("Incorrect Data Found \nPlease enter correctly -Save");
            }
        } else {
            MessageBox.ok("Incorrect Data Found \nPlease enter correctly-SaveActionPerformed ");
            txtdate.requestFocus();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
        try {
            String toString = cmbward.getSelectedItem().toString();
        } catch (Exception e) {
            b = false;
        }


        return b;
    }

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
    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == 10) {
            try {
                save();
            } catch (SQLException ex) {
                Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveKeyPressed
    void save() throws SQLException {

        String Fbht1 = lblBHT.getText();
        this.varible();

        String pidadd = MDI.DEPTCODE;
        String yyy = txty.getText();
        String mm = txtm.getText();
        String dd = txtd.getText();
        String Fbht = lblBHT.getText();
        Y = Integer.parseInt(yyy);
        M = Integer.parseInt(mm);
        D = Integer.parseInt(dd);
        if (Y == 0 && M == 0 && D == 0) {
            isRecordValid = false;
        }
        if (isRecordValid) {
            if (!lblPID.getText().equals(pidadd)) {

                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String sysdate = df.format(new Date());


                int Count = voidmodule.RCount("SELECT bhtno from admissions WHERE bhtno ='" + BHTnum + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        try {
                            dbconnector.insertquery("UPDATE admissions SET  adm_type = '" + type + "',pidno = '" + PIDnum + "',adr1 = '" + Address1 + "',adr2 = '" + Address2 + "',adr3 = '" + Address3 + "',status = '" + status + "',guardian = '" + guardin + "',age_Y = '" + Y + "',age_M = '" + M + "',age_D = '" + D + "',sys_date = '" + sysdate + "',adm_date = '" + admissiondate + "',adm_time = '" + admsntime + "',police = '" + pstation + "',w_num = '" + ward + "',hospid = '" + hospid + "'WHERE bhtno ='" + Fbht1 + "'");

                            //     saveHospitalType("edit",Fbht1, "I");
                            this.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE adm_date ='" + admissiondate + "' ORDER BY pidno,bhtno");

                        } catch (SQLException ex) {
                            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        retreveData(Fbht1);
                    }
                } else {


                    try {

                        wordsno = (voidmodule.getmax("SELECT sno from intertransfer WHERE bhtno ='" + BHTnum + "'ORDER BY sno"));
                        dbconnector.insertquery("INSERT INTO admissions VALUES ('" + sno + "','" + type + "','" + PIDnum + "','" + newBHTNo + "','" + Address1 + "','" + Address2 + "','" + Address3 + "','" + status + "','" + guardin + "','" + Y + "','" + M + "','" + D + "','" + sysdate + "','" + admissiondate + "','" + admsntime + "','" + pstation + "','" + ward + "',0,'" + hospid + "')");
                        //   saveHospitalType("add",newBHTNo, "I");
                        JOptionPane.showMessageDialog(null, "Records Saved");
                        //   newbht();

                        //    }

                    } catch (SQLException ex) {
                        MessageBox.ok("Incorrect Data Found \nPlease enter correctly ");
                    }

                    try {

                        this.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE bhtno ='" + Fbht
                                + "' ORDER BY pidno,bhtno ");
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lblBHT.requestFocus();
                lblBHT.setSelectionStart(6);
            } else {
                MessageBox.ok("No  PID Number ");
            }
        } else {
            MessageBox.ok("Age cannot be empty ");
            isRecordValid = true;
        }
        voidmodule.U_transaction("user", "save_update admission  " + PIDnum);

    }
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        String BHT = lblBHT.getText();

        int Count = 0;
        try {
            Count = voidmodule.RCount("SELECT bhtno from diagnose WHERE bhtno ='" + BHT + "'");
            if (Count > 0) {
                MessageBox.ok("You can not Delete this Records as Diagnosed");
            } else {

                int i = MessageBox.yesno("Do You Want to Delete   " + BHT);
                if (i == 0) {
                    try {

                        dbconnector.insertquery("DELETE FROM admissions WHERE bhtno ='" + BHT + "'");
                        voidmodule.U_transaction("user", "Removed   admissions" + BHT);
                        try {
                            this.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions ORDER BY pidno,bhtno LIMIT 10");
                        } catch (SQLException ex) {
                            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        voidmodule.fillcombo(txtpstation, "SELECT DISTINCT police from admissions ORDER BY police");
        voidmodule.fillcombo(cmbward, "SELECT DISTINCT w_num from wards ORDER BY w_num");
        voidmodule.fillcombo(cmbaddtype, "SELECT DISTINCT item from admision_items ORDER BY item");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfT = new SimpleDateFormat("HH:mm");
        String date = df.format(new Date());
        txtdate.setText(date);
        txttime.setText(dfT.format(new Date()));
        this.setTitle("Patients Admission. User = " + dbconnector.uname);
        lblPID.setText(MDI.DEPTCODE);

        try {

            this.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE adm_date ='" + date + "' ORDER BY pidno,bhtno ");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblinsname.setText(voidmodule.Out_fieldResulr("SELECT DEPNAME from deptinfo"));
        txtdate.requestFocus();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmissionActionPerformed
        //   MDI.removeAllFrames();
        //    frm_Registry open = new frm_Registry();
        //    MDI.addFrame(open);
        //   frm_Registry .setVisible(true);
        dispose();

    }//GEN-LAST:event_btnAdmissionActionPerformed

    private void cmbstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstatusActionPerformed
    void Clickent(Object Clkbht) {
        int i = MessageBox.yesno("Do You Want to Add a  New Records…? ");
        if (i == 1) {
            retreveData(Clkbht);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat dfT = new SimpleDateFormat("HH:mm");
            txtdate.setText(df.format(new Date()));
            txttime.setText(dfT.format(new Date()));

            btnSave.setText("Update");
            txtdate.requestFocus();
            txtdate.setSelectionStart(0);

        } else {

            retreveData(Clkbht);



            //DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            //DateFormat dfT = new SimpleDateFormat("HH:mm");
            //txtdate.setText(df.format(new Date()));
            //txttime.setText(dfT.format(new Date()));
            String yy = txtdate.getText().substring(2, 4);
            String Code = MDI.DEPTCODE;
            String fdate = txtdate.getText().substring(0, 4);
            NumberFormat nf1 = new DecimalFormat("000000");
            sno = (voidmodule.getmax("SELECT srno from admissions WHERE year(adm_date) ='" + fdate + "'ORDER BY srno"));

            lblBHT.setText(Code + "I-" + yy + nf1.format(sno));
            txty.setText("0");
            txtm.setText("0");
            txtd.setText("0");
            txtguardin.setText(null);
            cmbward.setSelectedItem(null);
            cmbaddtype.setSelectedItem(null);
            btnSave.setText("Save");
            txtdate.requestFocus();
            txtdate.setSelectionStart(0);
            try {
                varible();
            } catch (SQLException ex) {
                Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void cmbaddtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbaddtypeActionPerformed
        Object addtype = cmbaddtype.getSelectedItem();
        lbladdtype.setText(voidmodule.Out_fieldResulr("SELECT it_code from admision_items WHERE item ='" + addtype + "' ORDER BY item"));

        txthc.setText("");
        if ("8".equals(lbladdtype.getText())) {
            txthc.setText(voidmodule.Out_fieldResulr("SELECT  hospid  from admissions WHERE bhtno ='" + lblBHT.getText() + "'"));
        }
    }//GEN-LAST:event_cmbaddtypeActionPerformed

    private void txtdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdateKeyReleased
        String date = txtdate.getText();
        try {
            this.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE adm_date LIKE'" + date + "%' ORDER BY pidno,bhtno ");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtdateKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void lblPIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPIDKeyReleased
        String PID = lblPID.getText();
        frmPIDsearch open = new frmPIDsearch(this);
        MDI.addFrame(open);
        open.setVisible(true);
        try {
            open.settblmdl("SELECT pid AS PID_Num, title,init,name AS Name from register WHERE pid LIKE'" + PID + "%'LIMIT 20");
            open.txtpidNum.setText(PID);
            open.obj0 = true;
            open.obj2 = false;
            open.obj3 = true;
            open.obj1 = true;
            open.lblttle.setText("Please Type PID Number Here");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblPIDKeyReleased

    private void txtdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusGained
        txtdate.setSelectionEnd(0);
    }//GEN-LAST:event_txtdateFocusGained

    private void txttimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimeFocusGained
        txttime.setSelectionStart(0);
    }//GEN-LAST:event_txttimeFocusGained

    private void txtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtyFocusLost
        String text = txty.getText();
        try {
            int inttext = Integer.parseInt(text);

            if (Integer.parseInt(text) < 0) {
                MessageBox.ok("Incorrect Year");
                txty.requestFocus();
                txty.setText("0");
            } else {
                try {
                    Integer.parseInt(text);
                } catch (Exception e) {
                    txty.setText("0");
                }
            }
        } catch (Exception e) {
            text = "0";
            txty.setText("0");
        }

    }//GEN-LAST:event_txtyFocusLost

    private void txtmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmFocusLost
        String text = txtm.getText();
        try {
            int inttext = Integer.parseInt(text);

            if (Integer.parseInt(text) > 12 || Integer.parseInt(text) < 0) {
                MessageBox.ok("Incorrect Month ");
                txtm.requestFocus();
                txtm.setText("0");
            } else {
                try {
                    Integer.parseInt(text);
                } catch (Exception e) {
                    txtm.setText("0");
                }
            }
        } catch (Exception e) {
            text = "0";
            txtm.setText("0");
        }

    }//GEN-LAST:event_txtmFocusLost

    private void txtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdFocusLost
        String text = txtd.getText();
        try {
            int inttext = Integer.parseInt(text);


            if (Integer.parseInt(text) > 31 || Integer.parseInt(text) < 0) {
                MessageBox.ok("Incorrect Date");
                txtd.requestFocus();
                txtd.setText("0");
            } else {
                try {
                    Integer.parseInt(text);
                } catch (Exception e) {
                    txtd.setText("0");
                }
            }
        } catch (Exception e) {
            text = "0";
            txtd.setText("0");
        }
    }//GEN-LAST:event_txtdFocusLost

    private void lblBHTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblBHTFocusGained
        lblBHT.setSelectionStart(6);
    }//GEN-LAST:event_lblBHTFocusGained

    private void lblBHTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblBHTFocusLost
        lblBHT.setText(lblBHT.getText().toUpperCase());
    }//GEN-LAST:event_lblBHTFocusLost

    private void lblBHTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblBHTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBHTKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String BHT = lblBHT1.getText();
        String PID = "";

        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT pidno from admissions WHERE bhtno ='" + BHT + "'");
            while (rs.next()) {
                PID = (rs.getString("pidno"));
                lblPID.setText(PID);
            }
            Clickent(BHT);
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        this.viewregidate(PID);
        try {
            tblvist(PID);

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }


        try {
            this.settblmdl("SELECT pidno AS PID_No,bhtno AS BHT_No,adr1 AS Address1,adr2 AS Address2,adr3 AS Address3,status AS Status,guardian AS Guardian,age_Y AS years,age_M AS Month,age_D AS Days,adm_date AS Admisn_Date,adm_time AS Time,police AS Police_Station,w_num AS Ward from admissions WHERE bhtno ='" + BHT + "' ORDER BY bhtno ");
        } catch (SQLException ex) {
            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblBHT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblBHT1FocusGained
        lblBHT1.setSelectionStart(0);
    }//GEN-LAST:event_lblBHT1FocusGained

    private void txthcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthcActionPerformed
    void saveHospitalType(String action, String BHT, String type) {
        String text = lbladdtype.getText();
        String sql = "";
        String hc = txthc.getText();
        if ("8".equals(text)) {
            try {
                if ("add".equals(action)) {


                    sql = "INSERT INTO outdoor_trans VALUES('" + hc + "','" + BHT + "','" + type + "','" + 0 + "')";

                } else {
                    String sql4 = "SELECT o.`auto` FROM outdoor_trans o where  bhtno = '" + BHT + "' and type = '" + type + "'";

                    String dblookupFromSql = wans_javalib.DBFunctions.dblastFromSql(con, sql4).toString();

                    sql = "UPDATE outdoor_trans  SET sno = '" + hc + "' WHERE  auto = '" + dblookupFromSql + "'";
                }
                con.createStatement().execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }
    private void cmbaddtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbaddtypeItemStateChanged
    }//GEN-LAST:event_cmbaddtypeItemStateChanged

    private void cmbaddtypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbaddtypeFocusLost
        String text = lbladdtype.getText();
        if ("8".equals(text)) {


            String sql = "SELECT `sno`, `name` FROM `immr`.`hospital`";
            ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con, sql);
            int colomnwiths[] = {20, 150};
            JPopupMenu pop = new JPopupMenu();
            TableUtitlity.PopupTable p = new PopupTable(resultSet, colomnwiths);
            p.addTableToPopup(pop, txthc, "sno");

        }
    }//GEN-LAST:event_cmbaddtypeFocusLost

    private void txtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtyFocusGained
        txty.setSelectionStart(0);
    }//GEN-LAST:event_txtyFocusGained

    private void txtmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmFocusGained
        txtm.setSelectionStart(0);
    }//GEN-LAST:event_txtmFocusGained

    private void txtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdFocusGained
        txtd.setSelectionStart(0);
    }//GEN-LAST:event_txtdFocusGained
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmission;
    public javax.swing.JButton btnBHTnum;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbaddtype;
    private javax.swing.JComboBox cmbstatus;
    private javax.swing.JComboBox cmbward;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JFormattedTextField lblBHT;
    public javax.swing.JFormattedTextField lblBHT1;
    public javax.swing.JTextField lblPID;
    private javax.swing.JLabel lbladdtype;
    private javax.swing.JLabel lblinsname;
    public javax.swing.JLabel lblname;
    private javax.swing.JLabel lblrecords;
    public javax.swing.JLabel lblreligen;
    public javax.swing.JLabel lblsex;
    private javax.swing.JTable tbladmission;
    private javax.swing.JTable tblvisits;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddress3;
    public javax.swing.JLabel txtadmtdate;
    private javax.swing.JFormattedTextField txtd;
    public javax.swing.JFormattedTextField txtdate;
    private javax.swing.JTextField txtguardin;
    private javax.swing.JTextField txthc;
    private javax.swing.JFormattedTextField txtm;
    private javax.swing.JComboBox txtpstation;
    public javax.swing.JLabel txtregidate;
    private javax.swing.JFormattedTextField txttime;
    private javax.swing.JFormattedTextField txty;
    // End of variables declaration//GEN-END:variables
}
