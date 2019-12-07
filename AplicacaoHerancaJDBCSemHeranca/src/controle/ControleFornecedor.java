package controle;

import dao.Dao;
import dao.DaoFactory;
import dao.FornecedorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Fornecedor;

public class ControleFornecedor {

        Dao dao = DaoFactory.getDAO(new Fornecedor());
        
    public void salvar(Fornecedor fornecedor) throws SQLException {
        if (fornecedor.getId() > 0) {
            dao.alterar(fornecedor);
        } else {
            dao.inserir(fornecedor);
        }
    }

    public void excluir(Fornecedor fornecedor) throws SQLException {
        dao.excluir(fornecedor);
    }

    public ArrayList<Fornecedor> pesquisar(String filtro) throws SQLException {
        return dao.pesquisar(filtro);
    }
}
