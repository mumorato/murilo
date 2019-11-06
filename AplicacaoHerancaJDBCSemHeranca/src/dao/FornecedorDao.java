package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Fornecedor;

public class FornecedorDao {

    public void inserir(Fornecedor fornecedor) throws SQLException {
        Connection conexaoBD = Conexao.getConexao();
        String SQL = "insert into fornecedor(nome, cnpj, endereco, numero, bairro) values (?, ?, ?, ?, ?)";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setString(1, fornecedor.getNome());
        comando.setString(2, fornecedor.getCnpj());
        comando.setString(3, fornecedor.getEndereco());
        comando.setInt(4, fornecedor.getNumero());
        comando.setString(5, fornecedor.getBairro());
        comando.executeUpdate();
    }

    public void excluir(Fornecedor fornecedor) throws SQLException {
        Connection conexaoBD = Conexao.getConexao();
        String SQL = "delete from fornecedor where id = ?";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setInt(1, fornecedor.getId());
        comando.executeUpdate();
    }

    public void alterar(Fornecedor fornecedor) throws SQLException {
        Connection conexaoBD = Conexao.getConexao();
        String SQL = "update fornecedor set nome = ?, cnpj = ?, endereco = ?, numero = ?, bairro = ? where id = ?";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setString(1, fornecedor.getNome());
        comando.setString(2, fornecedor.getCnpj());
        comando.setString(3, fornecedor.getEndereco());
        comando.setInt(4, fornecedor.getNumero());
        comando.setString(5, fornecedor.getBairro());
        comando.setInt(6, fornecedor.getId());
        comando.executeUpdate();
    }

    public ArrayList<Fornecedor> pesquisar(String filtro) throws SQLException {
        ArrayList<Fornecedor> retorno = new ArrayList<>();

        Connection conexaoBD = Conexao.getConexao();
        String SQL = "select * from fornecedor where lower(nome) like ?";
        PreparedStatement comando = conexaoBD.prepareStatement(SQL);
        comando.setString(1, "%" + filtro.trim().toLowerCase() + "%");
        ResultSet resultadoConsulta = comando.executeQuery();
        while (resultadoConsulta.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(resultadoConsulta.getInt("id"));
            fornecedor.setNome(resultadoConsulta.getString("nome"));
            fornecedor.setCnpj(resultadoConsulta.getString("cnpj"));
            fornecedor.setEndereco(resultadoConsulta.getString("endereco"));
            fornecedor.setNumero(resultadoConsulta.getInt("numero"));
            fornecedor.setBairro(resultadoConsulta.getString("bairro"));
            retorno.add(fornecedor);
        }

        return retorno;
    }
}
