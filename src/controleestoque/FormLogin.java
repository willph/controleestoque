/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

/**
 *
 * @author Will
 */
public class FormLogin extends javax.swing.JFrame {
    
    Login login = new Login();

    /**
     * Creates new form Login
     */
    public FormLogin() {
        initComponents();
    }

    private void fechar() {
        WindowEvent windowsfechar = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowsfechar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelBackground = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setLocation(new java.awt.Point(400, 150));
        setMinimumSize(new java.awt.Dimension(455, 280));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleestoque/botao/botao-login2.png"))); // NOI18N
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(230, 180, 75, 25);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleestoque/botao/btn-sair.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(140, 180, 58, 25);

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setText("Login");
        getContentPane().add(jLabelLogin);
        jLabelLogin.setBounds(150, 95, 40, 14);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(150, 135, 40, 14);
        getContentPane().add(jTextFieldLogin);
        jTextFieldLogin.setBounds(190, 90, 110, 25);

        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(190, 130, 110, 25);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controleestoque/background/windows_7_black_login.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 450, 250);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 50, 59, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        if (login.entrar(jTextFieldLogin.getText(), new String(jPasswordFieldSenha.getPassword()))) {
            fechar();
        }
    }

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {                                            

        fechar();
    }

    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (login.entrar(jTextFieldLogin.getText(), new String(jPasswordFieldSenha.getPassword()))) {
                fechar();
            }
        }
    }//GEN-LAST:event_enter

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}