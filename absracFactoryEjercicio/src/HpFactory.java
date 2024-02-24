public class HpFactory implements ComutadorasFactory{
    @Override
    public Laptop crearLaptop() {
        return new HpLaptop();
    }

    @Override
    public Pc crearPc() {
        return new HpPc();
    }
}
