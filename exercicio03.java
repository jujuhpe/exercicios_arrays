
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;
        int operacao;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Operações: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
        System.out.print("Escolha: ");
        operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.printf("Resultado: %.2f%n", numero1 + numero2);
                break;

            case 2:
                System.out.printf("Resultado: %.2f%n", numero1 - numero2);
                break;

            case 3:
                System.out.printf("Resultado: %.2f%n", numero1 * numero2);
                break;

            case 4:
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    System.out.printf("Resultado: %.2f%n", numero1 / numero2);
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
