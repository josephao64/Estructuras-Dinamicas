public class Chocolate extends DecoradorIngredientes {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    public double costo() {
        return bebida.costo() + 0.75; // Precio adicional del chocolate
    }
}