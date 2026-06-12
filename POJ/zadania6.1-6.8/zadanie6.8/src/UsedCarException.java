public class UsedCarException extends Exception {

    public UsedCarException(String vin) {
        super("Wrong car information. VIN: " + vin);
    }
}