/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author macbook
 */
public class ProdutoTableModel extends AbstractTableModel {

    // array linhas da tabela
    private List<Produto> dados = new ArrayList<>();
    //vetor das colunas
    private String[] colunas = {"Descrição", "Quantidade", "Valor"};

    @Override
    public String getColumnName(int Column) {
        //identifica as colunas
        return colunas[Column];
    }

    @Override
    public int getRowCount() {
        //informando tamanho da lista de linhas
        return dados.size();

    }

    @Override
    public int getColumnCount() {
        //informando numero de colunas
        return colunas.length;

    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        // pegando a colunaXlinha do campo selecionado da tabela
        //case = (coluna). Return get (linha) da tabela.
        switch (coluna) {
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQtd();
            case 2:
                return dados.get(linha).getValor();

        }
        return null;

    }

    public void addRow(Produto p) {
        this.dados.add(p);
        this.fireTableDataChanged(); //evento de atualizar tabela sempre que for add algo    
    }
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);//evento de atualizar tabela sempre que delete linha
        
    }
    
    
    
}


