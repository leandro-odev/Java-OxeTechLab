public class Cachorro extends Animal {
    
    Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
