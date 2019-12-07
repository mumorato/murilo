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
import modelo.Categoria;

/**
 *
 * @author macbook
 */
public class ControleCategoria {

        Dao dao = DaoFactory.getDAO(new Categoria());
        
    public void salvar(Categoria categoria) throws SQLException {
        if (categoria.getIdCategoria() > 0) {
            dao.alterar(categoria);
        } else {
            dao.inserir(categoria);
        }
    }

    public void excluir(Categoria categoria) throws SQLException {
        dao.excluir(categoria);
    }

    public ArrayList<Categoria> pesquisar(String filtro) throws SQLException {
        return dao.pesquisar(filtro);
    }
}
