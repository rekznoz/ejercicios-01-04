package test.Java02;
import ejercicios.Java02.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void calcularSalarioTest() {
        Calculadora calculadora = new Calculadora();
        assert calculadora.calcularSalario(40) == 480;
        assert calculadora.calcularSalario(41) == 496;
        assert calculadora.calcularSalario(50) == 640;
    }
}
