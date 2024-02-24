public class Singleton {
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias directamente
    private Singleton() {
        // Inicialización de la instancia (si es necesario)
    }

    // Método estático para obtener la única instancia de la clase
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Otros métodos y variables de instancia
}
