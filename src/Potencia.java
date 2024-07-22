

public class Potencia {
    public static void main (String[] args) {
        int base = 2;
        int expoente = 3;
        int potencia = 1;

        for (int i = 0; i < expoente; i++) {
            potencia = potencia * base;
        }

        System.out.println(potencia);
    }
}
