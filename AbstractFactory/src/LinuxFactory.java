public class LinuxFactory implements AbstractFactory{
    @Override
    public Boton crearBoton() {
        return new LinuxBoton();
    }

    @Override
    public Ventana crearVentana() {
        return new LinuxVentana();
    }

    @Override
    public CuadroDeTexto crearCuadroDeTexto() {
        return new LinuxCuadroDeTexto();
    }
}
