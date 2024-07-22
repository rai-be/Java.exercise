import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = scanner.nextInt();

        boolean Primo = verificarPrimo(numero);

        System.out.println("O número " + numero + " é um numero primo? " + Primo);

        scanner.close();
    }

    // verificando se um numero é primo
    public static boolean verificarPrimo(int num) {
        // Caso especial: 0 e 1 não são primos
        if ( num <= 1) {
            return false;
        }

        // Verificando se numero pode ser dividido por algum número além de 1 e ele mesmo
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // Encontrou um divisor além de 1 e num, portanto não é primo
            }
        }

        return true; // Não encontrou nenhum divisor além de 1 e num, portanto é primo
    }
}
