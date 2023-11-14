public interface ICarroViejo {
    void arranqueManivela();
    void direccionHidraulica();
    void setDireccion(String tipo);
    Memento guardarEstado();
    void restaurarEstado(Memento memento);
}
