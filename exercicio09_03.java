// Nome: Julia Andrade Silva RA: 1261933183
public class exercicio09_03 {
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 1};
        int maior = encontrarMaior(numeros);

        System.out.println("Maior valor: " + maior);
    }
}
