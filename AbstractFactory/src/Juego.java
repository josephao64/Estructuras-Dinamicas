public class Juego {
    AbstractFactory factory;
    private Boton boton;
    private Ventana ventana;
    private CuadroDeTexto cuadroDeTexto;

    public Juego(AbstractFactory factory, Boton boton, Ventana ventana, CuadroDeTexto cuadroDeTexto) {
        this.factory = factory;
        this.boton = boton;
        this.ventana = ventana;
        this.cuadroDeTexto = cuadroDeTexto;
    }
}
