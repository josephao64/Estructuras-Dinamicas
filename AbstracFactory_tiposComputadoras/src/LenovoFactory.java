public class LenovoFactory implements  ComputerFactory{
    @Override
    public Laptop crearLaptop() {
        return new LenovoLaptop();
    }

    @Override
    public Escritorio crearEscritorio() {
        return new LenovoEscritorio();
    }
}
