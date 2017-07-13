/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_xl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Inserir {
    Connection conn = null;
    
    
    
    public Inserir(){
            try{
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\gui\\SQLiteStudio\\mydb.db"); 
            if (conn != null){
                JOptionPane.showMessageDialog(null, "Meio que foi.");
            }
            
            String sql = "INSERT INTO Imagem (idImagem,idLocal,descricao,seguranca,transporte,lazer,Imagem) VALUES(6,1,null,null,null,null,null)";
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

        public Connection Inserir(){
        return conn;
        }
}
