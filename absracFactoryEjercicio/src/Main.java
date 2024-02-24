
public class Main {
    public static void main(String[] args) {

        ComutadorasFactory lenovoFaxtory = new LenovoFaxtory();


        Laptop lenovoLaptops = lenovoFaxtory.crearLaptop();
        lenovoLaptops.cargar();

        Pc lenovopcs = lenovoFaxtory.crearPc();
        lenovopcs.cargar();





        ComutadorasFactory HpFactory = new HpFactory();

        Laptop hplap = HpFactory.crearLaptop();
        hplap.cargar();

        Pc pcHP = HpFactory.crearPc();
        pcHP.cargar();



        }
    }
