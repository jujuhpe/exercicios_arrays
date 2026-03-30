
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int multiplicador = 1;

        System.out.print("Digite o número: ");
        numero = scanner.nextInt();

        while (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        }

        scanner.close();
    }
}
