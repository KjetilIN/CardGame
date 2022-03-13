package no.ntnu.cardgame.Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class for a single hand.
 * Has a list of cards, and methods to check the values
 */

public class Hand {
    private ArrayList<PlayingCard> hand;

    /**
     * Constructor for the card class.
     *
     * @param hand takes a list of cards.
     */
    public Hand(List<PlayingCard> hand){
        this.hand = (ArrayList<PlayingCard>) hand;

    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

    /**
     * Gets the sum of the cards.
     *
     * @return returns the sum of the cards.
     */

    public int getCardSum(){
        return this.hand.stream().reduce(0,(subtotal, card) -> subtotal+ card.getFace(), Integer::sum);
    }


    /**
     * Method that check if the hand has hearts.
     *
     * @return returns an arraylist with cards that has hearts.
     */
    public ArrayList<PlayingCard> getHearts(){
        return (ArrayList<PlayingCard>) this.hand.stream().filter(card -> card.getSuit() == 'H').collect(Collectors.toList());
    }

    public PlayingCard findCard(char suit, int face){
        PlayingCard result = null;
        try{
            result = (PlayingCard) this.hand.stream().filter(card -> card.getSuit() == suit && card.getFace()==face);
        }catch (Exception ignore){}
        return result;
    }

}
