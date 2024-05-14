public class Blackjack {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Deal two cards to the player
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();

        System.out.println("Your cards: ");
        System.out.println(card1);
        System.out.println(card2);

        int totalPoints = card1.getValue() + card2.getValue();
        System.out.println("Total points: " + totalPoints);
    }
}