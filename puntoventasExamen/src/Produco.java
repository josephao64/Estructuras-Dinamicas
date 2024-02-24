class Producto implements ElementoVenta {
    private String nombre;
    private double precio;
    private String codigoDeBarras;
    private int cantidadEnStock;
    private double descuento; // Nuevo atributo para el descuento

    public Producto(String nombre, double precio, String codigoDeBarras, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoDeBarras = codigoDeBarras;
        this.cantidadEnStock = cantidadEnStock;
        this.descuento = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }



    @Override
    public double calcularPrecio() {
        return precio - descuento; // Se resta el descuento al precio
    }

    @Override
    public void aplicarDescuento(double descuento) {
        this.descuento = descuento;
    }
}