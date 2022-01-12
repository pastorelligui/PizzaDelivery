package DAO;

import Beans.ClienteBeans;
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

public class FuncionarioDAO {
 
    public FuncionarioDAO(){
        
    }
    
    public void cadastrarFuncionario(FuncionarioBeans Funcionario){
        
        try {
            String SQLInsertion = "insert into funcionario(fun_nome, fun_cargo, fun_permissao, fun_datacad) values "
                    + "(?, ?, ?, ?); ";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLInsertion);
            STM.setString(1, Funcionario.getNome());
            STM.setString(2, Funcionario.getCargo());
            STM.setString(3, Funcionario.getPermissao());
            STM.setString(4, VerificadoresECorretores.converteParaSQL(Funcionario.getDataCad()));
           
          
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public String proximoFuncionario(){
        try {
            String SQLSelection = "select * from funcionario order by fun_cod desc limit 1;";
            
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                return (Integer.parseInt(RS.getString("fun_cod")) + 1) + "";
            }
            else{
                String SQLResetIncrement = "alter table funcionario auto_increment = 1;";
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
     public void procurarFuncionario(String Pesquisa, DefaultTableModel Modelo){
        try {
            String SQLSelection = "select * from funcionario where fun_nome like '%"+Pesquisa+"%';";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet RS = STM.executeQuery();
            while(RS.next()){
                Modelo.addRow(new Object[] {RS.getString("fun_cod"), RS.getString("fun_nome"), RS.getString("fun_cargo"), RS.getString("fun_permissao")});
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Pesquisar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        
    }
     public FuncionarioBeans preencherCampos(int Codigo){
         
         FuncionarioBeans Funcionario = new FuncionarioBeans();
                  
        try {
            String SQLSelection = "select * from funcionario where fun_cod = ?;";
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLSelection);
            STM.setInt(1, Codigo);
            ResultSet RS = STM.executeQuery();
            if(RS.next()){
                Funcionario.setCodigo(RS.getInt("fun_cod"));
                Funcionario.setNome(RS.getString("fun_nome"));
                Funcionario.setCargo(RS.getString("fun_cargo"));
                Funcionario.setPermissao(RS.getString("fun_permissao"));
                Funcionario.setDataCad(VerificadoresECorretores.converteParaJAVA(RS.getString("fun_datacad")));
                
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Preencher os Campos", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
        }
        return Funcionario;
    }
      public void editarFuncionario(FuncionarioBeans Funcionario){
          try {
            String SQLEdition = "update funcionario set "
                    + "fun_nome = ?, "
                    + "fun_cargo = ?, "
                    + "fun_permissao = ? "
                    + "where fun_cod = ?;";
               
            PreparedStatement STM = Conexao.getConnection().prepareStatement(SQLEdition);
            STM.setString(1, Funcionario.getNome());
            STM.setString(2, Funcionario.getCargo());
            STM.setString(3, Funcionario.getPermissao());
            STM.setInt(4, Funcionario.getCodigo());
            
            
            STM.execute();
            
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!", "CADASTRO EFETUADO", 1, new ImageIcon("Imagens/check.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel Editar", "ERRO DE SQL", 0, new ImageIcon("Imagens/cancelar.png"));
                        
        }
          
     
          
    }
 }
    
