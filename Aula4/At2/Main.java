package At2;

public class Main {
    public static void main(String[] args) {
        Gato tico = new Gato("Tico", "Mau Egípicio");
        Cachorro c = new Cachorro("Winston", "Husky Siberiano");
        
        tico.caminhar();
        tico.miar();
        System.out.println(tico.getRaca());

        c.caminhar();
        c.latir();
        System.out.println(c.getRaca());
    }
}