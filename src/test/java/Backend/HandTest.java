package Backend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

}