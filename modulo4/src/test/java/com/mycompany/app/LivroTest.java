package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;

import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        assertEquals("O Universo Elegante", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        assertEquals("Científico", livro.getGenero());
    }

    @Test
    public void testDisponibilidadeInicial() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testEmprestarLivro() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testDevolverLivro() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        livro.emprestar();
        livro.devolver();
        assertTrue(livro.isDisponivel());
    }
}