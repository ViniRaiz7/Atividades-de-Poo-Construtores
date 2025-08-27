public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade +
            ", Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
    }
}
