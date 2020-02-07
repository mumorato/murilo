/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public abstract class Dao<TipoDado> {

    public abstract void inserir(TipoDado objeto) throws SQLException;
    public abstract void alterar(TipoDado objeto) throws SQLException;
    public abstract void excluir(TipoDado objeto) throws SQLException;
    public abstract ArrayList<TipoDado> pesquisar(String filtro) throws SQLException;    
    public abstract TipoDado consulta(int filtro) throws SQLException;    

    //metodo generico prepara consulta
    private PreparedStatement prepararConsulta(String SQL, Object... parametros) throws SQLException {
        PreparedStatement consulta = Conexao.getConexao().prepareStatement(SQL);
        for (int i = 0; i < parametros.length; i++) {
            consulta.setObject(i + 1, parametros[i]);
        }
        return consulta;
    }

    //metodo generico para executeUpdate
    protected void executarConsultaDML(String SQL, Object... parametros) throws SQLException {
        prepararConsulta(SQL, parametros).executeUpdate();
    }

    //metodo generico 
    protected ResultSet executarConsultaSQL(String SQL, Object... parametros) throws SQLException {
        return prepararConsulta(SQL, parametros).executeQuery();
    }

}
