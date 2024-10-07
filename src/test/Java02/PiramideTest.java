package test.Java02;

import ejercicios.Java02.Piramide;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PiramideTest {

    @Test
    public void testPiramideArriba() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Piramide.pintarPiramideArriba('*', 3);

        String expectedOutput =
                "  *\n ***\n*****\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testPiramideAbajo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Piramide.pintarPiramideAbajo('*', 3);

        String expectedOutput =
                "*****\n ***\n  *\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testPiramideIzquierda() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Piramide.pintarPiramideIzquierda('*', 3);

        String expectedOutput =
                "*\n**\n***\n**\n*\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testPiramideDerecha() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Piramide.pintarPiramideDerecha('*', 3);

        String expectedOutput =
                "  *\n **\n***\n **\n  *\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}
