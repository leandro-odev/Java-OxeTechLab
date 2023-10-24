import java.util.Scanner;

public class repeticao {

    public static void print_str(String variavel) {
        System.out.println(variavel);
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        switch (dia) {
            case 0:
                System.out.println("Bom domingo");
                break;
            case 1:
                System.out.println("Boa segunda");
                break;
            case 2:
                System.out.println("Boa terça");
                break;
            case 3:
                System.out.println("Boa quarta");
                break;
            case 4:
                System.out.println("Boa quinta");
                break;
            case 5:
                System.out.println("Boa sexta");
                break;
            case 6:
                System.out.println("Bom sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }   

        input.close();
    }
}
