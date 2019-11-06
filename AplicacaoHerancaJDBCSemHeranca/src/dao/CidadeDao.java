package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cidade;

public class CidadeDao {

    public void inserir(Cidade cidade) throws SQLException {
        Connection conexaoBD = Conexao.getConexao();
        String SQL = "insert into cidade(nome, sigla_estado) values (?, ?)";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setString(1, cidade.getNome());
        comando.setString(2, cidade.getSiglaEstado());
        comando.executeUpdate();
    }

    public void excluir(Cidade cidade) throws SQLException {
        Connection conexaoBD = Conexao.getConexao();
        String SQL = "delete from cidade where id = ?";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setInt(1, cidade.getId());
        comando.executeUpdate();
    }

    public void alterar(Cidade cidade) throws SQLException {
        Connection conexaoBD = Conexao.getConexao();
        String SQL = "update cidade set nome = ?, sigla_estado = ? where id = ?";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setString(1, cidade.getNome());
        comando.setString(2, cidade.getSiglaEstado());
        comando.setInt(3, cidade.getId());
        comando.executeUpdate();
    }

    public ArrayList<Cidade> pesquisar(String filtro) throws SQLException {
        ArrayList<Cidade> retorno = new ArrayList<>();

        Connection conexaoBD = Conexao.getConexao();
        String SQL = "select * from cidade where lower(nome) like ?";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setString(1, "%" + filtro.trim().toLowerCase() + "%");
        ResultSet resultadoConsulta = comando.executeQuery();
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
