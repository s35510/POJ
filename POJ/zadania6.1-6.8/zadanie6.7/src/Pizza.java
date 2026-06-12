public class Pizza implements Comparable {
    private double calories;
    private String name;
    private double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " {name='" + name + '\''
                + ", calories=" + calories
                + ", price=" + price
                + "}";
    }

    @Override
    public int compareTo(Object object) {
        Pizza otherPizza = (Pizza) object;
        return Double.compare(this.price, otherPizza.price);
    }
}