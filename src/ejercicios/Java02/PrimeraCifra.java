package ejercicios.Java02;

public class PrimeraCifra {
    public int primeraCifra(int numero) {
        int cifra = 0;
        if (numero < 10) {
            cifra = numero;
        } else if (numero < 100) {
            cifra = numero / 10;
        } else if (numero < 1000) {
            cifra = numero / 100;
        } else if (numero < 10000) {
            cifra = numero / 1000;
        } else if (numero < 100000) {
            cifra = numero / 10000;
        }
        return cifra;
    }
}
