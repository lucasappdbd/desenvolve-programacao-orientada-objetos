package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        assertEquals("O Universo Elegante", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        assertEquals("Científico", livro.getGenero());
    }

    @Test
    public void testDisponibilidadeInicial() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testEmprestarLivro() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testDevolverLivro() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        livro.emprestar();
        livro.devolver();
        assertTrue(livro.isDisponivel());
    }
}