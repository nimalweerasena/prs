/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wan <wmsp1970@gmail.com>
 */
public class FinalSummary {

    int fs_item_A;
    int fs_item_B;
    int fs_item_C;
    int fs_item_D;
    int fs_item_E;
    int fs_item_F;
    int fs_item_G;
    int fs_item_H;
    int fs_item_I;
    int fs_item_J;
    String immr_summary;
    String immr_summary1;
    Connection con;
    int immryear;
    int immrquarter;

    
    /**
     * 
     * @param connection
     */
    public FinalSummary(Connection connection) {
        con = connection;
    }

    /**
     * 
     * @param connection
     * @param immr_year
     * @param immr_quarter
     */
    public FinalSummary(Connection connection, int immr_year, int immr_quarter) {
        con = connection;
        immryear = immr_year;
        immrquarter = immr_quarter;
    }

    /**
     * 
     * @return
     * start date of the quarter
     */
    public String getStartDate() {
        String startDate = "";
        Date startDateofQuarter = wans_javalib.wans_Formats.getStartDateofQuarter(immryear, immrquarter);
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        startDate = df1.format(startDateofQuarter);

        return startDate;
    }

    /**
     * 
     * @return
     * end date of the quarter
     */
    public String getEndDate() {
        String endDate = "";
        Date endDateofQuarter = wans_javalib.wans_Formats.getEndDateofQuarter(immryear, immrquarter);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        endDate = df.format(endDateofQuarter);

        return endDate;
    }

    /**
     * 
     * @return
     * 
     * Number of patients remaining in the hospital at the beginning of the quarter
     */
    public int getFs_item_A() {
        // number of patients remainning in the hospital at the beginning of the quarter
        String startDate = getStartDate();
        int dbcountFromSql = 0;
        int dbcountFromSql1 = 0;
        try {
            immr_summary = "SELECT * FROM `immr`.`immr_non_discharged` where Adm_Date<'" + startDate + "'";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);
            immr_summary = "SELECT * FROM immr_discharged where Adm_Date<'" + startDate + "'";
            dbcountFromSql1 = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);


        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dbcountFromSql + dbcountFromSql1;
    }

    /**
     * 
     * @param immrYear
     * @param immrQtr
     * @return
     * 
     * Number of patients admitted during the quarter
     */
    public int getFs_item_B(int immrYear, int immrQtr) {
        //number of patients admitted during the quarter

        //SELECT * FROM `immr`.`admissions` where adm_date >= '"++"' and adm_date <= '"+
        int dbcountFromSql = 0;

        try {
            immr_summary = "SELECT * FROM `immr`.`admissions` where adm_date >= '" + getStartDate() + "' and adm_date <= '" + getEndDate() + "'";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcountFromSql;
    }

    /**
     * 
     * @return
     * 
     * Number of discharged alive from the hospital (Excluding the Transfers)
     */
    public int getFs_item_C() {
        //number of Live discharges
        int dbcountFromSql = 0;

        try {

            //    immr_summary = "SELECT BhtNumber FROM `immr`.`immr_summary`where dischargecode=1;";
            immr_summary = "SELECT * FROM `immr`.`diagnose` where dis_code=1 and dis_date>= '" + getStartDate() + "' and dis_date <= '" + getEndDate() + "'";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcountFromSql;

    }

    /**
     * 
     * @return
     * Number transfered to other hospitals
     */
    public int getFs_item_D() {
        //number of Transfers to other hospitals
        int dbcountFromSql = 0;

        try {

            //  immr_summary = "SELECT BhtNumber FROM `immr`.`immr_summary`where dischargecode=3;";
            immr_summary = "SELECT * FROM `immr`.`diagnose` where dis_code=3 and dis_date>= '" + getStartDate() + "' and dis_date <= '" + getEndDate() + "'";

            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcountFromSql;


    }

    /**
     * 
     * @return
     * Number of deaths within 48 hours of admission to the hospital   (PatientHours)
     */
    public int getFs_item_E() {
        //number of deaths within 48 hours of admission to the hospital  (PatientHours)
        int dbcountFromSql = 0;

        try {

            // immr_summary = "SELECT BhtNumber FROM `immr`.`immr_summary`where PatientHours<48 and dischargecode=2;";
            immr_summary = "SELECT * FROM `immr`.`immr_discharged` where dis_type=2 and patienthours <=48";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcountFromSql;


    }

    /**
     * 
     * @return
     * Number of Deaths occurred during the period
     */
    public int getFs_item_F() {
        //number of deaths
        int dbcountFromSql = 0;

        try {

            //   immr_summary = "SELECT BhtNumber FROM `immr`.`immr_summary`where dischargecode=2;";
            immr_summary = "SELECT * FROM `immr`.`immr_discharged` where dis_type=2";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcountFromSql;


    }

    /**
     * 
     * 
     * @param immrYear  
     * Year
     * @param immrQtr   
     * Quarter
     * @return
     * 
     * Number of patients remaining in the hospital at the end of the quarter         
     */
 public int getFs_item_G(int immrYear, int immrQtr) {
        // number of patients remainning in the hospital at the end of the quarter         
        int dbcountFromSql = 0;
        int dbcountFromSql1 = 0;
        String s = "";
        Date endDateofQuarter = wans_javalib.wans_Formats.getEndDateofQuarter(immrYear, immrQtr);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String endDate = df.format(endDateofQuarter);
        // System.out.println("" + endDate);
        try {
            //SELECT   admissions.`bhtno` AS admissions_bhtno,     diagnose.`bhtno` AS diagnose_bhtno FROM      `diagnose` diagnose RIGHT OUTER JOIN `admissions` admissions ON diagnose.`bhtno` = admissions.`bhtno` where diagnose.`bhtno`<>""
//            immr_summary = "SELECT   admissions.`bhtno` AS admissions_bhtno,     diagnose.`bhtno` AS diagnose_bhtno FROM      `diagnose` diagnose RIGHT OUTER JOIN `admissions` admissions ON diagnose.`bhtno` = admissions.`bhtno` where diagnose.`bhtno`<>'' and adm_date <='" + endDate + "'";
//            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);
//            s = "SELECT   admissions.`bhtno` AS admissions_bhtno,     diagnose.`bhtno` AS diagnose_bhtno FROM      `diagnose` diagnose RIGHT OUTER JOIN `admissions` admissions ON diagnose.`bhtno` = admissions.`bhtno` where adm_date <='" + endDate + "'";
//            dbcountFromSql1 = wans_javalib.DBFunctions.dbcountFromSql(con, s);
            immr_summary = "SELECT * FROM immr_non_discharged i;";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);
        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //  return dbcountFromSql1 - dbcountFromSql;
        return dbcountFromSql;
    }
    /**
     * 
     * @return
     * Number of missing BHTs
     */
    public int getFs_item_H() {
        //number of missing BHTs
        int dbcountFromSql = 0;

        try {

            //    immr_summary = "SELECT BhtNumber FROM `immr`.`immr_summary`where dischargecode=4;";
            immr_summary = "SELECT * FROM `immr`.`immr_discharged` where dis_type=4";
            dbcountFromSql = wans_javalib.DBFunctions.dbcountFromSql(con, immr_summary);

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbcountFromSql;


    }

    /**
     * 
     * @param immrYear
     * @param immrQtr
     * @return
     * 
     * Total patient days(arrived by adding the daily count of all patients resident in the hospital during the quarter
     */
    public int getFs_item_I(int immrYear, int immrQtr) {
        // String s = "SELECT  * fROM    immr_summary where immr_summary.`DischargeYear`= " + immrYear + " and immr_summary.`DischargeQuarter`= " + immrQtr;
        String s = "SELECT * FROM immr_discharged";
        double dbsumFromSql = wans_javalib.DBFunctions.dbsumFromSql(con, s, "PatientDaysInQtr");
        return (int) dbsumFromSql;
    }

    /**
     * 
     * @param immrYear
     * @param immrQtr
     * @return
     * 
     * Patient beds( excluding labour,examination and unserviceable)
     */
    public int getFs_item_J(int immrYear, int immrQtr) {
        String sql = "select beds from beds where immr_year=" + immrYear + " and immr_qtr=" + immrQtr;
        double dbsumFromSql = wans_javalib.DBFunctions.dbsumFromSql(con, sql, "beds");
        return (int) dbsumFromSql;


    }

    /**
     * 
     * @param immrYear
     * @param immrQtr
     * @return
     */
    public boolean isFoundBedsForQuarter(int immrYear, int immrQtr) {
        boolean b = false;

        try {
            String sql = "select beds from beds where immr_year=" + immrYear + " and immr_qtr=" + immrQtr;
            ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con, sql);
            int recordCount = wans_javalib.wans_MetaData.recordCount(resultSet);
            if (recordCount == 0) {
                b = false;

            } else {
                b = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    /**
     * 
     * @param immrYear
     * @param immrQtr
     * @return
     */
    public int getBedsForQuarter(int immrYear, int immrQtr) {
        double dbsumFromSql = 0;

        try {
            String sql = "select beds from beds where immr_year=" + immrYear + " and immr_qtr=" + immrQtr;
            // ResultSet resultSet = wans_javalib.RecordManipulator.getResultSet(con, sql);
            dbsumFromSql = wans_javalib.DBFunctions.dbsumFromSql(con, sql, "beds");

        } catch (Exception ex) {
            Logger.getLogger(FinalSummary.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (int) dbsumFromSql;
    }
}
