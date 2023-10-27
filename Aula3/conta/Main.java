public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(1000);
        System.out.println(conta.getSaldo());
        
        System.out.println(conta.getTitular());
        conta.setTitular("Leandro");
        System.out.println(conta.getTitular());
    }
}
