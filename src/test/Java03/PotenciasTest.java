package test.Java03;

import ejercicios.Java03.Potencias;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PotenciasTest {

    @Test
    public void testPotencias() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String input = "2\n5\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        Potencias.main(new String[]{});

        String expectedOutput =
                "Introduce la base (número real): Introduce el exponente (entero positivo): 2.0 ^ 1 = 2.0\n" +
                "2.0 ^ 2 = 4.0\n" +
                "2.0 ^ 3 = 8.0\n" +
                "2.0 ^ 4 = 16.0\n" +
                "2.0 ^ 5 = 32.0\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}
