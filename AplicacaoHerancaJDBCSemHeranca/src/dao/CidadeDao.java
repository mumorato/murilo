package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cidade;

public class CidadeDao extends Dao <Cidade> {

    @Override
    public void inserir(Cidade cidade) throws SQLException {
        String SQL = "insert into cidade(nome, sigla_estado) values (?, ?)";
        executarConsultaDML(
                SQL, cidade.getNome(),
                cidade.getSiglaEstado()
        );
    }

    @Override
    public void excluir(Cidade cidade) throws SQLException {
        String SQL = "delete from cidade where id = ?";
        executarConsultaDML(SQL,
                cidade.getId()
        );
    }

    @Override
    public void alterar(Cidade cidade) throws SQLException {
        String SQL = "update cidade set nome = ?, sigla_estado = ? where id = ?";
        executarConsultaDML(
                cidade.getNome(),
                cidade.getSiglaEstado(),
                cidade.getId()
        );
    }

    public ArrayList<Cidade> pesquisar(String filtro) throws SQLException {
        ArrayList<Cidade> retorno = new ArrayList<>();

        String SQL = "select * from cidade where lower(nome) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");

        while (resultadoConsulta.next()) {
            Cidade cidade = new Cidade();
            cidade.setId(resultadoConsulta.getInt("id"));
            cidade.setNome(resultadoConsulta.getString("nome"));
            cidade.setSiglaEstado(resultadoConsulta.getString("sigla_estado"));
            retorno.add(cidade);
        }

        return retorno;
    }
}
