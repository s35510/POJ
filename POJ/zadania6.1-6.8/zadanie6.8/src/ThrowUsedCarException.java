public class ThrowUsedCarException {

    public static void main(String[] args) {

        UsedCar[] cars = new UsedCar[7];
        int numberOfCorrectCars = 0;

        String[] vins = {
                "1234",
                "5678",
                "12A4",
                "9999",
                "7777",
                "8888",
                "0001"
        };

        String[] makes = {
                "Ford",
                "Honda",
                "Toyota",
                "BMW",
                "Chrysler",
                "Other",
                "Toyota"
        };

        int[] years = {
                2010,
                2005,
                2012,
                2011,
                1995,
                2017,
                2016
        };

        int[] mileages = {
                120000,
                80000,
                50000,
                70000,
                90000,
                -100,
                40000
        };

        double[] prices = {
                25000,
                30000,
                20000,
                35000,
                15000,
                18000,
                45000
        };

        for (int i = 0; i < cars.length; i++) {
            try {
                cars[numberOfCorrectCars] = new UsedCar(
                        vins[i],
                        makes[i],
                        years[i],
                        mileages[i],
                        prices[i]
                );

                numberOfCorrectCars++;
            } catch (UsedCarException e) {
                System.out.println("Failed to create the car: " + e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Car created successfully: ");

        for (int i = 0; i < numberOfCorrectCars; i++) {
            System.out.println(cars[i]);
        }
    }
}