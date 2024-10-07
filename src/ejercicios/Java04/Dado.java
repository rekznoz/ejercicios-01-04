package ejercicios.Java04;

import java.util.Random;

public class Dado {

    public static void main(String[] args) {
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;

        int sumaTotal = dado1 + dado2 + dado3;

        System.out.println("Tirada del dado 1: " + dado1);
        System.out.println("Tirada del dado 2: " + dado2);
        System.out.println("Tirada del dado 3: " + dado3);
        System.out.println("Suma total: " + sumaTotal);
    }

}
