public abstract class Espada extends Item{

    private int daño;

    public Espada (String nombre , int daño){
        super(nombre);
        this.daño = daño;



    }
 public abstract void atacar();
}
