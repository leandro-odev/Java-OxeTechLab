package At2;

public abstract class Animal {
    String nome;
    String raca;

    public void caminhar() {
        System.out.println(this.nome + " está caminhando...");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
}
