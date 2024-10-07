package test.Java03;

import ejercicios.Java03.Piramide;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiramideTest {
    @Test
    public void imprimirPiramideTest() {
        List<String> esperados = Arrays.asList(
                "    *",
                "   ***",
                "  *****",
                " *******",
                "*********"
        );
        assertEquals(esperados, new Piramide().imprimirPiramide(5, '*'));
    }

}
