/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.view;

import javax.swing.JOptionPane;

/**
 *
 * @author steph
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public TelaPrincipal() {
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

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        JLTitulo = new javax.swing.JLabel();
        JBLocacao = new javax.swing.JButton();
        JBLocacoes = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        JMClientes = new javax.swing.JMenu();
        JMICadastroCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMFilmes = new javax.swing.JMenu();
        JMICadastrar = new javax.swing.JMenuItem();
        JMiCadastrados = new javax.swing.JMenuItem();
        JMiAddValores = new javax.swing.JMenu();
        JMiCadastrar = new javax.swing.JMenuItem();
        JMiValores = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLTitulo.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        JLTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadora/view/icons/locadora.png"))); // NOI18N
        JLTitulo.setText("Locadora Castellano");

        JBLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JBLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadora/view/icons/novalocacao.png"))); // NOI18N
        JBLocacao.setText("Nova Locação");
        JBLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLocacaoActionPerformed(evt);
            }
        });

        JBLocacoes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JBLocacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadora/view/icons/locacoes.png"))); // NOI18N
        JBLocacoes.setText("Locações");
        JBLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLocacoesActionPerformed(evt);
            }
        });

        JBSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadora/view/icons/voltar.png"))); // NOI18N
        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        jMenuBar2.setBorder(null);

        JMClientes.setText("Clientes");

        JMICadastroCliente.setText("Cadastrar");
        JMICadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastroClienteActionPerformed(evt);
            }
        });
        JMClientes.add(JMICadastroCliente);

        jMenuItem1.setText("Cadastrados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMClientes.add(jMenuItem1);

        jMenuBar2.add(JMClientes);

        JMFilmes.setText("Filmes");

        JMICadastrar.setText("Cadastrar");
        JMICadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastrarActionPerformed(evt);
            }
        });
        JMFilmes.add(JMICadastrar);

        JMiCadastrados.setText("Cadastrados");
        JMiCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMiCadastradosActionPerformed(evt);
            }
        });
        JMFilmes.add(JMiCadastrados);

        jMenuBar2.add(JMFilmes);

        JMiAddValores.setText("Valores");

        JMiCadastrar.setText("Cadastrar");
        JMiCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMiCadastrarActionPerformed(evt);
            }
        });
        JMiAddValores.add(JMiCadastrar);

        JMiValores.setText("Cadastrados");
        JMiValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMiValoresActionPerformed(evt);
            }
        });
        JMiAddValores.add(JMiValores);

        jMenuBar2.add(JMiAddValores);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBLocacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addGap(33, 33, 33)
                .addComponent(JBLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JBLocacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastroClienteActionPerformed
        CadastrarCliente tela = new CadastrarCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_JMICadastroClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ListCliente tela = new ListCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JMICadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastrarActionPerformed
        CadastrarFilme tela = new CadastrarFilme();
        tela.setVisible(true);
    }//GEN-LAST:event_JMICadastrarActionPerformed

    private void JMiCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMiCadastradosActionPerformed
        ListFilme tela = new ListFilme();
        tela.setVisible(true);
    }//GEN-LAST:event_JMiCadastradosActionPerformed

    private void JMiValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMiValoresActionPerformed
        ListValores tela = new ListValores();
        tela.setVisible(true);
    }//GEN-LAST:event_JMiValoresActionPerformed

    private void JMiCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMiCadastrarActionPerformed
        CadastrarValores tela = new CadastrarValores();
        tela.setVisible(true);
    }//GEN-LAST:event_JMiCadastrarActionPerformed

    private void JBLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLocacaoActionPerformed
        CadastrarLocacao tela = new CadastrarLocacao();
        tela.setVisible(true);
    }//GEN-LAST:event_JBLocacaoActionPerformed

    private void JBLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLocacoesActionPerformed
        ListLocacao tela = new ListLocacao();
        tela.setVisible(true);
    }//GEN-LAST:event_JBLocacoesActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLocacao;
    private javax.swing.JButton JBLocacoes;
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JMenu JMClientes;
    private javax.swing.JMenu JMFilmes;
    private javax.swing.JMenuItem JMICadastrar;
    private javax.swing.JMenuItem JMICadastroCliente;
    private javax.swing.JMenu JMiAddValores;
    private javax.swing.JMenuItem JMiCadastrados;
    private javax.swing.JMenuItem JMiCadastrar;
    private javax.swing.JMenuItem JMiValores;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
