package Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class that hold a deck of playing cards.
 * @author Kjetil Indrehu
 * @version 0.0.1
 */
public class DeckOfCards {
    private static final char[] suit = { 'S', 'H', 'D', 'C' };
    private ArrayList<PlayingCard> cards;
    private Random random;


    /**
     * The constructor for the deck of playing cards.
     */
    public DeckOfCards(){
        random = new Random();
        cards = new ArrayList<>();
        for(int i = 0; i<=3;i++){
            char face = suit[i];
            for(int k = 1; k<=13; k++){
                try{
                    cards.add(new PlayingCard(face,k));
                }catch (NullPointerException e){
                    System.err.println("Wrong");
                }

            }
        }
    }

    public List<PlayingCard> dealHand(int n){
        ArrayList<PlayingCard> hand = new ArrayList<>();
        while (n > 1){
            PlayingCard card = cards.get(random.nextInt(cards.size())); // gets a card
            hand.add(card); //add the card to the hand
            cards.remove(card); //remove the hand from the collection of cards.
        }
        return hand;

    }


}