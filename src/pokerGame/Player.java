package src.pokerGame;

import java.util.ArrayList;


public class Player {
    private String name;
    private ArrayList<String> handCards;

    public Player() {
    }

    public Player(ArrayList<String> handCards, String name) {
        this.handCards = handCards;
        this.name = name;
    }

    public ArrayList<String> getHandCards() {
        return handCards;
    }

    public void pickCard(String newCard) {
        this.handCards.add(newCard);
    }

    public void throwCard(String cards) {
        this.handCards.remove(cards);
    }

}
