package pacote;


public class Pessoa {

private String nome;
private String tipo;

public Pessoa(String nome){
this.nome = nome;
}


public void imprimeDados(){

    System.out.println("nome: "+nome+" tipo: "+tipo);
}




    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

