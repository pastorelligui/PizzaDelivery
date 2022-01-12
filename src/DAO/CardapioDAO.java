package DAO;

import Beans.CardapioBeans;
import Beans.FuncionarioBeans;
import Utilitarios.Conexao;
import Utilitarios.VerificadoresECorretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardapioDAO {
    
    public CardapioDAO(){
        
    }
     public String proximoCardapio(){
        try {
            String SQLSelection = "select * from cardapio order by car_cod desc limit 1;";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                return (Integer.parseInt(RS.getString("car_cod")) + 1) + "";
            }
            else{
                String SQLResetIncrement = "alter table cardapio auto_increment = 1;";
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
      public void cadastrarCardapio(CardapioBeans Cardapio){
        
        try {
            String SQLInsertion = "insert into cardapio(car_descricao, car_tipo, car_valor) values "
                    + "(?, ?, ?); ";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLInsertion);
            STM.setString(1, Cardapio.getDescricao());
            STM.setString(2, Cardapio.getTipo());
            STM.setDouble(3, Cardapio.getValor());
            
           
          
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void procurarCardapio(String Pesquisa, DefaultTableModel Modelo){
        try {
            String SQLSelection = "select * from cardapio where car_descricao like '%"+Pesquisa+"%';";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            while(RS.next()){
                Modelo.addRow(new Object[] {RS.getString("car_cod"), RS.getString("car_descricao"), RS.getString("car_tipo"), RS.getString("car_valor")});
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Pesquisar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        
    }
      
       public CardapioBeans preencherCampos(int Codigo){
         
         CardapioBeans Cardapio = new CardapioBeans();
                  
        try {
            String SQLSelection = "select * from cardapio where car_cod = ?;";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            STM.setInt(1, Codigo);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                Cardapio.setCodigo(RS.getInt("car_cod"));
                Cardapio.setDescricao(RS.getString("car_descricao"));
                Cardapio.setTipo(RS.getString("car_tipo"));
                Cardapio.setValor(RS.getDouble("car_valor"));
               
                
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Preencher os Campos", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        return Cardapio;
    }
       
       public void editarCardapio(CardapioBeans Cardapio){
          try {
            String SQLEdition = "update cardapio set "
                    + "car_descricao = ?, "
                    + "car_tipo = ?, "
                    + "car_valor = ? "
                    + "where car_cod = ?;";
               
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLEdition);
            STM.setString(1, Cardapio.getDescricao());
            STM.setString(2, Cardapio.getTipo());
            STM.setDouble(3, Cardapio.getValor());
            STM.setInt(4, Cardapio.getCodigo());
            
            
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Editar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
                        
        }
          
     
          
    }
       
}
