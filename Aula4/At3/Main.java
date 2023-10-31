package At3;

public class Main {
    public static void main(String[] args) {
        String[] materias = {"Matemática", "Português"};
        Professor professor = new Professor("João", 30, "123456789-00", "Aulas", 2000, materias);
        Faxineiro faxineiro = new Faxineiro("José", 40, "987654321-00", "Limpeza", 1000, 8);
        Aluno aluno = new Aluno("Maria", 20, "123456789-00", new float[]{0, 0, 0, 0});

        System.out.println("Professor:");
        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("CPF: " + professor.cpf);
        System.out.println("Departamento: " + professor.departamento);
        System.out.println("Salário: " + professor.salario);
        System.out.println("Matérias: " + professor.materias[0] + ", " + professor.materias[1]);
        System.out.println("Renda anual: " + professor.getRendaAnual());
        professor.ensinarMateria();
        System.out.println();

        System.out.println("Faxineiro:");
        System.out.println("Nome: " + faxineiro.nome);
        System.out.println("Idade: " + faxineiro.idade);
        System.out.println("CPF: " + faxineiro.cpf);
        System.out.println("Departamento: " + faxineiro.departamento);
        System.out.println("Salário: " + faxineiro.salario);
        System.out.println("Horas trabalhadas: " + faxineiro.horasTrabalhadas);
        System.out.println("Horas semanais: " + faxineiro.getHorasSemanais());
        System.out.println("Renda anual: " + faxineiro.getRendaAnual());
        System.out.println();

        System.out.println("Aluno:");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("CPF: " + aluno.cpf);
        System.out.println("Status: " + aluno.getStatus());
        System.out.println("Notas: " + aluno.notas[0] + ", " + aluno.notas[1] + ", " + aluno.notas[2] + ", " + aluno.notas[3]);
    }
}
