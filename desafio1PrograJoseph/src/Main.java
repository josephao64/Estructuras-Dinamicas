
public class Main {
    public static void main(String[] args) {
        // Crear productos de prueba
        Producto producto1 = new Producto(1, "Producto 1", 10.0, 2);
        Electronico electronico1 = new Electronico(2, "Electrónico 1", 100.0, 1, "Marca 1");
        Producto producto3 = new Producto(3, "Producto 3", 5.0, 5);

        // Crear una orden
        Orden orden = new Orden();

        // Agregar productos a la orden
        orden.agregarProducto(producto1);
        orden.agregarProducto(electronico1);
        orden.agregarProducto(producto3);

        // Mostrar detalles de la orden
        orden.mostrarDetalles();
    }
}