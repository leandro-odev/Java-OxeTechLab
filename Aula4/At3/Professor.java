package At3;

public class Professor extends Funcionario {
    String[] materias = new String[2];

    public Professor(String nome, int idade, String cpf, String departamento, float salario, String[] materias) {
        super(nome, idade, cpf, departamento, salario);
        this.materias = materias;
    }

    public void ensinarMateria() {
        System.out.println("Ensinando metéria.");
    }
}
