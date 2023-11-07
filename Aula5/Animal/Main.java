public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("Juan", 10);
        Preguica preguica = new Preguica("Atacante do vasco", 5);
        Cachorro cachorro = new Cachorro("Winton", 3);

        cavalo.emitirSom();
        cavalo.acao();

        preguica.emitirSom();
        preguica.acao();

        cachorro.emitirSom();
        cachorro.acao();
    }
}
