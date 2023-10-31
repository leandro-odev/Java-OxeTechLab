package At3;

public class Funcionario extends Pessoa {
    String departamento;
    float salario;

    public Funcionario(String nome, int idade, String cpf, String departamento, float salario) {
        super(nome, idade, cpf);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getRendaAnual() {
        return salario*12;
    }

}
