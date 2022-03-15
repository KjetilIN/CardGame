package no.ntnu.cardgame.Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class for a single hand.
 * Has a list of cards, and methods to check the values
 */

public class Hand {
    private final ArrayList<PlayingCard> hand;

    /**
     * Constructor for the card class.
     *
     * @param hand takes a list of cards.
     */
    public Hand(List<PlayingCard> hand){
        this.hand = (ArrayList<PlayingCard>) hand;

    }

    public List<PlayingCard> getHand() {
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
    public List<PlayingCard> getHearts(){
        return this.hand.stream().filter(card -> card.getSuit() == 'H').collect(Collectors.toList());
    }

    /**
     * Method to find a card in the deck.
     *
     * @param suit the suit of the card that is looked for.
     * @param face face of the card that are looked for.
     * @return returns the card found, or null if the card is not found.
     */

    public PlayingCard findCard(char suit, int face){
        return this.hand.stream().filter(card -> card.getSuit()==suit && card.getFace()==face).findAny().orElse(null);
    }

    /**
     * Check if current hand has flush.
     * (If all the suit for each of the cards are equal)
     *
     * @return true if you have a flush, else return false
     */
    public boolean hasFlush(){
        char suit = this.hand.get(0).getSuit();
        return this.hand.stream().allMatch(s ->s.getSuit() ==suit);
    }

}
