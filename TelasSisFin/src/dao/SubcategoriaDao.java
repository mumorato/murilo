package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Subcategoria;

public class SubcategoriaDao extends Dao <Subcategoria> {

    @Override
    public void inserir(Subcategoria subcategoria) throws SQLException {
        String SQL = "insert into SUBCATEGORIA(nomeSubcategoria, categoriaId) values (?, ?)";
        executarConsultaDML(SQL,
                subcategoria.getNomeSubcategoria(),
                subcategoria.getCategoriaId()
        );
    }

    @Override
    public void excluir(Subcategoria subcategoria) throws SQLException {
        String SQL = "delete from SUBCATEGORIA where idSubcategoria = ?";
        executarConsultaDML(SQL, subcategoria.getIdSubcategoria());
    }
    
    @Override
    public void alterar(Subcategoria subcategoria) throws SQLException {
        String SQL = "update SUBCATEGORIA set nomeSubcategoria = ?, categoriaId = ? where idSubcategoria = ?";
        executarConsultaDML(SQL,
                subcategoria.getNomeSubcategoria(),
                subcategoria.getCategoriaId(),
                subcategoria.getIdSubcategoria()
        );
    }

    public ArrayList<Subcategoria> pesquisar(String filtro) throws SQLException {
        ArrayList<Subcategoria> retornoPesquisa = new ArrayList<>();

        String SQL="SELECT * FROM VIEWSUB WHERE LOWER (nomeSubcategoria) like ?" ;
        
        //String SQL ="S﻿ELECT idSubcategoria, nomeSubcategoria, categoriaId, nomeCategoria, tipoCategoria FROM SUBCATEGORIA INNER JOIN CATEGORIA ON SUBCATEGORIA.categoriaId = CATEGORIA.idCategoria where lower (﻿nomeSubcategoria) like ?";
        
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");
        while (resultadoConsulta.next()) {
            Subcategoria subcategoria = new Subcategoria();
            subcategoria.setIdSubcategoria(resultadoConsulta.getInt("idSubcategoria"));
            subcategoria.setNomeSubcategoria(resultadoConsulta.getString("nomeSubcategoria"));
            subcategoria.setCategoriaId(resultadoConsulta.getInt("categoriaId"));           
            subcategoria.setNomeCategoriaSubcategoria(resultadoConsulta.getString("nomeCategoria"));
            subcategoria.setNomeTipoSubcategoria(resultadoConsulta.getString("tipoCategoria"));
            
            retornoPesquisa.add(subcategoria);
        }

        return retornoPesquisa;
    }
}
