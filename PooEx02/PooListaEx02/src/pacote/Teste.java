package pacote;


public class Teste {
    
    public static void main(String[] args) {

    Pessoa pessoa1 = new PessoaFisica("murilo","123456789");
    pessoa1.imprimeDados();

    Pessoa pessoa2 = new PessoaJuridica("Companhia LTDA","123456789123456");
    //System.out.println(", nome: "+pessoa2.getNome());
    pessoa2.imprimeDados();
}

 


}