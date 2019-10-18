/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

public class FornecedorDao {

    public Fornecedor inserir(Fornecedor f) {
        return f;
    }

    public Boolean excluir(Fornecedor f) {
        return false;
    }

    public Boolean alterar(Fornecedor f) {
        return false;
    }

    public List<Fornecedor> SelecionarPeloNome(String n) {
        List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        return listaFornecedores;
    }
}
