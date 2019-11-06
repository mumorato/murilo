package visao;

import controle.ControleCidade;
import controle.ControleFornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import modelo.Cidade;
import modelo.Fornecedor;

public class TelaTeste extends javax.swing.JFrame {

    ArrayList<Fornecedor> resultadoPesquisaFor;
    ArrayList<Cidade> resultadoPesquisaCid;

    public TelaTeste() {
        initComponents();
        atualizarPesquisaFornecedores();
        atualizarPesquisaCidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFornecedores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoIdFor = new javax.swing.JTextField();
        campoNomeFor = new javax.swing.JTextField();
        campoCnpjFor = new javax.swing.JTextField();
        campoEnderecoFor = new javax.swing.JTextField();
        campoNumeroFor = new javax.swing.JTextField();
        campoBairroFor = new javax.swing.JTextField();
        botaoSalvarFor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        botaoExcluirFor = new javax.swing.JButton();
        botaoPesquisarFor = new javax.swing.JButton();
        campoFiltroFor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelCidades = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoIdCid = new javax.swing.JTextField();
        campoNomeCid = new javax.swing.JTextField();
        campoUfCid = new javax.swing.JTextField();
        botaoSalvarCid = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCidades = new javax.swing.JTable();
        botaoExcluirCid = new javax.swing.JButton();
        botaoPesquisarCid = new javax.swing.JButton();
        campoFiltroCid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 600));

        painelFornecedores.setBorder(javax.swing.BorderFactory.createTitledBorder("FORNECEDORES"));

        jLabel1.setText("ID:");

        jLabel2.setText("NOME:");

        jLabel3.setText("CNPJ:");

        jLabel4.setText("ENDEREÇO:");

        jLabel5.setText("NUMERO:");

        jLabel6.setText("BAIRRO:");

        botaoSalvarFor.setText("SALVAR");
        botaoSalvarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarForActionPerformed(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CNPJ", "ENDEREÇO", "NÚMERO", "BAIRRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);

        botaoExcluirFor.setText("EXCLUIR");
        botaoExcluirFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirForActionPerformed(evt);
            }
        });

        botaoPesquisarFor.setText("PESQUISAR");
        botaoPesquisarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarForActionPerformed(evt);
            }
        });

        campoFiltroFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoFiltroForKeyPressed(evt);
            }
        });

        jLabel7.setText("FILTRO:");

        javax.swing.GroupLayout painelFornecedoresLayout = new javax.swing.GroupLayout(painelFornecedores);
        painelFornecedores.setLayout(painelFornecedoresLayout);
        painelFornecedoresLayout.setHorizontalGroup(
            painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluirFor)
                .addContainerGap())
            .addGroup(painelFornecedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createSequentialGroup()
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createSequentialGroup()
                                .addComponent(campoFiltroFor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPesquisarFor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoBairroFor)
                            .addComponent(campoNumeroFor)
                            .addComponent(campoEnderecoFor)
                            .addComponent(campoCnpjFor)
                            .addComponent(campoNomeFor)
                            .addComponent(campoIdFor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFornecedoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSalvarFor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        painelFornecedoresLayout.setVerticalGroup(
            painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCnpjFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEnderecoFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumeroFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairroFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvarFor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoFiltroFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(botaoPesquisarFor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(botaoExcluirFor)
                .addGap(10, 10, 10))
        );

        painelCidades.setBorder(javax.swing.BorderFactory.createTitledBorder("CIDADES"));

        jLabel8.setText("ID:");

        jLabel9.setText("NOME:");

        jLabel10.setText("SIGLA UF:");

        botaoSalvarCid.setText("SALVAR");
        botaoSalvarCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarCidActionPerformed(evt);
            }
        });

        tabelaCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCidadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCidades);

        botaoExcluirCid.setText("EXCLUIR");
        botaoExcluirCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirCidActionPerformed(evt);
            }
        });

        botaoPesquisarCid.setText("PESQUISAR");
        botaoPesquisarCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarCidActionPerformed(evt);
            }
        });

        campoFiltroCid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoFiltroCidKeyPressed(evt);
            }
        });

        jLabel14.setText("FILTRO:");

        javax.swing.GroupLayout painelCidadesLayout = new javax.swing.GroupLayout(painelCidades);
        painelCidades.setLayout(painelCidadesLayout);
        painelCidadesLayout.setHorizontalGroup(
            painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluirCid)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCidadesLayout.createSequentialGroup()
                .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCidadesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCidadesLayout.createSequentialGroup()
                                .addComponent(campoFiltroCid, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPesquisarCid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoUfCid)
                            .addComponent(campoNomeCid)
                            .addComponent(campoIdCid)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCidadesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSalvarCid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(painelCidadesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCidadesLayout.setVerticalGroup(
            painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUfCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(61, 61, 61)
                .addComponent(botaoSalvarCid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoFiltroCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(botaoPesquisarCid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluirCid)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        painelCidades.getAccessibleContext().setAccessibleName("");
        painelCidades.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarForActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId(campoIdFor.getText().trim().length() > 0 ? Integer.parseInt(campoIdFor.getText()) : 0);
        fornecedor.setNome(campoNomeFor.getText());
        fornecedor.setCnpj(campoCnpjFor.getText());
        fornecedor.setEndereco(campoEnderecoFor.getText());
        fornecedor.setNumero(campoNumeroFor.getText().trim().length() > 0 ? Integer.parseInt(campoNumeroFor.getText()) : 0);
        fornecedor.setBairro(campoBairroFor.getText());
        ControleFornecedor controle = new ControleFornecedor();
        try {
            controle.salvar(fornecedor);
            JOptionPane.showMessageDialog(this, "Fornecedor Salvo com Sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            atualizarPesquisaFornecedores();
            limparCamposFornecedor();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Salvar Fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoSalvarForActionPerformed

    private void botaoPesquisarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarForActionPerformed
        atualizarPesquisaFornecedores();
    }//GEN-LAST:event_botaoPesquisarForActionPerformed

    private void campoFiltroForKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroForKeyPressed
        if (evt.getKeyCode() == 10) {
            atualizarPesquisaFornecedores();
        }
    }//GEN-LAST:event_campoFiltroForKeyPressed

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        if (evt.getClickCount() == 2) {
            Fornecedor fornecedorClicado = this.resultadoPesquisaFor.get(tabelaFornecedores.getSelectedRow());
            campoIdFor.setText(String.valueOf(fornecedorClicado.getId()));
            campoNomeFor.setText(fornecedorClicado.getNome());
            campoCnpjFor.setText(fornecedorClicado.getCnpj());
            campoEnderecoFor.setText(fornecedorClicado.getEndereco());
            campoNumeroFor.setText(fornecedorClicado.getNumero() > 0 ? String.valueOf(fornecedorClicado.getNumero()) : "");
            campoBairroFor.setText(fornecedorClicado.getBairro());
        }
    }//GEN-LAST:event_tabelaFornecedoresMouseClicked

    private void botaoExcluirForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirForActionPerformed
        if (tabelaFornecedores.getSelectedRow() >= 0) {
            Fornecedor fornecedorSelecionado = resultadoPesquisaFor.get(tabelaFornecedores.getSelectedRow());
            ControleFornecedor controle = new ControleFornecedor();
            try {
                controle.excluir(fornecedorSelecionado);
                JOptionPane.showMessageDialog(this, "Fornecedor  Excluído com Sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                atualizarPesquisaFornecedores();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao Excluir  Fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoExcluirForActionPerformed

    private void botaoSalvarCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarCidActionPerformed
        Cidade cidade = new Cidade();
        cidade.setId(campoIdCid.getText().trim().length() > 0 ? Integer.parseInt(campoIdCid.getText()) : 0);
        cidade.setNome(campoNomeCid.getText());
        cidade.setSiglaEstado(campoUfCid.getText());
        ControleCidade controle = new ControleCidade();
        try {
            controle.salvar(cidade);
            JOptionPane.showMessageDialog(this, "Cidade Salva com Sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            atualizarPesquisaCidades();
            limparCamposCidade();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Salvar Cidade!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoSalvarCidActionPerformed

    private void botaoExcluirCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirCidActionPerformed
        if (tabelaCidades.getSelectedRow() >= 0) {
            Cidade cidadeSelecionada = resultadoPesquisaCid.get(tabelaCidades.getSelectedRow());
            ControleCidade controle = new ControleCidade();
            try {
                controle.excluir(cidadeSelecionada);
                JOptionPane.showMessageDialog(this, "Cidade  Excluída com Sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                atualizarPesquisaCidades();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao Excluir  Cidade!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoExcluirCidActionPerformed

    private void botaoPesquisarCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarCidActionPerformed
        atualizarPesquisaCidades();
    }//GEN-LAST:event_botaoPesquisarCidActionPerformed

    private void campoFiltroCidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroCidKeyPressed
        if (evt.getKeyCode() == 10) {
            atualizarPesquisaCidades();
        }
    }//GEN-LAST:event_campoFiltroCidKeyPressed

    private void tabelaCidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCidadesMouseClicked
        if (evt.getClickCount() == 2) {
            Cidade cidadeClicada = this.resultadoPesquisaCid.get(tabelaCidades.getSelectedRow());
            campoIdCid.setText(String.valueOf(cidadeClicada.getId()));
            campoNomeCid.setText(cidadeClicada.getNome());
            campoUfCid.setText(cidadeClicada.getSiglaEstado());
        }
    }//GEN-LAST:event_tabelaCidadesMouseClicked

    private void limparCamposFornecedor() {
        campoIdFor.setText("");
        campoNomeFor.setText("");
        campoCnpjFor.setText("");
        campoEnderecoFor.setText("");
        campoNumeroFor.setText("");
        campoBairroFor.setText("");
    }

    private void limparCamposCidade() {
        campoIdCid.setText("");
        campoNomeCid.setText("");
        campoUfCid.setText("");
    }

    private void atualizarPesquisaFornecedores() {
        ControleFornecedor controle = new ControleFornecedor();
        DefaultTableModel model = (DefaultTableModel) tabelaFornecedores.getModel();
        model.setNumRows(0);

        try {
            this.resultadoPesquisaFor = controle.pesquisar(campoFiltroFor.getText().trim());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Falha ao Pesquisar Fornecedores!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        for (Fornecedor fornecedor : this.resultadoPesquisaFor) {
            model.addRow(new Object[]{
                fornecedor.getId(),
                fornecedor.getNome(),
                fornecedor.getCnpj(),
                fornecedor.getEndereco(),
                fornecedor.getNumero() > 0 ? fornecedor.getNumero() : null,
                fornecedor.getBairro()
            });
        }
    }

    private void atualizarPesquisaCidades() {
        ControleCidade controle = new ControleCidade();
        DefaultTableModel model = (DefaultTableModel) tabelaCidades.getModel();
        model.setNumRows(0);

        try {
            this.resultadoPesquisaCid = controle.pesquisar(campoFiltroCid.getText().trim());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Falha ao Pesquisar Cidades!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        for (Cidade cidade : this.resultadoPesquisaCid) {
            model.addRow(new Object[]{
                cidade.getId(),
                cidade.getNome(),
                cidade.getSiglaEstado()
            });
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {

                }
                TelaTeste tela = new TelaTeste();
                tela.setSize(1000, 750);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluirCid;
    private javax.swing.JButton botaoExcluirFor;
    private javax.swing.JButton botaoPesquisarCid;
    private javax.swing.JButton botaoPesquisarFor;
    private javax.swing.JButton botaoSalvarCid;
    private javax.swing.JButton botaoSalvarFor;
    private javax.swing.JTextField campoBairroFor;
    private javax.swing.JTextField campoCnpjFor;
    private javax.swing.JTextField campoEnderecoFor;
    private javax.swing.JTextField campoFiltroCid;
    private javax.swing.JTextField campoFiltroFor;
    private javax.swing.JTextField campoIdCid;
    private javax.swing.JTextField campoIdFor;
    private javax.swing.JTextField campoNomeCid;
    private javax.swing.JTextField campoNomeFor;
    private javax.swing.JTextField campoNumeroFor;
    private javax.swing.JTextField campoUfCid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelCidades;
    private javax.swing.JPanel painelFornecedores;
    private javax.swing.JTable tabelaCidades;
    private javax.swing.JTable tabelaFornecedores;
    // End of variables declaration//GEN-END:variables
}
