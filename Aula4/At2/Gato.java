package At2;

public class Gato extends Animal {
    public Gato(String nomeString, String racString) {
        this.nome = nomeString;
        this.raca = racString;
    }

    public void miar() {
        System.out.println(this.nome + " mia no quarto, " + this.nome + " mia na sala, " + this.nome + " mia no carro.");
    }
}
