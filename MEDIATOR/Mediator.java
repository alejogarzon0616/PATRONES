public class Mediator implements IMediadorCarros {
    private ICarroNuevo carroNuevo;
    private ICarroViejo carroViejo;

    public Mediator(ICarroNuevo carroNuevo, ICarroViejo carroViejo) {
        this.carroNuevo = carroNuevo;
        this.carroViejo = carroViejo;
    }

    @Override
    public void arrancarElectrico() {
        carroNuevo.arrancarElectrico();
    }

    @Override
    public void direccionHidraulica() {
        System.out.println("El carro tiene dirección hidráulica");
    }

    @Override
    public void direccionMecanica() {
        System.out.println("El carro tiene dirección mecánica");
    }

    @Override
    public void arrancarPorManivela() {
        carroViejo.arranqueManivela();
    }
}
