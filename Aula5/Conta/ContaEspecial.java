public class ContaEspecial extends ContaCorrente {
    private float credito;

    ContaEspecial(float credito) {
        super();
        this.credito = credito;
    }

    public void addCredito(float valor) {
        credito += valor;
        System.out.println("Credito adicionado! Credito: " + this.credito);
        System.out.println();
    }

    @Override
    public void sacar(float valor){
        if (valor <= this.saldo + this.credito) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo: " + this.saldo);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Saldo: " + this.saldo + " Credito: " + this.credito;
    }
}
