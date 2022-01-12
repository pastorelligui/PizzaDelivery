package Controller;

import Beans.ClienteBeans;
import DAO.ClienteDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteController {

    ClienteDAO ClienteD;
    
    public ClienteController(){
        ClienteD = new ClienteDAO();
        
        
    }
    
    public boolean verificarDados(ClienteBeans Cliente){
        if(Cliente.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cliente.getRua().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cliente.getBairro().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cliente.getTelefone().equals("(  )    -    ")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        ClienteD.cadastrarCliente(Cliente);
        return true;
    }
    public String controleDeCodigo(){
        return ClienteD.proximoCliente();
     }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        ClienteD.procurarCliente(Pesquisa, Modelo);
    }
    
    public void controlePesquisa(String Pesquisa,  List<String> Lista){
        ClienteD.procurarCliente(Pesquisa, Lista);
    }
    
    public ClienteBeans controlePreenchimento(int Codigo){
        return ClienteD.preencherCampos(Codigo);
    }
    public boolean verificarDadosParaEditar(ClienteBeans Cliente){
        if(Cliente.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cliente.getRua().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cliente.getBairro().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        if(Cliente.getTelefone().equals("(  )    -    ")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatório", "ERRO DE PREENCHIMENTO", 0, new ImageIcon("Imagens/cancelar.png"));
            return false;
        }
        ClienteD.editarCliente(Cliente); 
        return true;
    }
}
