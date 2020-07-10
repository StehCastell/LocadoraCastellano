/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import locadora.connection.ConnectionFactory;
import locadora.interfaces.IDAO;
import locadora.model.Locacao;

/**
 *
 * @author steph
 */
public class LocacaoDAO implements IDAO<Locacao>{

    @Override
    public void salvar(Locacao objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO locacao (idcliente, idfilme, idtipovalor, datalocacao, datadevolucao) "
                   + "VALUES (?,?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);
            
        pst.setInt(1, objeto.getCliente().getId());
        pst.setInt(2, objeto.getFilme().getId());
        pst.setInt(3, objeto.getTipoValor().getId());
        pst.setObject(4, objeto.getDataLocacao());
        pst.setObject(5, objeto.getDataDevolucao());
        pst.execute();
    }

    @Override
    public void alterar(Locacao objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE locacao SET\n" +
                     "idcliente = ?,\n" +
                     "idfilme = ?,\n" +
                     "idtipovalor = ?,\n" +
                     "datalocacao = ?,\n" +
                     "datadevolucao = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getCliente().getId());
        pst.setInt(2, objeto.getFilme().getId());
        pst.setInt(3, objeto.getTipoValor().getId());
        pst.setObject(4, objeto.getDataLocacao());
        pst.setObject(5, objeto.getDataDevolucao());
        pst.setInt(6, objeto.getId());

        pst.execute();
    }

    @Override
    public void apagar(Locacao objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM locacao WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<Locacao> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM locacao;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Locacao> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Locacao locacao = new Locacao();
                locacao.setId(resultado.getInt("id"));
                locacao.setCliente(new ClienteDAO().buscarPeloId(resultado.getInt("idcliente")));
                locacao.setFilme(new FilmeDAO().buscarPeloId(resultado.getInt("idfilme")));
                locacao.setTipoValor(new TipoValorDAO().buscarPeloId(resultado.getInt("idtipovalor")));
                locacao.setDataLocacao(sdf.parse(resultado.getString("datalocacao")));
                locacao.setDataDevolucao(sdf.parse(resultado.getString("datadevolucao")));
                lista.add(locacao);
            } catch (ParseException ex) {
                
            }
        }
        return lista;
    }

    @Override
    public Locacao buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        try {
            Connection c = ConnectionFactory.getConnection();
            
            String sql = "SELECT * FROM locacao Where id = ? ;";
            
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setInt(1, id);
            
            ResultSet resultado = pst.executeQuery();
            
            Locacao locacao = new Locacao();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            if(resultado.next()){
                locacao.setId(resultado.getInt("id"));
                locacao.setCliente(new ClienteDAO().buscarPeloId(resultado.getInt("idcliente")));
                locacao.setFilme(new FilmeDAO().buscarPeloId(resultado.getInt("idfilme")));
                locacao.setTipoValor(new TipoValorDAO().buscarPeloId(resultado.getInt("idtipovalor")));
                locacao.setDataLocacao(sdf.parse(resultado.getString("datalocacao")));
                locacao.setDataDevolucao(sdf.parse(resultado.getString("datadevolucao")));
                return locacao;
            }
            else{
                return locacao;
            }
        } catch (ParseException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<Locacao> buscarPeloCliente(String cliente) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM locacao "
                + "inner join cliente on locacao.idcliente = cliente.id "
                + "Where cliente.nome like CONCAT( '%',?,'%');";
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, cliente);
        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Locacao> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Locacao locacao = new Locacao();
                locacao.setId(resultado.getInt("id"));
                locacao.setCliente(new ClienteDAO().buscarPeloId(resultado.getInt("idcliente")));
                locacao.setFilme(new FilmeDAO().buscarPeloId(resultado.getInt("idfilme")));
                locacao.setTipoValor(new TipoValorDAO().buscarPeloId(resultado.getInt("idtipovalor")));
                locacao.setDataLocacao(sdf.parse(resultado.getString("datalocacao")));
                locacao.setDataDevolucao(sdf.parse(resultado.getString("datadevolucao")));
                lista.add(locacao);
            } catch (ParseException ex) {
                
            }
        }
        return lista;
    }
}
