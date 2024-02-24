public class LenovoFaxtory implements ComutadorasFactory{
    @Override
    public Laptop crearLaptop() {
        return new LenovoLaptop();
    }

    @Override
    public Pc crearPc() {
        return new LenovoPc();
    }
}
