/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import locadora.enums.EGenero;

/**
 *
 * @author steph
 */
public class Filme {
    private int id;
    private String nome;
    private int ano;
    private EGenero genero;
    private boolean disponivel;

    public Filme() {
    }

    public Filme(int id, String nome, int ano, EGenero genero, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public EGenero getGenero() {
        return genero;
    }

    public void setGenero(EGenero genero) {
        this.genero = genero;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }    
}
