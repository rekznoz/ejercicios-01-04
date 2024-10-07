package ejercicios.Java04;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int intentos = 5;
        int min = 0;
        int max = 100;

        System.out.println("Piensa en un número entre 0 y 100. El programa intentará adivinarlo.");

        while (intentos > 0) {
            int intento = random.nextInt(max - min + 1) + min;
            System.out.println("¿Es " + intento + " tu número? (responde con 'si', 'mayor' o 'menor')");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("¡Genial! El programa ha adivinado tu número.");
                break;
            } else if (respuesta.equalsIgnoreCase("mayor")) {
                min = intento + 1;
            } else if (respuesta.equalsIgnoreCase("menor")) {
                max = intento - 1;
            } else {
                System.out.println("Respuesta no válida. Por favor, responde con 'si', 'mayor' o 'menor'.");
                continue;
            }

            intentos--;
            if (intentos > 0) {
                System.out.println("Intentos restantes: " + intentos);
            } else {
                System.out.println("Lo siento, el programa no ha podido adivinar tu número.");
            }
        }
    }
}
