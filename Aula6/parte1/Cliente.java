package Aula6.parte1;

public class Cliente implements Autenticar {
    String nome;
    String cpf;
    String endereco;
    String dataNascimento;
    String variavel;

    Cliente(String nome, String cpf, String endereco, String dataNascimento, String variavel){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.variavel = variavel;
    }

    public void autentica(){
        System.out.println("Autenticando cliente...");
    }
}
