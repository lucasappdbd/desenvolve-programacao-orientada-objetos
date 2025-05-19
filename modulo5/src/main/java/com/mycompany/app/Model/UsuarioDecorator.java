package com.mycompany.app.Model;

import com.mycompany.app.Interfaces.*;

public class UsuarioDecorator implements PublicavelInterface {
    private EstrategiaPublicacao estrategiaPublicacao;

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Estratégia de publicação não definida.");
        }
    }
}