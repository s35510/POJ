public class PizzaWoogy extends Pizza {
    private String secretIngredient;
    private int sizeCm;
    private boolean vegan;

    public PizzaWoogy(double calories, String name, double price) {
        super(calories, name, price);
        this.secretIngredient = "mushrooms";
        this.sizeCm = 32;
        this.vegan = false;
    }

    public PizzaWoogy(double calories, String name, double price,
                      String secretIngredient, int sizeCm, boolean vegan) {
        super(calories, name, price);
        this.secretIngredient = secretIngredient;
        this.sizeCm = sizeCm;
        this.vegan = vegan;
    }

    public String getSecretIngredient() {
        return secretIngredient;
    }

    public int getSizeCm() {
        return sizeCm;
    }

    public boolean isVegan() {
        return vegan;
    }

    public double priceForTwoPizzas() {
        return getPrice() * 2;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " {name='" + getName() + '\''
                + ", calories=" + getCalories()
                + ", price=" + getPrice()
                + ", secretIngredient='" + secretIngredient + '\''
                + ", sizeCm=" + sizeCm
                + ", vegan=" + vegan
                + "}";
    }
}