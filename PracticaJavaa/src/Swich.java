public class Swich {
    public static void main(String[] args) {
        int dia = 3;
        int caso = 2;
        int num1 = 1;
        int num2 = 2;

        int operacion;
1
        String nombredia;

        switch (caso) {
            case 1: operacion = num1+num2; break;
            case 2: operacion = num1-num2; break;

            default: nombredia = "invalido"; break;

        }
        System.out.println(operacion);


    }

}
