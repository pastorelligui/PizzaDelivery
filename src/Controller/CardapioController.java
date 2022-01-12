package Controller;

import Beans.CardapioBeans;
import Beans.FuncionarioBeans;
import DAO.CardapioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardapioController {
 
    CardapioDAO CardapioD;
    
    public CardapioController(){
        CardapioD = new CardapioDAO();
    }
      public String controleDeCodigo(){
        return CardapioD.proximoCardapio();
     }
      public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        CardapioD.procurarCardapio(Pesquisa, Modelo);
    }
      
      public CardapioBeans controlePreenchimento(int Codigo){
        return CardapioD.preencherCampos(Codigo);
    }
       public boolean verificaDados(CardapioBeans Cardapio, String Valor){ // se o usuario não selecionar as duas opções, ocorre erro!
        if(Cardapio.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Descrição não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        if(Valor.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Valor não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        
        CardapioD.cadastrarCardapio(Cardapio);// passando de todas as condições acima, o funcionario está ok
        return true;
    }
       
         public boolean verificaDadosParaEditar(CardapioBeans Cardapio, String Valor){ // se o usuario não selecionar as duas opções, ocorre erro!
        if(Cardapio.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Descrição não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        if(Valor.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Valor não pode ser vazio!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        
        CardapioD.editarCardapio(Cardapio);// passando de todas as condições acima, o funcionario está ok
        return true;
    }   
}
