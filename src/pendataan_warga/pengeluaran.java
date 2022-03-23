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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Admin
 */
public class pengeluaran extends javax.swing.JFrame {

    private void kosong(){
        cmb_keluar.setSelectedIndex(0);
        txtjumlah.setText("");
        date_keluar.setDate(null);
        }
    
        private void tampil_tabel(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Pengeluaran");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal Pengeluaran");
        try{
          int no = 1;
          String sql = "SELECT * FROM tb_pengeluaran";
          java.sql.Connection conn =(Connection)koneksi.configDB();
          java.sql.Statement stm = conn.createStatement();
          java.sql.ResultSet res = stm.executeQuery(sql);
          
          while(res.next()){
              model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3)});
              }
          tabel_keluar.setModel(model);
        }catch (SQLException e){
            System.out.println("Error : "+ e.getMessage());
        }
            
    }
        //menjumlahkan isi colom ke 4 dalam tabel
    public final void auto_sum(){
    int txtjumlah = 0;
    for (int i =0; i< tabel_keluar.getRowCount(); i++){
       int amount = Integer.parseInt((String)tabel_keluar.getValueAt(i, 2));
       txtjumlah += amount;
}
    txttotal.setText("RP. "+txtjumlah);
    }
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form pengeluaran
     */
    public pengeluaran() {
        initComponents();
        kosong();
        tampil_tabel();
        auto_sum();
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmb_keluar = new javax.swing.JComboBox<>();
        txtjumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_keluar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        date_keluar = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        m_home = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        m_data = new javax.swing.JMenuItem();
        m_iuaran = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        m_lap = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("PENGELUARAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 54, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 268, -1, -1));

        jLabel3.setText("JUMLAH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 100, -1, -1));

        cmb_keluar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_keluar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "== PILIH ==", "ANGGARAN KEBERSIHAN", "ANGGARAN GOTONG ROYONG", "ANGGARAN ACARA", "ANGGARAN RAPAT WARGA" }));
        cmb_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 51, 250, -1));

        txtjumlah.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 97, 256, -1));

        jLabel4.setText("TANGGAL PENGELUARAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 150, -1, -1));

        tambah.setText("Add");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, -1));

        ubah.setText("Edit");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 70, -1));

        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 70, -1));

        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 66, -1));

        batal.setText("Cancel");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, -1));

        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 70, -1));

        tabel_keluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_keluarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_keluar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 238, 540, 160));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("KEUANGAN RT WARGA SIRNAGALIH");

        txttotal.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        txttotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttotalMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Total Pengeluaran RT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(date_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addComponent(date_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 470));

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

        m_lap.setText("Laporan");
        m_lap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_lapActionPerformed(evt);
            }
        });
        jMenu1.add(m_lap);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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

    private void m_iuaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_iuaranActionPerformed
        // TODO add your handling code here:
        new iuaran_warga_rt().setVisible(true);
        dispose();
    }//GEN-LAST:event_m_iuaranActionPerformed

    private void m_lapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_lapActionPerformed
        // TODO add your handling code here:
        new laporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_m_lapActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        new laporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_tambahActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
       try {
            String sql = "update tb_pengeluaran set jumlah=?,tgl_keluar=? where pengeluaran=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih","root","");
            pst = con.prepareStatement(sql);          
            
            pst.setString(1, txtjumlah.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = sdf.format(date_keluar.getDate());
            pst.setString(2, tanggal);
            pst.setString(3, cmb_keluar.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            tampil_tabel();
            kosong();
            txtjumlah.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" + e);
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO tb_pengeluaran"
            +"(pengeluaran, jumlah, tgl_keluar)"
            +"VALUES (?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sirnagalih","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,cmb_keluar.getSelectedItem().toString());
            pst.setString(2,txtjumlah.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = sdf.format(date_keluar.getDate());
            pst.setString(3,tanggal);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        tampil_tabel();
        kosong();
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM tb_pengeluaran WHERE pengeluaran='"+cmb_keluar.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        tampil_tabel();
        kosong();
    }//GEN-LAST:event_hapusActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_batalActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void tabel_keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_keluarMouseClicked
        // TODO add your handling code here:
        int baris = tabel_keluar.rowAtPoint(evt.getPoint());
        String pengeluaran = tabel_keluar.getValueAt(baris, 1).toString();
        cmb_keluar.setSelectedItem(pengeluaran);
        String jumlah = tabel_keluar.getValueAt(baris, 2).toString();
        txtjumlah.setText(jumlah);
        try{
	DefaultTableModel model2 = (DefaultTableModel)tabel_keluar.getModel();
	int bar = tabel_keluar.getSelectedRow();
	Date tanggal = new SimpleDateFormat("yyyy-MM-dd").parse((String)model2.getValueAt(bar, 3));
	date_keluar.setDate(tanggal);
        }catch(ParseException ex){
	Logger.getLogger(pengeluaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabel_keluarMouseClicked

    private void txttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMouseClicked
        // TODO add your handling code here:
        auto_sum();
    }//GEN-LAST:event_txttotalMouseClicked

    private void cmb_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengeluaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JComboBox<String> cmb_keluar;
    private com.toedter.calendar.JDateChooser date_keluar;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JMenuItem m_data;
    private javax.swing.JMenu m_home;
    private javax.swing.JMenuItem m_iuaran;
    private javax.swing.JMenuItem m_lap;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel_keluar;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txttotal;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}