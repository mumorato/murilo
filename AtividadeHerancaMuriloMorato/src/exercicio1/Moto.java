package exercicio1;



public class Moto extends Veiculo{

    private double imposto=0.3;
    
    public Moto(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
        double precoTotal = precoBase+(precoBase*imposto);
        setPrecoTotal(precoTotal);
    }
    
    
}
