package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        assertEquals("EUA", autor.getNacionalidade());
    }

    @Test
    public void testGetTipoAutor() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        assertEquals("tradicional", autor.getTipoAutor());
    }

    @Test
    public void testGetObrasPublicadas() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Livro livro = new Livro("O Universo Elegante", autor, "Científico", true);
        List<Livro> obras = autor.getObrasPublicadas();
        assertTrue(obras.contains(livro));
    }

    @Test
    public void testGetObrasPublicadasPorGenero() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        new Livro("O Universo Elegante", autor, "Científico", true);
        new Livro("Teoria das Cordas", autor, "Teórico", true);

        List<Livro> cientificos = autor.getObrasPublicadasPorGenero("Científico");
        assertEquals(1, cientificos.size());
        assertEquals("O Universo Elegante", cientificos.get(0).getTitulo());
    }
}