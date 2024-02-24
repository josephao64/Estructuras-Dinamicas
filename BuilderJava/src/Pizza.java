class Pizza {
    private String masa;
    private String salsa;
    private String topping;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza con masa " + masa + ", salsa " + salsa + " y topping " + topping;
    }
}
