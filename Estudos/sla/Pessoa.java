public class Pessoa {
    public String nome;
    public int idade;

    Pessoa(String nomee, int idadee) {
        this.nome = nomee;
        this.idade = idadee;
    }

    public static void falar(){
        System.out.println("Falando...");
    }
}