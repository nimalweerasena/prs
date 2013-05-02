/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.view.JRDesignViewer;
import net.sf.jasperreports.view.JRSaveContributor;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.view.save.JRPdfSaveContributor;

/**
 *
 * @author wan(W.M.S.P. Wanasinghe)
 */
public class Report {
//MysqlConnection msc = new MysqlConnection();
    //String reportDir = "I:\\Developments\\Reports\\";

    String property = System.getProperty("user.dir");
    String reportDir = property + "\\Reports\\";
    JasperPrint jp_name;
    JasperReport jusper;

    void generateReport(String reportname, Map params, Connection con, String reportTitle) throws JRException {
        try {
            JasperReport jr = JasperCompileManager.compileReport(reportDir + reportname);

            jr.setWhenNoDataType(WhenNoDataTypeEnum.NO_PAGES);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);

            jp_name = jp;
            jusper = jr;
            jp.setName(reportTitle);


            //            JasperExportManager1 jem = new JasperExportManager1();
            //            String exportReportToPdfFile = JasperExportManager1.exportReportToPdfFile(reportDir + reportname);
            //
            //            JasperExportManager1.exportReportToPdfFile(exportReportToPdfFile, "F:\\dd.pdf");
            //
            // byte[] exportReportToPdf = JasperExportManager.exportReportToPdf(jp);



//            JRViewer view = new JRViewer(jp);
//            view.setFitWidthZoomRatio();
//            view.setVisible(true);
//

            List pages = jp.getPages();

            if (!pages.isEmpty()) {
                // JasperViewer jp1 = new JasperViewer(jp);


                JasperViewer.viewReport(jp, false);

            } else {
                JOptionPane.showMessageDialog(null, "No data for the report");
            }
            //JasperExportManager.exportReportToHtmlFile(jp, "F:\\xx.html");


            //        JRSaveContributor[] saveContributors = view.getSaveContributors();
            File f = new File("F:\\s.pdf");
//             for (int i = 0; i < saveContributors.length; i++) {
//                 System.out.println(""+saveContributors[i].getDescription()); 
//                  
//            }
//          saveContributors[1].save(jp, f);
            // JRPdfExporter exporter = new JRPdfExporter();

            ////            view.getSaveContributors()[3].save(jp, f);
            //JasperExportManager.exportReportToPdfFile(jp,"F:\\java projects\\jasper\\fg.pdf" );
            //            JasperReport jr4 = JasperCompileManager.compileReport(reportDir + reportname);
            //            JasperReport jr5 = (JasperReport)JRLoader.loadObject(reportDir + reportname);


            //JasperDesign jd = JasperManager.loadXmlDesign(reportDir + reportname);

            //JasperViewer.viewReport(jp);
            //JasperPrintManager printrep = JasperPrintManager.printPage(jr,params, true);

            //JasperReport jasperReport = (JasperReport)JRLoader.loadObject(jr.getPath());
            // JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, con );


            // 

            /*
             * PrintRequestAttributeSet print = new
             * HashPrintRequestAttributeSet(); print.add(MediaSizeName.ISO_A4);
             *
             * print.add(new JobName("Informe SICAS.", null));
             *
             * PrintServiceAttributeSet printset = new
             * HashPrintServiceAttributeSet();
             *
             * JRPrintServiceExporter jrp = new JRPrintServiceExporter();
             *
             * jrp.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,print);
             * jrp.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG,true);
             * jrp.setParameter(JRExporterParameter.JASPER_PRINT,jp);
             * jrp.exportReport();
             */


            // view.setOpaque(true);
            //   view.setVisible(true);


//            net.sf.jasperreports.engine.JasperExportManager.exportReportToHtmlFile(jp, "f:\\ss.html");
            String[] propertyNames = jp.getPropertyNames();
            for (int i = 0; i < propertyNames.length; i++) {
          //      System.out.println("propertyNames[i]");
            }
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }



    }

    void setnewreport(String reportname, Map params, Connection con) throws JRException {
        JasperReport jr = JasperCompileManager.compileReport(reportDir + reportname);
        JRQuery query = jr.getQuery();
        JRDesignViewer jv = new JRDesignViewer(jr);
        jv.loadReport(jr);
        String sql = "SELECT     ipr_paydatacross.`F11_EMPNO` AS ipr_paydatacross_F11_EMPNO FROM     `ipr_paydatacross` ipr_paydatacross     ";
        jr.setProperty("query", sql);
        JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
        JasperViewer jp1 = new JasperViewer(jp);


        jp1.viewReport(jp, false);
        JRViewer view = new JRViewer(jp);
        view.setOpaque(true);
        view.setVisible(true);
    }

    void generateReport(String reportname, Map params, Connection con) {
        try {
            // File f = new File("c:\\z.pdf");
            JasperReport jr = JasperCompileManager.compileReport(reportDir + reportname);
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);

//            JRPdfSaveContributor sc = new JRPdfSaveContributor();
//            sc.save(jp, f);
            // JasperExportManager.exportReportToPdfFile(jp, "F:\\fg.pdf");

            // JasperFillManager.fillReportToFile(jr, "f:/s.pdf", params);

            jr.setWhenNoDataType(WhenNoDataTypeEnum.NO_PAGES);
            List pages = jp.getPages();
            if (!pages.isEmpty()) {
                JasperViewer jp1 = new JasperViewer(jp);
                jp1.viewReport(jp, false);
            } else {
                JOptionPane.showMessageDialog(null, "No data for the report");
            }

            /*
             * jp.setOrientation(JasperReport.ORIENTATION_PORTRAIT);
             * JasperPrintManager.printReport(jp,false);
             */
//            JRQuery query = jr.getQuery();
//            JRDesignViewer jv = new JRDesignViewer(jr);
//            jv.loadReport(jr);
//            String sql = "SELECT     ipr_paydatacross.`F11_EMPNO` AS ipr_paydatacross_F11_EMPNO FROM     `ipr_paydatacross` ipr_paydatacross     ";
//            jr.setProperty("query", sql);
//

            //  JasperExportManager.exportReportToPdfFile(jp,"F:\\fg.pdf" );
            // JasperReport jr = JasperCompileManager.compileReport(reportDir + reportname);
            // JasperReport jr = (JasperReport)JRLoader.loadObject(reportDir + reportname);
            //JasperDesign jd = JasperManager.loadXmlDesign(reportDir + reportname);
            //JasperViewer.viewReport(jp);
            //JasperPrintManager printrep = JasperPrintManager.printPage(jr,params, true);
            //JasperReport jasperReport = (JasperReport)JRLoader.loadObject(jr.getPath());
            // JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, con );
            //
            /*
             * PrintRequestAttributeSet print = new
             * HashPrintRequestAttributeSet(); print.add(MediaSizeName.ISO_A4);
             * print.add(new JobName("Informe SICAS.", null));
             * PrintServiceAttributeSet printset = new
             * HashPrintServiceAttributeSet(); JRPrintServiceExporter jrp = new
             * JRPrintServiceExporter();
             * jrp.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,print);
             * jrp.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG,true);
             * jrp.setParameter(JRExporterParameter.JASPER_PRINT,jp);
             * jrp.exportReport();
             */

//JRPrintServiceExporter jsp = new JRPrintServiceExporter();
//jsp.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "F:/s.pdf");
//jsp.exportReport();


            JRViewer view = new JRViewer(jp);

            view.setOpaque(true);
            view.setVisible(true);


            /*
             * this.add(view); this.setSize(300,400); this.setVisible(true);
             * this.setDefaultClosOparatio(EXIT_ON_CLOSE);
             */
            //  JOptionPane.showMessageDialog(null, ex);

        } catch (JRException ex) {
            // Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }



    }

    /**
     * 
     * @param name
     */
    public void setJp_name(String name) {

        jp_name.setName(name);


    }
}

