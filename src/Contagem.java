import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        // Utiliza try-with-resources para garantir o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que entre com um número inteiro
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Conta quantos dígitos o número possui
            int quantidadeDigitos = 0;
            int numeroTemp = numero;

            // Enquanto houver dígitos no número, incrementa o contador e remove o último dígito
            while (numeroTemp != 0) {
                quantidadeDigitos++;
                numeroTemp /= 10;
            }

            // Exibe o resultado
            System.out.println("O número " + numero + " possui " + quantidadeDigitos + " dígitos.");
        } // O Scanner será fechado automaticamente ao sair do bloco try
    }
}

