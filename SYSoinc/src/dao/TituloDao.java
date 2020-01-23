package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Titulo;

public class TituloDao extends Dao<Titulo> {

    @Override
    public void inserir(Titulo titulo) throws SQLException {
        String SQL = "insert into TITULO (dataCadastro, dataVencimento, valorTitulo, numeroParcela, pendente, tipoTituloId, categoriaId, subCategoriaId, pessoaId, nomeTitulo) values (?,?,?,?,?,?,?,?,?,?);";
        executarConsultaDML(SQL,
                //titulo.getIdTitulo(),
                titulo.getDataRealizacao(),
                titulo.getDataVencimento(),
                titulo.getValorTitulo(),
                titulo.getNumeroParcela(),
                titulo.getPendente(),
                titulo.getTipoTitulo(),
                titulo.getCategoriaId(),
                titulo.getSubCategoriaId(),
                titulo.getPessoaId(),
                titulo.getNomeTitulo()
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
                + " pessoaId = ?, nomeTitulo = ? where idTitulo = ?";
        executarConsultaDML(SQL,
                titulo.getDataRealizacao(),
                titulo.getDataVencimento(),
                titulo.getValorTitulo(),
                titulo.getNumeroParcela(),
                titulo.getPendente(),
                titulo.getTipoTitulo(),
                titulo.getCategoriaId(),
                titulo.getSubCategoriaId(),
                titulo.getPessoaId(),
                titulo.getNomeTitulo(),
                titulo.getIdTitulo()
        );
    }

    public ArrayList<Titulo> pesquisar(String filtro) throws SQLException {
        ArrayList<Titulo> retorno = new ArrayList<>();

        String SQL = "SELECT dataCadastro, dataVencimento, valorTitulo, numeroParcela, "
                + "pendente, tipoTituloId, categoriaId, subcategoriaId, pessoaId, nomeTitulo, idTitulo FROM TITULO "
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
            titulo.setPendente(resultadoConsulta.getInt("pendente"));
            titulo.setTipoTitulo(resultadoConsulta.getInt("tipoTituloId"));
            titulo.setCategoriaId(resultadoConsulta.getInt("categoriaId"));
            titulo.setSubCategoriaId(resultadoConsulta.getInt("subcategoriaId"));
            titulo.setPessoaId(resultadoConsulta.getInt("pessoaId"));
            titulo.setNomeTitulo(resultadoConsulta.getString("nomeTitulo"));
            titulo.setIdTitulo(resultadoConsulta.getInt("idTitulo"));
            //falta adicionar campos de herança
            retorno.add(titulo);
        }

        return retorno;
    }

}
