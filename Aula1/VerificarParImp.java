import java.util.Scanner;

public class VerificarParImp {
    public static void main(String[] abs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        if (num%2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
        input.close();
    }
}
