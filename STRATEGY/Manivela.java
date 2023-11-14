public class Manivela implements ArranqueStrategy {
    @Override
    public void arrancar() {
        System.out.println("El carro ha arrancado por manivela, tómate un vaso de agua.");
    }
}
