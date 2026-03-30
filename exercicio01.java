
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inteiro;
        System.out.println("Digite um numero inteiro:  ");
        inteiro = scanner.nextInt();
        if ((inteiro % 2 == 0)) {
            System.out.printf("%d é par", inteiro);
        } else {
            System.out.printf("%d é impar", inteiro);
        }
        scanner.close();

    }
}