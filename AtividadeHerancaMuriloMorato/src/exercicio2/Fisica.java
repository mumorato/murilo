package exercicio2;

public class Fisica extends Pessoa {

    public Fisica(String nome, double rendimento) {
        super(nome, rendimento);
        
        calculoPf(rendimento);
        double impostoTotal = (rendimento * getTaxaImposto());
        setImpostoTotal(impostoTotal);
        
    }
    
        public void calculoPf(double rendimento) {

        if (rendimento >= 1.90399 || rendimento <= 2.82665) {
            setTaxaImposto(0.075);
        } else if (rendimento >= 282666 || rendimento <= 375105) {
            setTaxaImposto(0.15);
        } else if (rendimento >= 375106 || rendimento <= 466468) {
            setTaxaImposto(0.225);
        } else if (rendimento > 466468) {
            setTaxaImposto(0.275);
        }
    }
}
