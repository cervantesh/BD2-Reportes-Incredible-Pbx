/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cervanteshernandez
 */
public class JasperViewerGenerator {
    public JasperViewer generateJasperViewer(JRDataSource jrDataSource,String sourceName) throws JRException
    {
        JasperReport jrReport;
        JasperPrint jrFilledReport;
        JasperViewer jasperViewer;

        jrReport = JasperCompileManager.compileReport(sourceName);
        jrFilledReport = JasperFillManager.fillReport(jrReport, null, jrDataSource);
        jasperViewer = new JasperViewer(jrFilledReport,false);//false para que no se cierre el reporte 
        return jasperViewer;
    }
    
}
