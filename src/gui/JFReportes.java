/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author cervanteshernandez
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import manager.ReportManager;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;


public class JFReportes extends javax.swing.JFrame {

    /**
     * Creates new form JFmain
     */


    
    public JFReportes() {
        initComponents();
      
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Users/cervanteshernandez/NetBeansProjects/ReportesBD2/src/resources/reportIcon3.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes BD2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Reportes");

        jLabel2.setText("Detalles de las llamadas");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detallesLlamadas(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverCancel(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverAzul(evt);
            }
        });

        jLabel3.setText("Menos Contestadas");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosContestadas(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverCancel(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverAzul(evt);
            }
        });

        jLabel4.setText("Mas llamadas Realizadas");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masLlamdasRealizadas(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverCancel(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverAzul(evt);
            }
        });

        jLabel5.setText("Mas llamadas Recibidas");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masLlamadasRecibidas(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverCancel(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEffectHoverAzul(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void detallesLlamadas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesLlamadas
        ReportManager reportManager;
        reportManager = ReportManager.getInstance();
        JasperViewer reporte = reportManager.CallDetailsReport();
        showReporte(reporte);
    }//GEN-LAST:event_detallesLlamadas

    private void showReporte(JasperViewer jasperViewer)
    {
        
        jasperViewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jasperViewer.setLocationRelativeTo(null);
        jasperViewer.setVisible(true);
    }
    
    
    private void jLabelEffectHoverAzul(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEffectHoverAzul
        // TODO add your handling code here:
        JLabel label; 
        Font font;
        Map attributes;
        
        label = (JLabel) evt.getComponent();
        label.setForeground(Color.blue);
        font = label.getFont();
        attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        
        label.setFont(font.deriveFont(attributes));
        
        
    }//GEN-LAST:event_jLabelEffectHoverAzul

    private void jLabelEffectHoverCancel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEffectHoverCancel

        JLabel label; 
        Font font;
        Map attributes;
        label = (JLabel) evt.getComponent();
        label.setForeground(Color.BLACK);
        font = label.getFont();
        attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        
        label.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_jLabelEffectHoverCancel

    private void menosContestadas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosContestadas
        // TODO add your handling code here:
        ReportManager reportManager;
        reportManager = ReportManager.getInstance();
        JasperViewer reporte = reportManager.MostMissedCallsReport();
        showReporte(reporte);
    }//GEN-LAST:event_menosContestadas

    private void masLlamdasRealizadas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masLlamdasRealizadas
        // TODO add your handling code here:
        ReportManager reportManager;
        reportManager = ReportManager.getInstance();
        JasperViewer reporte = reportManager.MostMadeCalls();
        showReporte(reporte);
    }//GEN-LAST:event_masLlamdasRealizadas

    private void masLlamadasRecibidas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masLlamadasRecibidas
        // TODO add your handling code here:
        ReportManager reportManager;
        reportManager = ReportManager.getInstance();
        JasperViewer reporte = reportManager.MostRecievedCalls();
        showReporte(reporte);
    }//GEN-LAST:event_masLlamadasRecibidas

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFReportes jf = new JFReportes();
                jf.setVisible(true);
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
