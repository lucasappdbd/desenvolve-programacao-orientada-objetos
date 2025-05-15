package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private int idade;
    private List<Emprestimo> historicoEmprestimos = new ArrayList<>();

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }
}
