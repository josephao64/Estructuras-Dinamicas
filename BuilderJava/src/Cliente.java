public class Cliente {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();

        cocina.setPizzaBuilder(hawaiPizzaBuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();
        System.out.println("Pizza construida: " + pizza);

    }
}