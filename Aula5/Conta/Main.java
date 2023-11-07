public class Main {
    public static void main(String[] args) {
        ContaEspecial conta = new ContaEspecial(100);
        conta.depositar(100);
        conta.sacar(200);
        conta.sacar(200);
        conta.addCredito(100);
        conta.sacar(100);
        System.out.println(conta);
        
    }
}
