package no.ntnu.cardgame.Backend;


import no.ntnu.cardgame.Backend.PlayingCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {
    PlayingCard card;

    @BeforeEach
    void setup(){
        card = new PlayingCard('H',3);
    }

    @Test
    @DisplayName("Test get suit")
    void getSuit() {
        assertEquals('H',card.getSuit());
    }

    @Test
    @DisplayName("Test get face")
    void getFace() {
        assertEquals(3,card.getFace());
    }
}