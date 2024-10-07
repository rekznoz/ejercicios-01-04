package test.Java03;
import ejercicios.Java03.Fibonacci;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void fibonacciTest() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> esperados = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(esperados, fibonacci.fibonacci(6));
    }

    @Test
    public void fibonacciTest2() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> esperados = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        assertEquals(esperados, fibonacci.fibonacci(10));
    }
}
