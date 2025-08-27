public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Produto X", 15.0);
        produto.setNome("Produto A");
        try {
            produto.setPreco(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        produto.setPreco(20.0);
        System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());

        Endereco endereco1 = new Endereco("Cremação", 123);
        Endereco endereco2 = new Endereco("Terra Firme", 456);
        Pessoa pessoa1 = new Pessoa("Vini", 20, endereco1);
        Pessoa pessoa2 = new Pessoa("Lis", 18, endereco2);
        pessoa1.mostrarDados();
        pessoa2.mostrarDados();

        Biblioteca biblioteca = new Biblioteca(5);
        Livro livro1 = new Livro("Livro A", "Autor A");
        Livro livro2 = new Livro("Livro B", "Autor B");
        Livro livro3 = new Livro("Livro C", "Autor C");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("Livro A");
        biblioteca.mostrarLivros();
        biblioteca.devolverLivro("Livro A");
        biblioteca.mostrarLivros();
    }
}
