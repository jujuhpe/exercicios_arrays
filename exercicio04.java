
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o N:");
        numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Valor invalido. N deve ser maior que zero.");
        } else {
            int resultado = numero - 1;

            while (resultado >= 0) {
                System.out.println(resultado);
                resultado--;
            }

            System.out.println("Contagem concluida!");
        }

        scanner.close();
    }
}
