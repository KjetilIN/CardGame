package no.ntnu.cardgame.Backend;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private ArrayList<PlayingCard> hand;


    public Hand(List<PlayingCard> hand){
        this.hand = (ArrayList<PlayingCard>) hand;

    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }
}
