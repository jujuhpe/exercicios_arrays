
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        double valor, resultado;

        while (opcao != 0) {
            System.out.println("=== CONVERSOR DE UNIDADES ===");
            System.out.println("1 - Quilometros para Milhas");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Quilogramas para Libras");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a distancia em quilometros: ");
                    valor = scanner.nextDouble();
                    resultado = valor * 0.621371;
                    System.out.println(valor + " km = " + resultado + " milhas");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Celsius: ");
                    valor = scanner.nextDouble();
                    resultado = (valor * 9 / 5) + 32;
                    System.out.println(valor + " C = " + resultado + " F");
                    break;

                case 3:
                    System.out.print("Digite o peso em quilogramas: ");
                    valor = scanner.nextDouble();
                    resultado = valor * 2.20462;
                    System.out.println(valor + " kg = " + resultado + " libras");
                    break;

                case 0:
                    System.out.println("Encerrando. Ate logo!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

            System.out.println();
        }

        scanner.close();
    }
}
