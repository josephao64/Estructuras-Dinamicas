public class Squirtle extends Pokemon implements IAgua{


    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("este es el ataque mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("este es el ataque arañaso");
    }

    @Override
    protected void atacarMordida() {
        System.out.println("este es el mordisco de squi");
}

    @Override
    public void atacarHidrobomba() {
        System.out.println("hidrobomba");
    }

    @Override
    public void atacarBurbuja() {

    }

    @Override
    public void atacarPistolaAgua() {

    }


}
