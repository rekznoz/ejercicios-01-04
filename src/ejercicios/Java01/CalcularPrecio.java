package ejercicios.Java01;

public class CalcularPrecio {
    // Base Imponible
    public double baseImponible;

    // Tipos de IVA
    private static final double IVA_GENERAL = 0.21;
    private static final double IVA_REDUCIDO = 0.10;
    private static final double IVA_SUPERREDUCIDO = 0.04;

    // Posibles Codigos promocionales
    private static final String CODIGO_PROMOCIONAL_1 = "nopro"; // Sin promocion
    private static final String CODIGO_PROMOCIONAL_2 = "mitad"; // 50% de descuento
    private static final String CODIGO_PROMOCIONAL_3 = "meno5"; // 5€ de descuento
    private static final String CODIGO_PROMOCIONAL_4 = "5porc"; // 5% de descuento

    public double calcularPromocion(String codigoPromocional) {
        if (codigoPromocional.equals(CODIGO_PROMOCIONAL_1)) {
            return 0;
        } else if (codigoPromocional.equals(CODIGO_PROMOCIONAL_2)) {
            return baseImponible / 2;
        } else if (codigoPromocional.equals(CODIGO_PROMOCIONAL_3)) {
            return 5;
        } else if (codigoPromocional.equals(CODIGO_PROMOCIONAL_4)) {
            return baseImponible * 0.05;
        }
        return 0;
    }

    public double seleccionarIva(String tipoIva) {
        if (tipoIva.equals("general")) {
            return IVA_GENERAL;
        } else if (tipoIva.equals("reducido")) {
            return IVA_REDUCIDO;
        } else if (tipoIva.equals("superreducido")) {
            return IVA_SUPERREDUCIDO;
        }
        return 0;
    }

    public double calcularPrecio( String tipoIva, String codigoPromocional) {
        double total = baseImponible + (baseImponible * seleccionarIva(tipoIva));
        return total - calcularPromocion(codigoPromocional);
    }

}
