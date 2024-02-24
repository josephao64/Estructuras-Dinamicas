import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double sueldo=0;

        System.out.println("ingrese el tipo de empkleado");
        Scanner teclado =new Scanner(System.in);
        int categoria = teclado.nextInt();

        if(categoria ==1 ){
            sueldo = 15890 + (15890*0.10);
        }else{
            if (categoria == 2){
                sueldo = 5630.89;


            }else {

                if(categoria==3){
                    sueldo = 35560.20  - (25560.20 *0.11);

                }else {
                    System.out.println("ingreso un numero incorecto ");
                }
            }
        }
        if(categoria ==1 ||  )
        System.out.println("la categoria de la persona es " + categoria);
        System.out.println("EL SUELDODE LA CATEFOTIA ES " + sueldo);
    }
}
