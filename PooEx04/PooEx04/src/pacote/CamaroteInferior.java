package pacote;

public class CamaroteInferior extends IngressoVip{
    
    public CamaroteInferior(double valorBase){
        super(valorBase);
        double valorInferior = getValorTotal() +(getValorTotal()*0.1); 
        setValorTotal(valorInferior);
    }

}