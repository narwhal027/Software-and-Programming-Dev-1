

class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        try {
            return Integer.parseInt(rank);
        } catch (NumberFormatException e) {
            if (rank.equals("A")) {
                return 11; // Ace can be 1 or 11, we'll set it to 11 by default
            } else {
                return 10; // Face cards are all worth 10
            }
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
