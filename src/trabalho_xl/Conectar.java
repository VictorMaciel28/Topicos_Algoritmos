package trabalho_xl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    
    private static Connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static String url = "jdbc:mysql://localhost:3306/teste";
    
    @SuppressWarnings("UseSpecificCatch")
    public Conectar(){
        conn = null;
        try{            
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("Conexao bem sucedida.");
            }
        }catch(Exception e){
            System.out.println("Conexao mal sucedida");
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

