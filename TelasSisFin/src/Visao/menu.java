package Visao;

import java.awt.Color;
import javax.swing.JFrame;

public class menu extends javax.swing.JFrame {

    TelaCategorias cadastroCategorias;

    public menu() {
        initComponents();
//      setBackground(new Color(0,0,0,0));
        cadastroCategorias = null;

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
                .addGap(0, 784, Short.MAX_VALUE))
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
                .addGap(378, 378, 378)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon1Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIcon4Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon2Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIcon5Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbIcon3Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addComponent(lbIcon1Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon4Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIcon2Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIcon3Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIcon5Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFundo.add(pnlInicio, "card3");

        pnlFrame.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGroup(pnlAreaUtilBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(tfValor)
                    .addComponent(cbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        pnlFundo.removeAll();
        pnlFundo.repaint();
        pnlFundo.revalidate();
        pnlFundo.add(pnlFrame);
        pnlFundo.repaint();
        pnlFundo.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_lbIcon1SelectMouseClicked

    private void cbParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbParcelasActionPerformed

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
