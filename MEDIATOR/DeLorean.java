public class DeLorean implements ICarroViejo {
    private int empujar;
    private String tipoDireccion;

    DeLorean() {
        this.empujar = 10;
        this.tipoDireccion = mecanica;
    }

    public void arranqueManivela() {
        System.out.println("El carro ha arrancado por manivela, tómate un vaso de agua");
    }

    public int getEmpujar() {
        return empujar;
    }

    public void setEmpujar(int nuevoValor) {
        this.empujar = nuevoValor;
    }

    public String direccion() {
        return tipoDireccion;
    }

    public void setDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }
}
