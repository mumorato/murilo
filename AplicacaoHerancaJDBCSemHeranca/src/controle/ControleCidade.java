package controle;

import dao.CidadeDao;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cidade;

public class ControleCidade {

    CidadeDao dao = new CidadeDao();

    public void salvar(Cidade cidade) throws SQLException {
        if (cidade.getId() > 0) {
            dao.alterar(cidade);
        } else {
            dao.inserir(cidade);
        }
    }

    public void excluir(Cidade cidade) throws SQLException {
        dao.excluir(cidade);
    }

    public ArrayList<Cidade> pesquisar(String filtro) throws SQLException {
        return dao.pesquisar(filtro);
    }
}
