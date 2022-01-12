package DAO;

import Beans.ClienteBeans;
import Utilitarios.Conexao;
import Utilitarios.VerificadoresECorretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {
     
    public ClienteDAO(){
               
    }
    public void cadastrarCliente(ClienteBeans Cliente){
        try {
            String SQLInsertion = "insert into cliente(cli_nome, cli_rua, cli_bairro, cli_telefone, cli_datacad) values "
                    + "(?, ?, ?, ?, ?);";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLInsertion);
            STM.setString(1, Cliente.getNome());
            STM.setString(2, Cliente.getRua());
            STM.setString(3, Cliente.getBairro());
            STM.setString(4, Cliente.getTelefone());
            STM.setString(5, VerificadoresECorretores.converteParaSQL(Cliente.getDataCad()));
            
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Cadastrar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
                        
        }
    }
    
    public String proximoCliente(){
        try {
            String SQLSelection = "select * from cliente order by cli_cod desc limit 1;";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                return (Integer.parseInt(RS.getString("cli_cod")) + 1) + "";
            }
            else{
                String SQLResetIncrement = "alter table cliente auto_increment = 1;";
                PreparedStatement STMIncrement = Conexao.getConnection().prepareStatement(SQLResetIncrement);
                STMIncrement.execute();
                Conexao.getConnection().commit();
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Cadastrar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
            return "0";
        }
    }
    public void procurarCliente(String Pesquisa, DefaultTableModel Modelo){
        try {
            String SQLSelection = "select * from cliente where cli_nome like '%"+Pesquisa+"%';";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            while(RS.next()){
                Modelo.addRow(new Object[] {RS.getString("cli_cod"), RS.getString("cli_nome"), RS.getString("cli_rua"), RS.getString("cli_bairro"), RS.getString("cli_telefone")});
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Pesquisar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        
    }
    
     public void procurarCliente(String Pesquisa, List<String> Lista){
        try {
            String SQLSelection = "select * from cliente where cli_nome like '%"+Pesquisa+"%';";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            while(RS.next()){
                Lista.add(RS.getString("cli_cod") + " - " + RS.getString("cli_nome"));
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Pesquisar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        
    }
    
    public ClienteBeans preencherCampos(int Codigo){
         ClienteBeans Cliente = new ClienteBeans();
         
         
        try {
            String SQLSelection = "select * from cliente where cli_cod = ?;";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            STM.setInt(1, Codigo);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                Cliente.setCodigo(RS.getInt("cli_cod"));
                Cliente.setNome(RS.getString("cli_nome"));
                Cliente.setRua(RS.getString("cli_rua"));
                Cliente.setBairro(RS.getString("cli_bairro"));
                Cliente.setTelefone(RS.getString("cli_telefone"));
                Cliente.setDataCad(VerificadoresECorretores.converteParaJAVA(RS.getString("cli_datacad")));
                
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Preencher os Campos", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        return Cliente;
    }
    public void editarCliente(ClienteBeans Cliente){
          try {
            String SQLEdition = "update cliente set "
                    + "cli_nome = ?, "
                    + "cli_rua = ?, "
                    + "cli_bairro = ?, "
                    + "cli_telefone = ? "
                    + "where cli_cod = ?;";
               
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLEdition);
            STM.setString(1, Cliente.getNome());
            STM.setString(2, Cliente.getRua());
            STM.setString(3, Cliente.getBairro());
            STM.setString(4, Cliente.getTelefone());
            STM.setInt(5, Cliente.getCodigo());
            
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Editar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
                        
        }
          
     
          
    }
    
    
}
