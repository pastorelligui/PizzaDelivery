package Controller;

import Beans.PedidoBeans;
import DAO.PedidoDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PedidoController {
    
    PedidoDAO  PedidoD;
    
    
    public PedidoController(){
        PedidoD = new PedidoDAO();
    }
    
    public void controledeItens(String Pesquisa, List<String> ListaDeItens){
        PedidoD.PesquisaItens(Pesquisa, ListaDeItens);
    }
    
    public double controledeValor(String Pesquisa){ // retorna o valor
        return PedidoD.ValorDoItem(Pesquisa);
    }
    
    public int controledeCodigo(String Pesquisa){ //retorna o código
        return PedidoD.codigoDoItem(Pesquisa);
    }
    
    public boolean verificaItens(String Valor, String Quantidade, String Codigo, String Item){ //faz uma verificação se todos os itens foram adicionados
        
        try{
            int X = Integer.parseInt(Quantidade); //caso dê certo a conversão, é feita o if abaixo
            if(X == 0){
                JOptionPane.showMessageDialog(null, "Campo Quantidade não pode ser 0!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
                return false;
            }
        }
        catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null, "Campo Quantidade deve ser número inteiro!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        
        if(Quantidade.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Quantidade Vazio - Campo Obrigatório!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }   
        
        if(Valor.equals("")){
            JOptionPane.showMessageDialog(null, "Valor Vazio - Campo Obrigatório!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
           if(Codigo.equals("")){
            JOptionPane.showMessageDialog(null, "Código Vazio - Campo Obrigatório!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
           
        if(Item.equals("")){
            JOptionPane.showMessageDialog(null, "Item Vazio - Campo Obrigatório!", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }   
        
        
        
        return true;
        
    }
    
    public void controleDePedido(String CodigoCliente, String CodigoFuncionario, String Total, int TamanhoTabela, PedidoBeans PedidoB){
        PedidoD.cadastrarPedido(CodigoCliente, CodigoFuncionario, Total, TamanhoTabela, PedidoB);
    }
    
}   
