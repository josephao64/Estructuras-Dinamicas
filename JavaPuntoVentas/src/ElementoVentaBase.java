abstract class ElementoVentaBase implements ElementoVenta {
    protected String nombre;
    protected double precio;

    public ElementoVentaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
