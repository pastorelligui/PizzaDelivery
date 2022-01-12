package GUI;

import Beans.CardapioBeans;
import Beans.EntregadorBeans;
import Beans.FuncionarioBeans;
import Controller.CardapioController;
import Controller.FuncionarioController;
import Utilitarios.VerificadoresECorretores;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardapioGUI extends javax.swing.JInternalFrame {
    
    DefaultTableModel Modelo;
    CardapioBeans CardapioB;
    CardapioController CardapioC;
    DecimalFormat FormatoDecimal;
    

    public CardapioGUI() {
        initComponents();
        Modelo = (DefaultTableModel)Tabela.getModel();
        TF_Codigo.setEditable(false);
        habilitaTudo(false);
        CardapioB = new CardapioBeans();
        CardapioC = new CardapioController();
        FormatoDecimal = new DecimalFormat("0.00");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Codigo = new javax.swing.JLabel();
        TF_Codigo = new javax.swing.JTextField();
        LB_Descricao = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_Descricao = new javax.swing.JTextArea();
        LB_Tipo = new javax.swing.JLabel();
        CB_Tipo = new javax.swing.JComboBox();
        LB_Valor = new javax.swing.JLabel();
        TF_Valor = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("MANUTENÇÃO DE CARDÁPIO");

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

        LB_Descricao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Descricao.setText("Descrição:");

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
                "Código", "Descrição", "Tipo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        TA_Descricao.setColumns(20);
        TA_Descricao.setRows(5);
        jScrollPane2.setViewportView(TA_Descricao);

        LB_Tipo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Tipo.setText("Tipo:");

        CB_Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Refrigerante", "Pizza" }));

        LB_Valor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Valor.setText("Valor:");

        TF_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ValorActionPerformed(evt);
            }
        });
        TF_Valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_ValorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TF_Codigo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(SEP_Formulario, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(SEP_Formulario1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LB_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LB_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Pesquisar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(LB_Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LB_Valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(LB_Descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Codigo)
                .addGap(7, 7, 7)
                .addComponent(TF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Descricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Valor)
                    .addComponent(TF_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Tipo))
                .addGap(18, 18, 18)
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
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void TF_PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PesquisarKeyReleased
        Modelo.setNumRows(0);
        CardapioC.controlePesquisa(TF_Pesquisar.getText(), Modelo);
    }//GEN-LAST:event_TF_PesquisarKeyReleased

    private void TabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMousePressed
       CardapioB = CardapioC.controlePreenchimento(Integer.parseInt(Modelo.getValueAt(Tabela.getSelectedRow(), 0).toString()));
       TF_Codigo.setText(CardapioB.getCodigo() + "");
       TA_Descricao.setText(CardapioB.getDescricao());
       TF_Valor.setText(CardapioB.getValor() + "");
       CB_Tipo.setSelectedItem(CardapioB.getTipo());
        
    }//GEN-LAST:event_TabelaMousePressed

    private void B_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_NovoActionPerformed
    habilitaTudo(true);
        
        TF_Codigo.setText(CardapioC.controleDeCodigo());
 //      limparNovo();
    }//GEN-LAST:event_B_NovoActionPerformed

    private void B_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CadastrarActionPerformed
        capturaBeans();
        if(CardapioC.verificaDados(CardapioB, TF_Valor.getText())){
         limparTudo();
         habilitaTudo(false);
         
        }

    }//GEN-LAST:event_B_CadastrarActionPerformed

    private void B_LiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LiberarActionPerformed
        habilitaTudo(true);
    }//GEN-LAST:event_B_LiberarActionPerformed

    private void B_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EditarActionPerformed
        capturaBeans();
         if(CardapioC.verificaDadosParaEditar(CardapioB, TF_Valor.getText())){
         limparTudo();
         habilitaTudo(false); 
         }
    
    }//GEN-LAST:event_B_EditarActionPerformed

    private void B_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_B_FecharActionPerformed

    private void TF_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_ValorActionPerformed

    private void TF_ValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_ValorFocusLost
        try{
            double Verifica = Double.parseDouble(TF_Valor.getText().replace(',', '.'));//troca o que for virgula ponto
            TF_Valor.setText(FormatoDecimal.format(Verifica).replace(',', '.')); // Formata a string em decimal
        }
        catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null, "Campo Valor deve ter apenas números!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            TF_Valor.setText("");
            TF_Valor.requestFocus();
        }
    }//GEN-LAST:event_TF_ValorFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastrar;
    private javax.swing.JButton B_Editar;
    private javax.swing.JButton B_Fechar;
    private javax.swing.JButton B_Liberar;
    private javax.swing.JButton B_Novo;
    private javax.swing.JComboBox CB_Tipo;
    private javax.swing.JLabel LB_Codigo;
    private javax.swing.JLabel LB_Descricao;
    private javax.swing.JLabel LB_Pesquisar;
    private javax.swing.JLabel LB_Tipo;
    private javax.swing.JLabel LB_Valor;
    private javax.swing.JSeparator SEP_Formulario;
    private javax.swing.JSeparator SEP_Formulario1;
    private javax.swing.JTextArea TA_Descricao;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField TF_Pesquisar;
    private javax.swing.JTextField TF_Valor;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    
    final void habilitaTudo(boolean Valor){ //Habilita todos os campos
        TA_Descricao.setEditable(Valor);
        CB_Tipo.setEnabled(Valor);
        TF_Valor.setEnabled(Valor);
    }
//    
    final void limparNovo(){ // limpa após clicar em NOvo
        
        TA_Descricao.setText("");
        CB_Tipo.setSelectedIndex(0);
        TF_Valor.setText("");
    }
    
    final void limparTudo(){
        TF_Codigo.setText("");
        TA_Descricao.setText("");
        TF_Valor.setText("");
        CB_Tipo.setSelectedIndex(0);
    }
    
    final CardapioBeans capturaBeans(){  //obtem o FuncionarioBeans
        CardapioB.setCodigo(Integer.parseInt(TF_Codigo.getText()));
        CardapioB.setDescricao(TA_Descricao.getText());
        CardapioB.setTipo(CB_Tipo.getSelectedItem().toString());
        CardapioB.setValor(Double.parseDouble(TF_Valor.getText()));
        
        
        return CardapioB;
        
    }
}



