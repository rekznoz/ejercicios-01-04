package ejercicios.Java03;

import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base (número real): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        for (int i = 1; i <= exponente; i++) {
            double resultado = 1;
            for (int j = 0; j < i; j++) {
                resultado *= base;
            }
            System.out.println(base + " ^ " + i + " = " + resultado);
        }
    }
}