/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.CategoriaDao;
import dao.Dao;
import dao.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;
import modelo.Subcategoria;

/**
 *
 * @author macbook
 */
public class ControleCategoria {

    Dao dao = DaoFactory.getDAO(new Categoria());
    List<Categoria> listaTitulo;

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

    public List<Categoria> getCategoria() {

        CategoriaDao dados = new CategoriaDao();
        try {
            listaTitulo = dados.getCategoria();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaTitulo;
    }

}
