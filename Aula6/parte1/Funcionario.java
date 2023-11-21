package Aula6.parte1;

public class Funcionario implements Autenticar {

    String nome;
    String cpf;
    double salario;
    String dataEntrada;

    Funcionario(String nome, String cpf, double salario, String dataEntrada){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
    }

    public void autentica(){
        System.out.println("Autenticando funcionário...");
    }

    void recebePagamento(double valor){
        this.salario += valor;
    }
}