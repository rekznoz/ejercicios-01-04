package test.Java01;

import ejercicios.Java01.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testCalcularTotal() {
        Calculadora c = new Calculadora();
        c.baseImponible = 1000;
        assertEquals(1210, c.calcularTotal(), 0);
    }

    @Test
    public void testCalcularTotal2() {
        Calculadora c = new Calculadora();
        c.baseImponible = 100;
        assertEquals(121, c.calcularTotal(), 0);
    }

    @Test
    public void testCalcularTotal3() {
        Calculadora c = new Calculadora();
        c.baseImponible = 10000;
        assertEquals(12100, c.calcularTotal(), 0);
    }

}
