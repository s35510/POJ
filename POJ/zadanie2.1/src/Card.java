// Autor: Tomasz Kreft s35510

// Zadanie 1
//
//Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl.
// W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy Card.

enum Suit {
    KIER,
    KARO,
    PIK,
    TREFL
}

public class Card {
    private String value;
    private Suit suit;

    public Card(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + " " + suit;
    }
}