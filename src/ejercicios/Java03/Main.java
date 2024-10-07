package ejercicios.Java03;

import ejercicios.Entradas;

public class Main {
    public static void main(String[] args) {

        Entradas entrada = new Entradas();

        // Ejercicio 5
        Conteo conteo = new Conteo();
        System.out.println(conteo.contar());

        // Ejercicio 12
        Fibonacci fibonacci = new Fibonacci();

        int numero = entrada.entradaNumero();
        System.out.println(fibonacci.fibonacci(numero));

        // Ejercicio 19
        Piramide piramide = new Piramide();
        int altura = entrada.entradaNumero("Introduce la altura de la piramide: ");
        char caracter = entrada.entradaTexto("Introduce el caracter de la piramide: ").charAt(0);

        piramide.imprimirPiramide(altura, caracter).forEach(System.out::println);

    }
}