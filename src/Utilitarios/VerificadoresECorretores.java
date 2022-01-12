package Utilitarios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VerificadoresECorretores {

    public static String converteParaSQL(String Data){
             
        return Data.substring(6, 10) + "-" + Data.substring(3, 5) + "-" + Data.substring(0, 2);
        
    }
     public static String converteParaJAVA(String Data){
             
        return Data.substring(8, 10) + "/" + Data.substring(5, 7) + "/" + Data.substring(0, 4);
    }
    
    public static String retornoDeDataAtual(){ //me retorna a data atual
        SimpleDateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date DataAtual = new Date();
        return FormatoData.format(DataAtual);
    } 
    
}
