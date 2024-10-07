package test.Java02;

import ejercicios.Java02.DiaSemana;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaSemanaTest {
    @ParameterizedTest
    @CsvSource({
            "1, Lunes",
            "2, Martes",
            "3, Miércoles",
            "4, Jueves",
            "5, Viernes",
            "6, Sábado",
            "7, Domingo",
            "8, Día no válido"
    })
    void testNombreDiaSemana(int numero, String expectedDia) {
        assertEquals(expectedDia, DiaSemana.diaSemana(numero));
    }
}
