package GUI;

import Beans.ClienteBeans;
import Beans.PedidoBeans;
import Controller.ClienteController;
import Controller.PedidoController;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class PedidoGUI extends javax.swing.JInternalFrame {
    
    MaskFormatter FormatoTelefone;
    ClienteBeans ClienteB;
    ClienteController ClienteC;
    List<String> ListaDeCliente;
    List<String> ListaDeItens;
    
    PedidoBeans PedidoB;
    PedidoController PedidoC;
    DefaultTableModel Modelo;
    DecimalFormat FormatoDecimal; //para os preços não ficarem dizima periodica
    int CodigoFuncionario;
    Date DataAtual;
    SimpleDateFormat FormatoData, FormatoHora;
    
    public PedidoGUI(int CodigoFuncionario) {
        initComponents();//instanciando
        this.CodigoFuncionario = CodigoFuncionario;
        habilitaCampos(false);
        Modelo = (DefaultTableModel) Tabela.getModel();
        ClienteB = new ClienteBeans();
        ClienteC = new ClienteController();
        PedidoB = new PedidoBeans();
        PedidoC = new PedidoController();
        ListaDeCliente = new ArrayList<>();
        ListaDeItens = new ArrayList<>();
        
        
        PainelPai.setEnabledAt(1, false);//pedido inicia no valor 1, assim quando carregar a aba pedido fica desabilitada
        TF_Cliente.setEditable(false); //não há como editar
        TF_Valor.setEditable(false);
        TF_CodItem.setEditable(false);
        TF_Total.setEditable(false); //campo não pode ser editado
        B_Finalizar.setEnabled(false);
        FormatoDecimal = new DecimalFormat("0.00");//formata em decimal
        Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//evita que selecione duas ou mais linhas na tabela de pedido
        FormatoData = new SimpleDateFormat("yyyy-MM-dd");
        FormatoHora = new SimpleDateFormat("HH:mm:ss");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPai = new javax.swing.JTabbedPane();
        P_Cliente = new javax.swing.JPanel();
        B_Pesquisa = new javax.swing.JButton();
        CB_Pesquisa = new javax.swing.JComboBox();
        LB_Codigo = new javax.swing.JLabel();
        TF_Codigo = new javax.swing.JTextField();
        SEP_Codigo = new javax.swing.JSeparator();
        LB_Nome = new javax.swing.JLabel();
        TF_Nome = new javax.swing.JTextField();
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
        B_Fechar = new javax.swing.JButton();
        B_Continuar = new javax.swing.JButton();
        P_Pedido = new javax.swing.JPanel();
        TF_Cliente = new javax.swing.JTextField();
        LB_Item = new javax.swing.JLabel();
        TF_Item = new javax.swing.JTextField();
        LB_Selecionar = new javax.swing.JLabel();
        CB_Selecionar = new javax.swing.JComboBox();
        B_Valor = new javax.swing.JButton();
        LB_Valor = new javax.swing.JLabel();
        TF_Valor = new javax.swing.JTextField();
        LB_Quantidade = new javax.swing.JLabel();
        TF_Quantidade = new javax.swing.JTextField();
        SEP_Item = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        B_Add = new javax.swing.JButton();
        B_Remove = new javax.swing.JButton();
        LB_Total = new javax.swing.JLabel();
        TF_Total = new javax.swing.JTextField();
        B_FecharP = new javax.swing.JButton();
        B_Calcular = new javax.swing.JButton();
        B_Finalizar = new javax.swing.JButton();
        LB_CodItem = new javax.swing.JLabel();
        TF_CodItem = new javax.swing.JTextField();

        setClosable(true);
        setTitle("PEDIDO");

        B_Pesquisa.setText("Pesquisar");
        B_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PesquisaActionPerformed(evt);
            }
        });

        CB_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PesquisaActionPerformed(evt);
            }
        });

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

        FTF_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTF_TelefoneActionPerformed(evt);
            }
        });

        LB_Data.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Data.setText("Data:");

        B_Fechar.setText("Fechar");
        B_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FecharActionPerformed(evt);
            }
        });

        B_Continuar.setText("Continuar Pedido");
        B_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_ClienteLayout = new javax.swing.GroupLayout(P_Cliente);
        P_Cliente.setLayout(P_ClienteLayout);
        P_ClienteLayout.setHorizontalGroup(
            P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEP_Formulario)
            .addComponent(SEP_Codigo)
            .addGroup(P_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_ClienteLayout.createSequentialGroup()
                        .addComponent(B_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_Pesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_ClienteLayout.createSequentialGroup()
                        .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, P_ClienteLayout.createSequentialGroup()
                                .addComponent(LB_Telefone)
                                .addGap(18, 18, 18)
                                .addComponent(FTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(LB_Data)
                                .addGap(18, 18, 18)
                                .addComponent(TF_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TF_Codigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_Codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, P_ClienteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LB_Rua)
                                    .addComponent(LB_Bairro)
                                    .addComponent(LB_Nome))
                                .addGap(23, 23, 23)
                                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF_Rua, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TF_Bairro)
                                    .addComponent(TF_Nome))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_ClienteLayout.createSequentialGroup()
                        .addComponent(B_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        P_ClienteLayout.setVerticalGroup(
            P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Pesquisa)
                    .addComponent(CB_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(LB_Codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SEP_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Nome)
                    .addComponent(TF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Rua)
                    .addComponent(TF_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Bairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Telefone)
                    .addComponent(FTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Data)
                    .addComponent(TF_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SEP_Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Fechar)
                    .addComponent(B_Continuar))
                .addContainerGap())
        );

        PainelPai.addTab("Cliente", P_Cliente);

        TF_Cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LB_Item.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Item.setText("Item:");

        TF_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ItemActionPerformed(evt);
            }
        });

        LB_Selecionar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Selecionar.setText("Selecionar:");

        CB_Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_SelecionarActionPerformed(evt);
            }
        });

        B_Valor.setText("Valor");
        B_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ValorActionPerformed(evt);
            }
        });

        LB_Valor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Valor.setText("Valor:");

        LB_Quantidade.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Quantidade.setText("Quantidade:");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Item", "Descrição", "Valor Unitário", "Quantidade", "Total"
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
        jScrollPane1.setViewportView(Tabela);

        B_Add.setText("Adicionar");
        B_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AddActionPerformed(evt);
            }
        });

        B_Remove.setText("Remover");
        B_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RemoveActionPerformed(evt);
            }
        });

        LB_Total.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_Total.setText("Total:");

        B_FecharP.setText("Fechar");
        B_FecharP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FecharPActionPerformed(evt);
            }
        });

        B_Calcular.setText("Calcular");
        B_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CalcularActionPerformed(evt);
            }
        });

        B_Finalizar.setText("Finalizar");
        B_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FinalizarActionPerformed(evt);
            }
        });

        LB_CodItem.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LB_CodItem.setText("Código:");

        javax.swing.GroupLayout P_PedidoLayout = new javax.swing.GroupLayout(P_Pedido);
        P_Pedido.setLayout(P_PedidoLayout);
        P_PedidoLayout.setHorizontalGroup(
            P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TF_Cliente)
            .addComponent(SEP_Item)
            .addComponent(jScrollPane1)
            .addGroup(P_PedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_PedidoLayout.createSequentialGroup()
                        .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(P_PedidoLayout.createSequentialGroup()
                                .addComponent(B_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LB_Valor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Valor))
                            .addGroup(P_PedidoLayout.createSequentialGroup()
                                .addComponent(LB_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_Selecionar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_Quantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_PedidoLayout.createSequentialGroup()
                                .addComponent(TF_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LB_CodItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TF_CodItem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(P_PedidoLayout.createSequentialGroup()
                        .addComponent(B_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_Remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LB_Total)
                        .addGap(18, 18, 18)
                        .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PedidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(B_Finalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_FecharP)))
                .addContainerGap())
        );
        P_PedidoLayout.setVerticalGroup(
            P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Item)
                    .addComponent(TF_Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Selecionar)
                    .addComponent(CB_Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Valor)
                    .addComponent(LB_Valor)
                    .addComponent(TF_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Quantidade)
                    .addComponent(TF_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_CodItem)
                    .addComponent(TF_CodItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SEP_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Add)
                    .addComponent(B_Remove)
                    .addComponent(LB_Total)
                    .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(P_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_FecharP)
                    .addComponent(B_Finalizar))
                .addContainerGap())
        );

        PainelPai.addTab("Pedido", P_Pedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPai)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void TF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeActionPerformed

    private void FTF_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTF_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTF_TelefoneActionPerformed

    private void B_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FecharActionPerformed
     dispose();
    }//GEN-LAST:event_B_FecharActionPerformed

    private void B_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PesquisaActionPerformed
        CB_Pesquisa.removeAllItems();//O Combobox pesquisa vai remover todos os itens
        ListaDeCliente.clear();//Limpa a Lista
        String Pesquisa = JOptionPane.showInputDialog(null, "Entre com o Nome do Cliente:", "PESQUISA DE CLIENTE", 3);//Habilita Janela para pesquisa
        ClienteC.controlePesquisa(Pesquisa, ListaDeCliente);//Vai Criar a Lista
        for(String S: ListaDeCliente){
            CB_Pesquisa.addItem(S);
        }
    }//GEN-LAST:event_B_PesquisaActionPerformed

    private void CB_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PesquisaActionPerformed
        if(!(CB_Pesquisa.getSelectedItem() == null)){// se combobox pesquisa for nulo
            String Cod = CB_Pesquisa.getSelectedItem().toString();
            Cod = Cod.substring(0, Cod.indexOf(" "));// número que irá cair
            ClienteB = ClienteC.controlePreenchimento(Integer.parseInt(Cod));// retornando um beans
            TF_Codigo.setText(ClienteB.getCodigo() + "");
            TF_Nome.setText(ClienteB.getNome());
            TF_Rua.setText(ClienteB.getRua());
            TF_Bairro.setText(ClienteB.getBairro());
            FTF_Telefone.setText(ClienteB.getTelefone());
            TF_Data.setText(ClienteB.getDataCad()); 
        }
       
        
    }//GEN-LAST:event_CB_PesquisaActionPerformed

    private void B_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ContinuarActionPerformed
         PainelPai.setEnabledAt(1, true); //ao clicar em Continuar Pedido, a aba Pedido é habilitada
         PainelPai.setEnabledAt(0, false);
         PainelPai.setSelectedIndex(1);
    }//GEN-LAST:event_B_ContinuarActionPerformed

    private void B_FecharPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FecharPActionPerformed
        dispose();
    }//GEN-LAST:event_B_FecharPActionPerformed

    private void TF_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ItemActionPerformed
        TF_Quantidade.setText("");
        TF_Valor.setText("");//Quando eu clicar em outro item, o tf valor ficará vazio
        TF_CodItem.setText("");
        CB_Selecionar.removeAllItems();// para não se repetir
        ListaDeItens.clear();//sempre será removida
        PedidoC.controledeItens(TF_Item.getText(), ListaDeItens);
        
        for(String S: ListaDeItens){ // o que está no DAO, irá retornar uma lista com itens
            CB_Selecionar.addItem(S);
        }
    }//GEN-LAST:event_TF_ItemActionPerformed

    private void B_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ValorActionPerformed
        //Quando clico em valor, ele vai executar:
        TF_Valor.setText(PedidoC.controledeValor(CB_Selecionar.getSelectedItem().toString()) + "");
        TF_CodItem.setText(PedidoC.controledeCodigo(CB_Selecionar.getSelectedItem().toString()) + "");
    }//GEN-LAST:event_B_ValorActionPerformed

    private void CB_SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_SelecionarActionPerformed
        TF_Valor.setText("");//Quando eu clicar em outro item, o campo ficará vazio
        TF_Quantidade.setText("");
        TF_CodItem.setText("");
    }//GEN-LAST:event_CB_SelecionarActionPerformed

    private void B_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AddActionPerformed
         if(PedidoC.verificaItens(TF_Valor.getText(), TF_Quantidade.getText(), TF_CodItem.getText(), CB_Selecionar.getSelectedItem().toString())){
             double Total = Double.parseDouble(TF_Valor.getText()) * Integer.parseInt(TF_Quantidade.getText());//faz o calculo total pela a quantidade
             Modelo.addRow(new Object[]{TF_CodItem.getText(), CB_Selecionar.getSelectedItem(), TF_Valor.getText(), TF_Quantidade.getText(), FormatoDecimal.format(Total).replace(',','.')});
             //adiciona os itens selecionados na tabela
             limpaItens(); // limpa quando eu adiciono um item
                          
         }
    }//GEN-LAST:event_B_AddActionPerformed

    private void B_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RemoveActionPerformed
       Modelo.removeRow(Tabela.getSelectedRow());//remove os itens da tabela
    }//GEN-LAST:event_B_RemoveActionPerformed

    private void B_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CalcularActionPerformed
        double TotalDoPedido = 0;
        for(int i = 0; i < Tabela.getRowCount(); i++){
            TotalDoPedido += Double.parseDouble(Modelo.getValueAt(i, 4).toString());
        }
        TF_Total.setText(FormatoDecimal.format(TotalDoPedido).replace(',', '.'));
        populaBeans();
        if(TotalDoPedido > 0){
            B_Finalizar.setEnabled(true);
            B_Add.setEnabled(false);
            B_Remove.setEnabled(false);
            B_Calcular.setEnabled(false);
        }
    }//GEN-LAST:event_B_CalcularActionPerformed

    private void B_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FinalizarActionPerformed
        JOptionPane.showMessageDialog(null,"Aguardando Forma de Pagamento!\n Clique em OK, ao finalizar o pagamento!");
        PedidoC.controleDePedido(TF_Codigo.getText(), CodigoFuncionario + "", TF_Total.getText(), Tabela.getRowCount(), PedidoB);
        limpaEfinaliza();
    }//GEN-LAST:event_B_FinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Add;
    private javax.swing.JButton B_Calcular;
    private javax.swing.JButton B_Continuar;
    private javax.swing.JButton B_Fechar;
    private javax.swing.JButton B_FecharP;
    private javax.swing.JButton B_Finalizar;
    private javax.swing.JButton B_Pesquisa;
    private javax.swing.JButton B_Remove;
    private javax.swing.JButton B_Valor;
    private javax.swing.JComboBox CB_Pesquisa;
    private javax.swing.JComboBox CB_Selecionar;
    private javax.swing.JFormattedTextField FTF_Telefone;
    private javax.swing.JLabel LB_Bairro;
    private javax.swing.JLabel LB_CodItem;
    private javax.swing.JLabel LB_Codigo;
    private javax.swing.JLabel LB_Data;
    private javax.swing.JLabel LB_Item;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_Quantidade;
    private javax.swing.JLabel LB_Rua;
    private javax.swing.JLabel LB_Selecionar;
    private javax.swing.JLabel LB_Telefone;
    private javax.swing.JLabel LB_Total;
    private javax.swing.JLabel LB_Valor;
    private javax.swing.JPanel P_Cliente;
    private javax.swing.JPanel P_Pedido;
    private javax.swing.JTabbedPane PainelPai;
    private javax.swing.JSeparator SEP_Codigo;
    private javax.swing.JSeparator SEP_Formulario;
    private javax.swing.JSeparator SEP_Item;
    private javax.swing.JTextField TF_Bairro;
    private javax.swing.JTextField TF_Cliente;
    private javax.swing.JTextField TF_CodItem;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField TF_Data;
    private javax.swing.JTextField TF_Item;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Quantidade;
    private javax.swing.JTextField TF_Rua;
    private javax.swing.JTextField TF_Total;
    private javax.swing.JTextField TF_Valor;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    final void habilitaCampos(boolean Valor){
        TF_Codigo.setEditable(Valor);
        TF_Bairro.setEditable(Valor);
        TF_Nome.setEditable(Valor);
        TF_Rua.setEditable(Valor);
        FTF_Telefone.setEditable(Valor);
        TF_Data.setEditable(Valor);
        
    }
    
    final void limpaItens(){ //limpa quando eu adiciono um item na tabela
        TF_Item.setText("");
        TF_Quantidade.setText("");
        TF_Valor.setText("");
        TF_CodItem.setText("");
        CB_Selecionar.removeAllItems();
    }
    
    final void populaBeans(){ //armazena todos os itens abaixo
        DataAtual = new Date();
        PedidoB.setCodigoCliente(Integer.parseInt(TF_Codigo.getText()));
        PedidoB.setCodigoFuncionario(CodigoFuncionario);
        PedidoB.setCodigoEntregador(0);
        PedidoB.setData(FormatoData.format(DataAtual));
        PedidoB.setHora(FormatoHora.format(DataAtual));
        PedidoB.setStatus("Pedido Aberto");
        PedidoB.setValor(Double.parseDouble(TF_Total.getText()));
        for(int i = 0; i < Tabela.getRowCount(); i++){
            PedidoB.setCodCardapio(Integer.parseInt(Modelo.getValueAt(i, 0).toString()));
            PedidoB.setQuantidade(Integer.parseInt(Modelo.getValueAt(i, 3).toString()));
            
        }
        
    }
    
    final void limpaEfinaliza(){
        TF_Total.setText("");
        B_Finalizar.setEnabled(false);
        Modelo.setNumRows(0);
        TF_Cliente.setText("");
    }
    
    
}
