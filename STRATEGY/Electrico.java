public class Electrico implements ArranqueStrategy {
    @Override
    public void arrancar() {
        System.out.println("El carro ha arrancado eléctricamente.");
    }
}
