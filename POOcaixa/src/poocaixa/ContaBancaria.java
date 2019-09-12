
package poocaixa;
public class ContaBancaria {
    private int quantiaDinheiro;
    private int numeroSaques;
    private int numeroDepositos;


    public ContaBancaria(int quantiaDinheiro) {
        this.quantiaDinheiro = quantiaDinheiro;
    }
    
    public int getQuantiaDinheiro() {
        return quantiaDinheiro;
    }


    public int getNumeroSaques() {
        return numeroSaques;
    }


    public int getNumeroDepositos() {
        return numeroDepositos;
    }

    
    void sacar(int vlinserido){
    quantiaDinheiro -=  vlinserido;
    numeroSaques ++; 
    }
    void depositar(int vlinserido){
    quantiaDinheiro +=  vlinserido;
    numeroDepositos ++;
    }
    
}
