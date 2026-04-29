// Nome: Julia Andrade Silva RA: 1261933183
public class exercicio09_02 {

    public static int somarArray(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 3, 4, 5};
        int[] numeros2 = {10, 20, 30};

        System.out.println("Soma: " + somarArray(numeros1));
        System.out.println("Soma: " + somarArray(numeros2));
    }
}
