
import java.util.ArrayList;
import java.util.Set;


public class Programa {
 
    public static void main(String[] args) {
        
        Empresa empresa  = new Empresa();
        empresa.setNome("Tabajara ltda");
        
        Produto p1 = new Produto();
        p1.setNome("Abacate");
        p1.setUnidade("UN");
        p1.setPreco(2.9f);
        
        Produto p2 = new Produto();
        p2.setNome("Cerveja Colonia");
        p2.setUnidade("UN");
        p2.setPreco(1.2f);
        
        
        FormaPagamento dinheiro = new FormaPagamento();
        dinheiro.setNome("Dinheiro");
        
        FormaPagamento cartao = new FormaPagamento();
        cartao.setNome("Cartao");
        
        
        // cadastrando a venda:
        
        Venda venda = new Venda();
        venda.setNumero(1);       
        
        ArrayList<ProdutoVenda> itens = new ArrayList<>();
        ProdutoVenda item1 = new ProdutoVenda();
        item1.setProduto(p1);
        item1.setQuantidade(2);
        item1.setValorUnitario(p1.getPreco());
        
        ProdutoVenda item2 = new ProdutoVenda();
        item1.setProduto(p2);
        item1.setQuantidade(1);
        item1.setValorUnitario(p2.getPreco());
        
        venda.setItensVenda(itens);
        
        ArrayList<VendaFormaPagamento> pagamentosVenda = new ArrayList<>();
        VendaFormaPagamento pagamento = new VendaFormaPagamento();
        pagamento.setFormaPagamento(dinheiro);
        pagamentosVenda.add(pagamento);
        venda.setPagamentos(pagamentosVenda);
        
        
        
    }
    
}
