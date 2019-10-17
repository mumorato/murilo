
public class TesteEx6 {

    public static void main(String[] args) {
        Pessoa bisavo = new Pessoa();
        bisavo.setNome("Roberto");
        bisavo.setIdade(102);

        Pessoa avo = new Pessoa();
        avo.setNome("Zacarias");
        avo.setIdade(82);

        Pessoa pai = new Pessoa();
        pai.setNome("Aldo");
        pai.setIdade(63);

        Pessoa eu = new Pessoa();
        eu.setNome("Murilo");
        eu.setIdade(29);

        eu.setPai(pai);
        avo.setPai(bisavo);

        
        System.out.println("");
    }

}
