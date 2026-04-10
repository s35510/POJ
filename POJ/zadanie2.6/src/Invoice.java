// Autor: Tomasz Kreft s35510

// Zadanie 6
//
// Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu.
// Klasa przechowuje następujące informacje: product_number (typ String), prodcut_description (typ String),
// quantity(typ int) i pricePerItem`(typ double). Klasa powinna mieć konstruktor, który umożliwi podanie
// wszystkich 4 parametrów. Zaimplementuj metody set i get dla każdej zmiennej. Dodaj metodę:
//
//    -	Amount, które zwraca iloczyn quantity i pricePerItem. Jeżeli pricePerItem nie jest dodatnia, Amount powinien
//      zwrócić 0. Jeżeli quantity nie jest dodatnie, Amount powinna zwrócić 0.
//      Przetestuj zaimplementowany program.

public class Invoice {
    private String productNumber;
    private String productDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String productNumber, String productDescription, int quantity, double pricePerItem) {
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double amount() {
        if (quantity <= 0 || pricePerItem <= 0) {
            return 0;
        }

        return quantity * pricePerItem;
    }
}