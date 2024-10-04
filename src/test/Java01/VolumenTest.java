package test.Java01;

import ejercicios.Java01.Volumen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumenTest {
    @Test
    public void testVolumenCono() {
        Volumen volumen = new Volumen();
        assertEquals(12.566370614359172, volumen.volumenCono(2, 3), 0);
        assertEquals(0, volumen.volumenCono(0, 3), 0);
    }
}
