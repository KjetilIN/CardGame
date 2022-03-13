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
    void setUp(){
        deck = new DeckOfCards();
    }

    @Test
    @DisplayName("Test correct given hand size")
    void testGivenHand(){
        Hand hand = new Hand(deck.dealHand(5));
        assertEquals(5,hand.getHand().size());
    }

    @Test
    @DisplayName("Test if sum of cards works")
    void testGetSum(){
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

    @Test
    @DisplayName("Test getHeart method works")
    void testGetHeart(){
        //Act
        ArrayList<PlayingCard> cards = new ArrayList<>();
        cards.add(new PlayingCard('S',5));
        cards.add(new PlayingCard('H',4));
        cards.add(new PlayingCard('D',3));
        cards.add(new PlayingCard('C',2));
        Hand hand = new Hand(cards);

        assertEquals(1,hand.getHearts().size());

        cards.add(new PlayingCard('H',5));
        cards.add(new PlayingCard('H',4));
        cards.add(new PlayingCard('H',3));
        cards.add(new PlayingCard('H',2));
        Hand newHand = new Hand(cards);
        assertEquals(5,newHand.getHearts().size());

        ArrayList<PlayingCard> cards2 = new ArrayList<>();
        cards2.add(new PlayingCard('S',5));
        cards2.add(new PlayingCard('S',4));
        cards2.add(new PlayingCard('D',3));
        cards2.add(new PlayingCard('C',2));
        Hand hand3 = new Hand(cards2);
        assertEquals(0,hand3.getHearts().size());
    }

}