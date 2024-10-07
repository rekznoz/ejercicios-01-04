package test.Java04;

import ejercicios.Java04.AdivinarNumero;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertTrue;

public class AdivinarNumeroTest {

    @Test
    public void testAdivinarNumero() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String input = "menor\nmenor\nmenor\nmenor\nmenor\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        AdivinarNumero.main(new String[]{});

        String output = outContent.toString().replace("\r\n", "\n");
        String[] lines = output.split("\n");

        int intentos = 0;
        for (String line : lines) {
            if (line.startsWith("¿Es")) {
                intentos++;
            }
        }
        assertTrue(intentos == 5);

        assertTrue(output.contains("Lo siento, el programa no ha podido adivinar tu número."));
    }
}
