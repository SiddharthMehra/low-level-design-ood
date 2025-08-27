package Blackjack;

import java.util.List;

public class Shoe {

    private List<Deck> decks;

    private Card card;

    public Shoe(int numDecks) {}

    public void shuffle() {}
    public Card dealCard() {
        return card;
    }

    public List<Deck> getDecks() {
        return decks;
    }
}
