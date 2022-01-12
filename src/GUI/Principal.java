


package GUI;

import Utilitarios.FundoDeTela;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {
    //chama as telas
    FundoDeTela Desktop;
    ClienteGUI ClienteG;
    FuncionarioGUI FuncionarioG;
    EntregadorGUI EntregadorG;
    CardapioGUI CardapioG;
    PedidoGUI PedidoG;
    
    
    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Desktop = new FundoDeTela("Imagens/logo.jpg");
        getContentPane().add(Desktop);
        setLayout(new GridLayout());
        JM_Manutencao.setIcon(new ImageIcon("Imagens/novo.png"));
        JM_Movimentacao.setIcon(new ImageIcon("Imagens/fone.png"));
        JMI_Cliente.setIcon(new ImageIcon("Imagens/cliente.png"));
        JMI_Funcionario.setIcon(new ImageIcon("Imagens/funcionario.png"));
        JMI_Entregador.setIcon(new ImageIcon("Imagens/entregador.png"));
        JMI_Cardapio.setIcon(new ImageIcon("Imagens/cardapio.png"));
        JMI_Pedido.setIcon(new ImageIcon("Imagens/novo.png"));
        Desktop.setVisible(true);
          }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        JM_Manutencao = new javax.swing.JMenu();
        JMI_Cliente = new javax.swing.JMenuItem();
        JMI_Funcionario = new javax.swing.JMenuItem();
        JMI_Entregador = new javax.swing.JMenuItem();
        JMI_Cardapio = new javax.swing.JMenuItem();
        JM_Movimentacao = new javax.swing.JMenu();
        JMI_Pedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Delivery");

        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N

        JM_Manutencao.setForeground(new java.awt.Color(0, 153, 51));
        JM_Manutencao.setText("Cadastro");
        JM_Manutencao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        JMI_Cliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JMI_Cliente.setText("Cliente");
        JMI_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ClienteActionPerformed(evt);
            }
        });
        JM_Manutencao.add(JMI_Cliente);

        JMI_Funcionario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JMI_Funcionario.setText("Funcionário");
        JMI_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_FuncionarioActionPerformed(evt);
            }
        });
        JM_Manutencao.add(JMI_Funcionario);

        JMI_Entregador.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JMI_Entregador.setText("Entregador");
        JMI_Entregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_EntregadorActionPerformed(evt);
            }
        });
        JM_Manutencao.add(JMI_Entregador);

        JMI_Cardapio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JMI_Cardapio.setText("Cardápio");
        JMI_Cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CardapioActionPerformed(evt);
            }
        });
        JM_Manutencao.add(JMI_Cardapio);

        jMenuBar1.add(JM_Manutencao);

        JM_Movimentacao.setForeground(new java.awt.Color(255, 51, 0));
        JM_Movimentacao.setText("Atendimento");
        JM_Movimentacao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        JMI_Pedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JMI_Pedido.setText("Pedido");
        JMI_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_PedidoActionPerformed(evt);
            }
        });
        JM_Movimentacao.add(JMI_Pedido);

        jMenuBar1.add(JM_Movimentacao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ClienteActionPerformed
        ClienteG = new ClienteGUI();
        Desktop.add(ClienteG);
        ClienteG.setVisible(true);
    }//GEN-LAST:event_JMI_ClienteActionPerformed

    private void JMI_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_FuncionarioActionPerformed
      FuncionarioG = new FuncionarioGUI(); //abre a tela funcionário na tela principal
      Desktop.add(FuncionarioG);
      FuncionarioG.setVisible(true);
    }//GEN-LAST:event_JMI_FuncionarioActionPerformed

    private void JMI_EntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_EntregadorActionPerformed
      EntregadorG = new EntregadorGUI(); //abre a tela entregador na tela principal
      Desktop.add(EntregadorG);
      EntregadorG.setVisible(true);
    }//GEN-LAST:event_JMI_EntregadorActionPerformed

    private void JMI_CardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CardapioActionPerformed
        CardapioG = new CardapioGUI(); //abre a tela cardapio na tela principal
        Desktop.add(CardapioG);
        CardapioG.setVisible(true);
    }//GEN-LAST:event_JMI_CardapioActionPerformed

    private void JMI_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_PedidoActionPerformed
        PedidoG = new PedidoGUI(1); //abre a tela pedido na tela principal
        Desktop.add(PedidoG);
        PedidoG.setVisible(true);
    }//GEN-LAST:event_JMI_PedidoActionPerformed
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMI_Cardapio;
    private javax.swing.JMenuItem JMI_Cliente;
    private javax.swing.JMenuItem JMI_Entregador;
    private javax.swing.JMenuItem JMI_Funcionario;
    private javax.swing.JMenuItem JMI_Pedido;
    private javax.swing.JMenu JM_Manutencao;
    private javax.swing.JMenu JM_Movimentacao;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
