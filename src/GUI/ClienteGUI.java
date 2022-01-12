package GUI;

import Beans.ClienteBeans;
import Controller.ClienteController;
import Utilitarios.VerificadoresECorretores;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class ClienteGUI extends javax.swing.JInternalFrame {

    MaskFormatter FormatoTelefone;
    ClienteBeans ClienteB;
    ClienteController ClienteC;
    DefaultTableModel Modelo;
    
    
    
    
    
    public ClienteGUI() {
        initComponents();
        TF_Codigo.setEditable(false);
        TF_Data.setEditable(false);
        habilitaCampos(false);
        
        ClienteB = new ClienteBeans();
        ClienteC = new ClienteController();
        Modelo = (DefaultTableModel)Tabela.getModel();
        
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Codigo = new javax.swing.JLabel();
        TF_Codigo = new javax.swing.JTextField();
        LB_Nome = new javax.swing.JLabel();
        TF_Nome = new javax.swing.JTextField();
        SEP_Codigo = new javax.swing.JSeparator();
        LB_Rua = new javax.swing.JLabel();
        TF_Rua = new javax.swing.JTextField();
        LB_Bairro = new javax.swing.JLabel();
        TF_Bairro = new javax.swing.JTextField();
        LB_Telefone = new javax.swing.JLabel();
        try{
            FormatoTelefone = new MaskFormatter("(##)####-####");
        }
        catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Impossivel Formatar esse Campo", "ERRO DE FORMATAÇÃO", 0);

        }
        FTF_Telefone = new JFormattedTextField(FormatoTelefone);
        ;
        LB_Data = new javax.swing.JLabel();
        TF_Data = new javax.swing.JTextField();
        SEP_Formulario = new javax.swing.JSeparator();
        LB_Pesquisar = new javax.swing.JLabel();
        TF_Pesquisar = new javax.swing.JTextField();
        SEP_Pesquisa = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        SEP_Tabela = new javax.swing.JSeparator();
        B_Novo = new javax.swing.JButton();
        B_Cadastrar = new javax.swing.JButton();
        B_Editar = new javax.swing.JButton();
        B_Liberar = new javax.swing.JButton();
        B_Fechar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("MANUTENÇÃO DE CLIENTES");

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

        LB_Nome.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Nome.setText("Nome:");

        TF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeActionPerformed(evt);
            }
        });

        LB_Rua.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Rua.setText("Rua:");

        LB_Bairro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Bairro.setText("Bairro:");

        LB_Telefone.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Telefone.setText("Telefone:");

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
                "Código", "Nome", "Rua", "Bairro", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        B_Editar.setText("Editar");
        B_Editar.setToolTipText("Edita uma informação de um Cliente");
        B_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EditarActionPerformed(evt);
            }
        });

        B_Liberar.setText("Liberar");
        B_Liberar.setToolTipText("Libera os campos para edição");
        B_Liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LiberarActionPerformed(evt);
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
            .addComponent(SEP_Codigo)
            .addComponent(TF_Codigo)
            .addComponent(SEP_Formulario)
            .addComponent(SEP_Pesquisa)
            .addComponent(SEP_Tabela)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LB_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_Bairro)
                            .addComponent(LB_Rua)
                            .addComponent(LB_Telefone)
                            .addComponent(LB_Nome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_Rua)
                            .addComponent(TF_Nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_Bairro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LB_Data)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Data)))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LB_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_Liberar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_Fechar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SEP_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Nome)
                    .addComponent(TF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Rua)
                    .addComponent(TF_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Bairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Telefone)
                    .addComponent(FTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Data)
                    .addComponent(TF_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SEP_Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Pesquisar)
                    .addComponent(TF_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SEP_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SEP_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Novo)
                    .addComponent(B_Cadastrar)
                    .addComponent(B_Editar)
                    .addComponent(B_Liberar)
                    .addComponent(B_Fechar))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void TF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeActionPerformed

    private void B_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_NovoActionPerformed
        TF_Data.setText(VerificadoresECorretores.retornoDeDataAtual());
        habilitaCampos(true);
        TF_Nome.requestFocus();
        TF_Codigo.setText(ClienteC.controleDeCodigo());
        limpaNovo();
    }//GEN-LAST:event_B_NovoActionPerformed

    private void B_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CadastrarActionPerformed
        populaClienteBeans();
        if(ClienteC.verificarDados(ClienteB)){
         limpaTudo();
         habilitaCampos(false);
         
        }
        
    }//GEN-LAST:event_B_CadastrarActionPerformed

    private void TF_PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PesquisarKeyReleased
        Modelo.setNumRows(0);
        ClienteC.controlePesquisa(TF_Pesquisar.getText(), Modelo);
    }//GEN-LAST:event_TF_PesquisarKeyReleased

    private void TabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMousePressed
       ClienteB = ClienteC.controlePreenchimento(Integer.parseInt(Modelo.getValueAt(Tabela.getSelectedRow(), 0).toString()));
       TF_Codigo.setText(ClienteB.getCodigo() + "");
       TF_Nome.setText(ClienteB.getNome());
       TF_Rua.setText(ClienteB.getRua());
       TF_Bairro.setText(ClienteB.getBairro());
       FTF_Telefone.setText(ClienteB.getTelefone());
       TF_Data.setText(ClienteB.getDataCad()); 
    }//GEN-LAST:event_TabelaMousePressed

    private void B_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EditarActionPerformed
        populaClienteBeans();
         if(ClienteC.verificarDadosParaEditar(ClienteB)){
         limpaTudo();
         habilitaCampos(false); 
         }
    }//GEN-LAST:event_B_EditarActionPerformed

    private void B_LiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LiberarActionPerformed
        habilitaCampos(true);
    }//GEN-LAST:event_B_LiberarActionPerformed

    private void B_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_B_FecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastrar;
    private javax.swing.JButton B_Editar;
    private javax.swing.JButton B_Fechar;
    private javax.swing.JButton B_Liberar;
    private javax.swing.JButton B_Novo;
    private javax.swing.JFormattedTextField FTF_Telefone;
    private javax.swing.JLabel LB_Bairro;
    private javax.swing.JLabel LB_Codigo;
    private javax.swing.JLabel LB_Data;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_Pesquisar;
    private javax.swing.JLabel LB_Rua;
    private javax.swing.JLabel LB_Telefone;
    private javax.swing.JSeparator SEP_Codigo;
    private javax.swing.JSeparator SEP_Formulario;
    private javax.swing.JSeparator SEP_Pesquisa;
    private javax.swing.JSeparator SEP_Tabela;
    private javax.swing.JTextField TF_Bairro;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField TF_Data;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Pesquisar;
    private javax.swing.JTextField TF_Rua;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    final void habilitaCampos(boolean Valor){
        TF_Bairro.setEditable(Valor);
        TF_Nome.setEditable(Valor);
        TF_Rua.setEditable(Valor);
        FTF_Telefone.setEditable(Valor);
        
    }
    
    final void populaClienteBeans(){
        
        ClienteB.setNome(TF_Nome.getText());
        ClienteB.setRua(TF_Rua.getText());
        ClienteB.setBairro(TF_Bairro.getText());
        ClienteB.setTelefone(FTF_Telefone.getText());
        ClienteB.setDataCad(TF_Data.getText());
    }
    
    final void limpaTudo(){
        TF_Bairro.setText("");
        TF_Nome.setText("");
        TF_Rua.setText("");
        FTF_Telefone.setText("");
        TF_Codigo.setText("");
        TF_Data.setText("");
        
    }
    
    final void limpaNovo(){
        TF_Bairro.setText("");
        TF_Nome.setText("");
        TF_Rua.setText("");
        FTF_Telefone.setText("");
        
        
    }
   
}
