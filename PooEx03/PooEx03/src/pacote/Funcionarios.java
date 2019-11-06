package pacote;

public class Funcionarios{

    private String nome;
    private double salarioBase;
    private double Adicional;    
    private double salarioCompleto;

    
    public Funcionarios (String nome, Double salarioBase){
    this.nome = nome;
    this.salarioBase = salarioBase;
    }

    public void imprimeDados(){

        System.out.println("nome: "+nome+"; sal.Base: "+salarioBase+"; sal.total: "+ getSalarioCompleto());
    }


    
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return double return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    /**
     * @return double return the Adicional
     */
    public double getAdicional() {
        return Adicional;
    }

    /**
     * @param Adicional the Adicional to set
     */
    public void setAdicional(double Adicional) {
        this.Adicional = Adicional;
    }

    /**
     * @return double return the salarioCompleto
     */
    public double getSalarioCompleto() {
        salarioCompleto=(salarioBase+Adicional);
        return salarioCompleto;
    }

    /**
     * @param salarioCompleto the salarioCompleto to set
     */
    public void setSalarioCompleto(double salarioCompleto) {
        this.salarioCompleto = salarioCompleto;
    }

}