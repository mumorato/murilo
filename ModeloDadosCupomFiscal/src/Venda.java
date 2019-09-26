
import java.util.ArrayList;
import java.util.Date;


public class Venda {

    private int id;
    private Date dataVenda;
    private int numero;
    private int serie;
    private String chaveNF;
    private Date dataProtocolo;
    private float desconto;
    private Empresa empresa;
    private ArrayList<ProdutoVenda> itensVenda;
    private ArrayList<VendaFormaPagamento> pagamentos;

    
    
    
    
    
    
    
    public ArrayList<VendaFormaPagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<VendaFormaPagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
   
    public ArrayList<ProdutoVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ProdutoVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getChaveNF() {
        return chaveNF;
    }

    public void setChaveNF(String chaveNF) {
        this.chaveNF = chaveNF;
    }

    public Date getDataProtocolo() {
        return dataProtocolo;
    }

    public void setDataProtocolo(Date dataProtocolo) {
        this.dataProtocolo = dataProtocolo;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    

    
}
