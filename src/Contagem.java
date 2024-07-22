import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um numero inteiro: ");
            int numero = scanner.nextInt();
            int quantidade = 0;
            int numeroTemp = numero;


            while (numeroTemp != 0) {
                quantidade++;
                numeroTemp /= 10;
            }
            System.out.println("O número " + numero + " possui " + quantidade + " dígitos.");
        }
    }
}

