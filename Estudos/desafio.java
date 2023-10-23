package Estudos;

import java.util.Scanner;

public class desafio {

    public static void print_str(String variavel) {
        System.out.println(variavel);
        return;
    }

    public static void print_int(int variavel) {
        System.out.println(variavel);
        return;
    }

    public static void print_float(float variavel) {
        System.out.print(variavel);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "Leandro";
        String tipo_conta = "Tipo vascaino";
        float saldo = 0;
        int op = 0;
        while(op != 4) {
            print_str("***********");
            print_str("** Digite sua opção **\n1 - Consultar saldo\n2 - Transferir valor\n3 - Receber valor\n4 - Sair");
            op = input.nextInt();
            if(op == 1) {
                print_str(nome + " | " + tipo_conta + " | " + saldo);
                print_str("Operação finalizada");
            }
            else if(op == 2) {
                float valor = input.nextFloat();
                if(valor > saldo) {
                    print_str("Valor que você deseja transferir é maior do que possui na conta. Transferência cancelada!");
                }
                else {
                    saldo -= valor;
                    print_str("O valor de "+valor+" foi transferido,  agora você possui "+saldo);
                }
                print_str("Operação finalizada");
            }
            else if(op == 3) {
                float valor = input.nextFloat();
                saldo += valor;
                print_str("Você acabou de inserir "+valor+" na sua conta, agora você possui "+saldo+" na conta.");
                
                print_str("Operação finalizada");
            }
            else if(op != 4) {
                print_str("Opção inválida, digite uma opção válida.");
            }
            else {
                print_str("Obrigado por utilizar meu aplicativo!");
            }
        }
        
        input.close();
    }
}
