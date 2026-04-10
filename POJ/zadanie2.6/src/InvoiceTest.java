
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("A101", "Klawiatura", 2, 99.99);
        Invoice invoice2 = new Invoice("B202", "Mysz", -3, 49.99);
        Invoice invoice3 = new Invoice("C303", "Monitor", 1, -100.00);

        System.out.println("Kwota faktury 1: " + invoice1.amount());
        System.out.println("Kwota faktury 2: " + invoice2.amount());
        System.out.println("Kwota faktury 3: " + invoice3.amount());
    }
}