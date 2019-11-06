package pacote;

public class Ingresso{

    private double valorBase;
    private double valorTotal;
    
    public Ingresso(double valorBase){
        this.valorBase=valorBase;
    }

    public void ImprimeDados(){
        System.out.println("Custo do ingresso: R$"+getValorTotal());
    }


    /**
     * @return double return the valorBase
     */
    public double getValorBase() {
        return valorBase;
    }

    /**
     * @param valorBase the valorBase to set
     */
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    /**
     * @return double return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}