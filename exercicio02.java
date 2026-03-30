// Nome: Julia Andrade Silva
// Matricula: 1261933183

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Lado A:");
        ladoA = scanner.nextInt();
        System.out.println("Lado B:");
        ladoB = scanner.nextInt();
        System.out.println("Lado C:");
        ladoC = scanner.nextInt();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilatero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("Isoceles");
        } else {
            System.out.println("Escaleno");
        }

        scanner.close();
    }
}
