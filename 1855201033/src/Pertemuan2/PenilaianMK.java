/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class PenilaianMK extends javax.swing.JFrame {

    /**
     * Creates new form PenilaianMK
     */
    public PenilaianMK() {
        initComponents();
        this.setTitle("FORMULIR PENILAIAN");
        this.setLocationRelativeTo(this);
        nilaiangka.setEnabled(false);
        nilaihuruf.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kehadiran = new javax.swing.JTextField();
        tugasmandiri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uts = new javax.swing.JTextField();
        uas = new javax.swing.JTextField();
        nim = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nilaiangka = new javax.swing.JTextField();
        nilaihuruf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULIR PENILAIAN");
        setBackground(new java.awt.Color(0, 204, 0));
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setForeground(java.awt.Color.red);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Formulir Penilaian Mata Kuliah");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ALGORITMA DAN PEMROGRAMAN 2");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulir"));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel4.setText("NIM");

        jLabel5.setText("NAMA");

        jLabel6.setText("Kehadiran 10%");

        jLabel7.setText("Tugas mandiri 20%");

        kehadiran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kehadiranActionPerformed(evt);
            }
        });

        jLabel8.setText("UTS 25%");

        jLabel9.setText("UAS 45%");

        nim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih NIM!", "1855201033", "1855201034", "1855201035", "1855201036", "1855201037" }));
        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        jLabel10.setText("Nilai Angka");

        jLabel11.setText("NIlai Huruf");

        nilaiangka.setBackground(new java.awt.Color(255, 255, 255));
        nilaiangka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiangkaActionPerformed(evt);
            }
        });

        nilaihuruf.setBackground(new java.awt.Color(255, 255, 255));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kehadiran, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(tugasmandiri))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uts, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel12))
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nilaiangka, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(nilaihuruf))))
                .addGap(15, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(uts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tugasmandiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(uas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nilaiangka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nilaihuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(reset)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here

        boolean inputulang = true;

        while (inputulang) {
            if (kehadiran.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Nilai Tidak Boleh Kosong!");
                break;
            } else {
                //continue;

                try {
                    double nhadir = Double.parseDouble(kehadiran.getText());
                    double nilaikehadiran = nhadir * 10 / 100;

                    double ntugasmandiri = Double.parseDouble(tugasmandiri.getText());
                    double nilaitugasmandiri = ntugasmandiri * 20 / 100;

                    double nuts = Double.parseDouble(uts.getText());
                    double nilaiuts = nuts * 25 / 100;

                    double nuas = Double.parseDouble(uas.getText());
                    double nilaiuas = nuas * 45 / 100;

                    double hasilnilai = nilaikehadiran + nilaitugasmandiri + nilaiuts + nilaiuas;

                    if (hasilnilai < 0 || hasilnilai > 100) {
                        JOptionPane.showMessageDialog(null, "Input Salah!");
                        JOptionPane.showMessageDialog(rootPane, reset);
                        inputulang = false;
                    } else if (hasilnilai >= 90 && hasilnilai <= 100) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("A");
                    } else if (hasilnilai >= 86 && hasilnilai <= 91) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("A-");
                    } else if (hasilnilai >= 81 && hasilnilai < 86) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("B+");
                    } else if (hasilnilai >= 75 && hasilnilai < 81) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("B");
                    } else if (hasilnilai >= 71 && hasilnilai < 75) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("B-");
                    } else if (hasilnilai >= 66 && hasilnilai < 71) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("C+");
                    } else if (hasilnilai >= 61 && hasilnilai < 66) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("C");
                    } else if (hasilnilai >= 56 && hasilnilai < 61) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("C-");
                    } else if (hasilnilai >= 51 && hasilnilai < 56) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("D");
                    } else if (hasilnilai >= 0 && hasilnilai < 51) {
                        nilaiangka.setText(String.valueOf(hasilnilai));
                        nilaihuruf.setText("E");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input Salah!");
                    JOptionPane.showMessageDialog(rootPane, reset);
                    inputulang = false;
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nilaiangkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiangkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiangkaActionPerformed

    private void kehadiranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kehadiranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kehadiranActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_namaActionPerformed

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:

        String dnama[] = {"", "Bukhori", "Nazriel Irham", "Ukie", "Lukman", "Rio"};

        for (int a = 0; a < dnama.length; a++) {
            if (nim.getSelectedIndex() == a) {
                nama.setText(dnama[a]);
            }
        }

        kehadiran.setText("");
        tugasmandiri.setText("");
        uts.setText("");
        uas.setText("");
        nilaiangka.setText("");
        nilaihuruf.setText("");

//        String datanim = (String) nim.getSelectedItem();
//
//        if (datanim == "1855201033") {
//            nama.setText("M Bukhori");
//            kehadiran.setText("");
//            tugasmandiri.setText("");
//            uts.setText("");
//            uas.setText("");
//            nilaiangka.setText("");
//            nilaihuruf.setText("");
//        } else if (datanim == "1855201034") {
//            nama.setText("Nazril Irham");
//            kehadiran.setText("");
//            tugasmandiri.setText("");
//            uts.setText("");
//            uas.setText("");
//            nilaiangka.setText("");
//            nilaihuruf.setText("");
//        } else if (datanim == "1855201035") {
//            nama.setText("Lukman Hakim");
//            kehadiran.setText("");
//            tugasmandiri.setText("");
//            uts.setText("");
//            uas.setText("");
//            nilaiangka.setText("");
//            nilaihuruf.setText("");
//        }
    }//GEN-LAST:event_nimActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        kehadiran.setText("");
        tugasmandiri.setText("");
        uts.setText("");
        uas.setText("");
        nilaiangka.setText("");
        nilaihuruf.setText("");
        kehadiran.requestFocus();

    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(PenilaianMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenilaianMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenilaianMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenilaianMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenilaianMK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kehadiran;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilaiangka;
    private javax.swing.JTextField nilaihuruf;
    private javax.swing.JComboBox<String> nim;
    private javax.swing.JButton reset;
    private javax.swing.JTextField tugasmandiri;
    private javax.swing.JTextField uas;
    private javax.swing.JTextField uts;
    // End of variables declaration//GEN-END:variables
}
