package ejercicios.Java02;

public class Horario {
    public static String asignaturaPorDia(String dia) {
        return switch (dia) {
            case "lunes" -> "Matemáticas";
            case "martes" -> "Lengua";
            case "miércoles" -> "Inglés";
            case "jueves" -> "Ciencias";
            case "viernes" -> "Historia";
            default -> "Día no válido";
        };
    }
}
