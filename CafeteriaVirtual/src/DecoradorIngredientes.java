public abstract class DecoradorIngredientes extends Bebida {
    protected Bebida bebida;

    public DecoradorIngredientes(Bebida bebida) {
        this.bebida = bebida;
    }public abstract String getDescripcion();
}



