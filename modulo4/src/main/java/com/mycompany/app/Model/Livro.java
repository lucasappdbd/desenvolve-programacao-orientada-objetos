package com.mycompany.app.Model;

public class Livro extends Publicacao {
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        super(titulo, autor);
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void validarPublicacao() {
        // Lógica específica de validação para Livro
        System.out.println("Validando publicação de Livro...");
    }

    public void validarDisponibilidade() {
        if (disponivel) {
            System.out.println("O livro está disponível.");
        } else {
            System.out.println("O livro não está disponível.");
        }
    }

    public void emprestar() {
        validarDisponibilidade();
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
