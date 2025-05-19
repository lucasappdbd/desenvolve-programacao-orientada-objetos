package com.mycompany.app.Model;

import com.mycompany.app.Interfaces.EstrategiaPublicacao;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {
    public void publicar() {
        System.out.println("Publicando Artigo ...");
    }
}
