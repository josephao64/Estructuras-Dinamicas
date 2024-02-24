public class Leche extends DecoradorIngredientes {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    public double costo() {
        return bebida.costo() + 0.5; // Precio adicional de la leche
    }
}