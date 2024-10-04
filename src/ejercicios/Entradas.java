package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entradas {
    Scanner scanner = new Scanner(System.in);

    // Integer
    public Integer entradaNumero(String mensaje) {
        int numero = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Numero no valido");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }
    // Sobrecarga Integer
    public Integer entradaNumero() {
        return entradaNumero("Introduce un numero: ");
    }

    //Double
    public Double entradaDecimal(String mensaje) {
        double numero = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Numero no valido");
                scanner.next();
            }
        } while (!valido);

        return numero;
    }
    // Sobrecarga Double
    public Double entradaDecimal() {
        return entradaDecimal("Introduce un numero decimal: ");
    }

    // String
    public String entradaTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }
    // Sobrecarga String
    public String entradaTexto() {
        return entradaTexto("Introduce un texto: ");
    }

}
