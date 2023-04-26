package view;

import control.DiscoController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Disco;

public class DiscoForm extends javax.swing.JFrame {

    private DiscoController dCntrl;

    public DiscoForm() {
        initComponents();
        dCntrl = new DiscoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblArtista = new javax.swing.JLabel();
        lblNumTracks = new javax.swing.JLabel();
        lblGravadora = new javax.swing.JLabel();
        lblAnoLancamento = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        txtGravadora = new javax.swing.JTextField();
        txtAnoLanc = new javax.swing.JTextField();
        txtNumTracks = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDiscos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Discos");

        lblCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCadastro.setText("Insira as informações do disco:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Título:");

        lblArtista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblArtista.setText("Artista:");

        lblNumTracks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNumTracks.setText("Nº de Tracks:");

        lblGravadora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblGravadora.setText("Gravadora:");

        lblAnoLancamento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAnoLancamento.setText("Ano de Lançamento:");

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtArtista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtGravadora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtAnoLanc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtNumTracks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tableDiscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Artista", "Gravadora", "Ano de Lançamento", "Nº de Tracks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDiscos);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Insira o título ou deixe vazio para buscar todos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTitulo)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNumTracks)
                                        .addComponent(lblGravadora)
                                        .addComponent(lblArtista)
                                        .addComponent(lblAnoLancamento))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtGravadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAnoLanc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtArtista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumTracks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblCadastro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnCadastrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblTitulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArtista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGravadora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGravadora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoLanc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnoLancamento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumTracks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumTracks))
                .addGap(26, 26, 26)
                .addComponent(btnCadastrar)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String titulo = txtTitulo.getText();
        String artista = txtArtista.getText();
        int anoLancamento = Integer.parseInt(txtAnoLanc.getText());
        String gravadora = txtGravadora.getText();
        int qtdTracks = Integer.parseInt(txtNumTracks.getText());
        try {
            dCntrl.inserirAluno(titulo, artista, anoLancamento, gravadora, qtdTracks);
            JOptionPane.showMessageDialog(null, "Disco inserido com sucesso!");
            txtTitulo.setText("");
            txtArtista.setText("");
            txtGravadora.setText("");
            txtAnoLanc.setText("");
            txtNumTracks.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir disco ");
            System.out.println("Erro ao incluir aluno: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ArrayList<Disco> lista;
        try {
            if (txtBuscar.getText().equals("")) {
                lista = dCntrl.buscarDiscos();
            } else {
                lista = dCntrl.buscarDiscos(txtBuscar.getText());
            }
            DefaultTableModel dados = (DefaultTableModel) tableDiscos.getModel();
            dados.setNumRows(0);
            for(Disco d: lista){
                dados.addRow(new Object[]{d.getId(), d.getTitulo(), d.getArtista(), d.getGravadora(), d.getAnoLancamento(), d.getQtdTracks()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar disco ");
            System.out.println("Erro ao incluir aluno: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int linhaSelecionada = tableDiscos .getSelectedRow();
        int codigo = Integer.parseInt(tableDiscos.getValueAt(linhaSelecionada, 0).toString());
        try{
            dCntrl.excluirDisco(codigo);
            JOptionPane.showMessageDialog(null, "Disco excluído com sucesso! ");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar disco ");
            System.out.println("Erro ao incluir aluno: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DiscoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiscoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiscoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiscoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnoLancamento;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblGravadora;
    private javax.swing.JLabel lblNumTracks;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tableDiscos;
    private javax.swing.JTextField txtAnoLanc;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtGravadora;
    private javax.swing.JTextField txtNumTracks;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
