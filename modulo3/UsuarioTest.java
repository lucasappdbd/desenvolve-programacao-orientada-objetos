package com.mycompany.app;

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
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA"), "Científico");
        Emprestimo emprestimo = new Emprestimo(new java.util.Date(), new java.util.Date(), livro, usuario);

        assertTrue(usuario.getHistoricoEmprestimos().contains(emprestimo));
    }
}