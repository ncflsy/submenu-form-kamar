/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simko_test1;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


/**
 *
 * @author nikof
 */
/*
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

*/

public class Input_Kamar extends javax.swing.JFrame {

    /**
     * Creates new form Input_Kamar
     */
    
    
    //private final Koneksi koneksi = new Koneksi();
    FormKamar IK = new FormKamar();
    
    
    public Input_Kamar() {
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

        tf_harga = new javax.swing.JTextField();
        tf_nokamar = new javax.swing.JTextField();
        tf_fasilitas = new javax.swing.JTextField();
        tf_ukuran = new javax.swing.JTextField();
        cb_lantai = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_harga.setBackground(new Color(0,0,0,0));
        tf_harga.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 28)); // NOI18N
        tf_harga.setForeground(new Color(6, 40, 61));
        tf_harga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(tf_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 650, 360, 50));

        tf_nokamar.setBackground(new Color(0,0,0,0));
        tf_nokamar.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 28)); // NOI18N
        tf_nokamar.setForeground(new Color(6, 40, 61));
        tf_nokamar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_nokamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nokamarActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nokamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 360, 50));

        tf_fasilitas.setBackground(new Color(0,0,0,0));
        tf_fasilitas.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 28)); // NOI18N
        tf_fasilitas.setForeground(new Color(6, 40, 61));
        tf_fasilitas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_fasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fasilitasActionPerformed(evt);
            }
        });
        getContentPane().add(tf_fasilitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 360, 50));

        tf_ukuran.setBackground(new Color(0,0,0,0));
        tf_ukuran.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 28)); // NOI18N
        tf_ukuran.setForeground(new Color(6, 40, 61));
        tf_ukuran.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_ukuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ukuranActionPerformed(evt);
            }
        });
        getContentPane().add(tf_ukuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 480, 360, 50));

        cb_lantai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "1", "2", "3" }));
        cb_lantai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lantaiActionPerformed(evt);
            }
        });
        getContentPane().add(cb_lantai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 310, 230, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Input Kamar Kost.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 790, 180, 50));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 790, 180, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        tf_nokamar.getText();
        
        if (IK.databaru = true) {
            try {
                String sql = "INSERT INTO tb_kamar VALUES ('%s', '%s', '%s', '%s', '%s')";
            
            sql = String.format(
                    sql,
                    tf_nokamar.getText(),
                    tf_fasilitas.getText(),
                    cb_lantai.getSelectedItem(),
                    tf_ukuran.getText(),
                    tf_harga.getText()
            );
            
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.execute();
            new pop_up.popup_berhasil().setVisible(true);
            new FormKamar().setVisible(true);
            this.dispose();
            } catch (SQLException ex) {
                new pop_up.popup_gagal().setVisible(true);
            }
        } 
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void tf_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hargaActionPerformed

    private void tf_nokamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nokamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nokamarActionPerformed

    private void tf_fasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fasilitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fasilitasActionPerformed

    private void tf_ukuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ukuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ukuranActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FormKamar().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_lantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lantaiActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cb_lantaiActionPerformed

   
    
    
    
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
            java.util.logging.Logger.getLogger(Input_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    public javax.swing.JComboBox<String> cb_lantai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JTextField tf_fasilitas;
    public javax.swing.JTextField tf_harga;
    public javax.swing.JTextField tf_nokamar;
    public javax.swing.JTextField tf_ukuran;
    // End of variables declaration//GEN-END:variables
}
