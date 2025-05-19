package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Pessoa;

import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class EmprestimoTest {

    @Test
    public void testGetDataRetirada() {
        Usuario usuario = new Usuario("Maria", 30);
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA", "tradicional"), "Científico", true);
        Date retirada = new Date();
        Date devolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(retirada, devolucao, livro, usuario);
        assertEquals(retirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        Usuario usuario = new Usuario("Maria", 30);
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA", "tradicional"), "Científico", true);
        Date retirada = new Date();
        Date devolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(retirada, devolucao, livro, usuario);
        assertEquals(devolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivro() {
        Usuario usuario = new Usuario("Maria", 30);
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA", "tradicional"), "Científico", true);
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        assertEquals(livro, emprestimo.getLivro());
    }

    @Test
    public void testGetUsuario() {
        Usuario usuario = new Usuario("Maria", 30);
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA", "tradicional"), "Científico", true);
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testDevolverLivro() {
        Usuario usuario = new Usuario("Maria", 30);
        Livro livro = new Livro("O Universo Elegante", new Autor("Brian Greene", "EUA", "tradicional"), "Científico", true);
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.devolverLivro();
        assertTrue(livro.isDisponivel());
    }
}