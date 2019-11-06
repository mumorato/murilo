package exercicio2;

public class Juridica extends Pessoa {

    public Juridica(String nome, double rendimento) {
        super(nome, rendimento);

        double impostoTotal = (rendimento * 0.15);
        setImpostoTotal(impostoTotal);

    }

}
