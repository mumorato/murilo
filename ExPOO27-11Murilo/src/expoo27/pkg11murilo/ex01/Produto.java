package expoo27.pkg11murilo.ex01;


public class Produto implements Imprimivel{

    private String nome;
    private String marca;

    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

     @Override
    public void imprimirDados() {
         System.out.println("");
    }   
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



}
