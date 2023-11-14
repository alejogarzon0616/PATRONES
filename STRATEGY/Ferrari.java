public class Ferrari {
    private DireccionStrategy direccionStrategy;
    private ArranqueStrategy arranqueStrategy;

    public void setDireccionStrategy(DireccionStrategy direccionStrategy) {
        this.direccionStrategy = direccionStrategy;
    }

    public void setArranqueStrategy(ArranqueStrategy arranqueStrategy) {
        this.arranqueStrategy = arranqueStrategy;
    }

    public void cambiarDireccion() {
        direccionStrategy.cambiarDireccion();
    }

    public void arrancar() {
        arranqueStrategy.arrancar();
    }
}
