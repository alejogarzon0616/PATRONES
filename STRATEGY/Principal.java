import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Deseas un carro nuevo o viejo? (nuevo/viejo):");
        String tipoCarro = scanner.nextLine();

        if (tipoCarro.equalsIgnoreCase("nuevo")) {
            Ferrari ferrari = new Ferrari();

            System.out.println("¿Qué tipo de dirección deseas? (hidraulica/mecanica):");
            String tipoDireccion = scanner.nextLine();
            if (tipoDireccion.equalsIgnoreCase("hidraulica")) {
                ferrari.setDireccionStrategy(new Hidraulica());
            } else if (tipoDireccion.equalsIgnoreCase("mecanica")) {
                // Agregar lógica para direccion mecanica si se desea
            } else {
                System.out.println("Opción de dirección no válida.");
                return;
            }

            System.out.println("¿Cómo quieres arrancar el carro? (electrico/manivela):");
            String tipoArranque = scanner.nextLine();
            if (tipoArranque.equalsIgnoreCase("electrico")) {
                ferrari.setArranqueStrategy(new Electrico());
            } else if (tipoArranque.equalsIgnoreCase("manivela")) {
                ferrari.setArranqueStrategy(new Manivela());
            } else {
                System.out.println("Opción de arranque no válida.");
                return;
            }

            ferrari.cambiarDireccion();
            ferrari.arrancar();
        } else if (tipoCarro.equalsIgnoreCase("viejo")) {
            DeLorean delorean = new DeLorean();

            // Lógica similar para el carro viejo
            // Puedes implementar la selección de dirección y arranque para el carro viejo aquí

        } else {
            System.out.println("Opción de carro no válida.");
        }
        scanner.close();
    }
}
