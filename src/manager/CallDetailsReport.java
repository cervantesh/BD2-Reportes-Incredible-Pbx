/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Cdr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cervanteshernandez
 */
public class CallDetailsReport implements JasperVierwerToSwing{


    @Override
    public List <Map<String,?>> generateDataSource() {
        CdrManager cdrManager = new CdrManager();
        List <Map<String,?>> dataSource = new ArrayList <>();
        for(Cdr cdr: cdrManager.getAll())
        {
            Map<String,Object> m = new HashMap<>();            
            m.put("src",cdr.getSrc());
            m.put("dst",cdr.getDst());
            m.put("duration",cdr.getDuration());
            m.put("disposition",cdr.getDisposition());
            dataSource.add(m);

        }
       return dataSource;
    }

    @Override
    public String getSource() {
        return "src/hibernateReports/DetallesDeLLamadas.jrxml";
    }
    
}
