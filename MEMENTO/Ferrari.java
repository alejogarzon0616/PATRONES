public class Ferrari implements ICarroNuevo {

    public void arrancarElectrico() {
        System.out.println("El carro ha arrancado eléctricamente.");
    }

    public void direccionHidraulica() {
        System.out.println("El carro tiene dirección hidráulica.");
    }

    public Memento guardarEstado() {
        return new Memento("nuevo", null);
    }

    public void restaurarEstado(Memento memento) {
        // No hay nada que restaurar para un carro nuevo en este caso
    }
}
