public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som de animal");
    }

    public void acao() {
        System.out.println("Correndo...");
    }
}