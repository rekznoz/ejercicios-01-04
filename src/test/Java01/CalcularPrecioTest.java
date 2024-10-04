package test.Java01;

import ejercicios.Java01.CalcularPrecio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularPrecioTest {
    @Test
    // Promocion
    public void testCalcularPromocion() {
        CalcularPrecio calcularPrecio = new CalcularPrecio();
        calcularPrecio.baseImponible = 100;
        assertEquals(0, calcularPrecio.calcularPromocion("nopro"));
        assertEquals(50, calcularPrecio.calcularPromocion("mitad"));
        assertEquals(5, calcularPrecio.calcularPromocion("meno5"));
        assertEquals(5, calcularPrecio.calcularPromocion("5porc"));

    }

    @Test
    // IVA
    public void testSeleccionarIva() {
        CalcularPrecio calcularPrecio = new CalcularPrecio();
        assertEquals(0.21, calcularPrecio.seleccionarIva("general"));
        assertEquals(0.10, calcularPrecio.seleccionarIva("reducido"));
        assertEquals(0.04, calcularPrecio.seleccionarIva("superreducido"));
    }

    @Test
    // Precio
    public void testCalcularPrecio() {
        CalcularPrecio calcularPrecio = new CalcularPrecio();
        calcularPrecio.baseImponible = 100;
        assertEquals(121, calcularPrecio.calcularPrecio("general", "nopro"));
        assertEquals(105, calcularPrecio.calcularPrecio("reducido", "meno5"));
        assertEquals(99, calcularPrecio.calcularPrecio("superreducido", "5porc"));

    }
}
