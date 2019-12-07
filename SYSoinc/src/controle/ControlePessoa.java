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
import modelo.Pessoa;

/**
 *
 * @author macbook
 */
public class ControlePessoa {

    Dao dao = DaoFactory.getDAO(new Pessoa());

    public void salvar(Pessoa pessoa) throws SQLException {
        if (pessoa.getIdPessoa() > 0) {
            dao.alterar(pessoa);
        } else {
            dao.inserir(pessoa);
        }
    }

    public void excluir(Pessoa pessoa) throws SQLException {
        dao.excluir(pessoa);
    }

    public ArrayList<Pessoa> pesquisar(String filtro) throws SQLException {
        return dao.pesquisar(filtro);
    }

}
