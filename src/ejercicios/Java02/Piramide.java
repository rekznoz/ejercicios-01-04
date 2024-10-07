package ejercicios.Java02;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un carácter para la pirámide: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("Elige la orientación de la pirámide:");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la izquierda");
        System.out.println("4. Vértice hacia la derecha");
        int opcion = scanner.nextInt();

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        switch (opcion) {
            case 1:
                pintarPiramideArriba(caracter, altura);
                break;
            case 2:
                pintarPiramideAbajo(caracter, altura);
                break;
            case 3:
                pintarPiramideIzquierda(caracter, altura);
                break;
            case 4:
                pintarPiramideDerecha(caracter, altura);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void pintarPiramideArriba(char c, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pintarPiramideAbajo(char c, int altura) {
        for (int i = altura; i >= 1; i--) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pintarPiramideIzquierda(char c, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pintarPiramideDerecha(char c, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
