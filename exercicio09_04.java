// Nome: Julia Andrade Silva RA: 1261933183
public class exercicio09_04 {
    public static int contarPares(int[] numeros) {
        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int quantidadePares = contarPares(numeros);

        System.out.println("Quantidade de pares: " + quantidadePares);
    }
}
