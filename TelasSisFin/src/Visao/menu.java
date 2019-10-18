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
        pnlMenuLateral = new javax.swing.JPanel();
        pnlAreaUtilBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlFundo.setPreferredSize(new java.awt.Dimension(1150, 700));
        pnlFundo.setLayout(new java.awt.CardLayout());

        pnlInicio.setPreferredSize(new java.awt.Dimension(900, 700));

        lbIcon1Select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIcon1Select.setPreferredSize(new java.awt.Dimension(211, 243));
        lbIcon1Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIcon1SelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIcon1SelectMouseExited(evt);
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
                .addContainerGap(112, Short.MAX_VALUE)
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
                .addGap(0, 893, Short.MAX_VALUE))
            .addGroup(pnlMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLateralLayout.createSequentialGroup()
                    .addGap(0, 256, Short.MAX_VALUE)
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
                .addComponent(lbIcon1Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(561, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbIcon1Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFundo.add(pnlInicio, "card3");

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
        lbIcon1Select.setPreferredSize(new java.awt.Dimension(211, 243));     // TODO add your handling code here:
    }//GEN-LAST:event_lbIcon1SelectMouseExited

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbIcon1Select;
    private javax.swing.JPanel pnlAreaUtilBG;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlMenuLateral;
    // End of variables declaration//GEN-END:variables
}
