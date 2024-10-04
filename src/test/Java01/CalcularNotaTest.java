package test.Java01;

import ejercicios.Java01.CalcularNota;
import org.junit.jupiter.api.Test;

public class CalcularNotaTest {
    @Test
    public void testCalcularNotaExamen2() {
        CalcularNota calcularNota = new CalcularNota();
        calcularNota.nota1 = 5;
        calcularNota.notaTrimestre = 6;
        double notaExamen2 = calcularNota.calcularNotaExamen2();
        assert notaExamen2 == 7.5;
    }

    @Test
    public void testCalcularNotaExamen2Nota1Cero() {
        CalcularNota calcularNota = new CalcularNota();
        calcularNota.nota1 = 0;
        calcularNota.notaTrimestre = 6;
        double notaExamen2 = calcularNota.calcularNotaExamen2();
        assert notaExamen2 == 10;
    }

    @Test
    public void testCalcularNotaExamen2NotaTrimestreCero() {
        CalcularNota calcularNota = new CalcularNota();
        calcularNota.nota1 = 5;
        calcularNota.notaTrimestre = 0;
        double notaExamen2 = calcularNota.calcularNotaExamen2();
        assert notaExamen2 == 0;
    }
}
