package test.Java04;

import ejercicios.Java04.Dado;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class DadoTest {

    @Test
    public void testTiradaDados() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dado.main(new String[]{});

        String output = outContent.toString().replace("\r\n", "\n");
        String[] lines = output.split("\n");

        assertTrue(lines[0].startsWith("Tirada del dado 1: "));
        assertTrue(lines[1].startsWith("Tirada del dado 2: "));
        assertTrue(lines[2].startsWith("Tirada del dado 3: "));
        assertTrue(lines[3].startsWith("Suma total: "));

        int dado1 = Integer.parseInt(lines[0].split(": ")[1]);
        int dado2 = Integer.parseInt(lines[1].split(": ")[1]);
        int dado3 = Integer.parseInt(lines[2].split(": ")[1]);
        int sumaTotal = Integer.parseInt(lines[3].split(": ")[1]);

        assertTrue(dado1 >= 1 && dado1 <= 6);
        assertTrue(dado2 >= 1 && dado2 <= 6);
        assertTrue(dado3 >= 1 && dado3 <= 6);
        assertTrue(sumaTotal == dado1 + dado2 + dado3);
    }
}