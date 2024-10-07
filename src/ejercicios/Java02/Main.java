package ejercicios.Java02;

import ejercicios.Entradas;

public class Main {
    public static void main(String[] args) {

        Entradas entrada = new Entradas();

        // Ejercicio 2

        SaludoPorHora saludo = new SaludoPorHora();
        int hora = entrada.entradaNumero("Introduce la hora: ");
        System.out.println(saludo.saludo(hora));

        // Ejercicio 4

        Calculadora calculadora = new Calculadora();
        int horas = entrada.entradaNumero("Introduce las horas trabajadas: ");
        System.out.println("El salario es: " + calculadora.calcularSalario(horas));

        // Ejercicio 16

        Infiel infiel = new Infiel();
        int puntos = infiel.responderPreguntas();
        System.out.println("Has obtenido " + puntos + " puntos.");
        int probabilidad = infiel.probabilidadInfidelidad(puntos);
        System.out.println("La probabilidad de infidelidad es del " + probabilidad + "%.");

        // Ejercicio 18

        int numero = entrada.entradaNumero("Introduce un número: ");
        PrimeraCifra primeraCifra = new PrimeraCifra();
        System.out.println("La primera cifra es " + primeraCifra.primeraCifra(numero));
    }
}