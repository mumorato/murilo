package controle;

import dao.Dao;
import dao.DaoFactory;
import modelo.Titulo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class ControleTitulo {

    Dao dao = DaoFactory.getDAO(new Titulo());

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

}
