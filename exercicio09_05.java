// Nome: Julia Andrade Silva RA: 1261933183
public class exercicio09_05 {
    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20};
        double media = calcularMedia(numeros);

        System.out.printf("Media: %.2f%n", media);
    }
}
