
// Nome: Julia Andrade Silva
// Matricula: 1261933183
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite a nota do aluno (0 a 100): ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 100) {
                System.out.println("Erro: nota inválida. Digite novamente.");
            }
        } while (nota < 0 || nota > 100);

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 75) {
            System.out.println("Conceito: B");
        } else if (nota >= 60) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D (Reprovado)");
        }

        sc.close();
    }
}
