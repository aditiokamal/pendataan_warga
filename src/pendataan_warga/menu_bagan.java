/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan_warga;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author pycode
 */
public class menu_bagan extends javax.swing.JFrame {

    private void tampil_data(){
        try {
            String sql = "SELECT * FROM tb_info";
            java.sql.Connection conn =(Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

                while(res.next())
                {
                    lb_ket.setText(res.getString("ketua"));
    		    lb_wak.setText(res.getString("wakil"));
                    lb_hum.setText(res.getString("bendahara"));
    		    lb_ben.setText(res.getString("humas"));
                    lb_kea.setText(res.getString("keamanan"));
    		    lb_keb.setText(res.getString("kebersihan"));
                    lb_ola.setText(res.getString("olahraga"));
                    lb_pkk.setText(res.getString("pkk"));
                    lb_pen.setText(res.getString("penasihat"));
                    lb_ibul.setText(res.getString("bulanan"));
                    lb_ikeb.setText(res.getString("bersih"));
                    lb_iaca.setText(res.getString("acara"));
                }
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    /**
     * Creates new form menu_bagan
     */
    public menu_bagan() {
        initComponents();
        tampil_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_ket = new javax.swing.JLabel();
        lb_kea = new javax.swing.JLabel();
        lb_keb = new javax.swing.JLabel();
        lb_hum = new javax.swing.JLabel();
        lb_pen = new javax.swing.JLabel();
        lb_wak = new javax.swing.JLabel();
        lb_ben = new javax.swing.JLabel();
        lb_ola = new javax.swing.JLabel();
        lb_pkk = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_ibul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_ikeb = new javax.swing.JLabel();
        lb_iaca = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_ket.setText("jLabel1");
        getContentPane().add(lb_ket, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, 30));

        lb_kea.setText("jLabel9");
        getContentPane().add(lb_kea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 110, -1));

        lb_keb.setText("jLabel7");
        getContentPane().add(lb_keb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 110, -1));

        lb_hum.setText("jLabel3");
        getContentPane().add(lb_hum, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, 20));

        lb_pen.setText("jLabel8");
        getContentPane().add(lb_pen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 140, 20));

        lb_wak.setText("jLabel2");
        getContentPane().add(lb_wak, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 130, 30));

        lb_ben.setText("jLabel4");
        getContentPane().add(lb_ben, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 130, 20));

        lb_ola.setText("jLabel5");
        getContentPane().add(lb_ola, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 110, -1));

        lb_pkk.setText("jLabel6");
        getContentPane().add(lb_pkk, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 100, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/kkp.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 760, 530));

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("WELCOME TO SIRNAGALIH");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_ibul.setBackground(new java.awt.Color(255, 255, 255));
        lb_ibul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ibul.setForeground(new java.awt.Color(255, 255, 255));
        lb_ibul.setText("jLabel4");
        jPanel2.add(lb_ibul, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iuran Bulanan :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iuran Acara :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iuran Kebersihan :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lb_ikeb.setBackground(new java.awt.Color(255, 255, 255));
        lb_ikeb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ikeb.setForeground(new java.awt.Color(255, 255, 255));
        lb_ikeb.setText("jLabel4");
        jPanel2.add(lb_ikeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        lb_iaca.setBackground(new java.awt.Color(255, 255, 255));
        lb_iaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_iaca.setForeground(new java.awt.Color(255, 255, 255));
        lb_iaca.setText("jLabel4");
        jPanel2.add(lb_iaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 780, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new menuawal_user().setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(menu_bagan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_bagan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_bagan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_bagan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_bagan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_ben;
    private javax.swing.JLabel lb_hum;
    private javax.swing.JLabel lb_iaca;
    private javax.swing.JLabel lb_ibul;
    private javax.swing.JLabel lb_ikeb;
    private javax.swing.JLabel lb_kea;
    private javax.swing.JLabel lb_keb;
    private javax.swing.JLabel lb_ket;
    private javax.swing.JLabel lb_ola;
    private javax.swing.JLabel lb_pen;
    private javax.swing.JLabel lb_pkk;
    private javax.swing.JLabel lb_wak;
    // End of variables declaration//GEN-END:variables
}
