package com.mycompany.app;

import com.mycompany.app.Model.*;
import com.mycompany.app.Interfaces.*;

public class TestePublicacao {
    public static void main(String[] args) {
        UsuarioDecorator autor = new UsuarioDecorator();

        // Publicando como artigo
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar();

        // Publicando como livro
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();
    }
}