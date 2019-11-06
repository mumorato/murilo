package pacote;

public class CamaroteSuperior extends IngressoVip{
    
    public CamaroteSuperior(double valorBase){
        super(valorBase);
        double valorSuperior = getValorTotal() +(getValorTotal()*0.2); 
        setValorTotal(valorSuperior);
    }

}