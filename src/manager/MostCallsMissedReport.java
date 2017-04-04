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
public class MostCallsMissedReport implements JasperVierwerToSwing{


    @Override
    public List <Map<String,?>> generateDataSource() {
        CdrManager cdrManager = new CdrManager();
        List <Map<String,?>> dataSource = new ArrayList <>();
        for(Cdr cdr: cdrManager.MostCallsMissedQuery())
        {
            Map<String,Object> m = new HashMap<>();            
            m.put("dst",cdr.getDst());
            m.put("duration",CdrManager.contador);
     
            dataSource.add(m);

        }
       return dataSource;
    }

    @Override
    public String getSource() {
        return "src/hibernateReports/MenosContestadas.jrxml";
    }
    
}
