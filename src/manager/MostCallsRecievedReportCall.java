/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cervanteshernandez
 */
public class MostCallsRecievedReportCall implements ReportCall{

    @Override
    public JasperViewer call() {
        ReportGenerator rg;
        rg = new  ReportGenerator();
        
        JasperVierwerToSwing cdr;
        cdr = new MostCallsRecievedReport();
        return rg.generate(cdr.getSource(),
                cdr.generateDataSource());
    
    }
    
}
