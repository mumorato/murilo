package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Pessoa;
import modelo.Subcategoria;
import modelo.TipoTitulo;
import modelo.Titulo;

public class TituloDao extends Dao<Titulo> {

    @Override
    public void inserir(Titulo titulo) throws SQLException {
        String SQL = "insert into TITULO (dataCadastro, dataVencimento, valorTitulo, numeroParcela, pendente, tipoTituloId, categoriaId, subCategoriaId, pessoaId, nomeTitulo, cedente) values (?,?,?,?,?,?,?,?,?,?,?);";
        executarConsultaDML(SQL,
                //titulo.getIdTitulo(),
                titulo.getDataRealizacao(),
                titulo.getDataVencimento(),
                titulo.getValorTitulo(),
                titulo.getNumeroParcela(),
                titulo.getPendente(),
                titulo.getTipoTitulo().getIdTipoTitulo(),
                titulo.getCategoria().getIdCategoria(),
                titulo.getSubCategoria().getIdSubcategoria(),
                titulo.getPessoa().getIdPessoa(),
                titulo.getNomeTitulo(),
                titulo.getCedente()
        );
    }

    @Override
    public void excluir(Titulo titulo) throws SQLException {
        String SQL = "delete from TITULO where idTitulo = ?";
        executarConsultaDML(SQL, titulo.getIdTitulo());
    }

    @Override
    public void alterar(Titulo titulo) throws SQLException {
        String SQL = "update TITULO set dataCadastro = ?, dataVencimento = ?, valorTitulo = ?,"
                + " numeroParcela = ? , pendente = ?, tipoTituloId = ?, categoriaId = ? , subCategoriaId = ?,"
                + " pessoaId = ?, nomeTitulo = ?, cedente = ? where idTitulo = ?";
        executarConsultaDML(SQL,
                titulo.getDataRealizacao(),
                titulo.getDataVencimento(),
                titulo.getValorTitulo(),
                titulo.getNumeroParcela(),
                titulo.getPendente(),
                titulo.getTipoTitulo().getIdTipoTitulo(),
                titulo.getCategoria().getIdCategoria(),
                titulo.getSubCategoria().getIdSubcategoria(),
                titulo.getPessoa().getIdPessoa(),
                titulo.getNomeTitulo(),
                titulo.getCedente(),
                titulo.getIdTitulo()
        );
    }

    public ArrayList<Titulo> pesquisar(String filtro) throws SQLException {
        ArrayList<Titulo> retorno = new ArrayList<>();

        String SQL = "SELECT dataCadastro, dataVencimento, valorTitulo, numeroParcela, "
                + "pendente, tipoTituloId, nomeTipoTitulo, categoriaId, nomeCategoria, subcategoriaId, nomeSubcategoria, pessoaId, nomeTitulo, idTitulo, cedente, nomePessoa"
                + " FROM TITULO "
                + "﻿inner join TIPOTITULO on tipoTituloId = TIPOTITULO.idTipoTitulo "
                + "inner join CATEGORIA on categoriaId = CATEGORIA.idCategoria "
                + "inner join SUBCATEGORIA on subcategoriaId = SUBCATEGORIA.idSubcategoria "
                + "inner join PESSOA on pessoaId = PESSOA.idPessoa "
                + "where lower(nomeTitulo) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");
        while (resultadoConsulta.next()) {
            Titulo titulo = new Titulo();

            titulo.setDataRealizacao(resultadoConsulta.getString("dataCadastro"));
            titulo.setDataVencimento(resultadoConsulta.getString("dataVencimento"));
            titulo.setValorTitulo(resultadoConsulta.getDouble("valorTitulo"));
            titulo.setNumeroParcela(resultadoConsulta.getInt("numeroParcela"));
            titulo.setPendente(resultadoConsulta.getString("pendente"));

            TipoTitulo tipo = new TipoTitulo();
            tipo.setIdTipoTitulo(resultadoConsulta.getInt("tipoTituloId"));
            tipo.setNomeTipoTitulo(resultadoConsulta.getString("nomeTipoTitulo"));
            titulo.setTipoTitulo(tipo);

            Categoria categoria = new Categoria();
            categoria.setIdCategoria(resultadoConsulta.getInt("categoriaId"));
            categoria.setNomeCategoria(resultadoConsulta.getString("nomeCategoria"));
            titulo.setCategoria(categoria);

            Subcategoria subcategoria = new Subcategoria();
            subcategoria.setIdSubcategoria(resultadoConsulta.getInt("subcategoriaId"));
            subcategoria.setNomeSubcategoria(resultadoConsulta.getString("nomeSubcategoria"));
            titulo.setSubCategoria(subcategoria);

            Pessoa pess = new Pessoa();
            pess.setIdPessoa(resultadoConsulta.getInt("pessoaId"));
            titulo.setPessoa(pess);
            pess.setNomePessoa(resultadoConsulta.getString("nomePessoa"));
            titulo.setPessoa(pess);

            titulo.setNomeTitulo(resultadoConsulta.getString("nomeTitulo"));
            titulo.setIdTitulo(resultadoConsulta.getInt("idTitulo"));
            titulo.setCedente(resultadoConsulta.getString("cedente"));

            retorno.add(titulo);
        }

        return retorno;
    }

    public ArrayList<Titulo> pesquisarFiltro(String string) throws SQLException {
        ArrayList<Titulo> retorno = new ArrayList<>();

        String SQL = "SELECT dataCadastro, dataVencimento, valorTitulo, numeroParcela, "
                + "pendente, tipoTituloId, nomeTipoTitulo, categoriaId, nomeCategoria, subcategoriaId, nomeSubcategoria, pessoaId, nomeTitulo, idTitulo, cedente, nomePessoa"
                + " FROM TITULO "
                + "﻿inner join TIPOTITULO on tipoTituloId = TIPOTITULO.idTipoTitulo "
                + "inner join CATEGORIA on categoriaId = CATEGORIA.idCategoria "
                + "inner join SUBCATEGORIA on subcategoriaId = SUBCATEGORIA.idSubcategoria "
                + "inner join PESSOA on pessoaId = PESSOA.idPessoa "
                + "where lower(tipoTituloId) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + string.trim().toLowerCase() + "%");
        while (resultadoConsulta.next()) {
            Titulo titulo = new Titulo();

            titulo.setDataRealizacao(resultadoConsulta.getString("dataCadastro"));
            titulo.setDataVencimento(resultadoConsulta.getString("dataVencimento"));
            titulo.setValorTitulo(resultadoConsulta.getDouble("valorTitulo"));
            titulo.setNumeroParcela(resultadoConsulta.getInt("numeroParcela"));
            titulo.setPendente(resultadoConsulta.getString("pendente"));

            TipoTitulo tipo = new TipoTitulo();
            tipo.setIdTipoTitulo(resultadoConsulta.getInt("tipoTituloId"));
            tipo.setNomeTipoTitulo(resultadoConsulta.getString("nomeTipoTitulo"));
            titulo.setTipoTitulo(tipo);

            Categoria categoria = new Categoria();
            categoria.setIdCategoria(resultadoConsulta.getInt("categoriaId"));
            categoria.setNomeCategoria(resultadoConsulta.getString("nomeCategoria"));
            titulo.setCategoria(categoria);

            Subcategoria subcategoria = new Subcategoria();
            subcategoria.setIdSubcategoria(resultadoConsulta.getInt("subcategoriaId"));
            subcategoria.setNomeSubcategoria(resultadoConsulta.getString("nomeSubcategoria"));
            titulo.setSubCategoria(subcategoria);

            Pessoa pess = new Pessoa();
            pess.setIdPessoa(resultadoConsulta.getInt("pessoaId"));
            titulo.setPessoa(pess);
            pess.setNomePessoa(resultadoConsulta.getString("nomePessoa"));
            titulo.setPessoa(pess);

            titulo.setNomeTitulo(resultadoConsulta.getString("nomeTitulo"));
            titulo.setIdTitulo(resultadoConsulta.getInt("idTitulo"));
            titulo.setCedente(resultadoConsulta.getString("cedente"));

            retorno.add(titulo);
        }

        return retorno;
    }

    public Titulo consulta(int id) throws SQLException {
        Titulo retorno = new Titulo();
        String filtro = Integer.toString(id);
        String SQL = "SELECT dataCadastro, dataVencimento, valorTitulo, numeroParcela, "
                + "pendente, tipoTituloId, nomeTipoTitulo, categoriaId, nomeCategoria, subcategoriaId, nomeSubcategoria, pessoaId, nomeTitulo, idTitulo, cedente, nomePessoa"
                + " FROM TITULO "
                + "﻿inner join TIPOTITULO on tipoTituloId = TIPOTITULO.idTipoTitulo "
                + "inner join CATEGORIA on categoriaId = CATEGORIA.idCategoria "
                + "inner join SUBCATEGORIA on subcategoriaId = SUBCATEGORIA.idSubcategoria "
                + "inner join PESSOA on pessoaId = PESSOA.idPessoa "
                + "where lower(idTitulo) like ?";
        ResultSet resultadoConsulta = executarConsultaSQL(
                SQL, "%" + filtro.trim().toLowerCase() + "%");
        while (resultadoConsulta.next()) {
            Titulo titulo = new Titulo();

            titulo.setDataRealizacao(resultadoConsulta.getString("dataCadastro"));
            titulo.setDataVencimento(resultadoConsulta.getString("dataVencimento"));
            titulo.setValorTitulo(resultadoConsulta.getDouble("valorTitulo"));
            titulo.setNumeroParcela(resultadoConsulta.getInt("numeroParcela"));
            titulo.setPendente(resultadoConsulta.getString("pendente"));

            TipoTitulo tipo = new TipoTitulo();
            tipo.setIdTipoTitulo(resultadoConsulta.getInt("tipoTituloId"));
            tipo.setNomeTipoTitulo(resultadoConsulta.getString("nomeTipoTitulo"));
            titulo.setTipoTitulo(tipo);

            Categoria categoria = new Categoria();
            categoria.setIdCategoria(resultadoConsulta.getInt("categoriaId"));
            categoria.setNomeCategoria(resultadoConsulta.getString("nomeCategoria"));
            titulo.setCategoria(categoria);

            Subcategoria subcategoria = new Subcategoria();
            subcategoria.setIdSubcategoria(resultadoConsulta.getInt("subcategoriaId"));
            subcategoria.setNomeSubcategoria(resultadoConsulta.getString("nomeSubcategoria"));
            titulo.setSubCategoria(subcategoria);

            Pessoa pess = new Pessoa();
            pess.setIdPessoa(resultadoConsulta.getInt("pessoaId"));
            titulo.setPessoa(pess);
            pess.setNomePessoa(resultadoConsulta.getString("nomePessoa"));
            titulo.setPessoa(pess);

            titulo.setNomeTitulo(resultadoConsulta.getString("nomeTitulo"));
            titulo.setIdTitulo(resultadoConsulta.getInt("idTitulo"));
            titulo.setCedente(resultadoConsulta.getString("cedente"));

            retorno = titulo;
        }

        return retorno;
    }

}
