package GUI;

import Beans.EntregadorBeans;
import Beans.FuncionarioBeans;
import Controller.EntregadorController;
import Controller.FuncionarioController;
import Utilitarios.VerificadoresECorretores;
import javax.swing.table.DefaultTableModel;

public class EntregadorGUI extends javax.swing.JInternalFrame {
    
    DefaultTableModel Modelo;
    EntregadorController EntregadorC;
    EntregadorBeans EntregadorB;
    

    public EntregadorGUI() {
        initComponents();
        Modelo = (DefaultTableModel)Tabela.getModel();
        TF_Codigo.setEditable(false);
        TF_Data.setEditable(false);
        TF_Data.setText(VerificadoresECorretores.retornoDeDataAtual());
        habilitaTudo(false);
        EntregadorC = new EntregadorController();
        EntregadorB = new EntregadorBeans();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Codigo = new javax.swing.JLabel();
        TF_Codigo = new javax.swing.JTextField();
        TF_Nome = new javax.swing.JTextField();
        LB_Nome1 = new javax.swing.JLabel();
        TF_Data = new javax.swing.JTextField();
        LB_Data = new javax.swing.JLabel();
        SEP_Formulario = new javax.swing.JSeparator();
        LB_Pesquisar = new javax.swing.JLabel();
        TF_Pesquisar = new javax.swing.JTextField();
        SEP_Formulario1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        B_Novo = new javax.swing.JButton();
        B_Cadastrar = new javax.swing.JButton();
        B_Liberar = new javax.swing.JButton();
        B_Editar = new javax.swing.JButton();
        B_Fechar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("MANUTENÇÃO DE ENTREGADORES");

        LB_Codigo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Codigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Codigo.setText("Código");

        TF_Codigo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TF_Codigo.setForeground(new java.awt.Color(255, 0, 0));
        TF_Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_CodigoActionPerformed(evt);
            }
        });

        TF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeActionPerformed(evt);
            }
        });

        LB_Nome1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Nome1.setText("Nome:");

        LB_Data.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Data.setText("Data:");

        LB_Pesquisar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Pesquisar.setText("Pesquisar:");

        TF_Pesquisar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TF_Pesquisar.setForeground(new java.awt.Color(0, 0, 255));
        TF_Pesquisar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_PesquisarKeyReleased(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.getTableHeader().setReorderingAllowed(false);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        B_Novo.setText("Novo");
        B_Novo.setToolTipText("Habilita o Formulário para receber novos dados");
        B_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_NovoActionPerformed(evt);
            }
        });

        B_Cadastrar.setText("Cadastrar");
        B_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CadastrarActionPerformed(evt);
            }
        });

        B_Liberar.setText("Liberar");
        B_Liberar.setToolTipText("Libera os campos para edição");
        B_Liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LiberarActionPerformed(evt);
            }
        });

        B_Editar.setText("Editar");
        B_Editar.setToolTipText("Edita uma informação de um Cliente");
        B_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EditarActionPerformed(evt);
            }
        });

        B_Fechar.setText("Fechar");
        B_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEP_Formulario, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(SEP_Formulario1)
            .addComponent(TF_Codigo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LB_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Pesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LB_Nome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(LB_Data)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TF_Nome))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(B_Novo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Liberar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Fechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LB_Codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Nome1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Data)
                    .addComponent(TF_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(SEP_Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Pesquisar)
                    .addComponent(TF_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SEP_Formulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Novo)
                    .addComponent(B_Cadastrar)
                    .addComponent(B_Editar)
                    .addComponent(B_Liberar)
                    .addComponent(B_Fechar))
                .addGap(0, 105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void TF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeActionPerformed

    private void TF_PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PesquisarKeyReleased
        Modelo.setNumRows(0);
        EntregadorC.controlePesquisa(TF_Pesquisar.getText(), Modelo);
    }//GEN-LAST:event_TF_PesquisarKeyReleased

    private void TabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMousePressed
       EntregadorB = EntregadorC.controlePreenchimento(Integer.parseInt(Modelo.getValueAt(Tabela.getSelectedRow(), 0).toString()));
       TF_Codigo.setText(EntregadorB.getCodigo() + "");
       TF_Nome.setText(EntregadorB.getNome());
       
      TF_Data.setText(EntregadorB.getDataCad()); 
    }//GEN-LAST:event_TabelaMousePressed

    private void B_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_NovoActionPerformed
        habilitaTudo(true);
        TF_Data.setText(VerificadoresECorretores.retornoDeDataAtual());
        TF_Nome.requestFocus();
        TF_Codigo.setText(EntregadorC.controleDeCodigo());
        limparNovo();
    }//GEN-LAST:event_B_NovoActionPerformed

    private void B_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CadastrarActionPerformed
        capturaBeans();
        if(EntregadorC.verificaDados(EntregadorB)){
         limparTudo();
         habilitaTudo(false);
         
        }

    }//GEN-LAST:event_B_CadastrarActionPerformed

    private void B_LiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LiberarActionPerformed
        habilitaTudo(true);
    }//GEN-LAST:event_B_LiberarActionPerformed

    private void B_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EditarActionPerformed
        capturaBeans();
         if(EntregadorC.verificaDadosParaEditar(EntregadorB)){
         limparTudo();
         habilitaTudo(false); 
         }
    
    }//GEN-LAST:event_B_EditarActionPerformed

    private void B_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_B_FecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastrar;
    private javax.swing.JButton B_Editar;
    private javax.swing.JButton B_Fechar;
    private javax.swing.JButton B_Liberar;
    private javax.swing.JButton B_Novo;
    private javax.swing.JLabel LB_Codigo;
    private javax.swing.JLabel LB_Data;
    private javax.swing.JLabel LB_Nome1;
    private javax.swing.JLabel LB_Pesquisar;
    private javax.swing.JSeparator SEP_Formulario;
    private javax.swing.JSeparator SEP_Formulario1;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField TF_Data;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Pesquisar;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    
    final void habilitaTudo(boolean Valor){ //Habilita todos os campos
        TF_Nome.setEditable(Valor);
       
    }
    
    final void limparNovo(){ // limpa após clicar em NOvo
        
        TF_Nome.setText("");
        
    }
    
    final void limparTudo(){
        TF_Codigo.setText("");
        TF_Nome.setText("");
        TF_Data.setText("");
        
    }
    
    final EntregadorBeans capturaBeans(){  //obtem o FuncionarioBeans
        EntregadorB.setCodigo(Integer.parseInt(TF_Codigo.getText()));
        EntregadorB.setNome(TF_Nome.getText());
        
        EntregadorB.setDataCad(TF_Data.getText());
        
        return EntregadorB;
        
    }
}



