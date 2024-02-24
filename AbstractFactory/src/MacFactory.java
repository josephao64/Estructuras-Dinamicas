public class MacFactory implements AbstractFactory{
    @Override
    public Boton crearBoton() {
        return new MacBoton();
    }

    @Override
    public ventana crearVentana() {
        return new MacVentana();
    }

    @Override
    public CuadroDeTexto crearCuadroDeTexto() {
        return new MacCuadroDeTexto();
    }
}
