package At2;

public class Cachorro extends Animal {
    public Cachorro(String nomeString, String racaString) {
        this.nome = nomeString;
        this.raca = racaString;
    }

    public void latir() {
        System.out.println(this.nome + " está latindo...");
    }
}
