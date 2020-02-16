/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Dao;
import dao.DaoFactory;
import dao.PessoaDao;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;

/**
 *
 * @author macbook
 */
public class ControlePessoa {

    Dao dao = DaoFactory.getDAO(new Pessoa());
    List<Pessoa> listaPessoa;
    Pessoa pessoa;

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
        public Pessoa consulta(int filtro) throws SQLException {
        PessoaDao consulta = new PessoaDao();
        pessoa = consulta.consulta(filtro);
        return pessoa;
    }

    public List<Pessoa> getPessoa() {

        PessoaDao dados = new PessoaDao();
        try {
            listaPessoa = dados.getPessoa();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ControlePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return listaPessoa;
    }
}
