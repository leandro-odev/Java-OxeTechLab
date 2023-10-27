public class Conta {
    private int numeroConta = 0;
    private float saldo;
    private String titular;

    Conta () {
        this.saldo = 0;
        this.numeroConta += 1;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(float deposito) {
        saldo += deposito;
        System.out.println("Depositando R$"+deposito);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
