 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compserv.configdb;

import java.sql.*;

/**
 *
 * @author ALLAN
 */
public class Modulo_conexao {
    
    // Metodo de conexao com o banco 
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //"CHAMA" O DRIVE
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //ARMAZENA INFORMACOES REFERENTE AO BANCO
        String url = "jdbc:mysql://localhost:3306/dbcompserv";
        String user = "root";
        String password = "";
        
        //ESTABELECE CONEXAO COM OBANCO
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        
    }
    
    
}
