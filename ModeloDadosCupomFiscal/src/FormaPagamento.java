
import java.util.ArrayList;

public class FormaPagamento {

    private int vendaId;
    private String nome;
    private ArrayList<VendaFormaPagamento> vendaPagamentos;
    
    
    

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<VendaFormaPagamento> getVendaPagamentos() {
        return vendaPagamentos;
    }

    public void setVendaPagamentos(ArrayList<VendaFormaPagamento> vendaPagamentos) {
        this.vendaPagamentos = vendaPagamentos;
    }

}
