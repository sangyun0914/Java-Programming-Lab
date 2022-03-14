package Lab4.exercise1;

public class Card {
    static int DIAMOND = 0;
    static int CLUB = 1;
    static int HEART = 2;
    static int SPADE = 3;
    String[] SUIT_STRING = {"Diamonds", "Clubs", "Hearts", "Spades"};
    String[] RANK_STRING = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public String toString() {
        return (RANK_STRING[getRank()] + " of " + SUIT_STRING[getSuit()]);
    }
}
