package view;

/**
 *
 * @author INFOLUCK
 */
public class menuPrincipal extends javax.swing.JFrame {

    controller.Util util = new controller.Util();

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenuPrincipal = new javax.swing.JPanel();
        txtMenuPrincipal = new javax.swing.JLabel();
        btnEspecialidade = new javax.swing.JButton();
        btnMedico = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnAtestado = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        itemDrop = new javax.swing.JMenuItem();
        itemSobre = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        painelMenuPrincipal.setPreferredSize(new java.awt.Dimension(700, 400));

        txtMenuPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenuPrincipal.setText("Menu Principal");

        btnEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/especialidade.png"))); // NOI18N
        btnEspecialidade.setText("Especialidades");
        btnEspecialidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialidadeActionPerformed(evt);
            }
        });

        btnMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medico.png"))); // NOI18N
        btnMedico.setText("Médicos");
        btnMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });

        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        btnPaciente.setText("Pacientes");
        btnPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        btnConsulta.setText("Consultas");
        btnConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnAtestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atestado.png"))); // NOI18N
        btnAtestado.setText("Atestados");
        btnAtestado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtestado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconexit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHideActionText(true);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgOptions.png"))); // NOI18N
        btnSair1.setText("Opções");
        btnSair1.setHideActionText(true);
        btnSair1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSair1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatorio.png"))); // NOI18N
        btnRelatorio.setText("Relatórios");
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout painelMenuPrincipalLayout = new javax.swing.GroupLayout(painelMenuPrincipal);
        painelMenuPrincipal.setLayout(painelMenuPrincipalLayout);
        painelMenuPrincipalLayout.setHorizontalGroup(
            painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuPrincipalLayout.createSequentialGroup()
                        .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                        .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMenuPrincipalLayout.setVerticalGroup(
            painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMenuPrincipal)
                .addGap(18, 18, 18)
                .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        menu1.setText("Arquivo");

        itemDrop.setText("Limpar Dados");
        itemDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDropActionPerformed(evt);
            }
        });
        menu1.add(itemDrop);

        itemSobre.setText("Sobre o aplicativo");
        menu1.add(itemSobre);

        itemSair.setText("Sair");
        menu1.add(itemSair);

        menu.add(menu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialidadeActionPerformed
        util.frame(this, new view.Especialidade());
    }//GEN-LAST:event_btnEspecialidadeActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        util.frame(this, new view.Medico());
    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        util.frame(this, new view.Paciente());
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        util.frame(this, new view.Consulta());
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void itemDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDropActionPerformed
        new controller.ConnectionFactory().reset();
    }//GEN-LAST:event_itemDropActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            menuPrincipal menuPrincipal = new menuPrincipal();
            menuPrincipal.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtestado;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEspecialidade;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JMenuItem itemDrop;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu1;
    private javax.swing.JPanel painelMenuPrincipal;
    private javax.swing.JLabel txtMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
