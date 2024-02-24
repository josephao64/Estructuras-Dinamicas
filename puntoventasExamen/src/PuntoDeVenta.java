public class PuntoDeVenta {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        Producto producto1 = new Producto("Camiseta", 25.0, "12345", 10);
        Servicio servicio1 = new Servicio("Limpieza", "Limpieza a domicilio", 50.0);

        carrito.agregarElemento(producto1);
        carrito.agregarElemento(servicio1);

        // Aplicar descuento al producto
        producto1.aplicarDescuento(5.0); // Se aplica un descuento de $5
        servicio1.aplicarDescuento(5.0);

        carrito.generarRecibo();
    }
}
