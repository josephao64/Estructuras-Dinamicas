class HawaiPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildMasa() {
        pizza.setMasa("normal");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("jamón y piña");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
