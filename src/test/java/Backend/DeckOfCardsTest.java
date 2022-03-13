package Backend;

import no.ntnu.cardgame.Backend.DeckOfCards;
import no.ntnu.cardgame.Backend.PlayingCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    DeckOfCards cards;

    @BeforeEach
    public void setup(){
        cards = new DeckOfCards();
    }

    @Test
    @DisplayName("Test card deck constructor")
    public void testConstructor(){
        assertNotEquals(cards.getCards().get(0),cards.getCards().get(1));
        assertEquals(52,cards.getCards().size());


        //Check if there are made duplicate cards
        ArrayList<PlayingCard> list = cards.getCards();
        Set<PlayingCard> set = new HashSet<>(list);

        if(set.size() < list.size()){
            /* There are duplicates */
            fail();
        }else{
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("Test that dealHand() method removes cards from deck")
    public void dealHand() {
        ArrayList<PlayingCard> hand = cards.dealHand(4); //Takes four cards away
        assertEquals(52-4,cards.getCards().size());

    }
}