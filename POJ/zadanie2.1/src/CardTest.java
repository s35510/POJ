public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card("AS", Suit.KIER);
        Card card2 = new Card("10", Suit.KARO);
        Card card3 = new Card("DAMA", Suit.PIK);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}