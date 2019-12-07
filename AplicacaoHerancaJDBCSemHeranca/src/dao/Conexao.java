package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao { //singleton

    private static Connection conexao;

    public static Connection getConexao() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.getConnection("jdbc:sqlite:bancodados.db");
        }
        return conexao;
    }
}
