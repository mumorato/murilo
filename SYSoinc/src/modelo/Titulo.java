package modelo;

public class Titulo {

    private int idTitulo;
    private String nomeTitulo;
    private int tipoTitulo;
    private String dataRealizacao;
    private String dataVencimento;
    private Double valorTitulo;
    private int numeroParcela;
    private int pendente;
    private int pessoaId;
    private int categoriaId;
    private int subCategoriaId;
    private String cedente;
    
    // precisa corrigir o banco. Alterar tipagem das colunas.
    //para parcela, fazer um IF e dividir vlTotal/qtdParcelas, depois laço FOR[qtdParcelas]

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
     * @return int return the pendente
     */
    public int getPendente() {
        return pendente;
    }

    /**
     * @param pendente the pendente to set
     */
    public void setPendente(int pendente) {
        this.pendente = pendente;
    }

    /**
     * @return int return the tipoTitulo
     */
    public int getTipoTitulo() {
        return tipoTitulo;
    }

    /**
     * @param tipoTitulo the tipoTitulo to set
     */
    public void setTipoTitulo(int tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }

    /**
     * @return int return the categoriaId
     */
    public int getCategoriaId() {
        return categoriaId;
    }

    /**
     * @param categoriaId the categoriaId to set
     */
    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    /**
     * @return int return the subCategoriaId
     */
    public int getSubCategoriaId() {
        return subCategoriaId;
    }

    /**
     * @param subCategoriaId the subCategoriaId to set
     */
    public void setSubCategoriaId(int subCategoriaId) {
        this.subCategoriaId = subCategoriaId;
    }

    /**
     * @return int return the pessoaId
     */
    public int getPessoaId() {
        return pessoaId;
    }

    /**
     * @param pessoaId the pessoaId to set
     */
    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
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

}
