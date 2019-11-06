package pacote;

public class Gerente extends Funcionarios {

    private double gratificacao = 3000;

    public Gerente (String nome, Double salarioBase){
        super (nome, salarioBase);
        setAdicional(gratificacao);
    }  
  
}