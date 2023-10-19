import java.util.Scanner;

public class mediaNumeros {
    public static void main(String[] abs) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float media = (num1 + num2 + num3) / 3;
        if (media > 7) {
            System.out.println("Média maior que 7, " + media);
        }
        else if (media == 7) {
            System.out.println("Média igual a 7, " + media);
        }
        else {
            System.out.println("Média menor que 7, " + media);
        }
        
        input.close();
    }
}
