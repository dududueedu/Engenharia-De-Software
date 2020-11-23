package br.ufc.quixada.si.view;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Edu da Silva
 */
public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_Cliente = new javax.swing.JMenu();
        jM_CadastroProduto = new javax.swing.JMenuItem();
        jM_CadastroCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jM_produto = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jM_VENDAS = new javax.swing.JMenuItem();
        jM_realizarVenda = new javax.swing.JMenu();
        jMvendaP = new javax.swing.JMenuItem();
        jM_quantiaProdCli = new javax.swing.JMenu();
        jM_MostrarCP = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/P (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jM_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/book_add.png"))); // NOI18N
        jM_Cliente.setText("CADASTRAR");
        jM_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_ClienteActionPerformed(evt);
            }
        });

        jM_CadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/coins_add.png"))); // NOI18N
        jM_CadastroProduto.setText("Produto");
        jM_CadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CadastroProdutoActionPerformed(evt);
            }
        });
        jM_Cliente.add(jM_CadastroProduto);

        jM_CadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/group_add.png"))); // NOI18N
        jM_CadastroCliente.setText("Cliente");
        jM_CadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CadastroClienteActionPerformed(evt);
            }
        });
        jM_Cliente.add(jM_CadastroCliente);

        jMenuBar1.add(jM_Cliente);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/zoom.png"))); // NOI18N
        jMenu2.setText("VISUALIZAR CADASTROS");

        jM_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/coins.png"))); // NOI18N
        jM_produto.setText("Produtos");
        jM_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_produtoActionPerformed(evt);
            }
        });
        jMenu2.add(jM_produto);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/group.png"))); // NOI18N
        jMenuItem5.setText("Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jM_VENDAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/cart_put.png"))); // NOI18N
        jM_VENDAS.setText("Vendas");
        jM_VENDAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_VENDASActionPerformed(evt);
            }
        });
        jMenu2.add(jM_VENDAS);

        jMenuBar1.add(jMenu2);

        jM_realizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/cart_put.png"))); // NOI18N
        jM_realizarVenda.setText("REALIZAR VENDA");
        jM_realizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_realizarVendaActionPerformed(evt);
            }
        });

        jMvendaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/cart_edit.png"))); // NOI18N
        jMvendaP.setText("VENDA DE PRODUTOS");
        jMvendaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvendaPActionPerformed(evt);
            }
        });
        jM_realizarVenda.add(jMvendaP);

        jMenuBar1.add(jM_realizarVenda);

        jM_quantiaProdCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/calculator_edit.png"))); // NOI18N
        jM_quantiaProdCli.setText("GERAR RELATÓRIO");
        jM_quantiaProdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_quantiaProdCliActionPerformed(evt);
            }
        });

        jM_MostrarCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufc/quixada/si/icones/zoom.png"))); // NOI18N
        jM_MostrarCP.setText("Visualizar");
        jM_MostrarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_MostrarCPActionPerformed(evt);
            }
        });
        jM_quantiaProdCli.add(jM_MostrarCP);

        jMenuBar1.add(jM_quantiaProdCli);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_CadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CadastroProdutoActionPerformed
        CadastroProduto cp = new CadastroProduto();
        cp.setVisible(true);
    }//GEN-LAST:event_jM_CadastroProdutoActionPerformed

    private void jM_CadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CadastroClienteActionPerformed
        new CadastroCliente().setVisible(true);       
    }//GEN-LAST:event_jM_CadastroClienteActionPerformed

    private void jM_quantiaProdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_quantiaProdCliActionPerformed

    }//GEN-LAST:event_jM_quantiaProdCliActionPerformed

    private void jM_MostrarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_MostrarCPActionPerformed
        try {
            new View().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jM_MostrarCPActionPerformed

    private void jM_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_ClienteActionPerformed

    }//GEN-LAST:event_jM_ClienteActionPerformed

    private void jM_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_produtoActionPerformed
        try {
            new RUDProduto().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jM_produtoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            new RUDCliente().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jM_realizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_realizarVendaActionPerformed
        try {
            new CadastroVenda().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jM_realizarVendaActionPerformed

    private void jMvendaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvendaPActionPerformed
        try {
            new CadastroVenda().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jMvendaPActionPerformed

    private void jM_VENDASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_VENDASActionPerformed
        try {
            new RUDVenda().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jM_VENDASActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jM_CadastroCliente;
    private javax.swing.JMenuItem jM_CadastroProduto;
    private javax.swing.JMenu jM_Cliente;
    private javax.swing.JMenuItem jM_MostrarCP;
    private javax.swing.JMenuItem jM_VENDAS;
    private javax.swing.JMenuItem jM_produto;
    private javax.swing.JMenu jM_quantiaProdCli;
    private javax.swing.JMenu jM_realizarVenda;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMvendaP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
