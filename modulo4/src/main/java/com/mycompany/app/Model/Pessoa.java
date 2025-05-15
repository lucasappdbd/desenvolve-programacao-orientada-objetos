package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }


    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}
