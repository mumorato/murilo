package exercicio1;



public class Veiculo {
 
    private String marca;
    private String modelo;
    private double precoBase;
    private double precoTotal;
    
    public Veiculo (String marca, String modelo, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
    }
    
    

        public void imprimeDados(){
        System.out.println("Modelo: "+modelo+"/ marca: "+marca+"/ preco base: "+precoBase+"/ preco venda: "+precoTotal);
        
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
       
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    
    
    
    
    

    
    
    
}
