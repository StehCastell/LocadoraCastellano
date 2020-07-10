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
import locadora.model.Cliente;
import locadora.interfaces.IDAO;

/**
 *
 * @author steph
 */
public class ClienteDAO implements IDAO<Cliente>{

    @Override
    public void salvar(Cliente objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO cliente (cpf, nome, endereco) VALUES (?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getCpf());
        pst.setString(2, objeto.getNome());
        pst.setString(3, objeto.getEndereco());

        pst.execute();
    }

    @Override
    public void alterar(Cliente objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE cliente SET\n" +
                     "cpf = ?,\n" +
                     "nome = ?,\n" +
                     "endereco = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getCpf());
        pst.setString(2, objeto.getNome());
        pst.setString(3, objeto.getEndereco());
        pst.setInt(4, objeto.getId());

        pst.execute();
    }

    @Override
    public void apagar(Cliente objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM cliente WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<Cliente> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM cliente;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Cliente> lista = new ArrayList<>();

        while (resultado.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultado.getInt("id"));
            cliente.setCpf(resultado.getString("cpf"));
            cliente.setNome(resultado.getString("nome"));
            cliente.setEndereco(resultado.getString("endereco")); 
            lista.add(cliente);
        }
        return lista;
    }

    @Override
    public Cliente buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM cliente Where id = ? ;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet resultado = pst.executeQuery();
        
        Cliente cliente = new Cliente();
        if(resultado.next()){
            cliente.setId(resultado.getInt("id"));
            cliente.setCpf(resultado.getString("cpf"));
            cliente.setNome(resultado.getString("nome"));
            cliente.setEndereco(resultado.getString("endereco"));        
            return cliente;
        }
        else{
            return cliente;
        }
    }
    
    public Cliente buscarPeloCPF(String cpf) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM cliente Where cpf = ? ;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, cpf);

        ResultSet resultado = pst.executeQuery();
        
        Cliente cliente = new Cliente();
        
        if(resultado.next()){
            cliente.setId(resultado.getInt("id"));
            cliente.setCpf(resultado.getString("cpf"));
            cliente.setNome(resultado.getString("nome"));
            cliente.setEndereco(resultado.getString("endereco"));        
            return cliente;
        }
        else{
            return cliente;
        }
    }
}