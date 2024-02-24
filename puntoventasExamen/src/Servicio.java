class Servicio implements ElementoVenta {
    private String nombre;
    private String descripcion;
    private double precio;
    private double descuento;

    public Servicio(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio - descuento;
    }

    @Override
    public void aplicarDescuento(double descuento) {
        this.descuento = descuento;
    }
}
