import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Deseas un carro nuevo o viejo? (nuevo/viejo):");
        String tipoCarro = scanner.next();

        if (tipoCarro.equalsIgnoreCase("nuevo")) {
            Ferrari carroNuevo = new Ferrari();

            System.out.println("Usando el mediador para un carro nuevo:");

            System.out.println("¿Deseas dirección hidráulica o mecánica? (hidraulica/mecanica):");
            String tipoDireccion = scanner.next();

            if (tipoDireccion.equalsIgnoreCase("hidraulica")) {
                carroNuevo.direccionHidraulica();
            } else if (tipoDireccion.equalsIgnoreCase("mecanica")) {
                System.out.println("Este carro no tiene dirección mecánica.");
            } else {
                System.out.println("Opción de dirección no válida. Debes elegir entre 'hidraulica' o 'mecanica'.");
            }

            System.out.println("¿Deseas arrancar eléctricamente o por manivela? (electrico/manivela):");
            String tipoArranque = scanner.next();

            if (tipoArranque.equalsIgnoreCase("electrico")) {
                carroNuevo.arrancarElectrico();
            } else if (tipoArranque.equalsIgnoreCase("manivela")) {
                System.out.println("Este carro no puede arrancar por manivela.");
            } else {
                System.out.println("Opción de arranque no válida. Debes elegir entre 'electrico' o 'manivela'.");
            }
        } else if (tipoCarro.equalsIgnoreCase("viejo")) {
            DeLorean carroViejo = new DeLorean();

            System.out.println("Usando el mediador para un carro viejo:");

            System.out.println("¿Deseas dirección hidráulica o mecánica? (hidraulica/mecanica):");
            String tipoDireccion = scanner.next();

            carroViejo.setDireccion(tipoDireccion);

            System.out.println("¿Deseas arrancar eléctricamente o por manivela? (electrico/manivela):");
            String tipoArranque = scanner.next();

            if (tipoArranque.equalsIgnoreCase("electrico")) {
                System.out.println("Este carro viejo no puede arrancar eléctricamente.");
            } else if (tipoArranque.equalsIgnoreCase("manivela")) {
                carroViejo.arranqueManivela();
            } else {
                System.out.println("Opción de arranque no válida. Debes elegir entre 'electrico' o 'manivela'.");
            }
        } else {
            System.out.println("Opción no válida. Debes elegir entre 'nuevo' o 'viejo'.");
        }
    }
}
