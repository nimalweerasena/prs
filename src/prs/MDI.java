package prs;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import mymod.dbconnector;
import mymod.voidmodule;

public class MDI extends javax.swing.JFrame {
    
    public static String DEPTCODE;
    public static String USER;
    
    public MDI() throws IOException {
        
        initComponents();
        
        Set<AWTKeyStroke> set = new HashSet<AWTKeyStroke>(KeyboardFocusManager.getCurrentKeyboardFocusManager().getDefaultFocusTraversalKeys(
                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        
        set.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        
        KeyboardFocusManager.getCurrentKeyboardFocusManager().setDefaultFocusTraversalKeys(
                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, set);
        
        
        String reportDir = System.getProperty("user.dir");
        String filename = "\\icons\\Home.gif";
        setIconImage(Toolkit.getDefaultToolkit().getImage(reportDir + filename));
        
        setLocationRelativeTo(this);
        setExtendedState(MAXIMIZED_BOTH);
        //setIconToDesktopLable();
        Showloging();
        
        this.setTitle(DEPTCODE);
        new AppletTimer(lbltime);
        //setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(System.getProperty("user.dir") + "\\icons\\images.JPG"))))); 
//        setLayout(new BorderLayout());
//        JLabel background = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\icons\\images.JPG"));
//        add(background);
//        repaint();
    }
    
    class c extends JDesktopPane {
        
        String iparth;
        ImageIcon icon;
        Image newimage;
        
        public c() {
            iparth = System.getProperty("user.dir") + "\\icons\\images.JPG";
            icon = new ImageIcon(iparth);
            Image image = icon.getImage();
            newimage = image.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
        }
        
        public c(String imageparth) {
            iparth = imageparth;
            icon = new ImageIcon(iparth);
            Image image = icon.getImage();
            newimage = image.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
            
        }
        //  ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "\\icons\\images.JPG");

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(newimage, 0, 0, this);
        }
    }
    
    public static String read_database(String dbname) {
        String DBcon = null;
        try {
            if (dbname.equals("immr_database")) {
                DBcon = "immr";
            }
        } catch (Exception ex) {
        }
        return DBcon;
    }

//    void setIconToDesktopLable() {
//        String filename = System.getProperty("user.dir") + "\\icons\\images.JPG";
//        Image image = Toolkit.getDefaultToolkit().getImage(filename);
////        Dimension d = new Dimension(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
////        jLabel2.setPreferredSize(d);
//        jLabel2.setSize(jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
//        Image scaledImage = image.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT);
//        ImageIcon icon = new ImageIcon(scaledImage);
//
//        jLabel2.setIcon(icon);
//    }
    void Showloging() {
        Frmloging FS = new Frmloging();
        addFrame(FS);
        FS.setSize(455, 280);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new c();
        lblInsname = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnconnection = new javax.swing.JButton();
        btnregistry = new javax.swing.JButton();
        btnadmission = new javax.swing.JButton();
        btnDiagnose = new javax.swing.JButton();
        btnICD = new javax.swing.JButton();
        btntransfer = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuhome = new javax.swing.JMenu();
        mnuward = new javax.swing.JMenuItem();
        mnuadmintype = new javax.swing.JMenuItem();
        mnuadminItems = new javax.swing.JMenuItem();
        mnuDischargetype = new javax.swing.JMenuItem();
        mnureligion = new javax.swing.JMenuItem();
        mnuHospital = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        mnutrans = new javax.swing.JMenu();
        mnuregi = new javax.swing.JMenuItem();
        mnuwardtrans = new javax.swing.JMenuItem();
        mnuaddmsn = new javax.swing.JMenuItem();
        mnudiagnosis = new javax.swing.JMenuItem();
        mnumidnight = new javax.swing.JMenuItem();
        mnudatatrans = new javax.swing.JMenu();
        mnudeptinfo = new javax.swing.JMenuItem();
        mnucretuser = new javax.swing.JMenuItem();
        mnucretuser1 = new javax.swing.JMenuItem();
        mnuuserPrivilage = new javax.swing.JMenuItem();
        mnuGT = new javax.swing.JMenuItem();
        mnuICD10 = new javax.swing.JMenu();
        mnublock = new javax.swing.JMenuItem();
        mnuchndUpass = new javax.swing.JMenu();
        mnuCUPassword = new javax.swing.JMenuItem();
        mnureport = new javax.swing.JMenu();
        mnuPRBook = new javax.swing.JMenuItem();
        mnuPRBook1 = new javax.swing.JMenuItem();
        mnuannalyzed = new javax.swing.JMenuItem();
        mnumidnight1 = new javax.swing.JMenuItem();
        mnuerrorReport = new javax.swing.JMenuItem();
        mnuUtility = new javax.swing.JMenu();
        mnuDvalidation = new javax.swing.JMenuItem();
        mnuDanalizer = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInsname.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblInsname.setForeground(new java.awt.Color(255, 153, 153));
        lblInsname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblInsnameKeyReleased(evt);
            }
        });
        lblInsname.setBounds(50, 0, 750, 220);
        jDesktopPane1.add(lblInsname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnconnection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Database.gif"))); // NOI18N
        btnconnection.setToolTipText("Database Connection");
        btnconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconnectionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnconnection);

        btnregistry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registration.jpg"))); // NOI18N
        btnregistry.setToolTipText("Patient Registration");
        btnregistry.setFocusable(false);
        btnregistry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregistry.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistryActionPerformed(evt);
            }
        });
        jToolBar1.add(btnregistry);

        btnadmission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admition.jpg"))); // NOI18N
        btnadmission.setToolTipText("Indoor Patient Admision ");
        btnadmission.setFocusable(false);
        btnadmission.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnadmission.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnadmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmissionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnadmission);

        btnDiagnose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Diagnose.jpg"))); // NOI18N
        btnDiagnose.setToolTipText("Diagnosis");
        btnDiagnose.setFocusable(false);
        btnDiagnose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiagnose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnoseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDiagnose);

        btnICD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ICD.jpg"))); // NOI18N
        btnICD.setToolTipText("ICD 10  Diseases List");
        btnICD.setFocusable(false);
        btnICD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnICD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnICD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnICD);

        btntransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Transfer.jpg"))); // NOI18N
        btntransfer.setToolTipText("Internal Transfer");
        btntransfer.setFocusable(false);
        btntransfer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btntransfer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferActionPerformed(evt);
            }
        });
        jToolBar1.add(btntransfer);

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        btnexit.setToolTipText("Internal Transfer");
        btnexit.setFocusable(false);
        btnexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnexit);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 0, 0));
        lbltime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.gif"))); // NOI18N
        lbltime.setText("time");
        jToolBar1.add(lbltime);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        mnuhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.gif"))); // NOI18N
        mnuhome.setText("Home (0)");

        mnuward.setText("Wards Info");
        mnuward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuwardActionPerformed(evt);
            }
        });
        mnuhome.add(mnuward);

        mnuadmintype.setText("Admission Type");
        mnuadmintype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuadmintypeActionPerformed(evt);
            }
        });
        mnuhome.add(mnuadmintype);

        mnuadminItems.setText("Admission Items");
        mnuadminItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuadminItemsActionPerformed(evt);
            }
        });
        mnuhome.add(mnuadminItems);

        mnuDischargetype.setText("Discharge Type");
        mnuDischargetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDischargetypeActionPerformed(evt);
            }
        });
        mnuhome.add(mnuDischargetype);

        mnureligion.setText("Religion");
        mnureligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureligionActionPerformed(evt);
            }
        });
        mnuhome.add(mnureligion);

        mnuHospital.setText("Hospitals");
        mnuHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHospitalActionPerformed(evt);
            }
        });
        mnuhome.add(mnuHospital);

        mnuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cross.png"))); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        mnuhome.add(mnuexit);

        jMenuBar1.add(mnuhome);

        mnutrans.setText("Transaction (1)");

        mnuregi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registration.jpg"))); // NOI18N
        mnuregi.setText("Registration");
        mnuregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuregiActionPerformed(evt);
            }
        });
        mnutrans.add(mnuregi);

        mnuwardtrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Transfer.jpg"))); // NOI18N
        mnuwardtrans.setText("Internal Ward Transferring");
        mnuwardtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuwardtransActionPerformed(evt);
            }
        });
        mnutrans.add(mnuwardtrans);

        mnuaddmsn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admition.jpg"))); // NOI18N
        mnuaddmsn.setText("Admission");
        mnuaddmsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddmsnActionPerformed(evt);
            }
        });
        mnutrans.add(mnuaddmsn);

        mnudiagnosis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Diagnose.jpg"))); // NOI18N
        mnudiagnosis.setText("Diagnosis");
        mnudiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudiagnosisActionPerformed(evt);
            }
        });
        mnutrans.add(mnudiagnosis);

        mnumidnight.setText("Midnight Data Entry");
        mnumidnight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumidnightActionPerformed(evt);
            }
        });
        mnutrans.add(mnumidnight);

        jMenuBar1.add(mnutrans);

        mnudatatrans.setText("Admin (2)");
        mnudatatrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudatatransActionPerformed(evt);
            }
        });

        mnudeptinfo.setText("Department Info");
        mnudeptinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudeptinfoActionPerformed(evt);
            }
        });
        mnudatatrans.add(mnudeptinfo);

        mnucretuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New.gif"))); // NOI18N
        mnucretuser.setText("Add New User");
        mnucretuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucretuserActionPerformed(evt);
            }
        });
        mnudatatrans.add(mnucretuser);

        mnucretuser1.setText("Data Transfer");
        mnucretuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucretuser1ActionPerformed(evt);
            }
        });
        mnudatatrans.add(mnucretuser1);

        mnuuserPrivilage.setText("Add  User Privileges");
        mnuuserPrivilage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuuserPrivilageActionPerformed(evt);
            }
        });
        mnudatatrans.add(mnuuserPrivilage);

        mnuGT.setText("General Stting");
        mnuGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGTActionPerformed(evt);
            }
        });
        mnudatatrans.add(mnuGT);

        jMenuBar1.add(mnudatatrans);

        mnuICD10.setText("ICD 10 Disease (3)");

        mnublock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ICD.jpg"))); // NOI18N
        mnublock.setText("ICD 10 Disease");
        mnublock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnublockActionPerformed(evt);
            }
        });
        mnuICD10.add(mnublock);

        jMenuBar1.add(mnuICD10);

        mnuchndUpass.setText("Change User Password (4)");

        mnuCUPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.gif"))); // NOI18N
        mnuCUPassword.setText("Change User Password");
        mnuCUPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCUPasswordActionPerformed(evt);
            }
        });
        mnuchndUpass.add(mnuCUPassword);

        jMenuBar1.add(mnuchndUpass);

        mnureport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        mnureport.setText("Report (5)");

        mnuPRBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        mnuPRBook.setText("Patient Registration Book");
        mnuPRBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPRBookActionPerformed(evt);
            }
        });
        mnureport.add(mnuPRBook);

        mnuPRBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        mnuPRBook1.setText("IMMR Reports");
        mnuPRBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPRBook1ActionPerformed(evt);
            }
        });
        mnureport.add(mnuPRBook1);

        mnuannalyzed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        mnuannalyzed.setText("Summary Analysis");
        mnuannalyzed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuannalyzedActionPerformed(evt);
            }
        });
        mnureport.add(mnuannalyzed);

        mnumidnight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        mnumidnight1.setText("Midnight Report");
        mnumidnight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumidnight1ActionPerformed(evt);
            }
        });
        mnureport.add(mnumidnight1);

        mnuerrorReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        mnuerrorReport.setText("Error Report");
        mnuerrorReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuerrorReportActionPerformed(evt);
            }
        });
        mnureport.add(mnuerrorReport);

        jMenuBar1.add(mnureport);

        mnuUtility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3.gif"))); // NOI18N
        mnuUtility.setText("Utility (6)");

        mnuDvalidation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/database_error.png"))); // NOI18N
        mnuDvalidation.setText("Data Validation ");
        mnuDvalidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDvalidationActionPerformed(evt);
            }
        });
        mnuUtility.add(mnuDvalidation);

        mnuDanalizer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bricks.png"))); // NOI18N
        mnuDanalizer.setText("Data Analizer");
        mnuDanalizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDanalizerActionPerformed(evt);
            }
        });
        mnuUtility.add(mnuDanalizer);

        jMenuBar1.add(mnuUtility);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconnectionActionPerformed
        Frmloging FS = new Frmloging();
        addFrame(FS);
        FS.setSize(455, 280);
        //   logging();
    }//GEN-LAST:event_btnconnectionActionPerformed
    
    public static void removeAllFrames() {
        JDesktopPane d = jDesktopPane1;
        d.removeAll();
    }
    private void mnuaddmsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddmsnActionPerformed
        addFrame(new Frm_admission());
    }//GEN-LAST:event_mnuaddmsnActionPerformed
    
    private void mnuregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuregiActionPerformed
        addFrame(new frm_Registry());
    }//GEN-LAST:event_mnuregiActionPerformed
    
    private void mnudiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudiagnosisActionPerformed
        addFrame(new Frm_diagnose());
    }//GEN-LAST:event_mnudiagnosisActionPerformed
    
    private void mnureligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureligionActionPerformed
        addFrame(new Frm_religion());
    }//GEN-LAST:event_mnureligionActionPerformed
    
    private void mnucretuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucretuserActionPerformed
        addFrame(new frmUser());
    }//GEN-LAST:event_mnucretuserActionPerformed
    
    private void mnudeptinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudeptinfoActionPerformed
        addFrame(new DeptInfo());
    }//GEN-LAST:event_mnudeptinfoActionPerformed
    
    private void mnublockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnublockActionPerformed
        addFrame(new Frm_ICD10());
    }//GEN-LAST:event_mnublockActionPerformed
    
    private void mnuadmintypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuadmintypeActionPerformed
        addFrame(new Frm_admintype());
    }//GEN-LAST:event_mnuadmintypeActionPerformed
    
    private void mnuwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuwardActionPerformed
        addFrame(new Frm_ward());
    }//GEN-LAST:event_mnuwardActionPerformed
    
    private void mnuDischargetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDischargetypeActionPerformed
        addFrame(new Frm_dischargetype());
    }//GEN-LAST:event_mnuDischargetypeActionPerformed
    
    private void mnuwardtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuwardtransActionPerformed
        addFrame(new Frm_wardtrans());
    }//GEN-LAST:event_mnuwardtransActionPerformed
    
    private void mnuCUPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCUPasswordActionPerformed
        addFrame(new frmchangepassword());
    }//GEN-LAST:event_mnuCUPasswordActionPerformed
    
    private void mnucretuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucretuser1ActionPerformed
        addFrame(new Frm_datatansfer());
    }//GEN-LAST:event_mnucretuser1ActionPerformed
    
    private void mnudatatransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudatatransActionPerformed
    }//GEN-LAST:event_mnudatatransActionPerformed
    
    private void btnregistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistryActionPerformed
        addFrame(new frm_Registry());
    }//GEN-LAST:event_btnregistryActionPerformed
    
    private void btnadmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmissionActionPerformed
        addFrame(new Frm_admission());
    }//GEN-LAST:event_btnadmissionActionPerformed
    
    private void btnDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnoseActionPerformed
        addFrame(new Frm_diagnose());
    }//GEN-LAST:event_btnDiagnoseActionPerformed
    
    private void btnICDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICDActionPerformed
        addFrame(new Frm_ICD10());
    }//GEN-LAST:event_btnICDActionPerformed
    
    private void btntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferActionPerformed
        addFrame(new Frm_wardtrans());
    }//GEN-LAST:event_btntransferActionPerformed
    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed
    
    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed
    
    private void mnuuserPrivilageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuuserPrivilageActionPerformed
        addFrame(new frm_UserPrevilage());
    }//GEN-LAST:event_mnuuserPrivilageActionPerformed
    
    private void mnuPRBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPRBookActionPerformed
        addFrame(new rpt_PRBook());
    }//GEN-LAST:event_mnuPRBookActionPerformed
    
    private void mnuPRBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPRBook1ActionPerformed
        addFrame(new Frm_IMMR());
    }//GEN-LAST:event_mnuPRBook1ActionPerformed
    
    private void mnuGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGTActionPerformed
       
        addFrame(new frm_generalSetting());
    }//GEN-LAST:event_mnuGTActionPerformed
    
    private void mnuadminItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuadminItemsActionPerformed
        addFrame(new Frm_admission_items());
    }//GEN-LAST:event_mnuadminItemsActionPerformed
    
    private void mnumidnightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumidnightActionPerformed
        
        addFrame(new frmmidnight());
    }//GEN-LAST:event_mnumidnightActionPerformed
    
    private void mnuannalyzedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuannalyzedActionPerformed
        
        addFrame(new AdmissionSummary());
    }//GEN-LAST:event_mnuannalyzedActionPerformed
    
    private void mnuHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHospitalActionPerformed
        addFrame(new Frm_hospital());
    }//GEN-LAST:event_mnuHospitalActionPerformed
    
    private void lblInsnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblInsnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInsnameKeyReleased
    
    private void mnumidnight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumidnight1ActionPerformed
        addFrame(new Midnight());
    }//GEN-LAST:event_mnumidnight1ActionPerformed

    private void mnuerrorReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuerrorReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuerrorReportActionPerformed

    private void mnuDvalidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDvalidationActionPerformed
        addFrame(new Audit());
    }//GEN-LAST:event_mnuDvalidationActionPerformed

    private void mnuDanalizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDanalizerActionPerformed
        addFrame(new MedicalRecordAnalizer());
    }//GEN-LAST:event_mnuDanalizerActionPerformed
    
    public static void addFrame(Component f) {
        JDesktopPane d = jDesktopPane1;
        
        int des_Height = d.getHeight();
        int des_Width = d.getWidth();
        int frame_Height = f.getHeight();
        int frame_Width = f.getWidth();
        int locX = (des_Width - frame_Width) / 2;
        //  int locY = (des_Height - frame_Height) / 2;
        int locY = 0;
        f.setLocation(locX, locY);
        jDesktopPane1.add(f);
        f.setVisible(true);
    }
    
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    new MDI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MDI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    public static void privillages1() {
        String sql = "SELECT menu_index,comp_index from privilage ";
        int Mindex = 0;
        int Cindex = 0;
        
        try {
            ResultSet rs = dbconnector.Sql_OutResultset(sql);
            while (rs.next()) {
                Mindex = Integer.parseInt(rs.getString("menu_index"));
                Cindex = Integer.parseInt(rs.getString("comp_index"));
                if (Mindex == 222) {
                    jToolBar1.getComponent(Cindex).setEnabled(false);
                } else {
                    jMenuBar1.getMenu(Mindex).getMenuComponent(Cindex).setEnabled(false);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void privillages(String User) {
        String ua = voidmodule.user_general(User);
        String xy = "1";
        if (!ua.equals(xy)) {
            
            MessageBox.ok("You Are Deactivated");
            System.exit(0);
            
        } else {
            
            String sql = "SELECT cmmd_code,cat_code from user_privilage WHERE user ='" + User + "'";
            int Mindex = 0;
            int Cindex = 0;
            
            try {
                ResultSet rs = dbconnector.Sql_OutResultset(sql);
                while (rs.next()) {
                    Mindex = Integer.parseInt(rs.getString("cmmd_code"));
                    Cindex = Integer.parseInt(rs.getString("cat_code"));
                    if (Mindex == 222) {
                        jToolBar1.getComponent(Cindex).setEnabled(true);
                    } else {
                        jMenuBar1.getMenu(Mindex).getMenuComponent(Cindex).setEnabled(true);
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    public static String Autobht() {
        String autobht = "";
        try {
            ResultSet rs = dbconnector.Sql_OutResultset("SELECT AutoBht from setting");
            while (rs.next()) {
                autobht = (rs.getString("AutoBht"));
            }
            
        } catch (Exception ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return autobht;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnDiagnose;
    private static javax.swing.JButton btnICD;
    private static javax.swing.JButton btnadmission;
    private static javax.swing.JButton btnconnection;
    private static javax.swing.JButton btnexit;
    private static javax.swing.JButton btnregistry;
    private static javax.swing.JButton btntransfer;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private static javax.swing.JToolBar jToolBar1;
    public static javax.swing.JLabel lblInsname;
    private static javax.swing.JLabel lbltime;
    private javax.swing.JMenuItem mnuCUPassword;
    private javax.swing.JMenuItem mnuDanalizer;
    private static javax.swing.JMenuItem mnuDischargetype;
    private javax.swing.JMenuItem mnuDvalidation;
    private javax.swing.JMenuItem mnuGT;
    private static javax.swing.JMenuItem mnuHospital;
    public static javax.swing.JMenu mnuICD10;
    private javax.swing.JMenuItem mnuPRBook;
    private javax.swing.JMenuItem mnuPRBook1;
    public static javax.swing.JMenu mnuUtility;
    private static javax.swing.JMenuItem mnuaddmsn;
    private static javax.swing.JMenuItem mnuadminItems;
    private static javax.swing.JMenuItem mnuadmintype;
    private javax.swing.JMenuItem mnuannalyzed;
    private static javax.swing.JMenuItem mnublock;
    public static javax.swing.JMenu mnuchndUpass;
    private javax.swing.JMenuItem mnucretuser;
    private javax.swing.JMenuItem mnucretuser1;
    private static javax.swing.JMenu mnudatatrans;
    private javax.swing.JMenuItem mnudeptinfo;
    private static javax.swing.JMenuItem mnudiagnosis;
    private static javax.swing.JMenuItem mnuerrorReport;
    private javax.swing.JMenuItem mnuexit;
    public static javax.swing.JMenu mnuhome;
    private static javax.swing.JMenuItem mnumidnight;
    private static javax.swing.JMenuItem mnumidnight1;
    private static javax.swing.JMenuItem mnuregi;
    private static javax.swing.JMenuItem mnureligion;
    public static javax.swing.JMenu mnureport;
    private static javax.swing.JMenu mnutrans;
    private javax.swing.JMenuItem mnuuserPrivilage;
    private static javax.swing.JMenuItem mnuward;
    private static javax.swing.JMenuItem mnuwardtrans;
    // End of variables declaration//GEN-END:variables
}
