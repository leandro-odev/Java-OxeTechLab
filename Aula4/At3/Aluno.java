package At3;

public class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nomeString, int idadeInt, String cpString, String matriculaString) {
        this.nome = nomeString;
        this.idade = idadeInt;
        this.cpf = cpString;
        this.matricula = matriculaString;
    }
}
