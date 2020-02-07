package controle;

import dao.CategoriaDao;
import dao.Dao;
import dao.DaoFactory;
import dao.TituloDao;
import modelo.Titulo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ControleTitulo {

    Dao dao = DaoFactory.getDAO(new Titulo());
    ArrayList<Titulo> listaTitulo;
    Titulo titulo;

    public void salvar(Titulo titulo) throws SQLException {
        if (titulo.getIdTitulo() > 0) {
            dao.alterar(titulo);
        } else {
            dao.inserir(titulo);
        }
    }

    public void excluir(Titulo titulo) throws SQLException {
        dao.excluir(titulo);
    }

    public ArrayList<Titulo> pesquisar(String filtro) throws SQLException {
        return dao.pesquisar(filtro);
    }

    public Titulo consulta(int filtro) throws SQLException {
        TituloDao consulta = new TituloDao();
        titulo = consulta.consulta(filtro);
        return titulo;
    }

    public ArrayList<Titulo> pesquisarFiltro(String string) throws SQLException {
        TituloDao dados = new TituloDao();
        listaTitulo = dados.pesquisarFiltro(string);
        return listaTitulo;
    }

}
