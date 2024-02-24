import java.util.ArrayList;
import java.util.List;

class CarritoDeCompras {
    private List<ElementoVenta> elementos = new ArrayList<>();

    public void agregarElemento(ElementoVenta elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(ElementoVenta elemento) {
        elementos.remove(elemento);
    }

    public double calcularTotal() {
        double total = 0;
        for (ElementoVenta elemento : elementos) {
            total += elemento.calcularPrecio();
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println("---- Carrito de Compras ----");
        if (elementos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (int i = 0; i < elementos.size(); i++) {
                ElementoVenta elemento = elementos.get(i);
                System.out.println("Item " + (i + 1) + ":");
                if (elemento instanceof Producto) {
                    Producto producto = (Producto) elemento;
                    System.out.println("Tipo: Producto");
                    System.out.println("Nombre: " + producto.getNombre());
                    System.out.println("Precio: Q" + producto.getPrecio());
                    System.out.println("Código de Barras: " + producto.getCodigoDeBarras());
                    System.out.println("Cantidad en Stock: " + producto.getCantidadEnStock());
                } else if (elemento instanceof Servicio) {
                    Servicio servicio = (Servicio) elemento;
                    System.out.println("Tipo: Servicio");
                    System.out.println("Nombre: " + servicio.getNombre());
                    System.out.println("Precio: Q" + servicio.getPrecio());
                    System.out.println("Descripción: " + servicio.getDescripcion());
                }
                System.out.println("------------------------------");
            }
        }
    }

    public void aplicarDescuento(double descuento) {
        for (ElementoVenta elemento : elementos) {
            double precioOriginal = elemento.calcularPrecio();
            double precioConDescuento = precioOriginal - (precioOriginal * descuento / 100);
            if (elemento instanceof Producto) {
                Producto producto = (Producto) elemento;
                int cantidad = producto.getCantidadEnStock();
                producto.setCantidadEnStock(cantidad - 1);
            }
            ((ElementoVentaBase) elemento).setPrecio(precioConDescuento);
        }
    }

    public void generarRecibo() {
        System.out.println("---- Recibo de Compra ----");
        for (ElementoVenta elemento : elementos) {
            System.out.println("Nombre: " + elemento.getNombre());
            System.out.println("Precio: Q" + elemento.getPrecio());
            System.out.println("------------------------------");
        }
        double total = calcularTotal();
        System.out.println("Total de la compra: Q" + total);
        System.out.println("------------------------------");
    }
}
