package test.Java02;
import ejercicios.Java02.UltimoNumero;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UltimoNumeroTest {

    @Test
    public void testUltimaCifraPositivo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        String input = "12345\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        UltimoNumero.main(new String[]{});

        String expectedOutput = "Introduce un número entero: La última cifra del número es: 5\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testUltimaCifraNegativo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String input = "-9876\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        UltimoNumero.main(new String[]{});

        String expectedOutput = "Introduce un número entero: La última cifra del número es: 6\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testUltimaCifraCero() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        String input = "0\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        UltimoNumero.main(new String[]{});

        String expectedOutput = "Introduce un número entero: La última cifra del número es: 0\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}