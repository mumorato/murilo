package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Fornecedor;

public class FornecedorDao extends Dao <Fornecedor> {

    @Override
    public void inserir(Fornecedor fornecedor) throws SQLException {
        String SQL = "insert into fornecedor(nome, cnpj, endereco, numero, bairro) values (?, ?, ?, ?, ?)";
        executarConsultaDML(SQL,
                fornecedor.getNome(),
                fornecedor.getCnpj(),
                fornecedor.getEndereco(),
                fornecedor.getNumero(),
                fornecedor.getBairro()
        );
    }

    @Override
    public void excluir(Fornecedor fornecedor) throws SQLException {
        String SQL = "delete from fornecedor where id = ?";
        executarConsultaDML(SQL, fornecedor.getId());
    }

    @Override
    public void alterar(Fornecedor fornecedor) throws SQLException {
        String SQL = "update fornecedor set nome = ?, cnpj = ?, endereco = ?, numero = ?, bairro = ? where id = ?";
        executarConsultaDML(SQL,
                fornecedor.getNome(),
                fornecedor.getCnpj(),
                fornecedor.getEndereco(),
                fornecedor.getNumero(),
                fornecedor.getBairro(),
                fornecedor.getId()
        );
    }

    public ArrayList<Fornecedor> pesquisar(String filtro) throws SQLException {
        ArrayList<Fornecedor> retorno = new ArrayList<>();

        String SQL = "select * from fornecedor where lower(nome) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");
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
