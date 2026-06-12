public class PizzaDeluxe extends Pizza {
    private String firstExtra;
    private String secondExtra;
    private boolean stuffedCrust;

    public PizzaDeluxe(double calories, String name, double price) {
        super(calories, name, price);
        this.firstExtra = "cheese";
        this.secondExtra = "ham";
        this.stuffedCrust = true;
    }

    public PizzaDeluxe(double calories, String name, double price,
                       String firstExtra, String secondExtra, boolean stuffedCrust) {
        super(calories, name, price);
        this.firstExtra = firstExtra;
        this.secondExtra = secondExtra;
        this.stuffedCrust = stuffedCrust;
    }

    public String getFirstExtra() {
        return firstExtra;
    }

    public String getSecondExtra() {
        return secondExtra;
    }

    public boolean hasStuffedCrust() {
        return stuffedCrust;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        this.stuffedCrust = stuffedCrust;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " {name='" + getName() + '\''
                + ", calories=" + getCalories()
                + ", price=" + getPrice()
                + ", firstExtra='" + firstExtra + '\''
                + ", secondExtra='" + secondExtra + '\''
                + ", stuffedCrust=" + stuffedCrust
                + "}";
    }
}