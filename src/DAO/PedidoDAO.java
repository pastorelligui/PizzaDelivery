
package DAO;

import Beans.PedidoBeans;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PedidoDAO {
    
    public PedidoDAO(){
        
    }
    
    public void PesquisaItens(String Pesquisa, List<String> ListaDeItens){ try {
        //Itens que serão encontrados
        String SQLPesquisa = "select * from cardapio where car_descricao like '%" + Pesquisa + "%';"; //irá pesquisar por descrição
        
        PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLPesquisa);
        ResultSet RS = STM.executeQuery();
        while(RS.next()){ //enquanto next for verdadeiro
            ListaDeItens.add(RS.getString("car_descricao"));
                    
        }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double ValorDoItem(String Pesquisa ){
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao = ?;";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLPesquisa);
            STM.setString(1, Pesquisa);
            
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                return RS.getDouble("car_valor");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int codigoDoItem(String Pesquisa ){ //retorna o código do item
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao = ?;";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLPesquisa);
            STM.setString(1, Pesquisa);
            
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                return RS.getInt("car_cod");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public void cadastrarPedido(String CodigoCliente, String CodigoFuncionario, String Total, int TamanhoTabela, PedidoBeans PedidoB){
        Date Data = new Date();
        SimpleDateFormat FormatoData = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm:ss");
        try {
            String SQLInsertPedido = "insert into pedido(ped_cli_cod, ped_fun_cod, ped_ent_cod, ped_data, ped_hora, ped_total, ped_status) "
                    + "values (?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLInsertPedido);
            STM.setString(1, CodigoCliente);
            STM.setString(2, CodigoFuncionario);
            STM.setString(3, "0");
            STM.setString(4, FormatoData.format(Data));
            STM.setString(5, FormatoHora.format(Data));
            STM.setString(6, Total);
            STM.setString(7, "Pedido Aberto");
            
            STM.execute();
            
            cadastrarItens(CodigoCliente, CodigoFuncionario, codigoDoPedido(), TamanhoTabela, PedidoB);
            
            //codigoDoPedido();//retorna o codigo(senha) do pedido;
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
            
        } catch (SQLException ex) {
            try {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                Conexao.getConnection().rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    public String codigoDoPedido(){
        String Cod = "0";
        try {
            
            String SQLSelection = "select ped_cod from pedido order by ped_cod desc limit 1";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                Cod = RS.getString("ped_cod");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //JOptionPane.showMessageDialog(null, Cod);
        return Cod;
        
    }
    
    public void cadastrarItens(String CodigoCliente, String CodigoFuncionario, String CodigoPedido, int TamanhoTabela, PedidoBeans PedidoB){
        for(int i = 0; i < TamanhoTabela; i++){
            try {
                String SQLInsertItens = "insert into item(item_ent_cod, item_fun_cod, item_cli_cod, item_ped_cod, item_car_cod, item_quantidade) "
                        + "values(?, ?, ?, ?, ?, ?);";
                
                PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLInsertItens);
                STM.setString(1, "0"); //codigo do entregador é estatico
                STM.setString(2, CodigoFuncionario);
                STM.setString(3, CodigoCliente);
                STM.setString(4, CodigoPedido);
                STM.setInt(5, PedidoB.getCodCardapio(i));
                STM.setInt(6, PedidoB.getQuantidade(i));
                
                
                STM.execute();
            } catch (SQLException ex) {
                 try {
                 Conexao.getConnection().rollback();
                 Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            }
        }
        
    
    }
    
}
