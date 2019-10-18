/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.Dados;
import java.util.List;
import model.Cidade;
import model.Estado;

/**
 *
 * @author macbook
 */
public class CidadeEstadoController {

    public List<Estado> getEstados() {

        Dados dados = new Dados();
        List<Estado> listaEstados = dados.getEstados();
        return listaEstados;
    }



    public List<Cidade> getCidades(int selectedIndex) {
        Dados dados = new Dados();
        List<Cidade> listaCidades = dados.getCidades(selectedIndex);
        return listaCidades;

    }

}
