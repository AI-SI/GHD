/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entity.Akun;
import Reports.ViewReport;

/**
 *
 * @author Rahmat Subekti
 */
public class FrmMenu extends javax.swing.JFrame {
    public Akun akun = null;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(this);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        lbTransaksi = new javax.swing.JLabel();
        lbProduk = new javax.swing.JLabel();
        lbKaryawan = new javax.swing.JLabel();
        lbPelanggan = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnPelanggan = new javax.swing.JMenuItem();
        mnKaryawan = new javax.swing.JMenuItem();
        mnProduk = new javax.swing.JMenuItem();
        mnKategori = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAkun = new javax.swing.JMenuItem();
        mnManagerAkun = new javax.swing.JMenuItem();
        mnDbSetting = new javax.swing.JMenuItem();
        mnTentang = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnLTransaksi = new javax.swing.JMenuItem();
        mnLProduk = new javax.swing.JMenuItem();
        mnLPelanggan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");
        setLocationByPlatform(true);

        jToolBar1.setRollover(true);

        lbTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transaksi64.png"))); // NOI18N
        lbTransaksi.setText("Transaksi");
        lbTransaksi.setDisabledIcon(null);
        lbTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTransaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTransaksiMouseClicked(evt);
            }
        });

        lbProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        lbProduk.setText("Produk");
        lbProduk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbProduk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProdukMouseClicked(evt);
            }
        });

        lbKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/karyawan64.png"))); // NOI18N
        lbKaryawan.setText("Karyawan");
        lbKaryawan.setDisabledIcon(null);
        lbKaryawan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbKaryawan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbKaryawanMouseClicked(evt);
            }
        });

        lbPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelanggan64.png"))); // NOI18N
        lbPelanggan.setText("Pelanggan");
        lbPelanggan.setDisabledIcon(null);
        lbPelanggan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbPelanggan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPelangganMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTransaksi)
                    .addComponent(lbKaryawan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProduk, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPelanggan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduk)
                    .addComponent(lbTransaksi))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKaryawan)
                    .addComponent(lbPelanggan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Master");

        mnPelanggan.setText("Pelanggan");
        mnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(mnPelanggan);

        mnKaryawan.setText("Karyawan");
        mnKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKaryawanActionPerformed(evt);
            }
        });
        jMenu1.add(mnKaryawan);

        mnProduk.setText("Produk");
        mnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProdukActionPerformed(evt);
            }
        });
        jMenu1.add(mnProduk);

        mnKategori.setText("Kategori Produk");
        mnKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKategoriActionPerformed(evt);
            }
        });
        jMenu1.add(mnKategori);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnAkun.setText("Akun");
        jMenu2.add(mnAkun);

        mnManagerAkun.setText("Manajer Akun");
        mnManagerAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnManagerAkunActionPerformed(evt);
            }
        });
        jMenu2.add(mnManagerAkun);

        mnDbSetting.setText("DB Setting");
        mnDbSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDbSettingActionPerformed(evt);
            }
        });
        jMenu2.add(mnDbSetting);

        mnTentang.setText("Tentang");
        mnTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTentangActionPerformed(evt);
            }
        });
        jMenu2.add(mnTentang);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Laporan");

        mnLTransaksi.setText("Transaksi");
        mnLTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLTransaksiActionPerformed(evt);
            }
        });
        jMenu3.add(mnLTransaksi);

        mnLProduk.setText("Produk");
        mnLProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLProdukActionPerformed(evt);
            }
        });
        jMenu3.add(mnLProduk);

        mnLPelanggan.setText("Pelanggan");
        mnLPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLPelangganActionPerformed(evt);
            }
        });
        jMenu3.add(mnLPelanggan);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTransaksiMouseClicked
        // TODO add your handling code here:
        FrmTransaksi transaksi = new FrmTransaksi();
        transaksi.setVisible(true);
    }//GEN-LAST:event_lbTransaksiMouseClicked

    private void lbProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProdukMouseClicked
        // TODO add your handling code here:
        FrmProduk produk=new FrmProduk();
        produk.setVisible(true);
    }//GEN-LAST:event_lbProdukMouseClicked

    private void lbPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPelangganMouseClicked
        // TODO add your handling code here:
        FrmPelanggan pelanggan = new FrmPelanggan();
        pelanggan.setVisible(true);
    }//GEN-LAST:event_lbPelangganMouseClicked

    private void lbKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbKaryawanMouseClicked
        // TODO add your handling code here:
        FrmAkun karyawan = new FrmAkun();
        karyawan.setVisible(true);
    }//GEN-LAST:event_lbKaryawanMouseClicked

    private void mnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPelangganActionPerformed
        // TODO add your handling code here:
        FrmPelanggan pelanggan = new FrmPelanggan();
        pelanggan.setVisible(true);
    }//GEN-LAST:event_mnPelangganActionPerformed

    private void mnKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnKaryawanActionPerformed

    private void mnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProdukActionPerformed
        // TODO add your handling code here:
        FrmProduk produk = new FrmProduk();
        produk.setVisible(true);
    }//GEN-LAST:event_mnProdukActionPerformed

    private void mnKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKategoriActionPerformed
        // TODO add your handling code here:
        FrmKategori kategori = new FrmKategori();
        kategori.setVisible(true);
    }//GEN-LAST:event_mnKategoriActionPerformed

    private void mnManagerAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnManagerAkunActionPerformed
        // TODO add your handling code here:
        FrmAkun akun = new FrmAkun();
        akun.setVisible(true);
    }//GEN-LAST:event_mnManagerAkunActionPerformed

    private void mnDbSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDbSettingActionPerformed
        // TODO add your handling code here:
        FrmSettingDB setting = new FrmSettingDB();
        setting.setVisible(true);
    }//GEN-LAST:event_mnDbSettingActionPerformed

    private void mnTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTentangActionPerformed
        // TODO add your handling code here:
        FrmTentang tentang = new FrmTentang(null,true);
        tentang.setVisible(true);
    }//GEN-LAST:event_mnTentangActionPerformed

    private void mnLTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLTransaksiActionPerformed
        // TODO add your handling code here:        
        ViewReport report = new ViewReport();
        report.Transaksi();
    }//GEN-LAST:event_mnLTransaksiActionPerformed

    private void mnLProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLProdukActionPerformed
        // TODO add your handling code here:        
        ViewReport report = new ViewReport();
        report.Produk();
    }//GEN-LAST:event_mnLProdukActionPerformed

    private void mnLPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLPelangganActionPerformed
        // TODO add your handling code here:        
        ViewReport report = new ViewReport();
        report.Pelanggan();
    }//GEN-LAST:event_mnLPelangganActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbKaryawan;
    private javax.swing.JLabel lbPelanggan;
    private javax.swing.JLabel lbProduk;
    private javax.swing.JLabel lbTransaksi;
    private javax.swing.JMenuItem mnAkun;
    private javax.swing.JMenuItem mnDbSetting;
    private javax.swing.JMenuItem mnKaryawan;
    private javax.swing.JMenuItem mnKategori;
    private javax.swing.JMenuItem mnLPelanggan;
    private javax.swing.JMenuItem mnLProduk;
    private javax.swing.JMenuItem mnLTransaksi;
    private javax.swing.JMenuItem mnManagerAkun;
    private javax.swing.JMenuItem mnPelanggan;
    private javax.swing.JMenuItem mnProduk;
    private javax.swing.JMenuItem mnTentang;
    // End of variables declaration//GEN-END:variables
}
