package Controller;

import Beans.EntregadorBeans;
import Beans.FuncionarioBeans;
import DAO.EntregadorDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EntregadorController {
  
    EntregadorDAO EntregadorD; 
    
    
    public EntregadorController(){
     EntregadorD = new EntregadorDAO();
    }
    
     public String controleDeCodigo(){
        return EntregadorD.proximoEntregador();
     }
        public boolean verificaDados(EntregadorBeans EntregadorB){ // se o usuario não selecionar as duas opções, ocorre erro!
        if(EntregadorB.getNome().equals("")){ //se foi colocado um nome para o entregador
            JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
                
        EntregadorD.cadastrarEntregador(EntregadorB);// passando de todas as condições acima, o funcionario está ok
        return true;
    }
        public boolean verificaDadosParaEditar(EntregadorBeans Entregador){ // se o usuario não selecionar as duas opções, ocorre erro!
        if(Entregador.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Nome não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        
        EntregadorD.editarEntregador(Entregador);// passando de todas as condições acima, o funcionario está ok
        return true;
    }

        public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        EntregadorD.procurarEntregador(Pesquisa, Modelo);
    }
         public EntregadorBeans controlePreenchimento(int Codigo){
        return EntregadorD.preencherCampos(Codigo);
    }
         
   
}
