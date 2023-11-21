package atv2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora");
        System.out.println("Escolha a operacao: ");
        System.out.println("+, -, *, /");
        String op;
        op = input.nextLine();
        while (op != "+" || op != "-" || op != "*" || op != "/") {
            System.out.println("Operação errada, digite novamente: ");
            op = input.nextLine();
        }

        Double n1;
        Double n2;
        Double resultado;
        n1 = input.nextDouble();
        n2 = input.nextDouble();

        switch (op) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            default:
                resultado = 0.0;
        
        System.out.println("Resultado: " + resultado);

        }

    }
}
