public  class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
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
        System.out.println("este es el mordisco");
    }

    @Override
    public void atagcarDrenaje() {

    }

    @Override
    public void atacarParalizar() {

    }
}
