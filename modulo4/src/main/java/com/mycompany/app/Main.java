package com.mycompany.app;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;
import com.mycompany.app.Model.Artigo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar autor
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional"); // Cadastra um autor
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true); // Cadastra um Livro
        livro.validarDisponibilidade(); // Valida disponibilidade do livro
        Usuario usuario = new Usuario("Lucas Aparecido", 30); // Cadastra um usuário
        Date dataAtual = new Date();

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        
        Emprestimo emprestimo = new Emprestimo(dataAtual, dataAtual, livro, usuario); // Realiza o empréstimo

        // Verifica se o livro está disponível
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Usuario: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Data de Retirada: " + dataAtual.toString());
            System.out.println("Data de Devolucao: " + dataAtual.toString());
        }

        System.out.println("Artigo publicado:");
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Genero: " + artigo.getGenero());
        System.out.println("Publicado: " + artigo.isPublicado());
    }
}
