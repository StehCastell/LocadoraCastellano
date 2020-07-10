/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.connection.ConnectionFactory;
import locadora.interfaces.IDAO;
import locadora.model.TipoValor;

/**
 *
 * @author steph
 */
public class TipoValorDAO implements IDAO<TipoValor>{

    @Override
    public void salvar(TipoValor objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO tipovalor (descricao, valor) VALUES (?,?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getDescricao());
        pst.setDouble(2, objeto.getValor());

        pst.execute();
    }

    @Override
    public void alterar(TipoValor objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE tipovalor SET\n" +
                     "descricao = ?,\n" +
                     "valor = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getDescricao());
        pst.setDouble(2, objeto.getValor());
        pst.setInt(3, objeto.getId());

        pst.execute();
    }

    @Override
    public void apagar(TipoValor objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM tipovalor WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<TipoValor> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM tipovalor;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<TipoValor> lista = new ArrayList<>();

        while (resultado.next()) {
            TipoValor tipovalor = new TipoValor();
            tipovalor.setId(resultado.getInt("id"));
            tipovalor.setDescricao(resultado.getString("descricao"));
            tipovalor.setValor(resultado.getDouble("valor"));
            lista.add(tipovalor);
        }
        return lista;
    }

    @Override
    public TipoValor buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM tipovalor Where id = ? ;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet resultado = pst.executeQuery();
        
        TipoValor tipovalor = new TipoValor();
        if(resultado.next()){
            tipovalor.setId(resultado.getInt("id"));
            tipovalor.setDescricao(resultado.getString("descricao"));
            tipovalor.setValor(resultado.getDouble("valor"));
            return tipovalor;
        }
        else{
            return tipovalor;
        }
    }
    
    public TipoValor buscarPelaDescricao(String descricao) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM tipovalor Where descricao like CONCAT( '%',?,'%');";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, descricao);

        ResultSet resultado = pst.executeQuery();
        
        TipoValor tipovalor = new TipoValor();
        
        if(resultado.next()){
            tipovalor.setId(resultado.getInt("id"));
            tipovalor.setDescricao(resultado.getString("descricao"));
            tipovalor.setValor(resultado.getDouble("valor"));
            return tipovalor;
        }
        else{
            return tipovalor;
        }
    }
}