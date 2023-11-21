package Aula6.parte1;

public class Gerente extends Funcionario {
    String setor;
    int numeroDeFuncionariosGerenciados;

    Gerente(String nome, String cpf, double salario, String dataEntrada, String setor, int numeroDeFuncionariosGerenciados){
        super(nome, cpf, salario, dataEntrada);
        this.setor = setor;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
