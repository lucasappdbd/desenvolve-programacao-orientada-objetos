package com.mycompany.app.Model;

public abstract class Publicacao {
    private String titulo;
    private Autor autor;

    public Publicacao(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
// Método abstrato para ser implementado pelas subclasses
    public abstract void validarPublicacao();
}
