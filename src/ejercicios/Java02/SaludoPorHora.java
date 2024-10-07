package ejercicios.Java02;

public class SaludoPorHora {
    public String saludo(int hora) {
        if (hora >= 0 && hora < 12) {
            return "Buenos días";
        } else if (hora >= 12 && hora < 20) {
            return "Buenas tardes";
        } else if (hora >= 20 && hora < 24) {
            return "Buenas noches";
        } else {
            return "Hora invalida";
        }
    }
}
