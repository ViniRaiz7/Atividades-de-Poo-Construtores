public class Biblioteca {
    private Livro[] livros;
    private int quantidade;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        quantidade = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (quantidade < livros.length) {
            livros[quantidade++] = livro;
        } else {
            System.out.println("Biblioteca cheia!");
        }
    }

    public void mostrarLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < quantidade; i++) {
            Livro livro = livros[i];
            String status = livro.isEmprestado() ? "Emprestado" : "Disponível";
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " (" + status + ")");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            Livro livro = livros[i];
            if (livro.getTitulo().equals(titulo) && !livro.isEmprestado()) {
                livro.emprestar();
                System.out.println("Livro emprestado: " + titulo);
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo: " + titulo);
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            Livro livro = livros[i];
            if (livro.getTitulo().equals(titulo) && livro.isEmprestado()) {
                livro.devolver();
                System.out.println("Livro devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro não está emprestado: " + titulo);
    }
}
