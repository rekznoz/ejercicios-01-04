package ejercicios.Java02;

public class Calculadora {
    public double baseImponible;
    private static final double IVA = 0.21; // 21% de IVA

    public double calcularTotal() {
        return baseImponible + (baseImponible * IVA);
    }

    public double calcularSalario(int horas) {
        double salario = 0;
        if (horas <= 40) {
            salario = horas * 12;
        } else {
            salario = 40 * 12 + (horas - 40) * 16;
        }
        return salario;
    }
}