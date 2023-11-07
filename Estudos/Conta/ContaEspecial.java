public class ContaEspecial extends ContaCorrente {
    private float credito;

    public ContaEspecial(float credito) {
        this.credito = credito;
    }
    
    @Override
    public String sacar(float valor) {
        if (valor <= saldo + credito) {
            saldo -= valor;
            return "Saque realizado com sucesso!";
        } else {
            return "Saldo insuficiente!";
        }
    }

    public void aumentarLimite(float valor) {
        credito = valor;
    }
    
}
