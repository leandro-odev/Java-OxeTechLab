package At1;

public class Aluno extends Pessoa {

    private String matricula;
    
    public Aluno (String nome) {
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDado() {
        return this.getNome() + " tem a matrícula " + this.getMatricula();
    }
}