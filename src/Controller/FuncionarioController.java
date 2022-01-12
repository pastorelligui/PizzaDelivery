package Controller;

import Beans.ClienteBeans;
import Beans.FuncionarioBeans;
import DAO.FuncionarioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController {

    FuncionarioDAO FuncionarioD;
    
    
    public FuncionarioController(){
    
        FuncionarioD = new FuncionarioDAO();
          
    }
     
    public String controleDeCodigo(){
        return FuncionarioD.proximoFuncionario();
     }
    
     public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        FuncionarioD.procurarFuncionario(Pesquisa, Modelo);
    }
      public FuncionarioBeans controlePreenchimento(int Codigo){
        return FuncionarioD.preencherCampos(Codigo);
    }
    
    public boolean verificaDados(FuncionarioBeans Funcionario, int Cargo, int Permissao){ // se o usuario não selecionar as duas opções, ocorre erro!
        if(Funcionario.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cargo == 0){
            JOptionPane.showMessageDialog(null, "Selecione um Cargo!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Permissao == 0){
            JOptionPane.showMessageDialog(null, "Selecione uma Permissão!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        FuncionarioD.cadastrarFuncionario(Funcionario);// passando de todas as condições acima, o funcionario está ok
        return true;
    }
    public boolean verificaDadosParaEditar(FuncionarioBeans Funcionario, int Cargo, int Permissao){ // se o usuario não selecionar as duas opções, ocorre erro!
        if(Funcionario.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cargo == 0){
            JOptionPane.showMessageDialog(null, "Selecione um Cargo!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Permissao == 0){
            JOptionPane.showMessageDialog(null, "Selecione uma Permissão!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        FuncionarioD.editarFuncionario(Funcionario);// passando de todas as condições acima, o funcionario está ok
        return true;
    }
}
