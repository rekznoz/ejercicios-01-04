package ejercicios.Java03;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> fibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();

        if (n <= 0) {
            return fibonacci;
        }

        fibonacci.add(0);

        if (n == 1) {
            return fibonacci;
        }

        fibonacci.add(1);

        for (int i = 2; i < n; i++) {
            int siguienteTermino = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(siguienteTermino);
        }

        return fibonacci;
    }
}
