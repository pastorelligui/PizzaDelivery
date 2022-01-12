package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class Conexao {

    private final String URL = "jdbc:mysql://127.0.0.1:3306/pizza";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "root";
    private final String Senha = "1234";
    private static Connection Con;
    
   public Conexao(){
        try {
            Class.forName(Driver);
            Con = DriverManager.getConnection(URL, Usuario, Senha);
            Con.setAutoCommit(false);
            JOptionPane.showMessageDialog(null, "Conectou com sucesso", "CONECTOU COM O BANCO", 1);
        } catch (SQLException | ClassNotFoundException ex) {
 JOptionPane.showMessageDialog(null, "Erro ao Conectar-se Com o Banco", "ERRO COM O BANCO", 0);
        }
   } 
   
   public static Connection getConnection(){
       if(Con == null){
           new Conexao();
       }
       return Con;
       
   }
       public static void closeConnection(){
        try {
            if(!Con.isClosed()){
                try {
                    Con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
  
    public static void main(String args []){
        Conexao.getConnection();
    }
}

