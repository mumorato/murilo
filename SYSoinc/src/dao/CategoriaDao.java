package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Subcategoria;

public class CategoriaDao extends Dao<Categoria> {

    @Override
    public void inserir(Categoria categoria) throws SQLException {
        String SQL = "insert into CATEGORIA(nomeCategoria, tipoCategoria) values (?, ?)";
        executarConsultaDML(SQL,
                categoria.getNomeCategoria(),
                categoria.getTipoCategoria()
        );
    }

    @Override
    public void excluir(Categoria categoria) throws SQLException {
        String SQL = "delete from CATEGORIA where idCategoria = ?";
        executarConsultaDML(SQL, categoria.getIdCategoria());
    }

    @Override
    public void alterar(Categoria categoria) throws SQLException {
        String SQL = "update CATEGORIA set nomeCategoria = ?, tipoCategoria = ? where idCategoria = ?";
        executarConsultaDML(SQL,
                categoria.getNomeCategoria(),
                categoria.getTipoCategoria(),
                categoria.getIdCategoria()
        );
    }

    public ArrayList<Categoria> pesquisar(String filtro) throws SQLException {
        ArrayList<Categoria> retorno = new ArrayList<>();

        String SQL = "select * from CATEGORIA where lower(nomeCategoria) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");
        while (resultadoConsulta.next()) {
            Categoria categoria = new Categoria();
            categoria.setIdCategoria(resultadoConsulta.getInt("idCategoria"));
            categoria.setNomeCategoria(resultadoConsulta.getString("nomeCategoria"));
            categoria.setTipoCategoria(resultadoConsulta.getString("tipoCategoria"));
            retorno.add(categoria);
        }

        return retorno;
    }

    public List<Categoria> getCategoria() throws SQLException {

        List<Categoria> lista;
        lista = new ArrayList();

        String sql = "SELECT * FROM CATEGORIA";
        ResultSet rs = executarConsultaSQL(sql);

        while (rs.next()) {
            Categoria categoria = new Categoria();
            categoria.setIdCategoria(rs.getInt("idCategoria"));
            categoria.setNomeCategoria(rs.getString("nomeCategoria"));
            categoria.setTipoCategoria(rs.getString("tipoCategoria"));
            lista.add(categoria);
        }

        return lista;
    }

    @Override
    public Categoria consulta(int filtro) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
