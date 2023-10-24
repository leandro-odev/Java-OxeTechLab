package Aula2;
import Aula2.src.contaBancaria;


public class banco {
    public static void main(String[] args) {
        contaBancaria vasco = new contaBancaria(1, 100);
        System.out.println(vasco.extrato());
        vasco.depositar(100);
        vasco.sacar(200);
        System.out.println(vasco.extrato());


    }
}
