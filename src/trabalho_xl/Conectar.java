package trabalho_xl;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conectar {
    Connection c = null;
    Statement stmt = null;
    Connection conn = null;
    
    public Conectar(){
        try{            
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\gui\\SQLiteStudio\\mydb.db");
            if (c != null){
                JOptionPane.showMessageDialog(null, "Meio que foi.");
            }
            
            stmt = c.createStatement();
            String sql ="CREATE TABLE AAAAA (" +
                        "idProimg INT NOT NULL)"; 
            
            stmt.executeUpdate(sql);
            stmt.close();
         
            c.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Inserir(){
            try{
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\gui\\SQLiteStudio\\mydb.db"); 
            if (conn != null){
                JOptionPane.showMessageDialog(null, "Meio que foi.");
            }
            
            String sql = "INSERT INTO Imagem (idImagem,idLocal,descricao,seguranca,transporte,lazer,Imagem) VALUES('6','1','DROGA','null','null','null','null')";
            PreparedStatement stmt = conn.prepareStatement(sql);
           
            
            int i=stmt.executeUpdate(sql);
            if(i>0){
                JOptionPane.showMessageDialog(null,"Inserido com muito secesso!");
            }else{
                JOptionPane.showMessageDialog(null,"Ocorreu algum erro.");
            }
            stmt.close();
            conn.close();

        }catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // METODO QUE RETORNA A CONEXAO
    public Connection getConnection(){
        return c;
    }
    
    // METODO QUE DESCONECTA A CONXEAO
    public void Desconectar(){
        c=null;
        if (c == null){
            System.out.println("VC FECHOU A CONEXAO");
        }
    }
    
    public Connection Insere(){
        return conn;
    }
    
    
    
    
    
}

