/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan_warga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Admin
 */
public class laporan extends javax.swing.JFrame {

    /**
     * Creates new form laporan
     */
    public laporan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lapkel = new javax.swing.JButton();
        lapdata = new javax.swing.JButton();
        lapiu = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        m_home = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        m_data = new javax.swing.JMenuItem();
        m_iuaran = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        m_lap1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cetak Feedback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 240, 70));

        lapkel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lapkel.setText("Cetak Laporan Dana Keluar");
        lapkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapkelActionPerformed(evt);
            }
        });
        getContentPane().add(lapkel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 243, 76));

        lapdata.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lapdata.setText("Cetak Laporan Data Warga");
        lapdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapdataActionPerformed(evt);
            }
        });
        getContentPane().add(lapdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 243, 76));

        lapiu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lapiu.setText("Cetak Laporan Iuaran Warga");
        lapiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapiuActionPerformed(evt);
            }
        });
        getContentPane().add(lapiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 243, 76));

        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 61, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\pendataan_warga\\src\\picture\\realistic-elegant-geometric-shapes-background_23-2148434482.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 450));

        m_home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        m_home.setText("Menu");
        m_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_homeActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Menu Utama");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        m_home.add(jMenuItem1);

        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        m_home.add(jMenuItem2);

        jMenuBar2.add(m_home);

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Master Data");

        m_data.setText("Data Warga");
        m_data.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        m_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_dataActionPerformed(evt);
            }
        });
        jMenu2.add(m_data);

        m_iuaran.setText("Iuaran Warga");
        m_iuaran.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        m_iuaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_iuaranActionPerformed(evt);
            }
        });
        jMenu2.add(m_iuaran);

        jMenuBar2.add(jMenu2);

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("View");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        m_lap1.setText("Laporan");
        m_lap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_lap1ActionPerformed(evt);
            }
        });
        jMenu1.add(m_lap1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void m_iuaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_iuaranActionPerformed
        // TODO add your handling code here:
        new iuaran_warga_rt().setVisible(true);
        dispose();
    }//GEN-LAST:event_m_iuaranActionPerformed

    private void m_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_homeActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_m_homeActionPerformed

    private void m_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_dataActionPerformed
        // TODO add your handling code here:
        new data_warga_rt().setVisible(true);
        dispose();
    }//GEN-LAST:event_m_dataActionPerformed

    private void m_lap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_lap1ActionPerformed
        // TODO add your handling code here:
        new laporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_m_lap1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        new laporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void lapdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapdataActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih", "root", "");
            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) koneksi;
            reportSource = System.getProperty("user.dir") + "/src/Report_laporan/reportdata.jrxml";
            reportDest = System.getProperty("user.dir") + "/src/Report_laporan/reportdata.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_lapdataActionPerformed

    private void lapiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapiuActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih", "root", "");
            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) koneksi;
            reportSource = System.getProperty("user.dir") + "/src/Report_laporan/reportiuranwarga.jrxml";
            reportDest = System.getProperty("user.dir") + "/src/Report_laporan/reportiuranwarga.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_lapiuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void lapkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapkelActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih", "root", "");
            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) koneksi;
            reportSource = System.getProperty("user.dir") + "/src/Report_laporan/reportkeluar.jrxml";
            reportDest = System.getProperty("user.dir") + "/src/Report_laporan/reportkeluar.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_lapkelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String reportSource = null;
        String reportDest = null;

        try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih", "root", "");
            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) koneksi;
            reportSource = System.getProperty("user.dir") + "/src/Report_laporan/report_feedback.jrxml";
            reportDest = System.getProperty("user.dir") + "/src/Report_laporan/report_feedback.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton lapdata;
    private javax.swing.JButton lapiu;
    private javax.swing.JButton lapkel;
    private javax.swing.JMenuItem m_data;
    private javax.swing.JMenu m_home;
    private javax.swing.JMenuItem m_iuaran;
    private javax.swing.JMenuItem m_lap1;
    // End of variables declaration//GEN-END:variables
}