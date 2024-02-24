public class WindowsFactory implements AbstractFactory{
    @Override
    public Boton crearBoton() {
        return new WindowsBoton();
    }

    @Override
    public Ventana crearVentana() {
        return new WindowsVentana();
    }

    @Override
    public CuadroDeTexto crearCuadroDeTexto() {
        return new CuadroDeTexto();
    }
}
