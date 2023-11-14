public interface ICarroNuevo {
    void arrancarElectrico();
    void direccionHidraulica();
    Memento guardarEstado();
    void restaurarEstado(Memento memento);
}
