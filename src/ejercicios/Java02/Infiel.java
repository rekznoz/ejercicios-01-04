package ejercicios.Java02;
import ejercicios.Entradas;

public class Infiel {

    Entradas Entradas = new Entradas();

    String[] preguntas = {
            "1. ¿Tu pareja parece estar más inquieta de lo normal sin motivo aparente?",
            "2. ¿Ha aumentado el uso de su teléfono móvil o computadora de forma sospechosa?",
            "3. ¿Evita responder ciertas preguntas sobre su día a día?",
            "4. ¿Se enfada o se molesta más fácilmente cuando le haces preguntas?",
            "5. ¿Notas cambios repentinos en su aspecto o forma de vestir sin razón aparente?",
            "6. ¿Te ha dejado de hablar de sus amigos o contactos frecuentes?",
            "7. ¿Ha disminuido la intimidad física entre ustedes?",
            "8. ¿Sale con frecuencia y no te dice con quién ha estado?",
            "9. ¿Te oculta su teléfono móvil o cambia la contraseña?",
            "10. ¿Parece estar más distante emocionalmente de ti?"
    };

    public int responderPreguntas() {
        int contador = 0;
        for (String pregunta : preguntas) {
            System.out.println(pregunta);
            String respuesta = Entradas.entradaTexto("Responde si o no: ");
            if (respuesta.equalsIgnoreCase("si")) {
                contador++;
            }
        }
        return contador;
    }

    // calcular probabilidad de infidelidad
    public int probabilidadInfidelidad(int puntos) {
        int probabilidad = 0;
        if (puntos > 0 && puntos <= 3) {
            probabilidad = 10;
        } else if (puntos >= 4 && puntos <= 7) {
            probabilidad = 25;
        } else if (puntos >= 8 && puntos <= 10) {
            probabilidad = 50;
        } else if (puntos >= 11 && puntos <= 14) {
            probabilidad = 75;
        } else if (puntos >= 15) {
            probabilidad = 100;
        }
        return probabilidad;
    }

}
