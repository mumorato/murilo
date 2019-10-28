package br.com.ifprbiopark.sistfinanceiro;
public class Categoria {

 private int id;
 private String nome;
 private boolean registroAtivo;

 
 
 
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

    public boolean getRegistroAtivo() {
        return registroAtivo;
    }

    public void setRegistroAtivo(boolean registroAtivo) {
        this.registroAtivo = registroAtivo;
    }
    

}