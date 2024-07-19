import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        int numeroprimo = 1; // Assume que o número é primo de inicio
        // Verifica se o número é divisível por algum número além de 1 e ele mesmo
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numeroprimo = 0;
                break; }
        }
        if (numero <= 2) {
            numeroprimo = 0;
        }

        if (numeroprimo == 2) {
            System.out.println(numero + " é um numero primo.");
        } else {
            System.out.println(numero + " não é um numero primo.");
        }

        scanner.close();
    }
}
