import java.util.Scanner;

public class Main {

    public static int saldo = 100;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    depositar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    Vsaldo();
                    break;
                case 4:
                    salir();
                    return;
                default:
                    System.out.println("Ingrese un número válido del 1 al 4 ");
                    break;
            }
        }
    }

    private static void salir() {
        System.out.println("Saliendo del programa. ¡Hasta luego!");
    }

    private static void Vsaldo() {
        System.out.println("El saldo total es de " + saldo);
    }

    private static void retirar() {
        System.out.println("ingrese  cantidad a retirar ");
        int retiro = scanner.nextInt();
        if ( saldo < retiro ) {
            System.out.println("saldo insuficiente ");
        }else {
            saldo -= retiro;|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||63
                    555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555++++++++++++++++++++++++++
        }
    }

    private static void depositar() {
        System.out.println("Ingrese la cantidad a depositar");
        int cantidad = scanner.nextInt();
        // Implementa la lógica para depositar saldo
        saldo += cantidad;
        System.out.println("Depósito exitoso. Saldo actual: " + saldo);
    }

    private static void menu() {
        System.out.println("Ingrese la operación a realizar ");
        System.out.println("--------------------------------");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Ver saldo");
        System.out.println("4. Salir");
    }
}
