package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private String tipoAutor;

    public Autor(String nome, String nacionalidade, String tipoAutor) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.tipoAutor = tipoAutor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTipoAutor() {
        return tipoAutor;
    }

    public List<Livro> getObrasPublicadas() {
        return getLivros(); // Usa o método herdado de Pessoa
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : getLivros()) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
}
