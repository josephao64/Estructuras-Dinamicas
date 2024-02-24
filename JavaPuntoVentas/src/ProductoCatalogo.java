import java.util.ArrayList;
import java.util.List;

class ProductoCatalogo {
    private List<Producto> productosDisponibles = new ArrayList<>();

    public ProductoCatalogo() {
        productosDisponibles.add(new Producto("azucar", 05.00, "1", 50));
        productosDisponibles.add(new Producto("aceite", 15.0, "2", 30));
        // Agregar más productos si es necesario
    }

    public void mostrarProductos() {
        System.out.println("---- Productos Disponibles ----");
        for (Producto producto : productosDisponibles) {
            System.out.println("Código de Barras: " + producto.getCodigoDeBarras());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: Q" + producto.getPrecio());
            System.out.println("Cantidad en Stock: " + producto.getCantidadEnStock());
            System.out.println("------------------------------");
        }
    }

    public Producto obtenerProductoPorCodigo(String codigo) {
        for (Producto producto : productosDisponibles) {
            if (producto.getCodigoDeBarras().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
}
