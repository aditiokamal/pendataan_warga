/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan_warga;

/**
 *
 * @author Admin
 */
public class menuawal_user extends javax.swing.JFrame {

    /**
     * Creates new form menuawal_user
     */
    public menuawal_user() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        info = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        daftar = new javax.swing.JButton();
        lihat_data = new javax.swing.JButton();
        lihat_keu = new javax.swing.JButton();
        saran = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton5.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        info.setText("Informasi");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, 70));

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 30));

        daftar.setText("Pendaftaraan");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });
        getContentPane().add(daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, 60));

        lihat_data.setText("Data Warga");
        lihat_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihat_dataActionPerformed(evt);
            }
        });
        getContentPane().add(lihat_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 100, 60));

        lihat_keu.setText("Keuangan");
        lihat_keu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihat_keuActionPerformed(evt);
            }
        });
        getContentPane().add(lihat_keu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 100, 60));

        saran.setText("Keluhan/Saran");
        saran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saranActionPerformed(evt);
            }
        });
        getContentPane().add(saran, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/dashboard 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saranActionPerformed
        new feedback().setVisible(true);
        dispose();
    }//GEN-LAST:event_saranActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lihat_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihat_dataActionPerformed
        new popup_data_warga().setVisible(true);
        dispose();
    }//GEN-LAST:event_lihat_dataActionPerformed

    private void lihat_keuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihat_keuActionPerformed
        new keuangan().setVisible(true);
        dispose();
    }//GEN-LAST:event_lihat_keuActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        new menu_bagan().setVisible(true);
        dispose();
    }//GEN-LAST:event_infoActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        new daftar().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarActionPerformed

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
            java.util.logging.Logger.getLogger(menuawal_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuawal_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuawal_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuawal_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuawal_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftar;
    private javax.swing.JButton info;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lihat_data;
    private javax.swing.JButton lihat_keu;
    private javax.swing.JButton saran;
    // End of variables declaration//GEN-END:variables
}
