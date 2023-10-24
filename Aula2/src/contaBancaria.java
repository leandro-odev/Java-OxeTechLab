package Aula2.src;

public class contaBancaria {
    public int numero;
    public double saldo;

    public contaBancaria(int id, int saldos) {
        this.numero = id;
        this.saldo = saldos;
    }

    public String extrato() {
        return ""+this.saldo;
    }

    public void sacar(int valor) {
        if (valor > saldo) {
            System.out.println("Não foi possivel terminar. Valor maior do que tem no saldo.");
        }
        else {
            saldo -= valor;
            System.out.println("Valor sacado");
        }   
    }

    public void depositar(int valor) {
        saldo += valor;
        System.out.println("Valor depositado");
    }

}
