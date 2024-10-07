package test.Java04;

import ejercicios.Java04.GeneradorMelodias;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorMelodiasTest {
    @Test
    public void testEjercicio15() {
        String melodia = new GeneradorMelodias().cancion();

        assertNotNull(melodia);

        assertTrue(melodia.endsWith("||"));

        String[] partes = melodia.split(" \\| | \\|\\|");
        String primeraNota = partes[0].split(" ")[0];
        String ultimaNota = partes[partes.length - 1].split(" ")[partes[partes.length - 1].split(" ").length - 1];
        assertEquals(primeraNota, ultimaNota);
    }
}
