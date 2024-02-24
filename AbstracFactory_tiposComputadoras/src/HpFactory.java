public class HpFactory implements   ComputerFactory {
    @Override
    public Laptop crearLaptop() {
        return new HpLaptop();
    }

    @Override
    public Escritorio crearEscritorio() {
        return new HpEscritorio();

    }
}
