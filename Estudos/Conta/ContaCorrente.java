public class ContaCorrente {
    float saldo = 0;

    public void depositar(float valor) {
        saldo += valor;
    }

    public String sacar(float valor) {
        saldo -= valor;
        return "Saque realizado com sucesso!";
    }
}