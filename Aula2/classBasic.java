package Aula2;
import Aula2.src.*;

public class classBasic {
    public static void main(String[] args) {
        Pessoa sandro = new Pessoa(); 

        sandro.nome = "sandro";
        sandro.altura = 1.75;
        System.out.println(sandro.nome);
        sandro.falar("vasco da grana");
        sandro.andar(3);
    }
}
