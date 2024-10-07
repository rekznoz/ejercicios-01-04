package ejercicios.Java04;

import java.util.Random;

public class BarajaCartas {

    Random random = new Random();

    public String barajar() {

        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String paloAleatorio = palos[random.nextInt(palos.length)];
        String cartaAleatoria = cartas[random.nextInt(cartas.length)];

        return cartaAleatoria + " de " + paloAleatorio;
    }
}
