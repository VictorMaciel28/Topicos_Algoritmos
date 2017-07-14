/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_xl;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Inserir {
    Connection conn = null;
    Statement Statement = null;
    
    
    public Inserir(String sql){
        //FileInputStream archivofoto;    
        try{
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\gui\\SQLiteStudio\\mydb.db"); 
            if (conn != null){
                JOptionPane.showMessageDialog(null, "Meio que foi.");
            }
            
            
            Statement = conn.createStatement();
           
            PreparedStatement stmt = conn.prepareStatement(sql);
            
   //         stmt.setString(1,"2");
            
            Statement.executeUpdate(sql);
            conn.close();
           
               //archivofoto= new FileInputStream(jTextField7.getText());
            //stmt.setBinaryStream(5,archivofoto);
            //if(i>0){
            //    JOptionPane.showMessageDialog(null,"Inserido com muito secesso!");
            //}else{
            //    JOptionPane.showMessageDialog(null,"Ocorreu algum erro.");
            //}
            //int i=stmt.executeUpdate(sql);
            
            //if(i>0){
             //   JOptionPane.showMessageDialog(null,"Inserido com muito secesso!");
            } catch (SQLException ex) {
            Logger.getLogger(Inserir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inserir.class.getName()).log(Level.SEVERE, null, ex);
        }//{
         //       JOptionPane.showMessageDialog(null,"Ocorreu algum erro.");
         //   }

        }
        
    public Connection Inserir(){
        return conn;
        }
}
