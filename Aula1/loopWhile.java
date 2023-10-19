import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (true) {
            int numero = input.nextInt();
            if (numero == -1) {
                System.out.println(i + " números foram digitados");
                break;
            }
            i++;
        }

        input.close();
    }
}
