package DAO;

import Beans.EntregadorBeans;
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

public class EntregadorDAO {
   
    public EntregadorDAO(){
        
    }
      public String proximoEntregador(){
        try {
            String SQLSelection = "select * from entregador order by ent_cod desc limit 1;";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                return (Integer.parseInt(RS.getString("ent_cod")) + 1) + "";
            }
            else{
                String SQLResetIncrement = "alter table entregador auto_increment = 1;";
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
       public void cadastrarEntregador(EntregadorBeans Entregador){
        
        try {
            String SQLInsertion = "insert into entregador(ent_nome, ent_permissao, ent_datacad, ent_status) values "
                    + "(?, ?, ?, ?); ";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLInsertion);
            STM.setString(1, Entregador.getNome());
            STM.setString(2, "ENT");
            STM.setString(3, VerificadoresECorretores.converteParaSQL(Entregador.getDataCad()));
            STM.setString(4, "Livre"); //Status padrão, de quando for cadastrado, esta na pizzaria e não está fazendo entrega
            
           
          
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void procurarEntregador(String Pesquisa, DefaultTableModel Modelo){
        try {
            String SQLSelection = "select * from entregador where ent_nome like '%"+Pesquisa+"%';";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            while(RS.next()){
                Modelo.addRow(new Object[] {RS.getString("ent_cod"), RS.getString("ent_nome")});
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Pesquisar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        
    }
         public EntregadorBeans preencherCampos(int Codigo){
         
         EntregadorBeans Entregador = new EntregadorBeans();
                  
        try {
            String SQLSelection = "select * from entregador where ent_cod = ?;";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            STM.setInt(1, Codigo);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                Entregador.setCodigo(RS.getInt("ent_cod"));
                Entregador.setNome(RS.getString("ent_nome"));
                Entregador.setPermissao(RS.getString("ent_permissao"));
                Entregador.setDataCad(VerificadoresECorretores.converteParaJAVA(RS.getString("ent_datacad")));
                
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Preencher os Campos", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        return Entregador;
    }
         public void editarEntregador(EntregadorBeans Entregador){
          try {
            String SQLEdition = "update entregador set "
                    + "ent_nome = ? "
                    + "where ent_cod = ?;";
               
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLEdition);
            STM.setString(1, Entregador.getNome());
            STM.setInt(2, Entregador.getCodigo());
            
            
            
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Editar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
                        
        }
          
     
          
    }
}
