package Aula6.parte1;

public class Secretaria extends Funcionario {
    String variavel;

    Secretaria(String nome, String cpf, double salario, String dataEntrada, String variavel){
        super(nome, cpf, salario, dataEntrada);
        this.variavel = variavel;
    }
}
