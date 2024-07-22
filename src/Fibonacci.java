import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // programa vai pedir para o usuario colocar um numero, usuario coloca um numero, e aperta enter.
        System.out.print("Digite um numero: ");
        // Programa armazena esse numero em memoria.
        int numeroDigitado = scanner.nextInt();



        // Iniciar uma lista.
        ArrayList<Integer> numerosFibonacci= new ArrayList();
        // programa saiba que fibonacci começa em 0.
        int numeroFibonacciInicial = 0;
        // saber o ultimo numero que eu somei.
        int ultimoNumeroSomado = 1;
        //resultado da ultima soma.
        int resultadoDaUltimaSoma = 0;
        // inicia o loop
        for(int i = 0; i < numeroDigitado; i++){
            // Programa precisa add o ultimo resultado na lista.
            numerosFibonacci.add(resultadoDaUltimaSoma);
            // Fazer a nova soma.
            int novaSoma = ultimoNumeroSomado + resultadoDaUltimaSoma;
            // Se a nova soma for maior que o numero digitado, então quebra o loop.
            if (novaSoma >= numeroDigitado){
                break;
            }

            // E vou reatribuir o valor do ultimo numero somado, e do ultimo resultado.
            ultimoNumeroSomado = resultadoDaUltimaSoma;
            resultadoDaUltimaSoma = novaSoma;
            // Repito esse processo até chegar no numero digitado.
        }

        // imprimir a lista ao usuario.
        System.out.println(numerosFibonacci);

//        for (int i = 0; i <)
    }

}


//● Descrição: Escreva um programa que imprima os primeiros n números da série de
//Fibonacci.
//● Exemplo de entrada: 5
//● Exemplo de saída: 0, 1, 1, 2, 3