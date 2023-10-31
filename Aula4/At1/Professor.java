package At1;

public class Professor extends Pessoa {
    
    private float salario;
    
    public Professor (String nome) {
        super(nome);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDado() {
        return this.getNome() + " recebe " + this.getSalario() + " de salário";
    }
}