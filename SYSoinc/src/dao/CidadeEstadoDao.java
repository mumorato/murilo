/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;
import modelo.Estado;
import modelo.Estado;

/**
 *
 * @author macbook
 */
public class CidadeEstadoDao extends Dao <Estado> {
    
    public List<Estado> getEstados() throws SQLException {

        List<Estado> lista;
        lista = new ArrayList();
        
            String sql = "SELECT * FROM ESTADO";
            ResultSet rs = executarConsultaSQL(sql);

            while (rs.next()) {
                Estado estado = new Estado();
                estado.setIdEstado(rs.getInt("idEstado"));
                estado.setNomeEstado(rs.getString("nomeEstado"));
                estado.setSiglaEstado(rs.getString("siglaEstado"));
                lista.add(estado);
            }


        return lista;
    }

    public List<Cidade> getCidades(int estadoId) throws SQLException {

        List<Cidade> listaCid;
        listaCid = new ArrayList();

           String sql = "SELECT * FROM CIDADE WHERE estadoId = ";
            sql += String.valueOf(estadoId);
            ResultSet rs = executarConsultaSQL(sql);
            
            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setIdCidade(rs.getInt("idCidade"));
                cidade.setNomeCidade(rs.getString("nomeCidade"));
                
                listaCid.add(cidade);
            }

        return listaCid;
    }

    @Override
    public void inserir(Estado objeto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Estado objeto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Estado objeto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Estado> pesquisar(String filtro) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estado consulta(int filtro) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
