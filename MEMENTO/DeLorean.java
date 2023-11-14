public class DeLorean implements ICarroViejo {
    private String tipoDireccion;

    public void arranqueManivela() {
        System.out.println("El carro ha arrancado por manivela, tómate un vaso de agua.");
    }

    public void direccionHidraulica() {
        System.out.println("El carro tiene dirección hidráulica.");
    }

    public void setDireccion(String tipo) {
        tipoDireccion = tipo;
    }

    public Memento guardarEstado() {
        return new Memento("viejo", tipoDireccion);
    }

    public void restaurarEstado(Memento memento) {
        tipoDireccion = memento.getTipoDireccion();
    }
}
