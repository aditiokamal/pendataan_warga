/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan_warga;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author pycode
 */
public class menu_info extends javax.swing.JFrame {

    /**
     * Creates new form menu_info
     */
    public menu_info() {
        initComponents();
    }
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ket = new javax.swing.JTextField();
        txt_waket = new javax.swing.JTextField();
        txt_ben = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_hum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_kea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_keb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ola = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_pkk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_pen = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_ibul = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ikeb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_iaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NAMA KETUA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel2.setText("NAMA WAKIL & SEKRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setText("NAMA BENDAHARA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(txt_ket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 244, -1));
        jPanel1.add(txt_waket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 244, -1));
        jPanel1.add(txt_ben, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 244, -1));

        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 63, -1));

        ubah.setText("Edit");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel1.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 63, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("INFORMASI SIRNAGALIH");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 64, -1));

        tambah.setText("Add");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 62, -1));

        batal.setText("Cancel");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel1.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel4.setText("NAMA HUMAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txt_hum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_humActionPerformed(evt);
            }
        });
        jPanel1.add(txt_hum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 244, -1));

        jLabel5.setText("NAMA KEAMANAN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(txt_kea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 244, -1));

        jLabel6.setText("NAMA KEBERSIHAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel1.add(txt_keb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 244, -1));

        jLabel7.setText("NAMA OLAHRAGA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel1.add(txt_ola, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 244, -1));

        jLabel9.setText("NAMA PKK & PP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        jPanel1.add(txt_pkk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 244, -1));

        jLabel10.setText("NAMA PENASIHAT");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel1.add(txt_pen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 244, -1));

        jLabel11.setText("IURAN BULANAN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        jPanel1.add(txt_ibul, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 244, -1));

        jLabel13.setText("IURAN KEBERSIHAN");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));
        jPanel1.add(txt_ikeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 244, -1));

        jLabel14.setText("IURAN ACARA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        jPanel1.add(txt_iaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 244, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO tb_info"
            +"(ketua, wakil, bendahara, humas, keamanan, kebersihan, olahraga, pkk, penasihat, bulanan, bersih, acara)"
            +"VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,txt_ket.getText());
            pst.setString(2,txt_waket.getText());
            pst.setString(3,txt_hum.getText());
            pst.setString(4,txt_ben.getText());
            pst.setString(5,txt_kea.getText());
            pst.setString(6,txt_keb.getText());
            pst.setString(7,txt_ola.getText());
            pst.setString(8,txt_pkk.getText());
            pst.setString(9,txt_pen.getText());
            pst.setString(10,txt_ibul.getText());
            pst.setString(11,txt_ikeb.getText());
            pst.setString(12,txt_iaca.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update tb_info set ketua=?,wakil=?,bendahara=?,humas=?,keamanan=?,kebersihan=?,olahraga=?,pkk=?,penasihat=?,bulanan=?,bersih=?,acara=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,txt_ket.getText());
            pst.setString(2,txt_waket.getText());
            pst.setString(3,txt_hum.getText());
            pst.setString(4,txt_ben.getText());
            pst.setString(5,txt_kea.getText());
            pst.setString(6,txt_keb.getText());
            pst.setString(7,txt_ola.getText());
            pst.setString(8,txt_pkk.getText());
            pst.setString(9,txt_pen.getText());
            pst.setString(10,txt_ibul.getText());
            pst.setString(11,txt_ikeb.getText());
            pst.setString(12,txt_iaca.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            txt_ket.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" + e);
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        
        txt_ket.requestFocus();
    }//GEN-LAST:event_tambahActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_batalActionPerformed

    private void txt_humActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_humActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_humActionPerformed

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
            java.util.logging.Logger.getLogger(menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField txt_ben;
    private javax.swing.JTextField txt_hum;
    private javax.swing.JTextField txt_iaca;
    private javax.swing.JTextField txt_ibul;
    private javax.swing.JTextField txt_ikeb;
    private javax.swing.JTextField txt_kea;
    private javax.swing.JTextField txt_keb;
    private javax.swing.JTextField txt_ket;
    private javax.swing.JTextField txt_ola;
    private javax.swing.JTextField txt_pen;
    private javax.swing.JTextField txt_pkk;
    private javax.swing.JTextField txt_waket;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
