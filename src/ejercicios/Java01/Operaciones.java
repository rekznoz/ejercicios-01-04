package ejercicios.Java01;

public class Operaciones {

    public static int sumar(int x, int y) {
        return x + y;
    }

    public static int restar(int x, int y) {
        return x - y;
    }

    public static int multiplicar(int x, int y) {
        return x * y;
    }

    public static double dividir(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Imposible dividir entre cero");
        }
        return (double) x / y;
    }

}