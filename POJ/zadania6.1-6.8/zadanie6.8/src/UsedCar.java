public class UsedCar {

    private String vin;
    private String make;
    private int year;
    private int mileage;
    private double price;

    public UsedCar(String vin, String make, int year, int mileage, double price)
            throws UsedCarException {

        if (vin == null || !vin.matches("\\d{4}")) {
            throw new UsedCarException(vin);
        }

        if (!isCorrectMake(make)) {
            throw new UsedCarException(vin);
        }

        if (year < 1997 || year > 2017) {
            throw new UsedCarException(vin);
        }

        if (mileage < 0 || price < 0) {
            throw new UsedCarException(vin);
        }

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    private boolean isCorrectMake(String make) {
        return make != null &&
                (make.equals("Ford") ||
                        make.equals("Honda") ||
                        make.equals("Toyota") ||
                        make.equals("Chrysler") ||
                        make.equals("Other"));
    }

    @Override
    public String toString() {
        return "VIN: " + vin +
                ", make: " + make +
                ", year: " + year +
                ", mileage: " + mileage +
                ", price: " + price;
    }
}