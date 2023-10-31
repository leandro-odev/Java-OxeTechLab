package At1;

public class Main {
    public static void main(String[] args) {
        // Pessoa leandro = new Pessoa("Leandro");
        // System.out.println("leandro nome: " + leandro.getNome());
        
        Professor p1 = new Professor("Ulpio");
        p1.setSalario(1000000);
        Aluno a1 = new Aluno("Zeca PO");
        a1.setMatricula("69");

        System.out.println(p1.getDado());
        System.out.println(a1.getDado());

    }
}
