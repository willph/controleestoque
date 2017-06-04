/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * FormPrincipal.java
 *
 * Created on 29/03/2012, 10:47:50
 */
package controleestoque;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.omg.CORBA.Object;

/**
 *
 * @author Professor
 */
public class FormPrincipal extends javax.swing.JFrame {

    ArrayList<Produto> listaProdutos;
    static FormAlterarProduto alterarProduto;
    FormNovoUsuario novoUsuario;

    /**
     * Creates new form FormPrincipal
     *
     * @param privilegio
     */
    public FormPrincipal(String privilegio) {

        initComponents();
        if (privilegio.equals("administrador") == false) {
            jButtonNovoUsuario.setEnabled(false);
            jButtonRemover.setEnabled(false);
            atualizarLinhas();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonListar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonNovoUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabeID = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle De Estoque - Copyright © ®");
        setLocation(new java.awt.Point(300, 50));

        jTextFieldID.setEnabled(false);

        jTextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNomeFocusLost(evt);
            }
        });
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Quantidade", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonListar.setText("Limpar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonNovoUsuario.setText("Novo usuário");
        jButtonNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Preço:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        jTextFieldDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDescricaoFocusLost(evt);
            }
        });
        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyPressed(evt);
            }
        });

        jLabeID.setText("ID:");

        jTextFieldPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPrecoKeyPressed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButton1.setText("Logoff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabeID)
                                            .addGap(35, 35, 35))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar)
                                .addGap(222, 222, 222)
                                .addComponent(jButtonRemover)))
                        .addGap(224, 224, 224)
                        .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonConsultar))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonRemover))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoUsuario)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        try {
            if (jTextFieldNome.getText().equals("") == true || jTextFieldDescricao.getText().equals("") == true || jTextFieldPreco.getText().equals("") == true) {
                JOptionPane.showMessageDialog(rootPane, "Nenhum campo pode ficar em branco.");
            } else {
                Produto produto1 = new Produto(jTextFieldNome.getText(), Float.valueOf(jTextFieldPreco.getText()),
                        0, jTextFieldDescricao.getText());

                DadosProduto dados = new DadosProduto();
                dados.cadastrar(produto1);
                JOptionPane.showMessageDialog(rootPane, "Produto cadastrado");
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.addRow(new String[]{"" + new DadosProduto().buscarId(produto1.getNome()), produto1.getNome(),
                    "R$ " + Float.toString(produto1.getPreco()), "" + produto1.getQuantidade(),
                    produto1.getDescricao()});
                clearFields();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro: preço inválido.");
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        clearFields();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        try {
            // TODO add your handling code here:
            if (Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()) > 0) {
                JOptionPane.showMessageDialog(rootPane, "Operação não permitida: a quantidade precisa estar zerada.");
            } else {
                DadosProduto dados = new DadosProduto();
                dados.remover(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
                //JOptionPane.showMessageDialog(rootPane, "Produto removido.");
                //DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                //modelo.removeRow(jTable1.getSelectedRow());
                atualizarLinhas();
                clearFields();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_jButtonRemoverActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            selectTableRow();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed

        atualizarLinhas();
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioActionPerformed
        // TODO add your handling code here:
        if (novoUsuario == null) {
            novoUsuario = new FormNovoUsuario(this);
        }
        novoUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonNovoUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fechar();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusLost
        // TODO add your handling code here:
        jTextFieldNome.setText(jTextFieldNome.getText().toUpperCase(Locale.CANADA));
    }//GEN-LAST:event_jTextFieldNomeFocusLost

    private void jTextFieldDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoFocusLost
        // TODO add your handling code here:
        jTextFieldDescricao.setText(jTextFieldDescricao.getText().toUpperCase(Locale.CANADA));
    }//GEN-LAST:event_jTextFieldDescricaoFocusLost

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldDescricao.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldPreco.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldDescricaoKeyPressed

    private void jTextFieldPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonCadastrar.doClick();
        }
    }//GEN-LAST:event_jTextFieldPrecoKeyPressed

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal("administrador").setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonNovoUsuario;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabeID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldPreco.setText("");
        jTextFieldDescricao.setText("");
    }

    public void atualizarLinhas() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            DadosProduto dados = new DadosProduto();
            this.listaProdutos = dados.consultar(jTextFieldNome.getText());
            //atribuindo as colunas da tabela
            modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Preço", "Quantidade", "Descrição"});
            for (int i = 0; i < this.listaProdutos.size(); i++) {
                Produto p = this.listaProdutos.get(i);
                modelo.addRow(new String[]{"" + p.getId(), p.getNome(), "R$ "
                    + p.getPreco(), "" + p.getQuantidade(), p.getDescricao()});
            }
            jTable1.setModel(modelo);
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
            //List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
            //sorter.setSortKeys(sortKeys);

        } catch (Exception ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fechar() {
        WindowEvent windowsfechar = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowsfechar);
    }

    private void selectTableRow() {
        Produto p = new Produto();
        int row = jTable1.getSelectedRow();
        int column = 0;
        row = jTable1.convertRowIndexToModel(row);

        p.setId(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
        p.setNome(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        p.setPreco(Float.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString().substring(3)));
        p.setQuantidade(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()));
        p.setDescricao(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        if (alterarProduto == null) {
            alterarProduto = new FormAlterarProduto(this, true, p, this);
        }
        alterarProduto.fechar();
        alterarProduto = new FormAlterarProduto(this, true, p, this);
        alterarProduto.setVisible(true);
    }

    public void setTableRow(Produto p) {
        jTable1.setValueAt(p.getId(), jTable1.getSelectedRow(), 0);
        jTable1.setValueAt(p.getNome(), jTable1.getSelectedRow(), 1);
        jTable1.setValueAt("R$ " + Float.toString(p.getPreco()), jTable1.getSelectedRow(), 2);
        jTable1.setValueAt(p.getQuantidade(), jTable1.getSelectedRow(), 3);
        jTable1.setValueAt(p.getDescricao(), jTable1.getSelectedRow(), 4);
    }

    public static void setNull() {
        alterarProduto = null;
    }

}
