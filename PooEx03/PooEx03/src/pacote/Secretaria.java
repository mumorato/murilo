package pacote;

public class Secretaria extends Funcionarios {

    private double gratificacao = 600;

    public Secretaria (String nome, Double salarioBase){
        super (nome, salarioBase);
        setAdicional(gratificacao);
    }  
    
}