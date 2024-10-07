package ejercicios.Java04;

import ejercicios.Entradas;

public class Main {
    public static void main(String[] args) {

        Entradas entrada = new Entradas();

        // Ejercicio 2
        BarajaCartas baraja = new BarajaCartas();
        System.out.println(baraja.barajar());
        System.out.println(baraja.barajar());

        // Ejercicio 15
        GeneradorMelodias melodia = new GeneradorMelodias();
        System.out.println(melodia.cancion());

    }
}