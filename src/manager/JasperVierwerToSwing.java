/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.List;
import java.util.Map;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cervanteshernandez
 */
public interface JasperVierwerToSwing {
    public String getSource();
    public List <Map<String,?>> generateDataSource();
}
