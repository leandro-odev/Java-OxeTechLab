public class ContaCorrente {
    float saldo = 0;

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depositado! Saldo: " + this.saldo);
        System.out.println();

    }

    public void sacar(float valor) {
        saldo -= valor;
        System.out.println();
    }

    public String toString() {
        return "Saldo: " + this.saldo;
    }
}