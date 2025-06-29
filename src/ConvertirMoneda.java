import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {

        double cantidad;
        double cantidadConvertida;

        RespuestaApi datos = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.printf("La tasa de conversion para hoy:\n1 %s = %.2f %s\n", monedaBase, datos.getConversion_rate(), monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase + ": ");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * datos.getConversion_rate();
        System.out.printf("%.2f %s = %.2f %s\n", cantidad, monedaBase, cantidadConvertida, datos.getTarget_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}

