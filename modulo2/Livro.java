public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel = true;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        autor.adicionarLivro(this); // Adiciona à lista de obras do autor
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade() {
        if (!disponivel) {
            throw new IllegalStateException("Livro não está disponível.");
        }
    }

    public void emprestar() {
        validarDisponibilidade();
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
