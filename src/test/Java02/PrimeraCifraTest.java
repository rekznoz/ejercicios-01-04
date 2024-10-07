package test.Java02;
import ejercicios.Java02.PrimeraCifra;
import org.junit.jupiter.api.Test;

public class PrimeraCifraTest {
    @Test
    public void primeraCifraTest() {
        PrimeraCifra primeraCifra = new PrimeraCifra();
        assert primeraCifra.primeraCifra(123) == 1;
        assert primeraCifra.primeraCifra(456) == 4;
        assert primeraCifra.primeraCifra(789) == 7;
        assert primeraCifra.primeraCifra(0) == 0;
        assert primeraCifra.primeraCifra(100) == 1;
        assert primeraCifra.primeraCifra(999) == 9;
    }
}
