package test.Java02;
import ejercicios.Java02.Infiel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfielTest {
    @Test
    public void obtenerPuntuacionTest(){
        Infiel infiel = new Infiel();
        infiel.probabilidadInfidelidad(0);

        assertEquals(0, infiel.probabilidadInfidelidad(0));
        assertEquals(10, infiel.probabilidadInfidelidad(3));
        assertEquals(25, infiel.probabilidadInfidelidad(7));
        assertEquals(50, infiel.probabilidadInfidelidad(10));
        assertEquals(75, infiel.probabilidadInfidelidad(14));
        assertEquals(100, infiel.probabilidadInfidelidad(15));


    }
}
