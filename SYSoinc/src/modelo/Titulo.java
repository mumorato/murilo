package modelo;

public class Titulo {

    private int idTitulo;
    private String nomeTitulo;
    private String dataRealizacao;
    private String dataVencimento;
    private Double valorTitulo;
    private int numeroParcela;
    private String pendente;
    private String cedente;

    private Pessoa pessoa;
    private Categoria categoria;
    private Subcategoria subCategoria;
    private TipoTitulo tipoTitulo;
    

    //para parcela, fazer um IF e dividir vlTotal/qtdParcelas, depois laço FOR[qtdParcelas]
    
    
    public TipoTitulo getTipoTitulo() {
        return tipoTitulo;
    }

    public void setTipoTitulo(TipoTitulo tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Subcategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(Subcategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getCedente() {
        return cedente;
    }

    public void setCedente(String cedente) {
        this.cedente = cedente;
    }

    /**
     * @return int return the idTitulo
     */
    public int getIdTitulo() {
        return idTitulo;
    }

    /**
     * @param idTitulo the idTitulo to set
     */
    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    /**
     * @return String return the dataVencimento
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return Double return the valorTitulo
     */
    public Double getValorTitulo() {
        return valorTitulo;
    }

    /**
     * @param valorTitulo the valorTitulo to set
     */
    public void setValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    /**
     * @return int return the numeroParcela
     */
    public int getNumeroParcela() {
        return numeroParcela;
    }

    /**
     * @param numeroParcela the numeroParcela to set
     */
    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    /**
     * @return String return the nomeTitulo
     */
    public String getNomeTitulo() {
        return nomeTitulo;
    }

    /**
     * @param nomeTitulo the nomeTitulo to set
     */
    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    public String getPendente() {
        return pendente;
    }

    public void setPendente(String pendente) {
        this.pendente = pendente;
    }
    

}
