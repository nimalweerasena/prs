/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mymod.dbconnector;
import mymod.voidmodule;

/**
 *
 * @author acer
 */
public class Frm_datatansfer extends javax.swing.JInternalFrame {

    public static String db1;
    public static String dbname;
    public static String pword1;
    public static String readLine;
    public static String uname1;
    public static String url1;
    public static String driver1 = "com.mysql.jdbc.Driver";
    public static String reportDir;
    public static String port1;
    public static String host1;
    public static Connection cc;
    com.mysql.jdbc.Connection wan;
    static int pb = 0;

    public Frm_datatansfer() {
        initComponents();

        uname1 = "root";
        pword1 = "weeranimal";
       // db1 = "test_par1213";
          db1 = "par-2013";
        host1 = "localhost";
        port1 = "3306";
        conn_par();
        wan = (com.mysql.jdbc.Connection) dbconnector.c;
    }

    public static Connection conn_par() {
        url1 = "jdbc:mysql://" + host1 + ":" + port1 + "/";
        try {
            Class.forName(driver1).newInstance();
            cc = DriverManager.getConnection(url1 + db1, uname1, pword1);
        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            // JOptionPane.showMessageDialog(null, " Incorrect MySql Server Instance");
            // System.exit(0);
        }
        return cc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Edit_BHT_Number = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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
            }
        });

        jButton1.setText("Diagnose Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Admission Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Redistration Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add Extra Field");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Remove Extra Field");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("ICD 10 Diagnose");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        pbar.setForeground(new java.awt.Color(0, 51, 255));
        pbar.setString("");
        pbar.setStringPainted(true);

        jLabel1.setText("Step 1 :Click 'Add Extra Field' Button to add new field to Diagnose Table ");

        jLabel2.setText("Step 2 :Click 'Diagnose Data' Button to add new  Diagnose list to Diagnoce Table ");

        jLabel3.setText("Step 3 :Click 'update' Button to update immr Number  Diagnose list  ");

        jLabel4.setText("Step 4 :Click 'Remove Extra Field' Button to remove extra field");

        jButton8.setText("Deaths");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        Edit_BHT_Number.setText("Edit BHT Number");
        Edit_BHT_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_BHT_NumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Edit_BHT_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3)
                .addGap(11, 11, 11)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit_BHT_Number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//SELECT     diagnose.`bhtno` AS diagnose_bhtno,     icd10_immr.`d_immrNo` AS icd10_immr_d_immrNo,     diagnose.`d_group` AS diagnose_d_group,     diagnose.`d_immrNo` AS diagnose_d_immrNo FROM     `diagnose` diagnose LEFT OUTER JOIN `icd10_immr` icd10_immr ON diagnose.`d_immrNo` = icd10_immr.`d_immrNo`
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Runnable run = new Runnable() {

            public void run() {
                diagnose();
            }
        };


        Thread tr = new Thread(run);
        tr.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    void diagnose() {



        try {
            int i = MessageBox.yesno("Do You Want to Delete Previous Diagnose Records …? ");
            if (i == 0) {
                dbconnector.insertquery("DELETE FROM diagnose");
            } else {
            }


            String diagnoseDate = null;
            String discode;
            String DC = null;
            String BHTnum = null;
            String diagnose = null;
            String time = null;
            int MLegal = 0;
            int hospid = 0;
            String sysdate = null;



            try {
                java.sql.Statement rss = conn_par().createStatement();
                ResultSet rs = rss.executeQuery("SELECT * from admission WHERE a_outcome <>'" + "Not Specify" + "' AND a_outcome <>'" + " " + "' ");
                while (rs.next()) {

                    BHTnum = rs.getString("a_bhtno");
                    diagnose = (rs.getString("a_diagnose"));

                    String immrNo = "SELECT d_immrNo from icd10_immr WHERE d_Group ='" + diagnose + "'";
                    String immrNo1 = "";
                    Object dblookupFromSql = wans_javalib.DBFunctions.dblookupFromSql(wan, immrNo);
                    if (dblookupFromSql == null) {
                        immrNo1 = "";
                    } else {
                        immrNo1 = dblookupFromSql.toString();
                    }

                    System.out.println(dblookupFromSql + "bht= " + BHTnum);
                    discode = (rs.getString("a_outcome"));
                    if (discode.equals("Live Discharges")) {
                        DC = "1";
                    } else if (discode.equals("Deaths")) {
                        DC = "2";
                    } else if (discode.equals("Transfer")) {
                        DC = "3";
                    }
                    diagnoseDate = (rs.getString("a_diagnoseDate"));
                    time = (rs.getString("a_time"));
                    String replace = time.replace('.', ':');
                    replace = replace + ":00";
                    String ML = (rs.getString("a_ntfbldis"));

                    if (ML.equals("1")) {
                        MLegal = 1;
                    } else {
                        MLegal = 0;
                    }



                    sysdate = (rs.getString("a_sysdate"));



                    try {
                        dbconnector.insertquery("INSERT INTO diagnose VALUES ('" + BHTnum + "','" + diagnose + "','" + DC + "','" + sysdate + "','" + diagnoseDate + "','" + replace + "','" + MLegal + "','" + immrNo1 + "','" + hospid + "')");
                    } catch (SQLException ex) {
                        Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
                    }


                    Runnable run1 = new Runnable() {

                        public void run() {
                            pbar.setValue(pb);
                        }
                    };
                    Thread tr1 = new Thread(run1);
                    tr1.start();

                    pb++;
                }

            } catch (SQLException ex) {
                Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sno;
        String admintype;
        String pid;
        String bht;
        String add1;
        String add2;
        String add3;
        String status;
        String statusM;
        String guardian;
        String age;
        int ageY;
        int ageM;
        int ageD;
        String sysdate;
        String adm_date;
        String time;
        String police;
        String ward;
        int agroup;
        int hospid = 0;
        int max = 1;

        try {
            int i = MessageBox.yesno("Do You Want to Delete Previous admissions Records …? ");
            if (i == 0) {
                dbconnector.insertquery("DELETE FROM admissions");
            } else {
            }

            java.sql.Statement rss = conn_par().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * FROM admission ");


            while (rs.next()) {
                sno = max;
                admintype = "1";
               // pid = (rs.getString("a_PIDno").replace('T', 'L'));
                bht = (rs.getString("a_bhtno").replace('/', '-'));
                
                   pid = rs.getString("a_PIDno");
                //    bht = (rs.getString("a_bhtno"));

                add1 = (rs.getString("a_addrss1").toString().replace('\'', '`').replace('\\', '/'));
                add2 = (rs.getString("a_addrss2").toString().replace('\'', '`').replace('\\', '/'));
                add3 = (rs.getString("a_addrss3").toString().replace('\'', '`').replace('\\', '/'));
                status = (rs.getString("a_Cstatus"));
                if (status.equals("Married")) {
                    statusM = "M";
                } else {
                    statusM = "S";
                }
                guardian = (rs.getString("a_guardian").replace('\'', '`').replace('\\', '/'));

                age = (rs.getString("a_age").replace('\'', '`').replace(',', '.'));
                // temporary solution
                if (!"N/A".equals(age)) {
                    if (Double.parseDouble(age) < 0.00) {
                        ageY = 0;
                        ageM = 6;
                        ageD = 0;

                    } else {
                        double d = Double.parseDouble(age);
                        DecimalFormat dc = new DecimalFormat("000");
                        String format = dc.format(d);
                        int parseInt = Integer.parseInt(format);
                        ageY = parseInt;
                        ageM = 0;
                        ageD = 0;
                    }
                } else {
                    ageY = 0;
                    ageM = 0;
                    ageD = 0;
                }



                sysdate = (rs.getString("a_sysdate"));
                adm_date = (rs.getString("a_sysdate"));
                time = (rs.getString("a_time"));
                String replace = time.replace('.', ':');
                replace = replace + ":00";
//                DateFormat tf = new SimpleDateFormat("hh:mm:ss");
                //  Date d=null;
//                try {
//                     tim = tf.parse(replace);
//                     
//                } catch (ParseException ex) {
//                    Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
//                }

                police = (rs.getString("a_policeStin").replace('\'', '`').replace('\\', '/'));
                ward = (rs.getString("a_word").replace('\'', '`').replace('\\', '/'));
                agroup = 0;
                max++;

                try {
                    System.out.println(bht);
                    dbconnector.insertquery("INSERT INTO admissions VALUES ('" + sno + "','" + admintype + "','" + pid + "','" + bht + "','" + add1 + "','" + add2 + "','" + add3 + "','" + statusM + "','" + guardian + "','" + ageY + "','" + ageM + "','" + ageD + "','" + sysdate + "','" + adm_date + "','" + replace + "','" + police + "','" + ward + "','" + agroup + "','" + hospid + "')");

                } catch (SQLException ex) {
                    Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
                }


            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int sno;
        int max = 1;
        String pid;
        String title;
        String init;
        String lastname;
        String sex;
        String religen;
        String dob;
        String sysdate;
        String adm_date;
        String nicNo;
        int counter = 0;


        try {

            int i = MessageBox.yesno("Do You Want to Delete Previous register Records …? ");
            if (i == 0) {
                dbconnector.insertquery("DELETE FROM register");
            } else {
            }

            java.sql.Statement rss = conn_par().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * FROM registry ");
//SELECT `a_stSSno`, `a_Sno`, `a_PIDno`, `a_amount`, `a_title`, `a_initial`, `a_lastname`, `a_sex`, `a_religen`, `a_dob`, `a_sysdate`, `a_year`, `a_nicNo`, `a_user`, `a_month` FROM par.registry ;
//SELECT `pid`, `srno`, `title`, `init`, `name`, `sex`, `religion`, `dob`, `sysdate`, `regidate`, `nicno` FROM register ;
            while (rs.next()) {

                pid = (rs.getString("a_PIDno").replace('T', 'L'));
                //   pid = rs.getString("a_PIDno");
                sno = Integer.parseInt(rs.getString("a_Sno"));
                title = (rs.getString("a_title").replace('\'', '`').replace('/', ','));
                init = (rs.getString("a_initial").replace('\'', ' ').replace('/', ',').replace('\'', '.').replace('/', '.'));
                lastname = (rs.getString("a_lastname").replace('\'', '`').replace('/', ' '));
                sex = (rs.getString("a_sex"));
                religen = (rs.getString("a_religen").replace('\'', '`').replace('/', ','));
                dob = (rs.getString("a_dob"));
                sysdate = (rs.getString("a_sysdate"));
                adm_date = (rs.getString("a_sysdate"));
                nicNo = ("N_A");


                try {
                    dbconnector.insertquery("INSERT INTO register VALUES ('" + pid + "','" + sno + "','" + title + "','" + init + "','" + lastname + "','" + sex + "','" + religen + "','" + dob + "','" + sysdate + "','" + adm_date + "','" + nicNo + "')");
                    max++;
                    System.out.println(pid + " -" + counter++);

                } catch (SQLException ex) {
                    Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
                }


            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            dbconnector.insertquery("ALTER TABLE `immr`.`diagnose` ADD COLUMN `d_immrNo` VARCHAR(12) NOT NULL AFTER `med_legel`");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            dbconnector.insertquery("ALTER TABLE `immr`.`diagnose` DROP COLUMN `d_immrNo`");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Runnable run = new Runnable() {

            public void run() {
                Diaupdate();
            }
        };


        Thread tr = new Thread(run);
        tr.start();
    }//GEN-LAST:event_jButton6ActionPerformed
    void Diaupdate() {
        try {
            String immrNo = null;
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT d_immrNo from diagnose WHERE d_immrNo <>'" + "" + "'");
            int counter = 0;
            while (rs.next()) {
                immrNo = rs.getString("d_immrNo");
                System.out.println("ImmrNo : " + immrNo + "Recno : " + counter++);
                if (immrNo == null) {
                } else {
                    String Out_fieldResulr = voidmodule.Out_fieldResulr("SELECT DISTINCT d_Group from icd10_deasease WHERE d_immrNo ='" + immrNo + "'");
                    dbconnector.insertquery("UPDATE diagnose SET  d_group = '" + Out_fieldResulr + "'WHERE d_immrNo ='" + immrNo + "'");
                    Runnable run1 = new Runnable() {

                        public void run() {
                            pbar.setValue(pb);
                        }
                    };
                    Thread tr1 = new Thread(run1);
                    tr1.start();

                    pb++;
                }
            }


        } catch (SQLException ex) {
            Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String immrNo;
        String Subblock;
        String NtfblDise;
        String Group;
        String disease;


        try {
            dbconnector.insertquery("DELETE FROM icd10_deasease");
            java.sql.Statement rss = conn_par().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * FROM diagnose WHERE d_ICD10 ='" + "ICD 10" + "'");
            while (rs.next()) {
//d_Sno, d_ICD10, d_IMMR, d_immrNo, d_Chapter, d_block, d_Title, d_Subblock, d_SubTitle, d_NtfblDise, d_Group, d_disease
//d_immrNo, d_Subblock, d_NtfblDise, d_Group, d_disease
                immrNo = rs.getString("d_immrNo");
                Subblock = rs.getString("d_Subblock");
                NtfblDise = (rs.getString("d_NtfblDise"));
                Group = (rs.getString("d_Group"));
                disease = (rs.getString("d_disease"));
                try {
                    dbconnector.insertquery("INSERT INTO icd10_deasease VALUES ('" + immrNo + "','" + Subblock + "','" + NtfblDise + "','" + Group + "','" + disease + "')");
                } catch (SQLException ex) {
                    Logger.getLogger(Frm_admission.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String bht = null;
            String type = null;
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT * from deaths");

            while (rs.next()) {
                bht = rs.getString("a_bhtno");
                type = rs.getString("dis_code");
                System.out.println(bht);
                if (bht == null) {
                } else {
                    dbconnector.insertquery("UPDATE diagnose SET  dis_code = '" + type + "'WHERE bhtno ='" + bht + "'");
                    Runnable run1 = new Runnable() {

                        public void run() {
                            pbar.setValue(pb);
                        }
                    };
                    Thread tr1 = new Thread(run1);
                    tr1.start();

                    pb++;
                }
            }


        } catch (SQLException ex) {
            Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Edit_BHT_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_BHT_NumberActionPerformed
        try {
            String sql = "ALTER TABLE `immr`.`admissions` MODIFY COLUMN `pidno` VARCHAR(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL, DROP PRIMARY KEY, ADD PRIMARY KEY  USING BTREE(`bhtno`, `pidno`);";

            dbconnector.insertquery(sql);
            try {
                String newbht = "";
                String newbht2 = "";

                java.sql.Statement rsss = dbconnector.conn().createStatement();
                ResultSet rs = rsss.executeQuery("SELECT bhtno FROM admissions ");

                while (rs.next()) {
                    newbht = (rs.getString("bhtno"));
                    System.out.println(newbht);
                    newbht2 = (rs.getString("bhtno").toString().replace('/', '-'));
                    dbconnector.insertquery("UPDATE admissions SET  bhtno = '" + newbht2 + "'WHERE bhtno ='" + newbht + "'");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
            }
            sql = "ALTER TABLE `immr`.`admissions` MODIFY COLUMN `pidno` VARCHAR(8) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL;";
            dbconnector.insertquery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Frm_datatansfer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Edit_BHT_NumberActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit_BHT_Number;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JProgressBar pbar;
    // End of variables declaration//GEN-END:variables
}
