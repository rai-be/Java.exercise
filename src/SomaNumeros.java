import java.util.Scanner; // importar biblioteca scanner, input

public class SomaNumeros { // Classe padrão
    public static void main(String[] args) { // Metodo padrão
        int n = scanner("Digite um valor:").nextInt(); // recebendo valor int, scanner (input) nextInt (como vai retornar o valor inteiro)
        int soma = 0; // Uma variavel vazia para receber o valor do calculo
        for (int i = 1; i <= n; i++) {
            soma += i; // laço de repetição (1) Primeira execução:
            //i = 1
           // n = 5
           // soma = 0 + 1 ou seja, 1
          //  i = 1 + 1 ou seja, 2)
        } System.out.println(soma); //Este é um comando em Java usado para exibir dados no console.
        // O System.out refere-se à saída padrão do sistema, que geralmente é o console ou a tela onde o programa está sendo executado.
        // O método println é usado para imprimir uma linha de texto ou o valor de uma variável.
    } public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
