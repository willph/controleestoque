/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class FormAlterarProduto extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    private Produto produto;
    private int quantidadeTotalInicial;
    private FormPrincipal formPrincipal;
    private int quantidadeTransacao;
    
    
    public FormAlterarProduto(java.awt.Frame parent, boolean modal, Produto produto, FormPrincipal form) {
        super(parent, modal);
          initComponents();
        this.produto = produto;
        this.formPrincipal = form;
        jTextFieldQuantidade.setEnabled(false);
        jTextFieldID.setText("" + produto.getId());
        jTextFieldNome.setText(produto.getNome());
        jTextFieldPreco.setText("" + produto.getPreco());
        jTextFieldQuantidade.setText("" + produto.getQuantidade());
        jTextFieldDescricao.setText(produto.getDescricao());
        quantidadeTotalInicial = produto.getQuantidade();
        //Abre o form no centro do form que o chamou
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabeID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar produto");
        setResizable(false);

        jTextFieldPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPrecoKeyPressed(evt);
            }
        });

        jLabel1.setText("Preço:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Quantidade:");

        jTextFieldID.setEnabled(false);

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1jButtonAlterarActionPerformed(evt);
            }
        });

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });

        jButton2.setText("Atualizar");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2jButtonAtualizarActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyReleased(evt);
            }
        });

        jLabeID.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabeID)
                                    .addGap(35, 35, 35))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2)
                        .addGap(64, 64, 64)
                        .addComponent(jButton3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2.doClick();
        }
    }//GEN-LAST:event_jTextFieldPrecoKeyPressed

    private void jButton1jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1jButtonAlterarActionPerformed
        //Abre o form de entrada e saída
        new FormEntradaSaida(this, true, produto, this).setVisible(true);
    }//GEN-LAST:event_jButton1jButtonAlterarActionPerformed

    private void jTextFieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
        // TODO add your handling code here:
        jTextFieldNome.setText(jTextFieldNome.getText().toUpperCase(Locale.CANADA));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2.doClick();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    private void jButton2jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2jButtonAtualizarActionPerformed
        //Atualiza as informações no BD
        try{
        produto.setId(Integer.valueOf(jTextFieldID.getText()));
        produto.setNome(jTextFieldNome.getText());
        produto.setDescricao(jTextFieldDescricao.getText());
        produto.setPreco(Float.valueOf(jTextFieldPreco.getText()));
        NegocioProduto negocioProduto = new NegocioProduto();
        negocioProduto.atualizar(produto, quantidadeTotalInicial);

        formPrincipal.setTableRow(produto);
        fechar();
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro: preço inválido.");
        }
    }//GEN-LAST:event_jButton2jButtonAtualizarActionPerformed

    private void jButton3jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3jButtonCancelarActionPerformed
        // TODO add your handling code here:
        fechar();
    }//GEN-LAST:event_jButton3jButtonCancelarActionPerformed

    private void jTextFieldDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyReleased
        // TODO add your handling code here:
        jTextFieldDescricao.setText(jTextFieldDescricao.getText().toUpperCase(Locale.CANADA));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2.doClick();
        }
    }//GEN-LAST:event_jTextFieldDescricaoKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabeID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
public void fechar() {
        WindowEvent windowsfechar = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowsfechar);
        formPrincipal.setNull();
    }

    public void setTextField() {
        jTextFieldQuantidade.setText("" + produto.getQuantidade());
    }
}
