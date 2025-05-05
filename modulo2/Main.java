import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar autor
        Autor autor = new Autor("Brian Greene", "EUA"); // Cadastra um autor
        Livro livro = new Livro("O Universo Elegante", autor, "Científico"); // Cadastra um Livro
        Usuario usuario = new Usuario("Lucas Aparecido", 30); // Cadastra um usuário
        Date dataAtual = new Date();
        
        Emprestimo emprestimo = new Emprestimo(dataAtual, dataAtual, livro, usuario); // Realiza o empréstimo

        // Verifica se o livro está disponível
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Usuario: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Data de Retirada: " + dataAtual.toString());
            System.out.println("Data de Devolucao: " + dataAtual.toString());
        }
    }
}
