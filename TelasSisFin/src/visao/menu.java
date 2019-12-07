package visao;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class menu extends javax.swing.JFrame {

    CadastroPessoa cadastroPessoa;
    CadastroTitulo cadastroTitulos;
    CadastroCategoria cadastroCategoria;
    CadastroReceita cadastroReceita;
    Lancamentos lancamentos;

    public menu() {
        initComponents();
        cadastroPessoa = null;
        cadastroTitulos = null;
        cadastroCategoria = null;
        cadastroReceita = null;
        lancamentos = null;
    }

    private void telasPraFrente() {
        //tela cadastroTitulo
        if (cadastroTitulos != null) {
            if (cadastroTitulos.estaFechada()) {
                cadastroTitulos = null;
            } else {
                cadastroTitulos.setVisible(true);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        //tela cadastroCategoria
        if (cadastroCategoria != null) {
            if (cadastroCategoria.estaFechada()) {
                cadastroCategoria = null;
            } else {
                cadastroCategoria.setVisible(true);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        //tela cadastroReceita
        if (cadastroReceita != null) {
            if (cadastroReceita.estaFechada()) {
                cadastroReceita = null;
            } else {
                cadastroReceita.setVisible(true);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        //tela Lancamentos
        if (lancamentos != null) {
            if (lancamentos.estaFechada()) {
                lancamentos = null;
            } else {
                lancamentos.setVisible(true);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        if (cadastroPessoa != null) {
            if (cadastroPessoa.estaFechada()) {
                cadastroPessoa = null;
            } else {
                cadastroPessoa.setVisible(true);
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        lbIcon1Select = new javax.swing.JLabel();
        lbIcon2Select = new javax.swing.JLabel();
        lbIcon3Select = new javax.swing.JLabel();
        lbIcon4Select = new javax.swing.JLabel();
        lbIcon5Select = new javax.swing.JLabel();
        menuPaineisSelect = new javax.swing.JLabel();
        menuLancamentosSelect1 = new javax.swing.JLabel();
        menuAgendamentosSelect = new javax.swing.JLabel();
        menuCadastroSelect = new javax.swing.JLabel();
        menuCategoriaSelect = new javax.swing.JLabel();
        menuTitulosSelect1 = new javax.swing.JLabel();
        pnlMenuLateral = new javax.swing.JPanel();
        pnlAreaUtilBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlFrame = new javax.swing.JPanel();
        pnlMenuLateral1 = new javax.swing.JPanel();
        pnlAreaUtilBG1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        tfSacado = new javax.swing.JTextField();
        tfCedente = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        tfVencimento = new javax.swing.JFormattedTextField();
        tfCompetencia = new javax.swing.JFormattedTextField();
        cbCondicao = new javax.swing.JComboBox<>();
        cbParcelas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pnlFundo.setPreferredSize(new java.awt.Dimension(1150, 700));
        pnlFundo.setLayout(new java.awt.CardLayout());

        pnlInicio.setPreferredSize(new java.awt.Dimension(900, 700));

        lbIcon1Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon1Select.setPreferredSize(new java.awt.Dimension(211, 243));
        lbIcon1Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIcon1SelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIcon1SelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIcon1SelectMouseExited(evt);
            }
        });

        lbIcon2Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon2Select.setPreferredSize(new java.awt.Dimension(211, 243));
        lbIcon2Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIcon2SelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIcon2SelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIcon2SelectMouseExited(evt);
            }
        });

        lbIcon3Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon3Select.setPreferredSize(new java.awt.Dimension(211, 243));
        lbIcon3Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIcon3SelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIcon3SelectMouseExited(evt);
            }
        });

        lbIcon4Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon4Select.setPreferredSize(new java.awt.Dimension(211, 243));
        lbIcon4Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIcon4SelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIcon4SelectMouseExited(evt);
            }
        });

        lbIcon5Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon5Select.setPreferredSize(new java.awt.Dimension(211, 243));
        lbIcon5Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIcon5SelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIcon5SelectMouseExited(evt);
            }
        });

        menuPaineisSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPaineisSelect.setPreferredSize(new java.awt.Dimension(242, 44));
        menuPaineisSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPaineisSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPaineisSelectMouseExited(evt);
            }
        });

        menuLancamentosSelect1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLancamentosSelect1.setPreferredSize(new java.awt.Dimension(242, 44));
        menuLancamentosSelect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLancamentosSelect1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuLancamentosSelect1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuLancamentosSelect1MouseExited(evt);
            }
        });

        menuAgendamentosSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAgendamentosSelect.setPreferredSize(new java.awt.Dimension(242, 44));
        menuAgendamentosSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAgendamentosSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAgendamentosSelectMouseExited(evt);
            }
        });

        menuCadastroSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCadastroSelect.setPreferredSize(new java.awt.Dimension(242, 44));
        menuCadastroSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastroSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuCadastroSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuCadastroSelectMouseExited(evt);
            }
        });

        menuCategoriaSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCategoriaSelect.setPreferredSize(new java.awt.Dimension(242, 44));
        menuCategoriaSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCategoriaSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuCategoriaSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuCategoriaSelectMouseExited(evt);
            }
        });

        menuTitulosSelect1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuTitulosSelect1.setPreferredSize(new java.awt.Dimension(242, 44));
        menuTitulosSelect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuTitulosSelect1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuTitulosSelect1MouseExited(evt);
            }
        });

        pnlMenuLateral.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuLateral.setPreferredSize(new java.awt.Dimension(1150, 700));

        pnlAreaUtilBG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconsBGDir.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlAreaUtilBGLayout = new javax.swing.GroupLayout(pnlAreaUtilBG);
        pnlAreaUtilBG.setLayout(pnlAreaUtilBGLayout);
        pnlAreaUtilBGLayout.setHorizontalGroup(
            pnlAreaUtilBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaUtilBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
        );
        pnlAreaUtilBGLayout.setVerticalGroup(
            pnlAreaUtilBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaUtilBGLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menuLateral.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLateralLayout = new javax.swing.GroupLayout(pnlMenuLateral);
        pnlMenuLateral.setLayout(pnlMenuLateralLayout);
        pnlMenuLateralLayout.setHorizontalGroup(
            pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 894, Short.MAX_VALUE))
            .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLateralLayout.createSequentialGroup()
                    .addGap(0, 253, Short.MAX_VALUE)
                    .addComponent(pnlAreaUtilBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlMenuLateralLayout.setVerticalGroup(
            pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLateralLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMenuLateralLayout.createSequentialGroup()
                    .addComponent(pnlAreaUtilBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuCadastroSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPaineisSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuLancamentosSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuAgendamentosSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuCategoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuTitulosSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon4Select, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIcon1Select, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon2Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIcon5Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbIcon3Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(menuPaineisSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuLancamentosSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuAgendamentosSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuCadastroSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuCategoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuTitulosSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIcon2Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIcon3Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon5Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addComponent(lbIcon1Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon4Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );

        pnlFundo.add(pnlInicio, "card3");

        pnlFrame.setBackground(new java.awt.Color(255, 255, 255));
        pnlFrame.setPreferredSize(new java.awt.Dimension(1150, 704));

        pnlMenuLateral1.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuLateral1.setPreferredSize(new java.awt.Dimension(1150, 700));

        pnlAreaUtilBG1.setBackground(new java.awt.Color(255, 255, 255));

        tfTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Título ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfSacado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sacado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfCedente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor (R$)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        tfVencimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vencimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        tfCompetencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Competência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        tfCompetencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        cbCondicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCondicao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N

        cbParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbParcelas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parcelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nexa Light", 1, 12))); // NOI18N
        cbParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParcelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAreaUtilBG1Layout = new javax.swing.GroupLayout(pnlAreaUtilBG1);
        pnlAreaUtilBG1.setLayout(pnlAreaUtilBG1Layout);
        pnlAreaUtilBG1Layout.setHorizontalGroup(
            pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaUtilBG1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(109, 109, 109))
            .addGroup(pnlAreaUtilBG1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAreaUtilBG1Layout.createSequentialGroup()
                        .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAreaUtilBG1Layout.createSequentialGroup()
                                .addComponent(tfSacado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCedente)))
                        .addGap(147, 417, Short.MAX_VALUE))
                    .addGroup(pnlAreaUtilBG1Layout.createSequentialGroup()
                        .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAreaUtilBG1Layout.createSequentialGroup()
                                .addComponent(tfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAreaUtilBG1Layout.createSequentialGroup()
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlAreaUtilBG1Layout.setVerticalGroup(
            pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaUtilBG1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSacado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCedente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfValor)
                        .addComponent(cbCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22)
                .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout pnlMenuLateral1Layout = new javax.swing.GroupLayout(pnlMenuLateral1);
        pnlMenuLateral1.setLayout(pnlMenuLateral1Layout);
        pnlMenuLateral1Layout.setHorizontalGroup(
            pnlMenuLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLateral1Layout.createSequentialGroup()
                .addComponent(pnlAreaUtilBG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMenuLateral1Layout.setVerticalGroup(
            pnlMenuLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLateral1Layout.createSequentialGroup()
                .addComponent(pnlAreaUtilBG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menuLateral.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlFrameLayout = new javax.swing.GroupLayout(pnlFrame);
        pnlFrame.setLayout(pnlFrameLayout);
        pnlFrameLayout.setHorizontalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrameLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMenuLateral1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlFrameLayout.setVerticalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuLateral1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlFundo.add(pnlFrame, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbIcon1SelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon1SelectMouseEntered
        lbIcon1Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon1Select.png"))); // NOI18N
        lbIcon1Select.setPreferredSize(new java.awt.Dimension(211, 243));        // TODO add your handling code here:
    }//GEN-LAST:event_lbIcon1SelectMouseEntered

    private void lbIcon1SelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon1SelectMouseExited
        lbIcon1Select.setIcon(null); // NOI18N
        lbIcon1Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon1SelectMouseExited

    private void lbIcon2SelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon2SelectMouseEntered
        lbIcon2Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon2Select.png")));
        lbIcon2Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon2SelectMouseEntered

    private void lbIcon2SelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon2SelectMouseExited
        lbIcon2Select.setIcon(null); // NOI18N
        lbIcon2Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon2SelectMouseExited

    private void lbIcon3SelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon3SelectMouseEntered
        lbIcon3Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon3Select.png")));
        lbIcon3Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon3SelectMouseEntered

    private void lbIcon3SelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon3SelectMouseExited
        lbIcon3Select.setIcon(null); // NOI18N
        lbIcon3Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon3SelectMouseExited

    private void lbIcon4SelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon4SelectMouseEntered
        lbIcon4Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon4Select.png")));
        lbIcon4Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon4SelectMouseEntered

    private void lbIcon4SelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon4SelectMouseExited
        lbIcon4Select.setIcon(null); // NOI18N
        lbIcon4Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon4SelectMouseExited

    private void lbIcon5SelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon5SelectMouseEntered
        lbIcon5Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon5Select.png")));
        lbIcon5Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon5SelectMouseEntered

    private void lbIcon5SelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon5SelectMouseExited
        lbIcon5Select.setIcon(null); // NOI18N
        lbIcon5Select.setPreferredSize(new java.awt.Dimension(211, 243));
    }//GEN-LAST:event_lbIcon5SelectMouseExited

    private void lbIcon1SelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon1SelectMouseClicked
//        pnlFundo.removeAll();
//        pnlFundo.repaint();
//        pnlFundo.revalidate();
//        pnlFundo.add(pnlFrame);
//        pnlFundo.repaint();
//        pnlFundo.revalidate();   
        if (cadastroTitulos == null) {            // condiçao de janela já aberta    
            CadastroTitulo frame = new CadastroTitulo();
            cadastroTitulos = frame;
        }
        cadastroTitulos.setVisible(true);
    }//GEN-LAST:event_lbIcon1SelectMouseClicked

    private void cbParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbParcelasActionPerformed

    private void menuPaineisSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPaineisSelectMouseEntered
        menuPaineisSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btPaineisSelect.png"))); // NOI18N
        menuPaineisSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuPaineisSelectMouseEntered

    private void menuPaineisSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPaineisSelectMouseExited
        menuPaineisSelect.setIcon(null); // NOI18N
        menuPaineisSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuPaineisSelectMouseExited

    private void menuLancamentosSelect1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLancamentosSelect1MouseEntered
        menuLancamentosSelect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btLancamentosSelect.png"))); // NOI18N
        menuLancamentosSelect1.setPreferredSize(new java.awt.Dimension(242, 44));       // TODO add your handling code here:
    }//GEN-LAST:event_menuLancamentosSelect1MouseEntered

    private void menuLancamentosSelect1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLancamentosSelect1MouseExited
        menuLancamentosSelect1.setIcon(null); // NOI18N
        menuLancamentosSelect1.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuLancamentosSelect1MouseExited

    private void menuAgendamentosSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgendamentosSelectMouseEntered
        menuAgendamentosSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btAgendamentosSelect.png"))); // NOI18N
        menuAgendamentosSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuAgendamentosSelectMouseEntered

    private void menuAgendamentosSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgendamentosSelectMouseExited
        menuAgendamentosSelect.setIcon(null); // NOI18N
        menuAgendamentosSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuAgendamentosSelectMouseExited

    private void menuCadastroSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastroSelectMouseEntered
        menuCadastroSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btCadastrosSelect.png"))); // NOI18N
        menuCadastroSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroSelectMouseEntered

    private void menuCadastroSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastroSelectMouseExited
        menuCadastroSelect.setIcon(null); // NOI18N
        menuCadastroSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroSelectMouseExited

    private void menuCategoriaSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategoriaSelectMouseEntered
        menuCategoriaSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btCategoriasSelect.png"))); // NOI18N
        menuCategoriaSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuCategoriaSelectMouseEntered

    private void menuCategoriaSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategoriaSelectMouseExited
        menuCategoriaSelect.setIcon(null); // NOI18N
        menuCategoriaSelect.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuCategoriaSelectMouseExited

    private void menuTitulosSelect1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTitulosSelect1MouseEntered
        menuTitulosSelect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btTitulosSelect.png"))); // NOI18N
        menuTitulosSelect1.setPreferredSize(new java.awt.Dimension(242, 44));        // TODO add your handling code here:
    }//GEN-LAST:event_menuTitulosSelect1MouseEntered

    private void menuTitulosSelect1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTitulosSelect1MouseExited
        menuTitulosSelect1.setIcon(null); // NOI18N
        menuTitulosSelect1.setPreferredSize(new java.awt.Dimension(242, 44));       // TODO add your handling code here:
    }//GEN-LAST:event_menuTitulosSelect1MouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        telasPraFrente();        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void menuCategoriaSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategoriaSelectMouseClicked
        if (cadastroCategoria == null) {            // condiçao de janela já aberta    
            CadastroCategoria janelaCad = new CadastroCategoria();
            cadastroCategoria = janelaCad;
        }
        cadastroCategoria.setVisible(true);
    }//GEN-LAST:event_menuCategoriaSelectMouseClicked

    private void lbIcon2SelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon2SelectMouseClicked
        if (cadastroReceita == null) {            // condiçao de janela já aberta    
            CadastroReceita frame2 = new CadastroReceita();
            cadastroReceita = frame2;
        }
        cadastroReceita.setVisible(true);
    }//GEN-LAST:event_lbIcon2SelectMouseClicked

    private void menuLancamentosSelect1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLancamentosSelect1MouseClicked
        if (lancamentos == null) {            // condiçao de janela já aberta    
            Lancamentos frame3 = new Lancamentos();
            lancamentos = frame3;
        }
        lancamentos.setVisible(true);
    }//GEN-LAST:event_menuLancamentosSelect1MouseClicked

    private void menuCadastroSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastroSelectMouseClicked
        if (cadastroPessoa == null) {            // condiçao de janela já aberta    
            CadastroPessoa frame4 = new CadastroPessoa();
            cadastroPessoa = frame4;
        }
        cadastroPessoa.setVisible(true);
    }//GEN-LAST:event_menuCadastroSelectMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCondicao;
    private javax.swing.JComboBox<String> cbParcelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbIcon1Select;
    private javax.swing.JLabel lbIcon2Select;
    private javax.swing.JLabel lbIcon3Select;
    private javax.swing.JLabel lbIcon4Select;
    private javax.swing.JLabel lbIcon5Select;
    private javax.swing.JLabel menuAgendamentosSelect;
    private javax.swing.JLabel menuCadastroSelect;
    private javax.swing.JLabel menuCategoriaSelect;
    private javax.swing.JLabel menuLancamentosSelect1;
    private javax.swing.JLabel menuPaineisSelect;
    private javax.swing.JLabel menuTitulosSelect1;
    private javax.swing.JPanel pnlAreaUtilBG;
    private javax.swing.JPanel pnlAreaUtilBG1;
    private javax.swing.JPanel pnlFrame;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlMenuLateral;
    private javax.swing.JPanel pnlMenuLateral1;
    private javax.swing.JTextField tfCedente;
    private javax.swing.JFormattedTextField tfCompetencia;
    private javax.swing.JTextField tfSacado;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValor;
    private javax.swing.JFormattedTextField tfVencimento;
    // End of variables declaration//GEN-END:variables
}
