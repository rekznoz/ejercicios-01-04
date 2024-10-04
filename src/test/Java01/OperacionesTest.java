package test.Java01;

import ejercicios.Java01.Operaciones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperacionesTest {

    @Test
    public void testSumar() {
        assertEquals(5, Operaciones.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(2, Operaciones.restar(5, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, Operaciones.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, Operaciones.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Operaciones.dividir(6, 0);
        });
    }
}
