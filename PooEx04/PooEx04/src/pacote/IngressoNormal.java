package pacote;

public class IngressoNormal extends Ingresso{

    private double valorAdd=0;
    
    public IngressoNormal(double valorBase){
        super(valorBase);
        double valorTotal = valorBase+(valorBase*valorAdd);
        setValorTotal(valorTotal);
    }


}