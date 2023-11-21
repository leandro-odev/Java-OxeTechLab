package atv1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = null;
        String cpf = null;
        int idade;

        try {
            System.out.println("Digite o nome:");
            nome = input.nextLine();
            
            System.out.println("Digite o idade: ");
            idade = input.nextInt();

            System.out.println("Digite o cpf: ");
            input.nextLine();
            cpf = input.nextLine();
            System.out.println(nome + " " + idade + " " + cpf);
        }
        catch(InputMismatchException e) {
            System.out.println("Erro: Tipo de dado inserido diferente.");
        }
        catch(NullPointerException e) {
            System.out.println("Erro: Dado com valor nulo.");
        }
    }
}