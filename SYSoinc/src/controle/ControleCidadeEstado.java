/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.CidadeEstadoDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;
import modelo.Estado;

/**
 *
 * @author macbook
 */
public class ControleCidadeEstado {

    List<Estado> listaEstados;

    public List<Estado> getEstados() {

        CidadeEstadoDao dados = new CidadeEstadoDao();
        try {
            listaEstados = dados.getEstados();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCidadeEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEstados;
    }

    public List<Cidade> getCidades(int selectedIndex) throws SQLException {
        CidadeEstadoDao dados = new CidadeEstadoDao();
        List<Cidade> listaCidades = dados.getCidades(selectedIndex);
        return listaCidades;

    }
}
