public class Life extends Insurance {

    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public void setCost() {
        monthlyPrice = 36.0;
    }

    @Override
    public void display() {
        System.out.println("Insurance type: " + getType());
        System.out.println("Monthly price: $" + getMonthlyPrice());
    }
}