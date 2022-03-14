package Lab4.exercise1;

import java.util.Random;

public class DeckOfCards {
    Random Random = new Random();

    private final int TOTAL_CARDS = 52;
    private Card[] deck;
    private int randNum;
    private int curCard = 0;


    public DeckOfCards() {
        deck = new Card[TOTAL_CARDS];

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck[curCard] = new Card(rank, suit);
                curCard++;
            }
        }
    }

    void shuffle() {
        for (int i = 0; i < TOTAL_CARDS; i++) {
            randNum = Random.nextInt(TOTAL_CARDS);
            Card temp = deck[i];
            deck[i] = deck[randNum];
            deck[randNum] = temp;
        }
    }

    void deal() {
        for (int i = 0; i < TOTAL_CARDS; i++)
            System.out.println(deck[i].toString());
    }

}
