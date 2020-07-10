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
import locadora.enums.EGenero;
import locadora.interfaces.IDAO;
import locadora.model.Filme;

/**
 *
 * @author steph
 */
public class FilmeDAO implements IDAO<Filme>{

    @Override
    public void salvar(Filme objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO filme (nome, ano, genero, disponivel) VALUES (?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getNome());
        pst.setInt(2, objeto.getAno());
        pst.setString(3, objeto.getGenero().toString());
        pst.setBoolean(4, objeto.getDisponivel());

        pst.execute();
    }

    @Override
    public void alterar(Filme objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE filme SET\n" +
                     "nome = ?,\n" +
                     "ano = ?,\n" +
                     "genero = ?,\n" +
                     "disponivel = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getNome());
        pst.setInt(2, objeto.getAno());
        pst.setString(3, objeto.getGenero().toString());
        pst.setBoolean(4, objeto.getDisponivel());
        pst.setInt(5, objeto.getId());

        pst.execute();
    }

    @Override
    public void apagar(Filme objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM filme WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<Filme> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM filme;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Filme> lista = new ArrayList<>();

        while (resultado.next()) {
            Filme filme = new Filme();
            filme.setId(resultado.getInt("id"));
            filme.setNome(resultado.getString("nome"));
            filme.setAno(resultado.getInt("ano"));
            filme.setGenero(EGenero.valueOf(resultado.getString("genero"))); 
            filme.setDisponivel(resultado.getBoolean("disponivel")); 
            lista.add(filme);
        }
        return lista;
    }

    @Override
    public Filme buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM filme Where id = ? ;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet resultado = pst.executeQuery();
        
        Filme filme = new Filme();
        if(resultado.next()){
            filme.setId(resultado.getInt("id"));
            filme.setNome(resultado.getString("nome"));
            filme.setAno(resultado.getInt("ano"));
            filme.setGenero(EGenero.valueOf(resultado.getString("genero"))); 
            filme.setDisponivel(resultado.getBoolean("disponivel"));       
            return filme;
        }
        else{
            return filme;
        } 
    }

    public Filme buscarPeloNome(String nome) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM filme Where nome like CONCAT( '%',?,'%');";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, nome);

        ResultSet resultado = pst.executeQuery();
        
        Filme filme = new Filme();
        
        if(resultado.next()){
            filme.setId(resultado.getInt("id"));
            filme.setNome(resultado.getString("nome"));
            filme.setAno(resultado.getInt("ano"));
            filme.setGenero(EGenero.valueOf(resultado.getString("genero"))); 
            filme.setDisponivel(resultado.getBoolean("disponivel"));       
            return filme;
        }
        else{
            return filme;
        }
    }    
}
