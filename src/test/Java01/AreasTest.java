package test.Java01;
import ejercicios.Java01.Areas;
import org.junit.jupiter.api.Test;

public class AreasTest {
    @Test
    public void testAreaRectangulo() {
        Areas areas = new Areas();
        assert areas.areaRectangulo(2, 3) == 6;
    }

    @Test
    public void testAreaTriangulo() {
        Areas areas = new Areas();
        assert areas.areaTriangulo(2, 3) == 3;
    }
}
