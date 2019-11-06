package exercicio1;



public class Carro extends Veiculo{

    private double imposto=0.1;
    
    public Carro(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
        double precoTotal = precoBase+(precoBase*imposto);
        setPrecoTotal(precoTotal);
    }
    
    
}
