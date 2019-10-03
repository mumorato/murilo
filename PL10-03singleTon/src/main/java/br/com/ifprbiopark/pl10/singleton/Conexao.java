package br.com.ifprbiopark.pl10.singleton;

public class Conexao {

    private static Conexao instancia; //atributo static da classConexao, para saber se há instancia de conexao 

    private Conexao() {
    }

    public static Conexao getInstance() { //método que instancia obj, para saber se há conexao;
        if (instancia == null) {
            instancia = new Conexao();
        }

        return instancia;

    }

}
