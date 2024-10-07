package ejercicios.Java04;

import java.util.Random;

public class GeneradorMelodias {

    Random random = new Random();
    String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
    StringBuilder melodia = new StringBuilder();

    public String cancion() {

        int numeroDeNotas = (random.nextInt(7) + 1) * 4;

        String primeraNota = notas[random.nextInt(notas.length)];
        melodia.append(primeraNota).append(" ");

        for (int i = 1; i < numeroDeNotas - 1; i++) {
            String notaAleatoria = notas[random.nextInt(notas.length)];
            melodia.append(notaAleatoria).append(" ");

            if (i % 4 == 3) {
                melodia.append("| ");
            }
        }

        melodia.append(primeraNota).append(" ||");

        return melodia.toString();
    }
}
