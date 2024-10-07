package test.Java04;
import ejercicios.Java04.BarajaCartas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BarajaCartasTest {
    @Test
    public void testEjercicio2() {
        String carta = new BarajaCartas().barajar();

        assertNotNull(carta);
        assertFalse(carta.isEmpty());

        assertTrue(carta.matches("([2-9]|10|J|Q|K|A) de (Picas|Corazones|Diamantes|Tréboles)"));
    }

}
