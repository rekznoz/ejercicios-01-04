package ejercicios.Java01;

public class CalcularNota {

    // Nota 1 examen
    public double nota1;
    // Notra trimestre
    public double notaTrimestre;

    // El 1 examen vale 40% y el 2 examen 60%
    private static final double PORCENTAJE_EXAMEN1 = 0.4;
    private static final double PORCENTAJE_EXAMEN2 = 0.6;

    // Funcion para Calcular nota del examen 2 para aprobar el trimestre
    public double calcularNotaExamen2() {
        return (notaTrimestre - (nota1 * PORCENTAJE_EXAMEN1)) / PORCENTAJE_EXAMEN2;
    }

}
