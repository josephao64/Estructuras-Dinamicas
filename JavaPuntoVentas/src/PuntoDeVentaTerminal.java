import java.util.Scanner;

public class PuntoDeVentaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoDeCompras carrito = new CarritoDeCompras();
        ProductoCatalogo catalogo = new ProductoCatalogo();

        while (true) {
            System.out.println("1. Mostrar lista de productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Agregar servicio al carrito");
            System.out.println("4. Mostrar carrito");
            System.out.println("5. Aplicar descuento a elementos del carrito");
            System.out.println("6. Generar recibo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    catalogo.mostrarProductos();
                    break;

                case 2:
                    System.out.print("Ingrese el código de barras del producto a agregar: ");
                    String codigoProducto = scanner.nextLine();
                    Producto productoSeleccionado = catalogo.obtenerProductoPorCodigo(codigoProducto);
                    if (productoSeleccionado != null) {
                        carrito.agregarElemento(productoSeleccionado);
                        System.out.println("Producto agregado al carrito.");
                    } else {
                        System.out.println("No se encontró un producto con ese código de barras.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del servicio a agregar: ");
                    String nombreServicio = scanner.nextLine();
                    System.out.print("Ingrese el precio del servicio: ");
                    double precioServicio = scanner.nextDouble();
                    scanner.nextLine();  // Consumir el salto de línea
                    System.out.print("Ingrese la descripción del servicio: ");
                    String descripcionServicio = scanner.nextLine();
                    Servicio servicio = new Servicio(nombreServicio, precioServicio, descripcionServicio);
                    carrito.agregarElemento(servicio);
                    System.out.println("Servicio agregado al carrito.");
                    break;

                case 4:
                    carrito.mostrarCarrito();
                    break;

                case 5:
                    System.out.print("Ingrese el porcentaje de descuento a aplicar: ");
                    double descuento = scanner.nextDouble();
                    carrito.aplicarDescuento(descuento);
                    System.out.println("Descuento aplicado a los elementos en el carrito.");
                    break;

                case 6:
                    carrito.generarRecibo();
                    break;

                case 7:
                    System.out.println("Gracias por utilizar el sistema de punto de venta.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
            }
        }
    }
}
