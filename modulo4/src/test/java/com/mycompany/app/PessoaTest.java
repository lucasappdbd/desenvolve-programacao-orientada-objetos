package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa();
    // Define um nome para a pessoa
    pessoa.setNome("Jess");
    // Verifica se o nome retornado é o mesmo que foi setado
    assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testSetNome() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa();
        // Define um nome para a pessoa
        pessoa.setNome("Jess");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }

    // @Test
    // public void testGetLivros() {
        // Cria uma instância da classe Pessoa
        // Pessoa pessoa = new Pessoa();

        // Define uma lista de livros para a pessoa
        // Livro[] livros = new Livro;
        // livros = new Livro("Livro 1");
        // livros = new Livro("Livro 2");
        // pessoa.setLivros(livros);

        // Verifica se a lista de livros retornado é a mesma que foi definida
        // assertArrayEquals(livros, pessoa.getLivros());
    }
