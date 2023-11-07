public class Preguica extends Animal {
    Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("ZzzZzzzzZZZZZzzz (Ta dormindo)");
    }

    @Override
    public void acao() {
        System.out.println("Subindo em arvores...");
    }
}
