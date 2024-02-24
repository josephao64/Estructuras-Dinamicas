public class Main {
    public static void main(String[] args) {
        ComputerFactory lenovoFabrica = new LenovoFactory();

        Laptop lenovolaptop = lenovoFabrica.crearLaptop();
        lenovolaptop.displayInfo();
    }
}