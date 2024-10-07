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

    public void obtenerPuntuacion(int puntos) {
        if (puntos > 10) {
            System.out.println("¡Cuidado! Tu pareja podría estar siendo infiel.");
        } else if (puntos > 6) {
            System.out.println("Presta atención a las señales, algo podría estar pasando.");
        } else if (puntos > 3) {
            System.out.println("No te preocupes, pero mantente alerta.");
        } else {
            System.out.println("Todo parece estar bien en tu relación.");
        }
    }

}
