public class Memento {
    private String tipoCarro;
    private String tipoDireccion;

    public Memento(String tipoCarro, String tipoDireccion) {
        this.tipoCarro = tipoCarro;
        this.tipoDireccion = tipoDireccion;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }
}
