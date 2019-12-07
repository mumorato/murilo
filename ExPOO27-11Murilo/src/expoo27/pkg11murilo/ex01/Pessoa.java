package expoo27.pkg11murilo.ex01;


public class Pessoa implements Imprimivel{

    private String nome;
    private String Sobrenome;

    public Pessoa(String nome, String Sobrenome) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
    }  
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }


    @Override
    public void imprimirDados() {
        System.out.println("nome: "+nome);
        System.out.println("sobrenome: "+Sobrenome);
    }
}
