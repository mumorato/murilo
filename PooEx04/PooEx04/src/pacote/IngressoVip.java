package pacote;

public class IngressoVip extends Ingresso{

    private double valorAdd = 0.3;

    public IngressoVip(double valorBase){
        super(valorBase);
        double valorTotal = valorBase+(valorBase*valorAdd);
        setValorTotal(valorTotal);
    }


}