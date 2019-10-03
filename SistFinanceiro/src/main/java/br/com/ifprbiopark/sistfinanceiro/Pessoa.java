package br.com.ifprbiopark.sistfinanceiro;
public class Pessoa {
    private int id;
    private String nome;
    private String tipoPessoa;
    private String cpfCnpj;
    private String telefone;
    private String endereco;
    private String bairro;
    private int enderecoNum;
    private int cliente;
    private int fornecedor;
    private int registroAtivo;

    private Cidade cidade;



// GETTERS E SETTERS---------------
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return String return the tipoPessoa
     */
    public String getTipoPessoa() {
        return tipoPessoa;
    }

    /**
     * @param tipoPessoa the tipoPessoa to set
     */
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    /**
     * @return String return the cpfCnpj
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * @param cpfCnpj the cpfCnpj to set
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return int return the enderecoNum
     */
    public int getEnderecoNum() {
        return enderecoNum;
    }

    /**
     * @param enderecoNum the enderecoNum to set
     */
    public void setEnderecoNum(int enderecoNum) {
        this.enderecoNum = enderecoNum;
    }

    /**
     * @return int return the cliente
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    /**
     * @return int return the fornecedor
     */
    public int getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return int return the registroAtivo
     */
    public int getRegistroAtivo() {
        return registroAtivo;
    }

    /**
     * @param registroAtivo the registroAtivo to set
     */
    public void setRegistroAtivo(int registroAtivo) {
        this.registroAtivo = registroAtivo;
    }

    /**
     * @return Cidade return the cidade
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}