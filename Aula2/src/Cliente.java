package Aula2.src;

public class Cliente {
    String nome;
    String cpf;
    int iterador = 0;
    int [] contas = new int [3];

    Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addConta(int numero) {
        if (iterador >= 3) {
            System.out.println("Numero de conta passou do limite");
        }
        else {
            contas[this.iterador] = numero;
            this.iterador++;
            System.out.println("Conta adicionada");
        }
    }

    public void removConta() {
        
    }
}
