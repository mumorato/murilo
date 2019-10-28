package br.com.ifprbiopark.sistfinanceiro;
import java.util.*;

public class Titulo {
   private int id;
   private int numeroTitulo;
   private int numeroParcela;
   private Date dataCadastro;
   private Date dataVencimento;
   private int valor;
   private int pendente;
   private boolean registroAtivo;
//objetos
   private TipoTitulo tipoTitulo;
   private Pessoa pessoa;
   private Categoria categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(int numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPendente() {
        return pendente;
    }

    public void setPendente(int pendente) {
        this.pendente = pendente;
    }

    public boolean getRegistroAtivo() {
        return registroAtivo;
    }

    public void setRegistroAtivo(boolean registroAtivo) {
        this.registroAtivo = registroAtivo;
    }

    public TipoTitulo getTipoTitulo() {
        return tipoTitulo;
    }

    public void setTipoTitulo(TipoTitulo tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


}