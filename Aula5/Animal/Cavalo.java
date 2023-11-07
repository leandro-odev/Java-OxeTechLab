public class Cavalo extends Animal{
    Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O vasco, é CAMPEÃO DA COPA DO BRASIL 2011!");
    }
}
