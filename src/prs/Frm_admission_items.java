package prs;

import com.mysql.jdbc.Connection;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mymod.dbconnector;
import mymod.voidmodule;

public class Frm_admission_items extends javax.swing.JInternalFrame {

    Connection con = (Connection) dbconnector.conn();
    Boolean optR = true;

    public Frm_admission_items() {
        initComponents();
        this.setTitle("Admission Items File - User : " + dbconnector.uname + "....");
        lbltitle.setText("Admission Items File");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnaddnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreligion = new javax.swing.JTable();
        btnshowAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbladmincode = new javax.swing.JLabel();
        txt_itname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_itcode = new javax.swing.JTextField();
        lbl_admcode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_admtype = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();

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

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnaddnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New.gif"))); // NOI18N
        btnaddnew.setText("Add New");
        btnaddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddnew);

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnsave);

        btnremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnremove);

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cross.png"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel2.add(btnexit);

        tblreligion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblreligion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblreligionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblreligion);

        btnshowAll.setText("Show All");
        btnshowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnshowAll)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnshowAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_itname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Admission Item Name");

        jLabel4.setText("Admission Item Code");

        txt_itcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itcodeActionPerformed(evt);
            }
        });

        jLabel5.setText("Admission Type");

        txt_admtype.setEditable(false);
        txt_admtype.setText("Click or press F2 to select items ");
        txt_admtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_admtypeMouseClicked(evt);
            }
        });
        txt_admtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_admtypeActionPerformed(evt);
            }
        });
        txt_admtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_admtypeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_itcode)
                    .addComponent(txt_itname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_admtype, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbl_admcode, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbladmincode, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbladmincode, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_itcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_itname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_admtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lbl_admcode, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        lbltitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(0, 0, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltitle.setText("Admission Items");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitle)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {100, 500, 50};
        wans_javalib.Tables.setTableModel(executeQuery, tblreligion, Tblmod, columnWidth);

    }
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        // dbconnector.conn();

        String itname = txt_itname.getText();
        String itcode = txt_itcode.getText();
        String admcode = txt_admtype.getText();
        if (itcode.equals("0")) {
          MessageBox.ok(" 0 is invalied Item Code");  
        }else{
        try {
//it_code, item, adm_code

            int Count = voidmodule.RCount("SELECT it_code from admision_items WHERE it_code ='" + itcode + "'");
            if (Count > 0) {
                int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                if (i == 0) {
                    dbconnector.insertquery("UPDATE admision_items SET  item = '" + itname + "', adm_code = '" + admcode + "' WHERE it_code ='" + itcode + "'");

                } else {
                }
            } else {
                int max = voidmodule.getmax("SELECT it_code from admision_items ORDER BY it_code");
                dbconnector.insertquery("INSERT INTO admision_items VALUES ('" + itcode + "','" + itname + "','" + admcode + "')");
                JOptionPane.showMessageDialog(null, "Records Saved");
            }




            settblmdl("SELECT it_code as ItemCode,Item as Item,adm_code AS Code from admision_items ORDER BY it_code");
            voidmodule.U_transaction("user", "save_update admision_items  " + admcode);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblreligionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblreligionMouseReleased

        String selectedRowsCellValue_it_code = wans_javalib.Tables.getSelectedRowsCellValue(tblreligion, "ItemCode");
        String selectedRowsCellValue_item = wans_javalib.Tables.getSelectedRowsCellValue(tblreligion, "Item");
        String selectedRowsCellValue_adm_code = wans_javalib.Tables.getSelectedRowsCellValue(tblreligion, "Code");
        txt_admtype.setText(selectedRowsCellValue_adm_code);
        txt_itcode.setText(selectedRowsCellValue_it_code);
        txt_itname.setText(selectedRowsCellValue_item);
        btnsave.setText("Update");


    }//GEN-LAST:event_tblreligionMouseReleased

    private void btnshowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowAllActionPerformed
        try {
            settblmdl("SELECT it_code as ItemCode,Item as Item ,adm_code AS Code from admision_items ORDER BY it_code");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnshowAllActionPerformed
    private boolean candelete(String admincode) {
        Boolean b = true;
        String findadmincode = voidmodule.Out_fieldResulr("SELECT adm_type from admissions WHERe adm_type = '" + admincode + "'");
        if (findadmincode != null) {
            b = false;
            MessageBox.ok("This item code( "+admincode+" ) has already been used in admissions database");
        } else if ("8".equals(admincode)) {
            b = false;
            MessageBox.ok("You Can not Delete This Item Code...");
        }

        return b;
    }
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed

        String admincode = txt_itcode.getText();
        if (candelete(admincode)) {


            //if (!"8".equals(admincode)) {

            int i = MessageBox.yesno("Do You Want to Remove Item  " + admincode);
            if (i == 0) {
                try {

                    dbconnector.insertquery("DELETE FROM admision_items WHERE it_code ='" + admincode + "'");
                    voidmodule.U_transaction("user", "Remove admision_items  " + admincode);
                    settblmdl("SELECT it_code as ItemCode,Item as Item,adm_code AS Code from admision_items ORDER BY it_code");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            }
        }
        // } else {
        //    MessageBox.ok("You Can not Delete This Item Code...");
        // }

    }//GEN-LAST:event_btnremoveActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            settblmdl("SELECT it_code as ItemCode,Item as Item,adm_code AS Code from admision_items ORDER BY it_code");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        this.setTitle("Admission Items. User = " + dbconnector.uname);

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnaddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewActionPerformed
        txt_itname.setText(null);
        lbladmincode.setText(null);
        btnsave.setText("Save");
        txt_itname.requestFocus();
        voidmodule.U_transaction("user", "addnew admision_items  ");
    }//GEN-LAST:event_btnaddnewActionPerformed

    private void txt_itnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itnameActionPerformed

    private void txt_itcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itcodeActionPerformed

    private void txt_admtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_admtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admtypeActionPerformed

    private void txt_admtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_admtypeMouseClicked
        final JPopupMenu pop = new JPopupMenu();
        pop.setLayout(new BorderLayout());

        String sql = "select * from admission_types";

        ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con, sql);
        try {
            final JTable t = new JTable();
            int columnWidth[] = {10, 200};

            wans_javalib.Tables.setTableModel(resultSet, t, sql, columnWidth);
            pop.add(new JScrollPane(t));
            Dimension preferredSize = t.getPreferredSize();
            preferredSize.width += 80;
            preferredSize.height += 80;
            t.setPreferredScrollableViewportSize(preferredSize);
            t.setAutoscrolls(false);

            t.setSurrendersFocusOnKeystroke(true);
            t.setAutoCreateRowSorter(true);
            t.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
            t.setColumnSelectionAllowed(false);
            t.setToolTipText("Press <Enter> to select item");

            t.addKeyListener(new KeyListener() {

                @Override
                public void keyTyped(KeyEvent e) {
                    //  t.setFocusable(true);
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //  t.setFocusable(true);

                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {


                        String selectedRowsCellValue = wans_javalib.Tables.getSelectedRowsCellValue(t, "adm_code");
                        txt_admtype.setText(selectedRowsCellValue);
                        pop.setVisible(false);


                    } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                        pop.setVisible(false);
                        txt_admtype.requestFocus();
                    }

                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //   t.setFocusable(true);
                }
            });

            pop.show(txt_admtype, 0, txt_admtype.getHeight());
            t.requestFocus();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }



    }//GEN-LAST:event_txt_admtypeMouseClicked

    private void txt_admtypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_admtypeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            txt_admtypeMouseClicked(null);
        }
    }//GEN-LAST:event_txt_admtypeKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnew;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnshowAll;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_admcode;
    private javax.swing.JLabel lbladmincode;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblreligion;
    private javax.swing.JTextField txt_admtype;
    private javax.swing.JTextField txt_itcode;
    private javax.swing.JTextField txt_itname;
    // End of variables declaration//GEN-END:variables
}
