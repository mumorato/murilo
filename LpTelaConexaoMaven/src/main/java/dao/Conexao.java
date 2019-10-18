package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    Connection c;
    
    private static Conexao instanciaConexao; // instancia para implementa SingleTon

    public ResultSet executarConsulta(String sql) {

        try {

            c = DriverManager.getConnection("jdbc:sqlite:LPexercicio1.db");
            Statement stm = c.createStatement();

            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    private Conexao() { //fazendo método construtor (método com mesmo nome da classe)

    }

    public static Conexao getInstance() { // metodo implementas singleTon
        if (instanciaConexao == null) {
            instanciaConexao = new Conexao();
        }

        return instanciaConexao;
    }

    public void close() {
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
