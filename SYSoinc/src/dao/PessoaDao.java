/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pessoa;

public class PessoaDao extends Dao<Pessoa> {

    @Override
    public void inserir(Pessoa pessoa) throws SQLException {
        String SQL = "insert into PESSOA(nomePessoa, tipoPessoa, cpfCnpj, telefone, endereco, bairro, cidadeId) values (?, ?, ?, ?, ?, ?, ?)";
        executarConsultaDML(SQL,
                pessoa.getNomePessoa(),
                pessoa.getTipoPessoa(),
                pessoa.getCpfCnpj(),
                pessoa.getTelefone(),
                pessoa.getEndereco(),
                pessoa.getBairro(),
                pessoa.getCidadeId()
        );
    }

    @Override
    public void excluir(Pessoa pessoa) throws SQLException {
        String SQL = "delete from PESSOA where idPessoa = ?";
        executarConsultaDML(SQL, pessoa.getIdPessoa());
    }

    @Override
    public void alterar(Pessoa pessoa) throws SQLException {
        String SQL = "update PESSOA set nomePessoa = ?, tipoPessoa = ?, cpfCnpj = ?, telefone = ?,"
                + " endereco = ?, bairro = ?, cidadeId = ? where idPessoa = ?";
        executarConsultaDML(SQL,
                pessoa.getNomePessoa(),
                pessoa.getTipoPessoa(),
                pessoa.getCpfCnpj(),
                pessoa.getTelefone(),
                pessoa.getEndereco(),
                pessoa.getBairro(),
                pessoa.getCidadeId(),
                pessoa.getIdPessoa()
        );
    }

    public ArrayList<Pessoa> pesquisar(String filtro) throws SQLException {
        ArrayList<Pessoa> retorno = new ArrayList<>();

        String SQL = "select * FROM PESSOA INNER JOIN CIDADE ON PESSOA.cidadeId = CIDADE.idCidade where lower(nomePessoa) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");
        while (resultadoConsulta.next()) {
            Pessoa pessoa = new Pessoa();
            
            pessoa.setIdPessoa(resultadoConsulta.getInt("idPessoa"));
            pessoa.setNomePessoa(resultadoConsulta.getString("nomePessoa"));
            pessoa.setTipoPessoa(resultadoConsulta.getString("tipoPessoa"));
            pessoa.setCpfCnpj(resultadoConsulta.getString("cpfCnpj"));
            pessoa.setTelefone(resultadoConsulta.getString("telefone"));
            pessoa.setEndereco(resultadoConsulta.getString("endereco"));
            pessoa.setBairro(resultadoConsulta.getString("bairro"));
            pessoa.setCidadeId(resultadoConsulta.getInt("cidadeId"));
            pessoa.setNomeCidade(resultadoConsulta.getString("nomeCidade"));
            retorno.add(pessoa);
        }

        return retorno;
    }
}
