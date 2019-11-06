package exercicio2;

public class Pessoa {

    private String nome;
    private double rendimento;
    private double impostoTotal;
    private double taxaImposto;

    public Pessoa(String nome, double rendimento) {
        this.nome = nome;
        this.rendimento = rendimento;
    }


    public void imprimeDados() {
        System.out.println("nome: "+nome+" IR devido: R$"+impostoTotal);

    }

    public double getTaxaImposto() {

        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public double getImpostoTotal() {
        return impostoTotal;
    }

    public void setImpostoTotal(double impostoTotal) {
        this.impostoTotal = impostoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

}
