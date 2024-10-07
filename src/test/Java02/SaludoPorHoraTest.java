package test.Java02;
import ejercicios.Java02.SaludoPorHora;
import org.junit.jupiter.api.Test;

public class SaludoPorHoraTest {
    @Test
    public void saludoTest() {
        SaludoPorHora saludo = new SaludoPorHora();
        assert saludo.saludo(0).equals("Buenos días");
        assert saludo.saludo(11).equals("Buenos días");
        assert saludo.saludo(12).equals("Buenas tardes");
        assert saludo.saludo(19).equals("Buenas tardes");
        assert saludo.saludo(20).equals("Buenas noches");
        assert saludo.saludo(23).equals("Buenas noches");
        assert saludo.saludo(24).equals("Hora invalida");
    }
}
