/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import com.mysql.jdbc.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import mymod.dbconnector;

/**
 *
 * @author acer
 */
public class Midnight extends javax.swing.JInternalFrame {

    Connection con = (Connection) dbconnector.c;

    /**
     * Creates new form Midnight
     */
    public Midnight() {
        initComponents();
       // option_MN.setSelected(true);
        option_MNActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo_mnt = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        combo_year = new javax.swing.JComboBox();
        option_MNS = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        combo_midnightDate = new de.wannawork.jcalendar.JCalendarComboBox();
        option_MN = new javax.swing.JRadioButton();

        setClosable(true);

        jButton1.setText("Create Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Year");

        combo_mnt.setEditable(true);
        combo_mnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combo_mnt.setForeground(new java.awt.Color(255, 0, 0));
        combo_mnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        combo_mnt.setAutoscrolls(true);
        combo_mnt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_mntItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Month");

        combo_year.setEditable(true);
        combo_year.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combo_year.setForeground(new java.awt.Color(255, 51, 51));
        combo_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015" }));
        combo_year.setAutoscrolls(true);

        buttonGroup1.add(option_MNS);
        option_MNS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        option_MNS.setText("Mid Night Census");
        option_MNS.setActionCommand("S");
        option_MNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_MNSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(option_MNS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_mnt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option_MNS)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_mnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        combo_midnightDate.setBackground(new java.awt.Color(51, 255, 51));
        combo_midnightDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo_midnightDate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                combo_midnightDateStateChanged(evt);
            }
        });

        buttonGroup1.add(option_MN);
        option_MN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        option_MN.setSelected(true);
        option_MN.setText("Mid Night Report");
        option_MN.setActionCommand("M");
        option_MN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_MNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(option_MN, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(combo_midnightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option_MN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_midnightDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_midnightDateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_combo_midnightDateStateChanged
    }//GEN-LAST:event_combo_midnightDateStateChanged

    private void combo_mntItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_mntItemStateChanged
    }//GEN-LAST:event_combo_mntItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Date date = combo_midnightDate.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dat = df.format(date);

        Map m = new HashMap();

        if ("M".equals(buttonGroup1.getSelection().getActionCommand())) {
            Report rpt = new Report();
            m.put("date", date);
            rpt.generateReport("MidNight.jrxml", m, con);
            m.clear();
        } else {
            try {


                String y = combo_year.getSelectedItem().toString();
                String mnt = combo_mnt.getSelectedItem().toString();
                int year = Integer.parseInt(y);
                int month = Integer.parseInt(mnt);
                Report rpt = new Report();

                m.put("year", year);
                m.put("month", month);
                rpt.generateReport("MidNight_Census.jrxml", m, con);
                m.clear();

            } catch (Exception e) {
                e.getMessage();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void option_MNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_MNActionPerformed
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(false);
        combo_year.setEnabled(false);
        combo_mnt.setEnabled(false);
        combo_midnightDate.setEnabled(true);
    }//GEN-LAST:event_option_MNActionPerformed

    private void option_MNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_MNSActionPerformed
        jLabel1.setEnabled(true);
        jLabel2.setEnabled(true);
        combo_year.setEnabled(true);
        combo_mnt.setEnabled(true);
        combo_midnightDate.setEnabled(false);
    }//GEN-LAST:event_option_MNSActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private de.wannawork.jcalendar.JCalendarComboBox combo_midnightDate;
    private javax.swing.JComboBox combo_mnt;
    private javax.swing.JComboBox combo_year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton option_MN;
    private javax.swing.JRadioButton option_MNS;
    // End of variables declaration//GEN-END:variables
}
