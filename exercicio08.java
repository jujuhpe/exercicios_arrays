
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 42;
        int tentativa = 1;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número secreto (1 a 100).");

        while (tentativa <= 5) {
            System.out.print("Tentativa " + tentativa + ": ");
            int chute = sc.nextInt();

            if (chute == numeroSecreto) {
                System.out.println("Parabéns! Você acertou na tentativa " + tentativa + "!");
                acertou = true;
                break;
            } else if (chute < numeroSecreto) {
                System.out.println("Muito baixo. Tente um número maior.");
            } else {
                System.out.println("Muito alto. Tente um número menor.");
            }

            tentativa++;
        }

        if (!acertou) {
            System.out.println("Você não acertou. O número secreto era " + numeroSecreto + ".");
        }

        sc.close();
    }
}
