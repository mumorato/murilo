/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleCategoria;
import controle.ControleCidadeEstado;
import controle.ControlePessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cidade;
import modelo.Estado;
import modelo.Pessoa;

/**
 *
 * @author macbook
 */
public class PessoasView extends javax.swing.JPanel {

    ArrayList<Pessoa> resultadoPesquisa;
    List<Cidade> listaCidades;

    public PessoasView() {
        initComponents();
        atualizarPesquisa();

//combo box de cidadeEstado
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
        ControleCidadeEstado controlador = new ControleCidadeEstado();
        List<Estado> listaEstados = controlador.getEstados();
        for (int i = 0; i < listaEstados.size(); i++) {
            cbEstado.addItem(listaEstados.get(i).getNomeEstado());
        }
    }

    //--------------MÉTODOS-------------------
    private void atualizarPesquisa() {
        ControlePessoa controle = new ControlePessoa();
        DefaultTableModel model = (DefaultTableModel) tblPessoa.getModel();
        model.setNumRows(0);

        try {
            this.resultadoPesquisa = controle.pesquisar(tfPesquisa.getText().trim());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Falha na Pesquisa!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        for (Pessoa pessoa : this.resultadoPesquisa) {
            model.addRow(new Object[]{
                pessoa.getIdPessoa(),
                pessoa.getNomePessoa(),
                pessoa.getTipoPessoa(),
                pessoa.getCpfCnpj(),
                pessoa.getNomeCidade(),
                pessoa.getEndereco(),
                pessoa.getBairro(),
                pessoa.getTelefone()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipo = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        tfCpfCnpj = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        cbCidade = new javax.swing.JComboBox<>();
        tfEndereco = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        cxCliente = new javax.swing.JRadioButton();
        cxFornecedor = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 630));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1280, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgDesfocado.jpg"))); // NOI18N

        jPanel1.setOpaque(false);

        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfCpfCnpj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF/CNPJ (apenas números)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        cbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        cbCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });

        tfEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço (Rua, número, complemento)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        tfBairro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone (DDD+numero)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });

        grupoTipo.add(cxCliente);
        cxCliente.setSelected(true);
        cxCliente.setText("Cliente");
        cxCliente.setActionCommand("Cliente");
        cxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxClienteActionPerformed(evt);
            }
        });

        grupoTipo.add(cxFornecedor);
        cxFornecedor.setText("Fornecedor");
        cxFornecedor.setActionCommand("Fornecedor");

        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Documento", "Cidade", "Endereço", "Bairro", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPessoa);
        if (tblPessoa.getColumnModel().getColumnCount() > 0) {
            tblPessoa.getColumnModel().getColumn(0).setResizable(false);
            tblPessoa.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jButton1.setText("Apagar");

        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nexa Light", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO DE PESSOAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisa))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cxFornecedor)
                                                        .addComponent(cxCliente))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxFornecedor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisa))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void cxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxClienteActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
 
        try {
            cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
            ControleCidadeEstado controlador = new ControleCidadeEstado();
            listaCidades = controlador.getCidades(cbEstado.getSelectedIndex());
            for (int i = 0; i < listaCidades.size(); i++) {
                cbCidade.addItem(listaCidades.get(i).getNomeCidade());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        int vlCidade = cbCidade.getSelectedIndex();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNomePessoa(tfNome.getText());
        pessoa.setCpfCnpj(tfCpfCnpj.getText());                                           //falta máscara do documento
        pessoa.setEndereco(tfEndereco.getText());
        pessoa.setBairro(tfBairro.getText());
        pessoa.setTelefone(tfTelefone.getText());
        pessoa.setCidadeId(listaCidades.get(vlCidade-1).getIdCidade());
        pessoa.setTipoPessoa(grupoTipo.getSelection().getActionCommand());

//salvando
        ControlePessoa controle = new ControlePessoa();
        try {
            controle.salvar(pessoa);
//setando o campos em branco novamente
            tfNome.setText("");
            tfCpfCnpj.setText("");
            tfEndereco.setText("");
            tfBairro.setText("");
            tfTelefone.setText("");
            tfNome.setText("");
            cbCidade.setSelectedIndex(-1);
            grupoTipo.clearSelection();

        } catch (SQLException ex) {
            Logger.getLogger(PessoasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Cadastro realizado!", "Concluído", JOptionPane.INFORMATION_MESSAGE);
        atualizarPesquisa();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        atualizarPesquisa();
    }//GEN-LAST:event_btPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JRadioButton cxCliente;
    private javax.swing.JRadioButton cxFornecedor;
    private javax.swing.ButtonGroup grupoTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCpfCnpj;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
