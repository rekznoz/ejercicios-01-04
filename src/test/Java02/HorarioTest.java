package test.Java02;

import ejercicios.Java02.Horario;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HorarioTest {
    @ParameterizedTest
    @CsvSource({
            "lunes, Matemáticas",
            "martes, Lengua",
            "miércoles, Inglés",
            "jueves, Ciencias",
            "viernes, Historia",
            "sábado, Día no válido"
    })
    void asignaturaPorDia(String dia, String expectedAsignatura) {
        assertEquals(expectedAsignatura, Horario.asignaturaPorDia(dia));
    }
}
