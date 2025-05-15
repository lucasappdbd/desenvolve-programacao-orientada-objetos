package com.mycompany.app;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArtigoTest {

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertEquals("tecnologia", artigo.getGenero());
    }

    @Test
    public void testIsPublicado() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertEquals(true, artigo.isPublicado());
    }

    @Test
    public void testValidarPublicacao() {
        Autor autor = new Autor("Brian Greene", "EUA", "tradicional");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
    }
    
}