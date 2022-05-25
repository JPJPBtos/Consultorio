package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String DATABASE = "consultorio";
    private static final String HOST = "localhost:3306";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jbdc:mysql://"+HOST+"/"+DATABASE;
    private static final String USR = "etec";
    private static final String PWD = "";
    
    public static Connection conectar(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PWD);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro:" + e.getMessage());
            return null;
        }
    }
    
    public static void desconectar(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static void main(String[] args){
        if(conectar() != null){
            System.out.println("Conexao realizada com sucesso!");
        }
    }
}
