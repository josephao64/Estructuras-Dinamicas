public class Main {
    public static void main(String[] args) {
        // Intentamos obtener la instancia Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instaciasingleton = Singleton.getInstance();

        // Comprobamos si ambas instancias son la misma
        if (instance1 == instance2) {
            System.out.println("Las instancias son iguales, Singleton funciona correctamente.");
        } else {
            System.out.println("Las instancias son diferentes, algo salió mal con Singleton.");
        }

        System.out.println(instaciasingleton);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
