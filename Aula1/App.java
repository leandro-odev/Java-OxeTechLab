import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        String numero = input.nextLine();
        System.out.println("Olá " + numero);
        // if (numero == 1998) {
        //     System.out.println("I'm fine, Vasco Won!!");
        // }
        // else {
        //     System.out.println("I'm not fine, Vasco Lost :^(");
        // }
        
        input.close();
    }
}

