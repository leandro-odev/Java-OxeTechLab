package Aula2.src;

public class Pessoa {

    public String nome;
    public int idade;
    public String profissao;
    public double altura;

    public void falar(String frase) {
        System.out.println(frase);
    }

    public void andar(int passos) {
        System.out.println("Andando. " + passos + " passos.");
    }
}
