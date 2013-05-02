package prs;

import TableUtitlity.CellValueCalculatableTable;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmmidnight extends javax.swing.JInternalFrame {

    Connection con = (Connection) dbconnector.conn();
    Integer pb = 0;
    int tot = 0;
    Boolean rowchange = true;
    int calculateColumns[] = new int[]{1, 2, 3};
    int valueColumn = 14;
    int result = 0;
    String pdt = null;
    String admncount = null;
    String transIncount = null;
    String transOutcount = null;

    public frmmidnight() {
        initComponents();
        lblInsname.setText(voidmodule.Out_fieldResulr("SELECT DEPNAME from deptinfo"));
        this.setTitle("MidNight Report. User = " + dbconnector.uname);

//        KeyListener k = new KeyAdapter() {
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                super.keyPressed(e);
//                lblrow.setText(""+tblmidnight.getSelectedRow());
//                lblcol.setText(""+tblmidnight.getSelectedColumn());
//
//                tblmidnight.editCellAt(tblmidnight.getSelectedRow(), tblmidnight.getSelectedColumn(), e);
//                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP) {
//
//                    cellCalc(calculateColumns, valueColumn, tblmidnight.getSelectedRow());
//
//                }
//
//            }
//        };
//
//        FocusListener f;
//        f = new FocusAdapter() {
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                super.focusLost(e); //To change body of generated methods, choose Tools | Templates.
//              //  Component component = e.getComponent();
//                cellCalc(calculateColumns, valueColumn, tblmidnight.getSelectedRow());
//            }
//        };
//
//        tblmidnight.addKeyListener(k);
//        tblmidnight.addFocusListener(f);
//new CellValueCalculatableTable(    new int []{1,2,3,4,5,6,7,8,9,10,11,12,13}, 14);
    }

//    void cellCalc(int calculateColumns[], int valueColumn, int row) {
//       // int val = 0;
//        int[] cellValues = new int[calculateColumns.length];
//        // int columnCount = t.getColumnCount();
//        for (int i = 0; i < calculateColumns.length; i++) {
//            try {
//                if (tblmidnight.getValueAt(row, calculateColumns[i])==null|| tblmidnight.getValueAt(row, calculateColumns[i])=="") {
//                    cellValues[i] =0;
//                }else{
//                    cellValues[i] = Integer.parseInt(tblmidnight.getValueAt(row, calculateColumns[i]).toString());
//                }
//                
//               // val = val + Integer.parseInt((String) tblmidnight.getValueAt(row, calculateColumns[i]));
//            } catch (Exception e) {
//                String message = e.getMessage();
//                System.out.println(""+message);
//            }
//
//        }
//        
//        result = cellValues[0] + cellValues[1] - cellValues[2];
//        
//        tblmidnight.setValueAt(result, row, valueColumn);
//
//
//
//        //        TableColumn column = getColumn(getColumnName(val));
//        //        Component tableCellEditorComponent = (JTextField) super.getCellEditor().getTableCellEditorComponent(this, val, rowSelectionAllowed, row, valueColumn);
//        //        tableCellEditorComponent.setEnabled(false);
//
//    }
    void settblmdl(String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {100, 125, 160, 155, 140, 80, 170, 60, 60, 60, 100, 100, 100, 100, 100};
        wans_javalib.Tables.setTableModel(executeQuery, tblmidnight, Tblmod, columnWidth);



    }

    void makeMidNightFor() throws ParseException {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(txttoDate.getDate());
        try {
            Statement createStatement = con.createStatement();

            String sql = "";
            sql = "DROP TABLE IF EXISTS `immr`.`Midnight_For`";
            createStatement.execute(sql);
//            sql = "";
//            createStatement.execute(sql);
            sql = "Create Table Midnight_For SELECT count(a.`bhtno`) as amt, a.`adm_date` as dateX, a.`w_num` as Ward , 'Adm' as item FROM admissions a where a.`adm_date` = '" + format + "' group by a.`adm_date`, a.`w_num`;";
            createStatement.execute(sql);
            sql = "Insert Into Midnight_For SELECT count(a.`bhtno`) as amt, a.`trans_date` as dateX, a.`from_w_num` as Ward , 'TrF' as item FROM intertransfer a where a.`trans_date` = '" + format + "' group by a.`trans_date`, a.`from_w_num`;";
            createStatement.execute(sql);
            sql = "Insert Into Midnight_For SELECT count(a.`bhtno`) as amt, a.`trans_date` as dateX, a.`to_w_num` as Ward , 'TrT' as item FROM intertransfer a where a.`trans_date` = '" + format + "' group by a.`trans_date`, a.`to_w_num`;";
            createStatement.execute(sql);

            String result = previousDateString(txttoDate.getDate());
            sql = "Insert Into Midnight_For SELECT  IF(m.`ttal`=0,'',m.`ttal`)as amt,'" + format + "' as dateX, w_num as Ward , 'pdt' as item FROM midnight m where m.`date` = '" + result + "'";
            createStatement.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        }



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInsname = new javax.swing.JLabel();
        txttoDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnwardtrans = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblrow = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblcol = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmidnight = new CellValueCalculatableTable(    new int []{1,2,3,4,5,6,7,8,9,10,11,12,13}, 14);

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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Midnight Report");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel1);

        lblInsname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInsname.setForeground(new java.awt.Color(255, 153, 0));
        lblInsname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(lblInsname);

        jLabel2.setText("Date :");

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Load.gif"))); // NOI18N
        btnnew.setText("Load");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel3.add(btnnew);

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave);

        btnwardtrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Transfer.jpg"))); // NOI18N
        btnwardtrans.setText("Internal Ward Transfer");
        btnwardtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwardtransActionPerformed(evt);
            }
        });
        jPanel3.add(btnwardtrans);

        btnremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove from basket.gif"))); // NOI18N
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel3.add(btnremove);

        pbar.setRequestFocusEnabled(false);
        pbar.setString("Completed");

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("R");
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3);

        lblrow.setBackground(new java.awt.Color(0, 0, 0));
        lblrow.setForeground(new java.awt.Color(255, 153, 0));
        lblrow.setText("1");
        lblrow.setOpaque(true);
        lblrow.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                lblrowHierarchyChanged(evt);
            }
        });
        lblrow.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                lblrowCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblrowInputMethodTextChanged(evt);
            }
        });
        lblrow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblrowKeyReleased(evt);
            }
        });
        jPanel4.add(lblrow);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("C");
        jLabel5.setOpaque(true);
        jPanel4.add(jLabel5);

        lblcol.setBackground(new java.awt.Color(0, 0, 0));
        lblcol.setForeground(new java.awt.Color(255, 153, 0));
        lblcol.setText("0");
        lblcol.setOpaque(true);
        jPanel4.add(lblcol);

        tblmidnight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "W_No", "ANC", "PNC", "Deli", "Bady", "Tran_In", "Tran_Out", "Tran_OH", "AMA", "Miss", "Death", "PDT", "Adm", "Disch", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, false, true, true, true, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmidnight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmidnightMouseClicked(evt);
            }
        });
        tblmidnight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblmidnightKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblmidnight);
        tblmidnight.getColumnModel().getColumn(0).setMinWidth(150);
        tblmidnight.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblmidnight.getColumnModel().getColumn(0).setMaxWidth(150);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txttoDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void addtogrid(String query) {




        String incode = null;
        Date date = txttoDate.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formatdate = df.format(date);
        try {


            DefaultTableModel addabl = (DefaultTableModel) tblmidnight.getModel();
            while (tblmidnight.getRowCount() > 0) {
                addabl.removeRow(0);
            }
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            int recordCount = wans_javalib.RecordManipulator.getRecordCount(con, query);
            pbar.setString("");
            pbar.setMinimum(0);
            pbar.setMaximum(recordCount);
            while (rs.next()) {
                txttoDate.setEnabled(false);
                incode = rs.getString("w_num");
                pb = rs.getRow();
//=====================================
                String sql5 = "SELECT"
                        + "     count(admissions.`bhtno`) AS countbht,"
                        + "     admissions.`adm_date` AS admissions_adm_date,"
                        + "     admissions.`w_num` AS admissions_w_num "
                        + "FROM"
                        + "     `admissions` admissions "
                        + "GROUP BY"
                        + "     admissions_adm_date,"
                        + "     admissions_w_num "
                        + "HAVING"
                        + "     admissions.`adm_date` = '" + formatdate + "'"
                        + "     and admissions.`w_num` = '" + incode + "'";
                admncount = voidmodule.Out_fieldResulr(sql5);
//================transIncount========================
                String sql6 = "SELECT"
                        + "     count(intertransfer.`bhtno`) AS countbht,"
                        + "     intertransfer.`trans_date` AS intertransfer_trans_date,"
                        + "     intertransfer.`to_w_num` AS intertransfer_to_w_num "
                        + "FROM"
                        + "     `intertransfer` intertransfer "
                        + "GROUP BY"
                        + "     intertransfer_trans_date,"
                        + "     intertransfer_to_w_num "
                        + "HAVING"
                        + "     intertransfer.`trans_date` = '" + formatdate + "'"
                        + "     and intertransfer.`to_w_num` = '" + incode + "'";
                transIncount = voidmodule.Out_fieldResulr(sql6);
//========================================           
                String sql7 = "SELECT"
                        + "     count(intertransfer.`bhtno`) AS countbht,"
                        + "     intertransfer.`trans_date` AS intertransfer_trans_date,"
                        + "     intertransfer.`from_w_num` AS intertransfer_from_w_num "
                        + "FROM"
                        + "     `intertransfer` intertransfer "
                        + "GROUP BY"
                        + "     intertransfer_trans_date,"
                        + "     intertransfer_from_w_num "
                        + "HAVING"
                        + "     intertransfer.`trans_date` = '" + formatdate + "'"
                        + "     and intertransfer.`from_w_num` = '" + incode + "'";
                transOutcount = voidmodule.Out_fieldResulr(sql7);
                //      addabl.addRow(new Object[]{incode, "", "", "", "", transIncount, transOutcount, "", "", "", "", "", admncount, "", "", ""});


//================previousDate========================              
                String result;

                try {
                    result = previousDateString(txttoDate.getDate());
                    String sql8 = "SELECT  IF(m.`ttal`=0,'',m.`ttal`) FROM midnight m where m.`date` = '" + result + "' and m.`w_num`= '" + incode + "'";
                    pdt = voidmodule.Out_fieldResulr(sql8);
                } catch (ParseException ex) {
                    Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
                }
                addabl.addRow(new Object[]{incode, "", "", "", "", transIncount, transOutcount, "", "", "", "", pdt, admncount, "", ""});



//                Runnable run = new Runnable() {
//
//                    public void run() {
                pbar.setValue(pb);
//
//                    }
//                };
//
//
//                Thread tr = new Thread(run);
//                tr.start();

                selectcolor();
            }
            addabl.addRow(new Object[]{"Total", "", "", "", "", "", "", "", "", "", "", "", "", "", ""});

            rss.close();

            //   tblmidnight.setShowVerticalLines(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        }
        pbar.setValue(0);
        pbar.setString("Completed !!!");
        getTotal();
        txttoDate.setEnabled(true);
    }

    class Ntcr implements TableCellRenderer {

        public Ntcr() {
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            throw new UnsupportedOperationException("Not supported yet.");

        }
    }

    String getPreviousWard(String bhtno) {
        String sql = "";

        return null;
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnwardtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwardtransActionPerformed
        MDI.addFrame(new Frm_wardtrans());
//        frmmidnight open = new frmmidnight();
//        MDI.addFrame(new frmmidnight());
//        open.setVisible(true);executeUpdate
    }//GEN-LAST:event_btnwardtransActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        savetable();

    }//GEN-LAST:event_btnsaveActionPerformed
    void savetable() {

        int ANC = 0;
        int PNC = 0;
        int deli = 0;
        int trans_IN = 0;
        int AMA = 0;
        int trans_other_hos = 0;
        int miss = 0;
        int death = 0;
        int PDT = 0;
        int trans_OUT = 0;
        int adm = 0;
        int ttal = 0;
        int disch = 0;
        int bady = 0;


        try {
            int tblRcount = tblmidnight.getRowCount();
            for (int xx = 0; xx < tblRcount - 1; xx++) {
                String w_num = tblmidnight.getValueAt(xx, 0).toString();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String date = df.format(txttoDate.getDate());

//                if ((tblmidnight.getValueAt(xx, 1) == null) || (tblmidnight.getValueAt(xx, 1) == "")) {
//                    ANC = 0;
//                } else {
//                    ANC = Integer.parseInt(tblmidnight.getValueAt(xx, 1).toString());
//                }

                try {
                    ANC = Integer.parseInt(tblmidnight.getValueAt(xx, 1).toString());
                } catch (NumberFormatException numberFormatException) {
                    ANC = 0;
                } catch (Exception sQLException) {
                    ANC = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 2) == null) || (tblmidnight.getValueAt(xx, 2) == "")) {
//                    PNC = 0;
//                } else {
//                    PNC = Integer.parseInt(tblmidnight.getValueAt(xx, 2).toString());
//                }

                try {
                    PNC = Integer.parseInt(tblmidnight.getValueAt(xx, 2).toString());
                } catch (NumberFormatException numberFormatException) {
                    PNC = 0;
                } catch (Exception sQLException) {
                    PNC = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 3) == null) || (tblmidnight.getValueAt(xx, 3) == "")) {
//                    deli = 0;
//                } else {
//                    deli = Integer.parseInt(tblmidnight.getValueAt(xx, 3).toString());
//                }

                try {
                    deli = Integer.parseInt(tblmidnight.getValueAt(xx, 3).toString());
                } catch (NumberFormatException numberFormatException) {
                    deli = 0;
                } catch (Exception sQLException) {
                    deli = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 4) == null) || (tblmidnight.getValueAt(xx, 4) == "")) {
//                    bady = 0;
//                } else {
//                    bady = Integer.parseInt(tblmidnight.getValueAt(xx, 4).toString());
//                }

                try {
                    bady = Integer.parseInt(tblmidnight.getValueAt(xx, 4).toString());
                } catch (NumberFormatException numberFormatException) {
                    bady = 0;
                } catch (Exception sQLException) {
                    bady = 0;
                }

//                if (tblmidnight.getValueAt(xx, 5) == null || (tblmidnight.getValueAt(xx, 5) == "")) {
//                    trans_IN = 0;
//                } else {
//                    trans_IN = Integer.parseInt(tblmidnight.getValueAt(xx, 5).toString());
//                }

                try {
                    trans_IN = Integer.parseInt(tblmidnight.getValueAt(xx, 5).toString());
                } catch (NumberFormatException numberFormatException) {
                    trans_IN = 0;
                } catch (Exception sQLException) {
                    trans_IN = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 6) == null) || (tblmidnight.getValueAt(xx, 6) == "")) {
//                    trans_OUT = 0;
//                } else {
//                    trans_OUT = Integer.parseInt(tblmidnight.getValueAt(xx, 6).toString());
//                }

                try {
                    trans_OUT = Integer.parseInt(tblmidnight.getValueAt(xx, 6).toString());
                } catch (NumberFormatException numberFormatException) {
                    trans_OUT = 0;
                } catch (Exception sQLException) {
                    trans_OUT = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 7) == null) || (tblmidnight.getValueAt(xx, 7) == "")) {
//                    trans_other_hos = 0;
//                } else {
//                    trans_other_hos = Integer.parseInt(tblmidnight.getValueAt(xx, 7).toString());
//                }

                try {
                    trans_other_hos = Integer.parseInt(tblmidnight.getValueAt(xx, 7).toString());
                } catch (NumberFormatException numberFormatException) {
                    trans_other_hos = 0;
                } catch (Exception sQLException) {
                    trans_other_hos = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 8) == null) || (tblmidnight.getValueAt(xx, 8) == "")) {
//                    AMA = 0;
//                } else {
//                    AMA = Integer.parseInt(tblmidnight.getValueAt(xx, 8).toString());
//                }

                try {
                    AMA = Integer.parseInt(tblmidnight.getValueAt(xx, 8).toString());
                } catch (NumberFormatException numberFormatException) {
                    AMA = 0;
                } catch (Exception sQLException) {
                    AMA = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 9) == null) || (tblmidnight.getValueAt(xx, 9) == "")) {
//                    miss = 0;
//                } else {
//                    miss = Integer.parseInt(tblmidnight.getValueAt(xx, 9).toString());
//                }

                try {
                    miss = Integer.parseInt(tblmidnight.getValueAt(xx, 9).toString());
                } catch (NumberFormatException numberFormatException) {
                    miss = 0;
                } catch (Exception sQLException) {
                    miss = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 10) == null) || (tblmidnight.getValueAt(xx, 10) == "")) {
//                    death = 0;
//                } else {
//                    death = Integer.parseInt(tblmidnight.getValueAt(xx, 10).toString());
//                }
                try {
                    death = Integer.parseInt(tblmidnight.getValueAt(xx, 10).toString());
                } catch (NumberFormatException numberFormatException) {
                    death = 0;
                } catch (Exception sQLException) {
                    death = 0;
                }
//                if ((tblmidnight.getValueAt(xx, 11) == null) || (tblmidnight.getValueAt(xx, 11) == "")|| (tblmidnight.getValueAt(xx, 11) == "0")) {
//                    PDT = 0;
//                    System.out.println("A");
//                        } else {
//                    PDT = Integer.parseInt(tblmidnight.getValueAt(xx, 11).toString());
//                       System.out.println("B");
//                }
                try {
                    PDT = Integer.parseInt(tblmidnight.getValueAt(xx, 11).toString());
                } catch (NumberFormatException numberFormatException) {
                    PDT = 0;
                } catch (Exception sQLException) {
                    PDT = 0;
                }


//                    if ((tblmidnight.getValueAt(xx, 12) == null) || (tblmidnight.getValueAt(xx, 12) == "")) {
//                        adm = 0;
//                    } else {
//                        adm = Integer.parseInt(tblmidnight.getValueAt(xx, 12).toString());
//                    }

                try {
                    adm = Integer.parseInt(tblmidnight.getValueAt(xx, 12).toString());
                } catch (NumberFormatException numberFormatException) {
                    adm = 0;
                } catch (Exception sQLException) {
                    adm = 0;
                }
//                if ((tblmidnight.getValueAt(xx, 13) == null) || (tblmidnight.getValueAt(xx, 13) == "")) {
//                    disch = 0;
//                } else {
//                    disch = Integer.parseInt(tblmidnight.getValueAt(xx, 13).toString());
//                }

                try {
                    disch = Integer.parseInt(tblmidnight.getValueAt(xx, 13).toString());
                } catch (NumberFormatException numberFormatException) {
                    disch = 0;
                } catch (Exception sQLException) {
                    disch = 0;
                }

//                if ((tblmidnight.getValueAt(xx, 14) == null) || (tblmidnight.getValueAt(xx, 14) == "")) {
//                    ttal = 0;
//                } else {
//                    ttal = Integer.parseInt(tblmidnight.getValueAt(xx, 14).toString());
//                }

                try {
                    ttal = Integer.parseInt(tblmidnight.getValueAt(xx, 14).toString());
                } catch (NumberFormatException numberFormatException) {
                    ttal = 0;
                } catch (Exception SQLException) {
                    ttal = 0;
                }

                int Count = voidmodule.RCount("SELECT w_num from midnight WHERE w_num ='" + w_num + "'AND date ='" + date + "'");
                if (Count > 0) {
                    //   int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    //   if (i == 0) {
                    dbconnector.insertquery("UPDATE midnight SET ANC = '" + ANC + "',PNC = '" + PNC + "',deli = '" + deli + "',bady = '" + bady + "',trans_IN = '" + trans_IN + "',trans_OUT = '" + trans_OUT + "',trans_other_hos = '" + trans_other_hos + "',AMA = '" + AMA + "',miss = '" + miss + "',death = '" + death + "',PDT = '" + PDT + "',adm = '" + adm + "',disch = '" + disch + "',ttal = '" + ttal + "' WHERE w_num = '" + w_num + "'AND date ='" + date + "'");
                } else {
                    dbconnector.insertquery("INSERT INTO midnight VALUES ('" + w_num + "','" + date + "','" + ANC + "','" + PNC + "','" + deli + "','" + bady + "','" + trans_IN + "','" + trans_OUT + "','" + trans_other_hos + "','" + AMA + "','" + miss + "','" + death + "','" + PDT + "','" + adm + "','" + disch + "','" + ttal + "')");
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);

        }
        JOptionPane.showMessageDialog(null, "Save Successfully...");
    }

    void selectcolor() {
        class CustomTableCellRenderer extends DefaultTableCellRenderer {

            public Component getTableCellRendererComponent(JTable table, Object obj, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, obj, isSelected, hasFocus, row, column);
//                int rowCount = table.getRowCount() - 1;
//                String parseInt = (String) table.getValueAt(rowCount, 0);

                if (isSelected) {
                    cell.setBackground(Color.GRAY);
                } else {
                    cell.setBackground(Color.lightGray);
                }
                return cell;
            }
        }

        TableColumn column1 = tblmidnight.getColumnModel().getColumn(1);
        column1.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column2 = tblmidnight.getColumnModel().getColumn(2);
        column2.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column3 = tblmidnight.getColumnModel().getColumn(3);
        column3.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column4 = tblmidnight.getColumnModel().getColumn(4);
        column4.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column7 = tblmidnight.getColumnModel().getColumn(7);
        column7.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column8 = tblmidnight.getColumnModel().getColumn(8);
        column8.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column9 = tblmidnight.getColumnModel().getColumn(9);
        column9.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column10 = tblmidnight.getColumnModel().getColumn(10);
        column10.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column13 = tblmidnight.getColumnModel().getColumn(13);
        column13.setCellRenderer(new CustomTableCellRenderer());

    }

    public String previousDateString(Date currentDate)
            throws ParseException {
        // Create a date formatter using your format string
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse the given date string into a Date object.
        // Note: This can throw a ParseException.
        Date myDate = currentDate;

        // Use the Calendar class to subtract one day
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.add(Calendar.DAY_OF_YEAR, -1);

        // Use the date formatter to produce a formatted date string
        Date previousDate = calendar.getTime();
        String result = dateFormat.format(previousDate);

        return result;
    }

    void loadData() {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(txttoDate.getDate());

        try {
            String sql = "select date from midnight where date = '" + format + "'";
            Object dblookupFromSql = wans_javalib.DBFunctions.dblookupFromSql(con, sql);

            if (dblookupFromSql != null) {

                settable1();
            } else {
                addtogrid("SELECT w_num from wards ORDER BY w_num");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static DefaultTableModel convertResultSetToTableMOdel(ResultSet rs) {
        try {
            DefaultTableModel d = new DefaultTableModel();
            ResultSetMetaData resmeta = (ResultSetMetaData) rs.getMetaData();

            int col = resmeta.getColumnCount();
            Object[] rowData = new Object[col];
            Object[] colData = new Object[col];
            //  colData[0] = "pos";

            for (int a = 0; a < col; a++) {

                colData[a] = resmeta.getColumnLabel(a + 1);

            }

            d.setColumnIdentifiers(colData);

            while (rs.next()) {
                rowData[0] = rs.getRow();
                for (int j = 0; j < col; j++) {


                    if (rs.getString(j + 1).toString() == "0") {
                        rowData[j] = null;
                    } else {
                        rowData[j] = rs.getString(j + 1);
                    }
                }
                // System.out.println(""+rowData.toString());
                d.addRow(rowData);
            }


            return d;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            return null;
        }
        //http://times.imkrisna.com/2010/05/java-resultset-to-jtable/
    }

    void settable() {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(txttoDate.getDate());

        try {
            String sql = "SELECT m.`w_num`as W_No, m.`ANC` as ANC, m.`PNC`as PNC, m.`deli` as Deli, m.`bady`as Baby, m.`trans_IN`as Tran_In, m.`trans_OUT`as Tran_Out, m.`trans_other_hos`as Tran_OH, m.`AMA`as AMA, m.`miss` as Miss, m.`death` as Death, m.`PDT`as PDT, m.`adm`as ADM, m.`disch`as Disch, m.`ttal`as Total FROM midnight m where m.`date` = '" + format + "'";
//            ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con, sql);
//            DefaultTableModel convertResultSetToTableMOdel = convertResultSetToTableMOdel(resultSet);
//            tblmidnight.setModel(convertResultSetToTableMOdel);
            wans_javalib.Tables.setTableModel1(con, tblmidnight, sql);

            // tblmidnight.getColumn("Tran_In").getCellEditor().stopCellEditing();

            tblmidnight = new CellValueCalculatableTable(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, 14);
            int rowCount = tblmidnight.getRowCount();
            int columnCount = tblmidnight.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                for (int j = 0; j < rowCount; j++) {
//                    if (tblmidnight.getValueAt(j, i)=="0") {
//                        tblmidnight.setValueAt("", j, i);
//                    }
                    System.out.println("nimal");
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void settable1() {


        String format = new SimpleDateFormat("yyyy-MM-dd").format(txttoDate.getDate());
        String wn = "";
        String ANC = "";
        String PNC = "";
        String Deli = "";
        String Baby = "";
        String trans_IN = "";
        String trans_OUT = "";
        String trans_other_hos = "";
        String AMA = "";
        String miss = "";
        String death = "";
        String PDT = "";
        String adm = "";
        String disch = "";
        String ttal = "";
        int ianc = 0;
        try {
            String sql = "SELECT m.`w_num`as W_No, m.`ANC` as ANC, m.`PNC`as PNC, m.`deli` as Deli, m.`bady`as Baby, m.`trans_IN`as Tran_In, m.`trans_OUT`as Tran_Out, m.`trans_other_hos`as Tran_OH, m.`AMA`as AMA, m.`miss` as Miss, m.`death` as Death, m.`PDT`as PDT, m.`adm`as ADM, m.`disch`as Disch, m.`ttal`as Total FROM midnight m where m.`date` = '" + format + "'";

            DefaultTableModel addabl = (DefaultTableModel) tblmidnight.getModel();
            while (tblmidnight.getRowCount() > 0) {
                addabl.removeRow(0);
            }
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(sql);
            while (rs.next()) {


                wn = rs.getString("W_No");
                ANC = rs.getString("ANC");
                if (ANC.equals("0")) {
                    ANC = "";
                }
                PNC = rs.getString("PNC");
                if (PNC.equals("0")) {
                    PNC = "";
                }
                Deli = rs.getString("Deli");
                if (Deli.equals("0")) {
                    Deli = "";
                }
                Baby = rs.getString("Baby");
                if (Baby.equals("0")) {
                    Baby = "";
                }
                trans_IN = rs.getString("Tran_In");
                if (trans_IN.equals("0")) {
                    trans_IN = "";
                }
                trans_OUT = rs.getString("Tran_Out");
                if (trans_OUT.equals("0")) {
                    trans_OUT = "";
                }
                trans_other_hos = rs.getString("Tran_OH");
                if (trans_other_hos.equals("0")) {
                    trans_other_hos = "";
                }
                AMA = rs.getString("AMA");
                if (AMA.equals("0")) {
                    AMA = "";
                }
                miss = rs.getString("Miss");
                if (miss.equals("0")) {
                    miss = "";
                }
                death = rs.getString("Death");
                if (death.equals("0")) {
                    death = "";
                }
                PDT = rs.getString("PDT");
                if (PDT.equals("0")) {
                    PDT = "";
                }
                adm = rs.getString("ADM");
                if (adm.equals("0")) {
                    adm = "";
                }
                disch = rs.getString("Disch");
                if (disch.equals("0")) {
                    disch = "";
                }
                ttal = rs.getString("Total");
                if (ttal.equals("0")) {
                    ttal = "";
                }
                addabl.addRow(new Object[]{wn, ANC, PNC, Deli, Baby, trans_IN, trans_OUT, trans_other_hos, AMA, miss, death, PDT, adm, disch, ttal});

                selectcolor();

            }
            addabl.addRow(new Object[]{"Total", "", "", "", "", "", "", "", "", "", "", "", "", "", ""});
            getTotal();
        } catch (Exception ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getTotal() {

        for (int j = 1; j < tblmidnight.getColumnCount(); j++) {
            int val = 0;
            for (int i = 0; i < tblmidnight.getRowCount() - 1; i++) {



                Object valueAt = tblmidnight.getValueAt(i, j);
                try {
                    int parseInt = Integer.parseInt(valueAt.toString());
                    val = val + parseInt;
                } catch (Exception ex) {
                }
            }

            tblmidnight.setValueAt(val, tblmidnight.getRowCount() - 1, j);
            val = 0;
        }
    }


//    void tbltotal() {
//        int columnCount[] = {1,2,3,4,5, 6, 7, 8, 9, 10, 11, 12, 13};
//        int rowCount = tblmidnight.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//
//            int ANC = Integer.parseInt(tblmidnight.getValueAt(j, i).toString());
//            ANC++;
//            System.out.println("nimal");
//
//        }
//    }
    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        Runnable run1 = new Runnable() {

            public void run() {
                // addtogrid("SELECT w_num from wards ORDER BY w_num");
                loadData();


            }
        };


        Thread tr = new Thread(run1);
        tr.start();

        //        } catch (SQLException ex) {
        //            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        //        }
//        } catch (ParseException ex) {
//            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnnewActionPerformed
    int rowval = 0;
    private void lblrowHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_lblrowHierarchyChanged
    }//GEN-LAST:event_lblrowHierarchyChanged

    private void lblrowCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblrowCaretPositionChanged
    }//GEN-LAST:event_lblrowCaretPositionChanged

    private void lblrowInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblrowInputMethodTextChanged
    }//GEN-LAST:event_lblrowInputMethodTextChanged

    private void lblrowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblrowKeyReleased
        //    inputval();
    }//GEN-LAST:event_lblrowKeyReleased

    private void tblmidnightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblmidnightKeyPressed

        int row = tblmidnight.getSelectedRow();
        int col = tblmidnight.getSelectedColumn();
        lblrow.setText(row + "");
        lblcol.setText(col + "");
    }//GEN-LAST:event_tblmidnightKeyPressed

    private void tblmidnightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmidnightMouseClicked
        int row = tblmidnight.getSelectedRow();
        int col = tblmidnight.getSelectedColumn();
        lblrow.setText(row + "");
        lblcol.setText(col + "");
    }//GEN-LAST:event_tblmidnightMouseClicked

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String date = df.format(txttoDate.getDate());
            int i = MessageBox.yesno("Do You Want to Delete   " + date);
            if (i == 0) {

                dbconnector.insertquery("DELETE FROM midnight WHERE date ='" + date + "'");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmmidnight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnremoveActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnwardtrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblInsname;
    private javax.swing.JLabel lblcol;
    private javax.swing.JLabel lblrow;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JTable tblmidnight;
    private de.wannawork.jcalendar.JCalendarComboBox txttoDate;
    // End of variables declaration//GEN-END:variables
}
