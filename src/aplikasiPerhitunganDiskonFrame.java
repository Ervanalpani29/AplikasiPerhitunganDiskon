/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;   // Jika menggunakan dropdown untuk pilihan diskon
import javax.swing.JRadioButton; // Jika menggunakan radio button
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class aplikasiPerhitunganDiskonFrame extends javax.swing.JFrame {

    /**
     * Creates new form aplikasiPerhitunganDiskonFrame
     */
    public aplikasiPerhitunganDiskonFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        hargaAwal = new javax.swing.JLabel();
        hargaDiskon = new javax.swing.JLabel();
        hargaField = new javax.swing.JTextField();
        diskonField = new javax.swing.JTextField();
        pilihBox = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hargaAwal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hargaAwal.setText("Harga Awal");

        hargaDiskon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hargaDiskon.setText("Harga Setelah Di Diskon");

        hargaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaFieldActionPerformed(evt);
            }
        });

        diskonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskonFieldActionPerformed(evt);
            }
        });

        pilihBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "20%", "30%", "50%", "70%", "80%", " " }));
        pilihBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihBoxActionPerformed(evt);
            }
        });

        jRadioButton1.setText("klik Diskon");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pilih Diskon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargaAwal)
                            .addComponent(hargaDiskon)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jRadioButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(diskonField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pilihBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaAwal)
                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilihBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(hargaDiskon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diskonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihBoxActionPerformed
          String selectedItem = (String) pilihBox.getSelectedItem();
    
    // Mengonversi pilihan diskon menjadi angka (persen)
    double diskonPersen = 0.0;
    switch (selectedItem) {
        case "10%":
            diskonPersen = 10;
            break;
        case "20%":
            diskonPersen = 20;
            break;
        case "30%":
            diskonPersen = 30;
            break;
        case "50%":
            diskonPersen = 50;
            break;
        case "70%":
            diskonPersen = 70;
            break;
        case "80%":
            diskonPersen = 80;
            break;    
        // Tambahkan kasus lain sesuai kebutuhan
        default:
            diskonPersen = 0;
            break;
    }
    
    // Menampilkan diskon yang dipilih
    System.out.println("Diskon yang dipilih: " + diskonPersen + "%");
    
    // Misalkan hargaAwal sudah diambil dari hargaField sebelumnya
    try {
        double hargaAwal = Double.parseDouble(hargaField.getText());
        double hargaSetelahDiskon = hargaAwal - (hargaAwal * (diskonPersen / 100));
        
        // Menampilkan harga setelah diskon
        System.out.println("Harga Setelah Diskon: " + hargaSetelahDiskon);
        
        // Anda bisa mengupdate komponen lain, misalnya menampilkan hasil di label atau field lain
        diskonField.setText(" " + hargaSetelahDiskon);
    } catch (NumberFormatException e) {
        // Menangani jika harga tidak valid
        System.out.println("Input harga tidak valid.");
    }
    }//GEN-LAST:event_pilihBoxActionPerformed

    private void hargaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaFieldActionPerformed
       String hargaText = hargaField.getText();
    
    // Mengubah string harga menjadi angka
    try {
        double hargaAwal = Double.parseDouble(hargaText);
        
        // Misalkan ada diskon 10%
        double diskonPersen = Double.parseDouble(diskonField.getText());
        double hargaSetelahDiskon = hargaAwal - (hargaAwal * (diskonPersen / 100));

        
        // Menampilkan harga awal dan harga setelah diskon (misalnya di label atau text field lain)
        System.out.println("Harga Awal: " + hargaAwal);
        System.out.println("Harga Setelah Diskon: " + hargaSetelahDiskon);
        
        // Anda bisa mengupdate komponen lain dengan harga tersebut jika perlu
    
        
    } catch (NumberFormatException e) {
        // Menangani jika input bukan angka yang valid
        System.out.println("Input harga tidak valid.");
    }
    }//GEN-LAST:event_hargaFieldActionPerformed

    private void diskonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonFieldActionPerformed
   
    }//GEN-LAST:event_diskonFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
         if (jRadioButton1.isSelected()) {
        // Misalnya, eksekusi menghitung harga setelah diskon berdasarkan pilihan
        double diskonPersen = 10;
        // Mendapatkan harga awal dari hargaField
        try {
            double hargaAwal = Double.parseDouble(hargaField.getText());
            // Menghitung harga setelah diskon
            double hargaSetelahDiskon = hargaAwal - (hargaAwal * (diskonPersen / 100));
            
            // Menampilkan hasil harga setelah diskon
            System.out.println("Harga Awal: " + hargaAwal);
            System.out.println("Harga Setelah Diskon: " + hargaSetelahDiskon);
            
            // Anda bisa mengupdate komponen lain, seperti label atau field
            diskonField.setText(" " + hargaSetelahDiskon);
            
        } catch (NumberFormatException e) {
            // Menangani jika input harga tidak valid
            System.out.println("Input harga tidak valid.");
        }
    } else {
        // Jika jRadioButton1 tidak dipilih, lakukan eksekusi lain (jika diperlukan)
        System.out.println("RadioButton1 tidak dipilih.");
    }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(aplikasiPerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasiPerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasiPerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasiPerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasiPerhitunganDiskonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diskonField;
    private javax.swing.JLabel hargaAwal;
    private javax.swing.JLabel hargaDiskon;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JComboBox<String> pilihBox;
    // End of variables declaration//GEN-END:variables
}
