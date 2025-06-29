import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion= 0;
        while (opcion != 8) {
            System.out.println("***************************\n" +
                    "Bienvenidos al conversos de monedas\n\n" +
                    "Ingrese la conversion que desea realizar\n\n " +
                    "1. Dolar a Peso Argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3.Dolar a Real Brasileño\n" +
                    "4. Real Brasileño a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, leer);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, leer);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, leer);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, leer);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, leer);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP1", "USD", consulta, leer);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, leer);
                    break;
                case 8:
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
