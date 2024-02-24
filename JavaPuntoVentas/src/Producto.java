class Producto extends ElementoVentaBase {
    private String codigoDeBarras;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, String codigoDeBarras, int cantidadEnStock) {
        super(nombre, precio);
        this.codigoDeBarras = codigoDeBarras;
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
}
