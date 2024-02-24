public class Circulo extends Figura{

    private double radio;

    public Circulo(){

    }
    public Circulo(double x, double y, double lado) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 0.14;
        double resultado  = pi *radio * radio;
        return resultado;
    }
}
