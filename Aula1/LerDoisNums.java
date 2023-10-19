import java.util.Scanner;

public class LerDoisNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();
        System.out.println("Soma entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1 + numero2));
        System.out.println("Produto entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1 * numero2));
        System.out.println("Diferença entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1 - numero2));
        System.out.println("Média entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1 + numero2)/2);
        System.out.println("Razão entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1/numero2));
        System.out.println("Resto entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1%numero2));
        
        input.close();
    }
}
