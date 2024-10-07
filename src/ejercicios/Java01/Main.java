package ejercicios.Java01;

import ejercicios.Entradas;

public class Main {
    public static void main(String[] args) {

        Entradas entrada = new Entradas();

        // Operaciones Ejericio 1 y 4
        System.out.println("Ejercicio 1 y 4");

        int x = entrada.entradaNumero();
        int y = entrada.entradaNumero();

        System.out.println(x);
        System.out.println(y);
        System.out.println("Suma " + Operaciones.sumar(x, y));
        System.out.println("Resta " + Operaciones.restar(x, y));
        System.out.println("Multiplicacion " + Operaciones.multiplicar(x, y));
        System.out.println("Division " + Operaciones.dividir(x, y));

        // Conversor Ejercicio 2 y 3
        System.out.println("Ejercicio 2 y 3");

        int euros = entrada.entradaNumero("Introduce euros: ");
        int pesetas = entrada.entradaNumero("Introduce pesetas: ");

        System.out.println("Euros a pesetas " + Conversion.eurosAPesetas(euros));
        System.out.println("Pesetas a euros " + Conversion.pesetasAEuros(pesetas));

        // Areas Ejercicio 5 y 6
        System.out.println("Ejercicio 5 y 6");

        int altura = entrada.entradaNumero("Introduce la altura: ");
        int base = entrada.entradaNumero("Introduce la base: ");

        Areas areas = new Areas();
        System.out.println("Area rectangulo " + areas.areaRectangulo(base, altura));
        System.out.println("Area triangulo " + areas.areaTriangulo(base, altura));

        // Calculadora Ejercicio 7
        System.out.println("Ejercicio 7");

        int baseImponible = entrada.entradaNumero("Introduce la base imponible: ");

        Calculadora calculadora = new Calculadora();
        calculadora.baseImponible = baseImponible;
        System.out.println("Total " + calculadora.calcularTotal());

        // Salario Ejercicio 8
        System.out.println("Ejercicio 8");

        int horas = entrada.entradaNumero("Introduce las horas trabajadas: ");
        double precioHora = entrada.entradaNumero("Introduce el precio por hora: ");

        calculadora.baseImponible = Calculadora.calcularSalario(horas, precioHora);
        System.out.println("Salario " + calculadora.calcularTotal());

        // Volumen Cono Ejercicio 9
        System.out.println("Ejercicio 9");

        int radioCono = entrada.entradaNumero("Introduce el radio del cono: ");
        int alturaCono = entrada.entradaNumero("Introduce la altura del cono: ");

        Volumen volumen = new Volumen();
        System.out.println("Volumen cono " + volumen.volumenCono(radioCono, alturaCono));

        // MB a KB Ejercicio 10
        System.out.println("Ejercicio 10");

        double mb = entrada.entradaNumero("Introduce MB: ");
        System.out.println("MB a KB " + Conversion.mbAKb(mb));

        // KB a MB Ejercicio 11
        System.out.println("Ejercicio 11");

        double kb = entrada.entradaNumero("Introduce KB: ");
        System.out.println("KB a MB " + Conversion.kbAMb(kb));

        // Calcular Precio Ejercicio 12
        System.out.println("Ejercicio 12");

        int baseImponiblePrecio = entrada.entradaNumero("Introduce la base imponible: ");
        String tipoIva = entrada.entradaTexto("Introduce el tipo de IVA (general, reducido, superreducido): ");
        String codigoPromocional = entrada.entradaTexto("Introduce el codigo promocional (nopro, mitad, meno5, 5porc): ");

        CalcularPrecio calcularPrecio = new CalcularPrecio();
        calcularPrecio.baseImponible = baseImponiblePrecio;
        System.out.println("Promocion " + calcularPrecio.calcularPromocion(codigoPromocional));
        System.out.println("IVA " + calcularPrecio.seleccionarIva(tipoIva));
        System.out.println("Precio " + calcularPrecio.calcularPrecio(tipoIva, codigoPromocional));

        // Calcular Precio Ejercicio 13
        System.out.println("Ejercicio 13");

        double nota1 = entrada.entradaDecimal("Introduce la nota 1: ");
        double notatrimestre = entrada.entradaDecimal("Introduce la nota del trimestre: ");

        CalcularNota calcularNota = new CalcularNota();
        calcularNota.nota1 = nota1;
        calcularNota.notaTrimestre = notatrimestre;

        System.out.println("Para aprobar el trimestre necesitas un " + calcularNota.calcularNotaExamen2());
    }
}