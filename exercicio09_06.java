// Nome: Julia Andrade Silva RA: 1261933183
import java.util.Scanner;

public class exercicio09_06 {
    public static void exibirNotas(double[] notas) {
        System.out.println("--- Notas da Turma ---");

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Aluno %d: %.1f%n", i + 1, notas[i]);
        }
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public static double encontrarMaior(double[] notas) {
        double maior = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        return maior;
    }

    public static int contarAprovados(double[] notas) {
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6.0) {
                aprovados++;
            }
        }

        return aprovados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("=== Sistema de Notas ===");

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();

                if (notas[i] > 10) {
                    System.out.println("Nota invalida. Digite uma nota de 0 a 10.");
                }
            } while (notas[i] > 10);
        }

        exibirNotas(notas);
        System.out.printf("Media da turma: %.2f%n", calcularMedia(notas));
        System.out.printf("Maior nota: %.1f%n", encontrarMaior(notas));
        System.out.println("Alunos aprovados: " + contarAprovados(notas));

        scanner.close();
    }
}
