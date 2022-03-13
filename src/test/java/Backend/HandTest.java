package Backend;

import no.ntnu.cardgame.Backend.DeckOfCards;
import no.ntnu.cardgame.Backend.Hand;
import no.ntnu.cardgame.Backend.PlayingCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {
    DeckOfCards deck;

    @BeforeEach
    public void setUp(){
        deck = new DeckOfCards();
    }

    @Test
    @DisplayName("Test correct given hand size")
    public void testGivenHand(){
        Hand hand = new Hand(deck.dealHand(5));
        assertEquals(5,hand.getHand().size());
    }

    @Test
    @DisplayName("Test if sum of cards works")
    public void testGetSum(){
        //Act
        ArrayList<PlayingCard> cards = new ArrayList<>();
        cards.add(new PlayingCard('S',5));
        cards.add(new PlayingCard('H',4));
        cards.add(new PlayingCard('D',3));
        cards.add(new PlayingCard('C',2));
        Hand hand = new Hand(cards);

        //Assert
        assertEquals(5+4+3+2,hand.getCardSum());

    }

}