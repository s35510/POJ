import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza[] pizzas = new Pizza[40];

        for (int i = 0; i < pizzas.length; i++) {
            if (i % 3 == 0) {
                pizzas[i] = new PizzaDeluxe(
                        900 + i * 5,
                        "Deluxe " + (i + 1),
                        40 + ((i * 7) % 20),
                        "mozzarella",
                        "salami",
                        i % 2 == 0
                );
            } else if (i % 3 == 1) {
                pizzas[i] = new PizzaSpecial(
                        750 + i * 4,
                        "Special " + (i + 1),
                        30 + ((i * 5) % 18),
                        "tomato",
                        (i % 5) + 1,
                        i % 2 == 0
                );
            } else {
                pizzas[i] = new PizzaWoogy(
                        650 + i * 3,
                        "Woogy " + (i + 1),
                        25 + ((i * 6) % 16),
                        "mushrooms",
                        28 + (i % 8),
                        i % 2 == 1
                );
            }
        }

        Arrays.sort(pizzas);

        System.out.println("Pizzas sorted by price:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}