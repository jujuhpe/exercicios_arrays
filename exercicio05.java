
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        while (numero != 0) {
            System.out.print("Digite um número (0 para encerrar): ");
            numero = scanner.nextInt();
            soma = soma + numero;
        }

        System.out.println("Soma total: " + soma);
        scanner.close();
    }
}
