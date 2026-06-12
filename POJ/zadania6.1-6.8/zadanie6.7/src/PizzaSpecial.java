public class PizzaSpecial extends Pizza {
    private String sauce;
    private int spiceLevel;
    private boolean limitedEdition;

    public PizzaSpecial(double calories, String name, double price) {
        super(calories, name, price);
        this.sauce = "tomato";
        this.spiceLevel = 1;
        this.limitedEdition = false;
    }

    public PizzaSpecial(double calories, String name, double price,
                        String sauce, int spiceLevel, boolean limitedEdition) {
        super(calories, name, price);
        this.sauce = sauce;
        this.spiceLevel = spiceLevel;
        this.limitedEdition = limitedEdition;
    }

    public String getSauce() {
        return sauce;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public boolean isLimitedEdition() {
        return limitedEdition;
    }

    public boolean isSpicy() {
        return spiceLevel >= 4;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " {name='" + getName() + '\''
                + ", calories=" + getCalories()
                + ", price=" + getPrice()
                + ", sauce='" + sauce + '\''
                + ", spiceLevel=" + spiceLevel
                + ", limitedEdition=" + limitedEdition
                + "}";
    }
}