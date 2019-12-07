package visao;

import java.awt.BorderLayout;

public class InicialView extends javax.swing.JFrame {

    public InicialView() {
        initComponents();
        pnlInferior.setLayout(new BorderLayout());
        InicialBgView view = new InicialBgView();
        pnlInferior.add(view);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbInicio = new javax.swing.JLabel();
        lbQuem = new javax.swing.JLabel();
        lbLancamentos = new javax.swing.JLabel();
        lbCategorias = new javax.swing.JLabel();
        lbPessoas = new javax.swing.JLabel();
        bgMenuSup = new javax.swing.JLabel();
        pnlInferior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 710));
        setMinimumSize(new java.awt.Dimension(1280, 710));
        setResizable(false);

        pnlMenu.setPreferredSize(new java.awt.Dimension(1280, 80));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbInicio.setFont(new java.awt.Font("Nexa Light", 0, 14)); // NOI18N
        lbInicio.setText("Início");
        lbInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbInicioMouseExited(evt);
            }
        });

        lbQuem.setFont(new java.awt.Font("Nexa Light", 0, 14)); // NOI18N
        lbQuem.setText("Quem Somos");
        lbQuem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbQuem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQuemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbQuemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbQuemMouseExited(evt);
            }
        });

        lbLancamentos.setFont(new java.awt.Font("Nexa Light", 0, 14)); // NOI18N
        lbLancamentos.setText("Lançamentos");
        lbLancamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLancamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLancamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLancamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLancamentosMouseExited(evt);
            }
        });

        lbCategorias.setFont(new java.awt.Font("Nexa Light", 0, 14)); // NOI18N
        lbCategorias.setText("Categorias");
        lbCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCategoriasMouseExited(evt);
            }
        });

        lbPessoas.setFont(new java.awt.Font("Nexa Light", 0, 14)); // NOI18N
        lbPessoas.setText("Pessoas");
        lbPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPessoasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPessoasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPessoasMouseExited(evt);
            }
        });

        jLayeredPane1.setLayer(lbInicio, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(lbQuem, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(lbLancamentos, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(lbCategorias, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(lbPessoas, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(lbInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lbLancamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(lbCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(lbPessoas)
                .addGap(79, 79, 79)
                .addComponent(lbQuem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategorias)
                    .addComponent(lbLancamentos)
                    .addComponent(lbInicio)
                    .addComponent(lbQuem)
                    .addComponent(lbPessoas))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlMenu.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 6, -1, -1));

        bgMenuSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OincFinal_01.jpg"))); // NOI18N
        pnlMenu.add(bgMenuSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout pnlInferiorLayout = new javax.swing.GroupLayout(pnlInferior);
        pnlInferior.setLayout(pnlInferiorLayout);
        pnlInferiorLayout.setHorizontalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        pnlInferiorLayout.setVerticalGroup(
            pnlInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 630, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(pnlInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMouseEntered
        lbInicio.setFont(new java.awt.Font("Nexa Bold", 0, 14));                             // EVENTO RESPONSIVO DO ITEM DO MENU
        lbInicio.setText("Início");
    }//GEN-LAST:event_lbInicioMouseEntered

    private void lbInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMouseExited
        lbInicio.setFont(new java.awt.Font("Nexa Light", 0, 14));                            // EVENTO RESPONSIVO DO ITEM DO MENU
        lbInicio.setText("Início");
    }//GEN-LAST:event_lbInicioMouseExited

    private void lbInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMouseClicked

        pnlInferior.removeAll();
        pnlInferior.setLayout(new BorderLayout());

        InicialBgView view = new InicialBgView();
        pnlInferior.add(view);
        pack();
    }//GEN-LAST:event_lbInicioMouseClicked

    private void lbLancamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLancamentosMouseEntered
        lbLancamentos.setFont(new java.awt.Font("Nexa Bold", 0, 14));                        // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbLancamentosMouseEntered

    private void lbLancamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLancamentosMouseExited
        lbLancamentos.setFont(new java.awt.Font("Nexa Light", 0, 14));                       // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbLancamentosMouseExited

    private void lbLancamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLancamentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbLancamentosMouseClicked

    private void lbCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCategoriasMouseEntered
        lbCategorias.setFont(new java.awt.Font("Nexa Bold", 0, 14));                         // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbCategoriasMouseEntered

    private void lbCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCategoriasMouseExited
        lbCategorias.setFont(new java.awt.Font("Nexa Light", 0, 14));                        // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbCategoriasMouseExited

    private void lbCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCategoriasMouseClicked
        pnlInferior.removeAll();
        pnlInferior.setLayout(new BorderLayout());
        CategoriaView view = new CategoriaView();
        pnlInferior.add(view);
        pack();
    }//GEN-LAST:event_lbCategoriasMouseClicked

    private void lbQuemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuemMouseEntered
        lbQuem.setFont(new java.awt.Font("Nexa Bold", 0, 14));                               // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbQuemMouseEntered

    private void lbQuemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuemMouseExited
        lbQuem.setFont(new java.awt.Font("Nexa Light", 0, 14));                              // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbQuemMouseExited

    private void lbQuemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbQuemMouseClicked

    private void lbPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPessoasMouseClicked
        pnlInferior.removeAll();
        pnlInferior.setLayout(new BorderLayout());
        PessoasView view = new PessoasView();
        pnlInferior.add(view);
        pack();
    }//GEN-LAST:event_lbPessoasMouseClicked

    private void lbPessoasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPessoasMouseEntered
        lbPessoas.setFont(new java.awt.Font("Nexa Bold", 0, 14));                               // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbPessoasMouseEntered

    private void lbPessoasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPessoasMouseExited
        lbPessoas.setFont(new java.awt.Font("Nexa Light", 0, 14));                               // EVENTO RESPONSIVO DO ITEM DO MENU
    }//GEN-LAST:event_lbPessoasMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgMenuSup;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbCategorias;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbLancamentos;
    private javax.swing.JLabel lbPessoas;
    private javax.swing.JLabel lbQuem;
    private javax.swing.JPanel pnlInferior;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
