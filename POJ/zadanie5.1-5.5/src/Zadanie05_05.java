public class Zadanie05_05 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Jan Kowalski", 10);
        Customer customer2 = new Customer(2, "Janina Kowalska", 25);

        Invoice invoice1 = new Invoice(101, customer1, 200.00);
        Invoice invoice2 = new Invoice(102, customer2, 400.00);

        printCustomer(customer1);
        printCustomer(customer2);

        printInvoice(invoice1);
        printInvoice(invoice2);

        customer1.setDiscount(20);
        invoice1.setAmount(300.00);

        System.out.println("Invoice after setting new amount and new discount: ");
        printInvoice(invoice1);
    }

    private static void printCustomer(Customer customer) {
        System.out.println("Customer: " + customer);
        System.out.println("Customer ID: " + customer.getID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Discount: " + customer.getDiscount() + "%");
        System.out.println();
    }

    private static void printInvoice(Invoice invoice) {
        System.out.println(invoice);
        System.out.println("Invoice ID: " + invoice.getID());
        System.out.println("Customer: " + invoice.getCustomer());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Price after discount: " + invoice.getAmountAfterDiscount());
        System.out.println();
    }
}
