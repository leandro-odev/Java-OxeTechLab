package Aula6.parte1;

public class Vendedor extends Funcionario{
    String variavel;

    Vendedor(String nome, String cpf, double salario, String dataEntrada, String variavel){
        super(nome, cpf, salario, dataEntrada);
        this.variavel = variavel;
    }
}
