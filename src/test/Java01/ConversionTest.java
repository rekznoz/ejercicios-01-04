package test.Java01;

import ejercicios.Java01.Conversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {
    @Test
    public void testConversion() {
        assertEquals(166386, Conversion.eurosAPesetas(1000), 0);
        assertEquals(1000, Conversion.pesetasAEuros(166386), 0);
    }

    @Test
    public void testConversion2() {
        assertEquals(16639.0, Conversion.eurosAPesetas(100), 0);
        assertEquals(100, Conversion.pesetasAEuros(16638.6), 0);
    }

    @Test
    public void testConversion3() {
        assertEquals(1663860, Conversion.eurosAPesetas(10000), 0);
        assertEquals(10000, Conversion.pesetasAEuros(1663860), 0);
    }
}
