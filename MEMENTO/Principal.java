import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Deseas un carro nuevo o viejo? (nuevo/viejo):");
        String tipoCarro = scanner.nextLine();

        ICarroViejo carroViejo = null;
        ICarroNuevo carroNuevo = null;

        if (tipoCarro.equals("viejo")) {
            carroViejo = new DeLorean();

            System.out.println("¿Deseas cambiar la dirección del carro? (si/no):");
            String cambiarDireccion = scanner.nextLine();

            if (cambiarDireccion.equals("si")) {
                System.out.println("¿Qué tipo de dirección deseas? (hidraulica/mecanica):");
                String tipoDireccion = scanner.nextLine();
                carroViejo.setDireccion(tipoDireccion);
                System.out.println("El carro tiene dirección " + tipoDireccion + ".");
            }

            System.out.println("¿Deseas arrancar el carro? (si/no):");
            String arrancar = scanner.nextLine();

            if (arrancar.equals("si")) {
                System.out.println("¿Cómo deseas arrancar? (manivela):");
                String tipoArranque = scanner.nextLine();
                if (tipoArranque.equals("manivela")) {
                    carroViejo.arranqueManivela();
                } else {
                    System.out.println("Opción de arranque no válida.");
                }
            }
        } else if (tipoCarro.equals("nuevo")) {
            carroNuevo = new Ferrari();

            System.out.println("¿Deseas cambiar la dirección del carro? (si/no):");
            String cambiarDireccion = scanner.nextLine();

            if (cambiarDireccion.equals("si")) {
                System.out.println("¿Qué tipo de dirección deseas? (hidraulica):");
                String tipoDireccion = scanner.nextLine();
                if (tipoDireccion.equals("hidraulica")) {
                    carroNuevo.direccionHidraulica();
                } else {
                    System.out.println("Opción de dirección no válida.");
                }
            }

            System.out.println("¿Deseas arrancar el carro? (si/no):");
            String arrancar = scanner.nextLine();

            if (arrancar.equals("si")) {
                System.out.println("¿Cómo deseas arrancar? (electrico):");
                String tipoArranque = scanner.nextLine();
                if (tipoArranque.equals("electrico")) {
                    carroNuevo.arrancarElectrico();
                } else {
                    System.out.println("Opción de arranque no válida.");
                }
            }
        } else {
            System.out.println("Opción de carro no válida.");
        }

        scanner.close();
    }
}
