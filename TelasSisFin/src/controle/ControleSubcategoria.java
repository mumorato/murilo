/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Dao;
import dao.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Subcategoria;

/**
 *
 * @author macbook
 */
public class ControleSubcategoria {

        Dao dao = DaoFactory.getDAO(new Subcategoria());
        
    public void salvar(Subcategoria subcategoria) throws SQLException {
        if (subcategoria.getIdSubcategoria() > 0) {
            dao.alterar(subcategoria);
        } else {
            dao.inserir(subcategoria);
        }
    }

    public void excluir(Subcategoria subcategoria) throws SQLException {
        dao.excluir(subcategoria);
    }

    public ArrayList<Subcategoria> pesquisar(String filtro) throws SQLException {
        return dao.pesquisar(filtro);
    }
}
