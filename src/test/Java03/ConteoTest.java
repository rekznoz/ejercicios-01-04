package test.Java03;
import ejercicios.Java03.Conteo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConteoTest {
    @Test
    public void contarTest() {
        Conteo conteo = new Conteo();
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, conteo.contar());
    }
}
