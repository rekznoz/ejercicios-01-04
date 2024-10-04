package ejercicios.Java01;

public class Calculadora {
    public double baseImponible;
    private static final double IVA = 0.21; // 21% de IVA

    public double calcularTotal() {
        return baseImponible + (baseImponible * IVA);
    }

    public static double calcularSalario(int horas, double precioHora) {
        return horas * precioHora;
    }
}