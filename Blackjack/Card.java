package Blackjack;

public class Card {

    private Suit suit;
    private int faceValue;

    public Card(Suit suit, int faceValue) {}

    public int getValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "";
    }

}
