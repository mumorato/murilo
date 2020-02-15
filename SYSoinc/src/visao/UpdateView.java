/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleCategoria;
import controle.ControlePessoa;
import controle.ControleSubcategoria;
import controle.ControleTitulo;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.Categoria;
import modelo.Pessoa;
import modelo.Subcategoria;
import modelo.TipoTitulo;
import modelo.Titulo;

/**
 *
 * @author macbook
 */
public class UpdateView extends javax.swing.JFrame {

    List<Categoria> listaCategoria;
    List<Subcategoria> listaSubcategoria;
    List<Pessoa> listaPessoa;
    ArrayList<Titulo> resultadoPesquisa;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form UpdateView
     */
    public UpdateView() {
        initComponents();
        formatarCampos();

        //Combobox de categoria
        cbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
        ControleCategoria controlador = new ControleCategoria();
        listaCategoria = controlador.getCategoria();
        for (int i = 0; i < listaCategoria.size(); i++) {
            cbCategorias.addItem(listaCategoria.get(i).getNomeCategoria());
        }

        //Combobox de pessoas
        cbCedente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
        ControlePessoa controladorPessoa = new ControlePessoa();
        listaPessoa = controladorPessoa.getPessoa();
        for (int i = 0; i < listaPessoa.size(); i++) {
            cbCedente.addItem(listaPessoa.get(i).getNomePessoa());
        }

    }

    public void setId(int id) {
        txtId.setText(String.valueOf(id));
        consultar();
    }

    private void consultar() {

        try {
            Titulo tituloUp = new Titulo();
            ControleTitulo controle = new ControleTitulo();
            tituloUp = controle.consulta(Integer.parseInt(txtId.getText()));

            tfTitulo.setText(tituloUp.getNomeTitulo());
            tfCedente.setText(tituloUp.getCedente());
            tfValor.setText(Double.toString(tituloUp.getValorTitulo()));
            tfParcela.setText(Integer.toString(tituloUp.getNumeroParcela()));

            tfVencimento.setText(tituloUp.getDataVencimento() != null ? sdf.format(tituloUp.getDataVencimento()) : null);
            tfRealizacao.setText(tituloUp.getDataRealizacao() != null ? sdf.format(tituloUp.getDataRealizacao()) : null);

            if (tituloUp.getTipoTitulo().getIdTipoTitulo() == 0) {
                // grupoTipo.setSelected(jRadioButton, true);
                jRadioButton2.setSelected(true);
            } else {
                jRadioButton1.setSelected(true);
            }

            cbCedente.setSelectedItem(tituloUp.getPessoa().getNomePessoa());
            cbCategorias.setSelectedItem(tituloUp.getCategoria().getNomeCategoria());
            cbSubcategoria.setSelectedItem(tituloUp.getSubCategoria().getNomeSubcategoria());

            if (tituloUp.getPendente().equals("Pendente")) {
                btPendente.setSelected(true);
            } else {
                btEncerrado.setSelected(true);
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void formatarCampos() {

        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.install(tfVencimento);
            MaskFormatter mascara2 = new MaskFormatter("##/##/####");
            mascara2.install(tfRealizacao);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipo = new javax.swing.ButtonGroup();
        grupoPendente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tfTitulo = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        cbCategorias = new javax.swing.JComboBox<>();
        cbSubcategoria = new javax.swing.JComboBox<>();
        pnlInf = new javax.swing.JPanel();
        tfCedente = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        tfRealizacao = new javax.swing.JFormattedTextField();
        cbCedente = new javax.swing.JComboBox<>();
        tfVencimento = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        tfParcela = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btPendente = new javax.swing.JRadioButton();
        btEncerrado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(768, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Título ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        grupoTipo.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Despesa");
        jRadioButton2.setActionCommand("0");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        grupoTipo.add(jRadioButton1);
        jRadioButton1.setText("Receita");
        jRadioButton1.setActionCommand("1");

        cbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        cbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriasActionPerformed(evt);
            }
        });

        cbSubcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbSubcategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subcategoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        pnlInf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlInf.setOpaque(false);

        tfCedente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedente/Sacado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfCedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCedenteActionPerformed(evt);
            }
        });

        tfValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor (R$)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfRealizacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Realização em caixa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfRealizacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        cbCedente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCedente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagador/Beneficiário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfVencimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vencimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        btSalvar.setText("Atualizar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tfParcela.setText("1");
        tfParcela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parcelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        grupoPendente.add(btPendente);
        btPendente.setSelected(true);
        btPendente.setText("Pendente");
        btPendente.setActionCommand("Pendente");
        btPendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPendenteActionPerformed(evt);
            }
        });

        grupoPendente.add(btEncerrado);
        btEncerrado.setText("Encerrado");
        btEncerrado.setActionCommand("Encerrado");
        btEncerrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfLayout = new javax.swing.GroupLayout(pnlInf);
        pnlInf.setLayout(pnlInfLayout);
        pnlInfLayout.setHorizontalGroup(
            pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfLayout.createSequentialGroup()
                        .addComponent(btPendente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEncerrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfLayout.createSequentialGroup()
                        .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfLayout.createSequentialGroup()
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbCedente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCedente)
                            .addGroup(pnlInfLayout.createSequentialGroup()
                                .addComponent(tfVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tfRealizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlInfLayout.setVerticalGroup(
            pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfLayout.createSequentialGroup()
                .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCedente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCedente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRealizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEncerrado)
                            .addComponent(btPendente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSalvar)
                        .addComponent(btCancelar)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Nexa Light", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDITAR TÍTULO");

        jLayeredPane1.setLayer(tfTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbCategorias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbSubcategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlInf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlInf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addComponent(cbSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriasActionPerformed

        //filtrando combobox Subcategoria a partir do índice categoria
        cbSubcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
        ControleSubcategoria controlador = new ControleSubcategoria();

        try {
            listaSubcategoria = controlador.getSubcategoria(cbCategorias.getSelectedIndex());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        for (int i = 0; i < listaSubcategoria.size(); i++) {
            cbSubcategoria.addItem(listaSubcategoria.get(i).getNomeSubcategoria());
        }
    }//GEN-LAST:event_cbCategoriasActionPerformed

    private void tfCedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCedenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCedenteActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Titulo titulo = new Titulo();
        int iCat = cbCategorias.getSelectedIndex();
        int iPess = cbCedente.getSelectedIndex();
        int iSubcat = cbSubcategoria.getSelectedIndex();
        if (iSubcat >= 1) {
            //verifica se a subcategoria foi selecionada
            titulo.setIdTitulo(Integer.parseInt(txtId.getText()));
            titulo.setNomeTitulo(tfTitulo.getText());
            titulo.setCedente(tfCedente.getText());                                          //falta máscara do documento
            titulo.setValorTitulo(Double.parseDouble(tfValor.getText()));

            try {
                if (!tfRealizacao.getText().trim().startsWith("/")) {
                    Date temp = new SimpleDateFormat("dd/MM/yyyy").parse(tfRealizacao.getText());
                    titulo.setDataRealizacao(temp);
                }
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(AddTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            try {
                if (tfVencimento.getText().length() >= 8) {
                    Date temp = new SimpleDateFormat("dd/MM/yyyy").parse(tfVencimento.getText());
                    titulo.setDataVencimento(temp);
                };

            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(AddTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            TipoTitulo tipo = new TipoTitulo();
            tipo.setIdTipoTitulo(Integer.parseInt(grupoTipo.getSelection().getActionCommand()));
            titulo.setTipoTitulo(tipo);
            titulo.setPendente((grupoPendente.getSelection().getActionCommand()));

            //combobox categoria/subcategora, salvando posição selecionada da lista e recuperando objeto:
            Categoria categoria = new Categoria();
            categoria.setIdCategoria(listaCategoria.get(iCat - 1).getIdCategoria());
            titulo.setCategoria(categoria);
            Subcategoria subcategoria = new Subcategoria();
            subcategoria.setIdSubcategoria(listaSubcategoria.get(iSubcat - 1).getIdSubcategoria());
            titulo.setSubCategoria(subcategoria);

            //combobox pessoa, salvando posição selecionada da lista e recuperando objeto:
            Pessoa pess = new Pessoa();
            pess.setIdPessoa(listaPessoa.get(iPess - 1).getIdPessoa());
            titulo.setPessoa(pess);

            titulo.setCedente(tfCedente.getText());
            titulo.setNumeroParcela(Integer.parseInt(tfParcela.getText()));

            //salvando titulo
            ControleTitulo controle = new ControleTitulo();

            try {
                controle.salvar(titulo);
                JOptionPane.showMessageDialog(this, "Alterações realizadas! Atualize a tabela de títulos.", "Concluído", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Subcategoria é um campo obrigatório!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btPendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPendenteActionPerformed

    private void btEncerradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEncerradoActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JRadioButton btEncerrado;
    private javax.swing.JRadioButton btPendente;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbCategorias;
    private javax.swing.JComboBox<String> cbCedente;
    private javax.swing.JComboBox<String> cbSubcategoria;
    private javax.swing.ButtonGroup grupoPendente;
    private javax.swing.ButtonGroup grupoTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel pnlInf;
    private javax.swing.JTextField tfCedente;
    private javax.swing.JTextField tfParcela;
    private javax.swing.JFormattedTextField tfRealizacao;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValor;
    private javax.swing.JFormattedTextField tfVencimento;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
