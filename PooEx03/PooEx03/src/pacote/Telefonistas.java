package pacote;

public class Telefonistas extends Funcionarios {

    private double gratificacao = 0;

    public Telefonistas (String nome, Double salarioBase){
        super (nome, salarioBase);
        setAdicional(gratificacao);

    }  
  
}