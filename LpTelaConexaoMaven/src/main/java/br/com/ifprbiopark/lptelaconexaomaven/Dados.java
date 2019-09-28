package br.com.ifprbiopark.lptelaconexaomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados {

    public List<Estado> getEstados() {
        
        List<Estado> lista; 
        lista = new ArrayList();
        
        try {

            Connection c = DriverManager.getConnection("jdbc:sqlite:LPexercicio1.db");
            Statement stm = c.createStatement();

            //Lendo registros
            String sql = "SELECT * FROM estado";
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
//                cbEstado.addItem(rs.getString("nome"));
                Estado e= new Estado();
                e.setId(rs.getInt("id"));
                e.setNome(rs.getString("nome"));
                e.setSigla(rs.getString("sigla"));
                lista.add(e);

            }
            c.close();

        } catch (SQLException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

}
