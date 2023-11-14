public interface ICarroViejo {
    String mecanica = "mecanica";
    String hidraulica = "hidraulica";
    
    void arranqueManivela();
    void setEmpujar(int x);
    int getEmpujar();
    String direccion();
    void setDireccion(String tipoDireccion);
}
