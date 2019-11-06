package pacote;


public class PessoaFisica extends Pessoa {

private String cpf;

public PessoaFisica (String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
    setTipo("fisica");
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}