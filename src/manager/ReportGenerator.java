/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cervanteshernandez
 */
public class ReportGenerator {
    
    public JasperViewer generate(String sourceName,List <Map<String,?>> dataSource  )
    {
        try{
            JRDataSource jrDataSource = new JRBeanCollectionDataSource(dataSource);           
            JasperViewer jasperViewer;
            JasperViewerGenerator jvg = new JasperViewerGenerator();
            jasperViewer = jvg.generateJasperViewer( jrDataSource, sourceName);
            return jasperViewer;
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Paso algo raro");
        }
        return null;
    }
    
}
