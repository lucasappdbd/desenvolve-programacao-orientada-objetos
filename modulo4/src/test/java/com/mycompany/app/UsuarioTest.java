package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Lucas", 30);
        assertEquals(30, usuario.getIdade());
    }

    @Test
    public void testAdicionarEmprestimo() {
        Usuario usuario = new Usuario("Lucas", 30);
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA", "tradicional"), "Científico", true);
        Emprestimo emprestimo = new Emprestimo(new java.util.Date(), new java.util.Date(), livro, usuario);

        assertTrue(usuario.getHistoricoEmprestimos().contains(emprestimo));
    }
}