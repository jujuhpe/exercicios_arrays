
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: R$ ");
                    double deposito = sc.nextDouble();

                    if (deposito < 0) {
                        System.out.println("Valor inválido. Não é permitido depósito negativo.");
                    } else {
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;

                case 2:
                    System.out.print("Valor do saque: R$ ");
                    double saque = sc.nextDouble();

                    if (saque < 0) {
                        System.out.println("Valor inválido. Não é permitido saque negativo.");
                    } else if (saque > saldo) {
                        System.out.printf("Saldo insuficiente. Saldo disponível: R$ %.2f%n", saldo);
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 0:
                    System.out.println("Obrigado. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
