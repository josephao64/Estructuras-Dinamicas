import java.util.ArrayList;
import java.util.List;

class CarritoDeCompras {
    private List<ElementoVenta> elementos;

    public CarritoDeCompras() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoVenta elemento) {
        elementos.add(elemento);
    }


    public double calcularTotal() {
        double total = 0;
        for (ElementoVenta elemento : elementos) {
            total += elemento.calcularPrecio();
        }
        return total;
    }

    public void generarRecibo() {

        System.out.println("--------------------------------");
        System.out.println("        Recibo de compra      ");
        System.out.println("--------------------------------");

        System.out.println();

        for (ElementoVenta elemento : elementos) {
            String tipo = elemento instanceof Producto ? "Producto" : "Servicio";
            String nombre = tipo.equals("Producto") ? ((Producto) elemento).getNombre() : ((Servicio) elemento).getNombre();
            double precioSinDescuento = elemento.getPrecio();
            double descuento = elemento.getPrecio() - elemento.calcularPrecio();
            double precioConDescuento = elemento.calcularPrecio();

            System.out.println("Tipo: " + tipo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio sin descuento: Q" + precioSinDescuento);
            System.out.println("Descuento aplicado: Q" + descuento);
            System.out.println("Precio con descuento: Q" + precioConDescuento);
            System.out.println("--------------------------------");
        }

        System.out.println("Total a pagar: Q" + calcularTotal());
        System.out.println("--------------------------------");
    }
}

