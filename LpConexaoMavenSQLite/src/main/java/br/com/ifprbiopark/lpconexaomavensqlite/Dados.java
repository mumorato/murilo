
package br.com.ifprbiopark.lpconexaomavensqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dados {
 
    
 public List<Estado>getEstados(){
     
             try {

            Connection c = DriverManager.getConnection("jdbc:sqlite:LPexercicio1.db");
            Statement stm = c.createStatement();

            //Lendo registros
            String sql = "SELECT * FROM estado";
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
//                cbEstado.addItem(rs.getString("nome"));
            }
            c.close();

        } catch (SQLException ex) {
//          Logger.getLogger(cidadeEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     
     
     return null;
     
 }   
    
}
