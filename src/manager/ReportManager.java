/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
//import org.apache.commons.logging.LogFactory;
import org.apache.commons.collections.map.ReferenceMap;

import net.sf.jasperreports.engine.fonts.SimpleFontExtensionsRegistryFactory;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.beans.factory.config.FieldRetrievingFactoryBean;

/**
 *
 * @author cervanteshernandez
 */
public class ReportManager {
    
    /*singletoneando*/
    public static ReportManager instance = null;

    public static ReportManager getInstance()
    {
        if (instance == null)
        {
            instance = new ReportManager();
        }
        return instance;
    }
    /*final singletoneo*/        
    public JasperViewer CallDetailsReport()
    {
        ReportCall cdrc;
        cdrc = new CallDetailReportCall();
        return cdrc.call();
    }
    
    public JasperViewer MostMissedCallsReport()
    {
        ReportCall mnar;
        mnar = new MostCallsMissedReportCall();
        return mnar.call();
    }
    
    public JasperViewer MostMadeCalls()
    {
        ReportCall mnar;
        mnar = new MostCallsMadeReportCall();
        return mnar.call();
    }
    
      public JasperViewer MostRecievedCalls()
    {
        ReportCall mnar;
        mnar = new MostCallsRecievedReportCall();
        return mnar.call();
    }

}
