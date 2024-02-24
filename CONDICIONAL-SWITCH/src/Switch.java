public class Switch {
    public static void main(String[] args) {

        int operacion = 2;
        int num1 =4;
        int num2 =5;



        switch (operacion) {
            case 1 : operacion = num1 + num2 ; break;
            case 2 : operacion = num1 * num2; break;
            case 3 : operacion = num1 / num2 ; break;
            case 4 : operacion = num1- num2 ; break;
            default :
                System.out.println(2 ); break;


        }


    }
}
