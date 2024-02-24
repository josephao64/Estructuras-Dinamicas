class Servicio extends ElementoVentaBase {
    private String descripcion;

    public Servicio(String nombre, double precio, String descripcion) {
        super(nombre, precio);
        this.descripcion = descripcion;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

