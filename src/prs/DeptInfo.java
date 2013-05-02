/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import mymod.dbconnector;
import mymod.voidmodule;
import wans_javalib.DBFunctions;

import wans_javalib.RecordManipulator;
import wans_javalib.RecordNavigator;

/**
 *
 * @author wan
 */
public class DeptInfo extends javax.swing.JInternalFrame {

    Connection con1 = (Connection) dbconnector.c;
    RecordNavigator rv;
    /**
     *
     */
    public static boolean loaded;

    /**
     * Creates new form DeptInfo
     */
    public DeptInfo() {
        //  ConnectMySql cm = new ConnectMySql(Application.host, "PayrollReports", Application.port, Application.user, Application.pass);



        //  con1 = cm.getConnection();

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txt_0deptcode = new javax.swing.JTextField();
        txt_1deptname = new javax.swing.JTextField();
        txt_2deptadr1 = new javax.swing.JTextField();
        txt_3deptadr2 = new javax.swing.JTextField();
        txt_district = new javax.swing.JTextField();
        txt_AGA = new javax.swing.JTextField();
        txt_MOH = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_headname = new javax.swing.JTextField();
        txt_Designation = new javax.swing.JTextField();
        txt_12contact = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        recordSelector = new javax.swing.JSpinner();

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

        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel8.setLayout(new java.awt.GridLayout(11, 0));

        txt_0deptcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_0deptcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_0deptcodeActionPerformed(evt);
            }
        });
        jPanel8.add(txt_0deptcode);

        txt_1deptname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_1deptname);

        txt_2deptadr1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_2deptadr1);

        txt_3deptadr2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_3deptadr2);

        txt_district.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_district);

        txt_AGA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_AGA);

        txt_MOH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_MOH);
        jPanel8.add(jLabel1);

        txt_headname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_headname);

        txt_Designation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_Designation);

        txt_12contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(txt_12contact);

        jPanel9.setLayout(new java.awt.GridLayout(11, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Department Code (Eg: KU)(3)");
        jPanel9.add(jLabel2);

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Department Name(60");
        jPanel9.add(jLabel3);

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Department Address 1(30)");
        jPanel9.add(jLabel4);

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Department Address 2(30)");
        jPanel9.add(jLabel5);

        lbl5.setForeground(new java.awt.Color(0, 0, 153));
        lbl5.setText("District (20)");
        jPanel9.add(lbl5);

        lbl6.setForeground(new java.awt.Color(0, 0, 153));
        lbl6.setText("AGA Division (30)");
        jPanel9.add(lbl6);

        lbl7.setForeground(new java.awt.Color(0, 0, 153));
        lbl7.setText("HOH Division (30 )");
        jPanel9.add(lbl7);
        jPanel9.add(jLabel6);

        lbl14.setForeground(new java.awt.Color(0, 0, 153));
        lbl14.setText("Name of Head of Department");
        jPanel9.add(lbl14);

        lbl15.setForeground(new java.awt.Color(0, 0, 153));
        lbl15.setText("Designation");
        jPanel9.add(lbl15);

        lbl13.setForeground(new java.awt.Color(0, 0, 153));
        lbl13.setText("Contact Phone Number");
        jPanel9.add(lbl13);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        btnupdate.setForeground(new java.awt.Color(204, 0, 0));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel12.add(btnupdate);

        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Help");
        jPanel12.add(jButton2);

        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.gif"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recordSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recordSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_0deptcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_0deptcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_0deptcodeActionPerformed
    Object[] values() {
        Object[] values = {txt_0deptcode.getText(), txt_1deptname.getText(), txt_2deptadr1.getText(), txt_3deptadr2.getText(), txt_district.getText(), txt_AGA.getText(), txt_MOH.getText(), txt_headname.getText(), txt_Designation.getText(), txt_12contact.getText()};
        return values;
    }

    void setrv() {
        rv = new RecordNavigator(recordSelector, con1, "Select * from deptinfo");
    }

    public static boolean isLoaded() {
        return loaded;
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // setrv();
        try {
            int DbCount = wans_javalib.DBFunctions.DbCount(con1, "deptinfo", "DEPCODE", null);

            if (DbCount == 0) {
                btnupdate.setText("Append");
            } else {
                btnupdate.setText("Update");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        //DEPCODE, DEPNAME, ADDRESS1, ADDRESS2, BANKCODE, HEADOFDEPT, DEPTSLIP, BANKNAME, BANKBRANCH, BANKACCTNO   


        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 1, 1);
        recordSelector.setModel(model);
        int DbCount;
        try {
            DbCount = DBFunctions.DbCount(con1, "deptinfo", "DEPCODE", null);
            if (DbCount == 0) {
            } else {
                recordSelector.setValue(1);
                setvals();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

this.setTitle("Deoartment Information. User = " + dbconnector.uname);
    }//GEN-LAST:event_formInternalFrameOpened

    void setvals() {
        //  Object[] record = rv.getRecord();

        String sql = "Select * from deptinfo";
        ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con1, sql);
        Object[] record = wans_javalib.RecordManipulator.getRowData(resultSet, 1);


        txt_0deptcode.setText(record[0].toString());
        txt_1deptname.setText(record[1].toString());
        txt_2deptadr1.setText(record[2].toString());
        txt_3deptadr2.setText(record[3].toString());
        txt_district.setText(record[4].toString());
        txt_AGA.setText(record[5].toString());
        txt_MOH.setText(record[6].toString());
        txt_headname.setText(record[7].toString());
        txt_Designation.setText(record[8].toString());
        txt_12contact.setText(record[9].toString());
    }

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String deptcode = (txt_0deptcode.getText());
            String deptname = txt_1deptname.getText();
            String deptadr1 = txt_2deptadr1.getText();
            String deptadr2 = txt_3deptadr2.getText();
            String distrint = txt_district.getText();
            String AGA = txt_AGA.getText();
            String MOH = txt_MOH.getText();

            String HOname = txt_headname.getText();
            String designation = txt_Designation.getText();
            String contact = txt_12contact.getText();
            
           int Count = voidmodule.RCount("SELECT DEPCODE from deptinfo WHERE DEPCODE ='" + deptcode + "'");
                    if (Count > 0) {
                        int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                        if (i == 0) {
                            try {
                                dbconnector.insertquery("UPDATE deptinfo SET  DEPNAME = '" + deptname + "',ADDRESS1 = '" + deptadr1 + "',ADDRESS2 = '" + deptadr2 + "',DISTRICT = '" + distrint + "',AGADIV = '" + AGA + "',MOHDIV = '" + MOH + "',HEADOFNAME = '" + HOname + "',DESIGNATION = '" + designation + "',CONTACT = '" + contact+ "'WHERE DEPCODE ='" + deptcode + "'");

                           } catch (SQLException ex) {
                                Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                        }
                    } else {


                        try {
                            dbconnector.insertquery("DELETE FROM deptinfo");
                            dbconnector.insertquery("INSERT INTO deptinfo VALUES ('" + deptcode + "','" + deptname + "','" + deptadr1 + "','" + deptadr2 + "','" + distrint + "','" + AGA + "','" + MOH + "','" + HOname + "','" + designation + "','" + contact + "')");
                        } catch (SQLException ex) {
                            Logger.getLogger(frm_Registry.class.getName()).log(Level.SEVERE, null, ex);
                        }}
                    voidmodule.U_transaction("user", "Update dept infor " + deptcode);
                    setvals();
        } catch (SQLException ex) {
            Logger.getLogger(DeptInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private static javax.swing.JSpinner recordSelector;
    private javax.swing.JTextField txt_0deptcode;
    private javax.swing.JTextField txt_12contact;
    private javax.swing.JTextField txt_1deptname;
    private javax.swing.JTextField txt_2deptadr1;
    private javax.swing.JTextField txt_3deptadr2;
    private javax.swing.JTextField txt_AGA;
    private javax.swing.JTextField txt_Designation;
    private javax.swing.JTextField txt_MOH;
    private javax.swing.JTextField txt_district;
    private javax.swing.JTextField txt_headname;
    // End of variables declaration//GEN-END:variables
}
