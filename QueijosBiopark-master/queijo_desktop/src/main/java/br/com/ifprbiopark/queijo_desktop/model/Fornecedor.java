package br.com.ifprbiopark.queijo_desktop.model;

public class Fornecedor {
    private int id;
    private String nome;

    public Fornecedor() {
        id = 0;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
