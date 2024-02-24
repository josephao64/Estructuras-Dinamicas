
public class Main {
    public static void main(String[] args) {
        // Crear una bebida base
        Bebida cafeConLeche = new Cafe();
        System.out.println("Bebida: " + cafeConLeche.getDescripcion());
        System.out.println("Costo total: Q" + cafeConLeche.costo());

        // Agregar ingredientes
        cafeConLeche = new Leche(cafeConLeche);
        cafeConLeche = new Chocolate(cafeConLeche);

        System.out.println("Bebida personalizada: " + cafeConLeche.getDescripcion());
        System.out.println("Costo total: Q" + cafeConLeche.costo());

        //  otra bebida
        Bebida teConLeche = new Te();
        System.out.println("Bebida: " + teConLeche.getDescripcion());
        System.out.println("Costo total: Q" + teConLeche.costo());

        // Agregar ingredientes
        teConLeche = new Leche(teConLeche);
        teConLeche = new Leche(teConLeche); // Doble de leche
        System.out.println("Bebida personalizada: " + teConLeche.getDescripcion());
        System.out.println("Costo total: Q" + teConLeche.costo());
    }
}
//joseph isaac asencio ortiz 0907-22-11933