package At3;

public class Faxineiro extends Funcionario {
    int horasTrabalhadas;

    public Faxineiro(String nome, int idade, String cpf, String departamento, float salario, int horasTrabalhadas) {
        super(nome, idade, cpf, departamento, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasSemanais() {
        return horasTrabalhadas*5;
    }
    
}
