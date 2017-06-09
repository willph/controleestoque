/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.Sides;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author aluno
 */
public class FormAuditoria extends javax.swing.JDialog {

    private ArrayList<Auditoria> listaAuditoria;
    HashPrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
    PrinterJob printerJob = PrinterJob.getPrinterJob();

    /**
     * Creates new form FormAuditoria
     *
     * @param parent
     * @param modal
     * @throws java.lang.Exception
     */
    public FormAuditoria(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        centralizaColunas();
        listaAuditoria = new DadosAuditoria().listar();
        listar(listaAuditoria);
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
        jTextFieldProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGerarRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Auditoria");

        jLabel1.setText("Produto:");

        jLabel2.setText("Usuário:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario ID", "Usuario", "Produto ID", "Produto", "Quantidade", "Transação", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItemGerarRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGerarRelatorio.setText("Gerar Relatorio");
        jMenuItemGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGerarRelatorio);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            // TODO add your handling code here:
            listaAuditoria = new DadosAuditoria().consultaId(jTextFieldProduto.getText(), jTextFieldUsuario.getText());
            if (listaAuditoria.size() > 0) {
                listar(listaAuditoria);
            } else {
                if (jTextFieldProduto.getText().equals("") == true && jTextFieldUsuario.getText().equals("") == true) {
                    JOptionPane.showMessageDialog(null, "Preencha pelo menos um campos para buscar.");
                } else {
                    JOptionPane.showMessageDialog(null, "A busca não retornou resultados.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());

        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jMenuItemGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelatorioActionPerformed
        try {
            // TODO add your handling code here:
            DadosProduto dados = new DadosProduto();
            dados.gerarRelatorio();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("PDF_Relatorio.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
            }
        }
    }//GEN-LAST:event_jMenuItemGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(FormAuditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAuditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAuditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAuditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            FormAuditoria dialog;
            try {
                dialog = new FormAuditoria(new javax.swing.JFrame(), true);

                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(FormAuditoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private void centralizaColunas() {
        ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);
        jTable1.getTableHeader().repaint();
    }

    private void listar(ArrayList<Auditoria> listaAuditoria) {
//        DadosUsuario dadosU = new DadosUsuario();
//        DadosProduto dados = new DadosProduto();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < listaAuditoria.size(); i++) {
                Auditoria auditoria = listaAuditoria.get(i);
                modelo.addRow(new String[]{String.valueOf(auditoria.getId()), String.valueOf(auditoria.getUsuario().getId()), auditoria.getUsuario().getLogin(), 
                    String.valueOf(auditoria.getProduto().getId()), auditoria.getProduto().getNome(), String.valueOf(auditoria.getQuantidadeProduto()), 
                    auditoria.getTipoTransacao(), String.valueOf(auditoria.getDataOperacao())});
            }
            for (int x = 0; x < 8; x++) {
                jTable1.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
            }
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
            jTable1.setRowSorter(sorter);
        } catch (Exception ex) {
            Logger.getLogger(FormAuditoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void preVizualizar() {

        //attributes.add(new MediaPrintableArea(6, 6, 198, 278, MediaPrintableArea.MM)); // A4: 210x297mm
        //boolean add = attributes.add(Sides.DUPLEX);
        //attributes.add(OrientationRequested.PORTRAIT);
        PrintPreview printPreview = new PrintPreview(
                jTable1.getPrintable(PrintMode.FIT_WIDTH, new MessageFormat("Controle de Estoque"), new MessageFormat("Pagina {0}")),
                printerJob.defaultPage()
        //printerJob.getPageFormat(attributes)
        );

    }

    private void imprimir() {
        MessageFormat header = new MessageFormat("Controle de Estoque");
        MessageFormat footer = new MessageFormat("Pagina {0,number,integer}");

        try {
            // TODO add your handling code here:

            Boolean printdata = jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            if (printdata) {
                JOptionPane.showMessageDialog(null, "Impressão terminada");
            } else {
                JOptionPane.showMessageDialog(null, "Impressão cancelada");
            }
        } catch (PrinterException ex) {
            //System.err.format("Impressora não encontrada %s%n", ex.getMessage());
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
