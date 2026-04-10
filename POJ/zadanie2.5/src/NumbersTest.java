public class NumbersTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(2, 4, 8);

        System.out.println("Suma: " + numbers.sum());
        System.out.println("Srednia: " + numbers.average());
        System.out.println("Min: " + numbers.min());
        System.out.println("Max: " + numbers.max());
        System.out.println("Srednia geometryczna: " + numbers.geometric());
    }
}