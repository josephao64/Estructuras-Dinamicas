public class Pikachu extends Pokemon implements IElectrico{


    public Pikachu() {
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
    public void atacarImpacTrueno() {
        System.out.println("este es impac de pikachu ");

    }

    @Override
    public void inpacarPunoTrueno() {
        System.out.println("este es el puñotueno de pika pikaaaaa");

    }
}
