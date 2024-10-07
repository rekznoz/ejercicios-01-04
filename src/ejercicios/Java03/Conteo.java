package ejercicios.Java03;

import java.util.ArrayList;
import java.util.List;

public class Conteo {
    // COntar numeros del 320 al 160 de 20 en 20 con una lista de integers
    public List<Integer> contar() {
        List <Integer> numeros = new ArrayList<>();
        int numero = 320;
        while (numero >= 160) {
            numeros.add(numero);
            numero -= 20;
        }
        return numeros;
    }
}
