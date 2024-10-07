package ejercicios.Java03;

import java.util.ArrayList;
import java.util.List;

public class Piramide {
    public List<String> imprimirPiramide(int altura, char caracter) {

        List<String> piramide = new ArrayList<>();

        for (int i = 1; i <= altura; i++) {
            StringBuilder linea = new StringBuilder();

            for (int j = 0; j < altura - i; j++) {
                linea.append(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                linea.append(caracter);
            }

            piramide.add(linea.toString());
        }

        return piramide;
    }
}
