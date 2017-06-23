package trabalho_xl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    
    private static Connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static String url = "jdbc:mysql://localhost:3306/mydb";
    
    public Conectar(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("FOI CARAIO");
            }
        }catch(Exception e){
            System.out.println("NAO FOI CARAIO");
        }
    }
    
    // METODO QUE RETORNA A CONEXAO
    public Connection getConnection(){
        return conn;
    }
    
    // METODO QUE DESCONECTA A CONXEAO
    public void Desconectar(){
        conn=null;
        if (conn == null){
            System.out.println("VC FECHOU A CONEXAO");
        }
    }
    
    
    
    
    
}

