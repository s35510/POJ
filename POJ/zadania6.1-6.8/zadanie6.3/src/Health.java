public class Health extends Insurance {

    public Health() {
        super("Health");
        setCost();
    }

    @Override
    public void setCost() {
        monthlyPrice = 196.0;
    }

    @Override
    public void display() {
        System.out.println("Insurance type: " + getType());
        System.out.println("Monthly price: $" + getMonthlyPrice());
    }
}