package ejercicios.Java03;

import java.util.ArrayList;
import java.util.List;

public class Conteo {
    // COntar numeros del 320 al 160 de 20 en 20 con una lista de integers
    public List<Integer> contar320a160en20List() {
        List <Integer> numeros = new ArrayList<>();
        int numero = 320;
        while (numero >= 160) {
            numeros.add(numero);
            numero -= 20;
        }
        return numeros;
    }

    // Numeros del 320 al 160 de 20 en 20 hacia atrás utilizando un bucle for
    public List<Integer> contar320a160en20For() {
        List <Integer> numeros = new ArrayList<>();
        for (int i = 320; i >= 160; i -= 20) {
            numeros.add(i);
        }
        return numeros;
    }

    // Numeros del 320 al 160 de 20 en 20 hacia atrás utilizando un do-while
    public List<Integer> contar320a160en20DoWhile() {
        List <Integer> numeros = new ArrayList<>();
        int numero = 320;
        do {
            numeros.add(numero);
            numero -= 20;
        } while (numero >= 160);
        return numeros;
    }


}
