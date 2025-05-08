package com.mycompany.app;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Brian Greene", "EUA");
        assertEquals("EUA", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadas() {
        Autor autor = new Autor("Brian Greene", "EUA");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico");
        List<Livro> obras = autor.getObrasPublicadas();
        assertTrue(obras.contains(livro));
    }

    @Test
    public void testGetObrasPublicadasPorGenero() {
        Autor autor = new Autor("Brian Greene", "EUA");
        new Livro("O Universo Elegante", autor, "Científico");
        new Livro("Teoria das Cordas", autor, "Teórico");

        List<Livro> cientificos = autor.getObrasPublicadasPorGenero("Científico");
        assertEquals(1, cientificos.size());
        assertEquals("O Universo Elegante", cientificos.get(0).getTitulo());
    }
}