/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author steph
 */
public interface IDAO<O> {
    public void salvar(O objeto)  throws SQLException, ClassNotFoundException;
    public void alterar(O objeto)  throws SQLException, ClassNotFoundException;
    public void apagar(O objeto)  throws SQLException, ClassNotFoundException;
    public ArrayList<O> buscarTodos()  throws SQLException, ClassNotFoundException;
    public O buscarPeloId(int id)  throws SQLException, ClassNotFoundException;
}
