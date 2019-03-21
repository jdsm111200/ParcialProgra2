/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1_;

import java.awt.event.KeyEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author rossy
 */
public class Ventana_Login extends javax.swing.JFrame {

    String usuario;
    String contraseña;
    String NewPass;

    /**
     * Creates new form Ventana_Login
     */
    public Ventana_Login() {
        initComponents();
        setSize(500, 350);
        setLocationRelativeTo(null);
        usuario = "Tom@gmail.com";
        try {
            FileReader fr = new FileReader("C:\\Users\\rossy\\Documents\\NetBeansProjects\\Parcial1_\\src\\Cambiodecontraseña.txt");
            BufferedReader bf = new BufferedReader(fr);
            contraseña = bf.readLine();
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtusuario.requestFocus(true);
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
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lblcontraseña = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 180, 60, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(42, 203, 90, 17);

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(150, 174, 236, 20);

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });
        getContentPane().add(txtpass);
        txtpass.setBounds(150, 200, 236, 20);

        lblcontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblcontraseña.setText("Cambiar contraseña");
        lblcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcontraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(lblcontraseña);
        lblcontraseña.setBounds(295, 262, 150, 17);

        btnlogin.setText("LOGIN");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });
        btnlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnloginKeyPressed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(46, 258, 80, 23);

        btnsalir.setText("SALIR");
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(399, 11, 80, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burros222.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(175, 32, 175, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sin título-2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed

    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpass.requestFocus(true);
        }


    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtusuario.getText().equals(usuario) && txtpass.getText().equals(contraseña)) {
                Ventana_usuario ventana = new Ventana_usuario();
                ventana.setVisible(true);
                Ventana_usuario.jLabel1.setText(txtusuario.getText());
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "ERROR DE LOGIN");
                txtusuario.setText("");
                txtpass.setText("");
                txtusuario.requestFocus(true);  
            }
        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void lblcontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcontraseñaMouseClicked
      
        NewPass = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
        Validacion Pass = new Validacion();
        if (Pass.validar(NewPass)) {
            contraseña = NewPass;
            JOptionPane.showMessageDialog(null, "SU CONTRASEÑA ES: " + contraseña);
            try {
                FileWriter changedpass = new FileWriter("C:\\Users\\rossy\\Documents\\NetBeansProjects\\Parcial1_\\src\\Cambiodecontraseña.txt");
                BufferedWriter bw = new BufferedWriter(changedpass);
                PrintWriter imprime = new PrintWriter(bw);
                changedpass.write(NewPass);
                changedpass.close();
                bw.close();

            } catch (Exception ex) {
                Logger.getLogger(Ventana_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "ERROR DE CONTRASEÑA");

        }


    }//GEN-LAST:event_lblcontraseñaMouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        if (txtusuario.getText().equals(usuario) && txtpass.getText().equals(contraseña)) {

            Ventana_usuario ventana = new Ventana_usuario();
            ventana.setVisible(true);
            Ventana_usuario.jLabel1.setText(txtusuario.getText());
            dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnloginMouseClicked
    }
    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnloginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtusuario.getText().equals(usuario) && txtpass.getText().equals(contraseña)) {
                Ventana_usuario ventana = new Ventana_usuario();
                ventana.setVisible(true);
                dispose();
            }

    }//GEN-LAST:event_btnloginKeyPressed
    }

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
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
