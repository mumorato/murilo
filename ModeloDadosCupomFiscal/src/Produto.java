
import java.util.ArrayList;

public class Produto {

private String nome;
private float preco;
private int codigo;
private String unidade;
private ArrayList<ProdutoVenda> produtosVenda;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public ArrayList<ProdutoVenda> getProdutosVenda() {
        return produtosVenda;
    }

    public void setProdutosVenda(ArrayList<ProdutoVenda> produtosVenda) {
        this.produtosVenda = produtosVenda;
    }


    
}
