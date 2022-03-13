package Backend;


import no.ntnu.cardgame.Backend.PlayingCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {
    PlayingCard card;

    @BeforeEach
    public void setup(){
        card = new PlayingCard('H',3);
    }

    @Test
    @DisplayName("[TEST]: Get suit")
    public void getSuit() {
        assertEquals('H',card.getSuit());
    }

    @Test
    @DisplayName("[TEST]: Get face")
    public void getFace() {
        assertEquals(3,card.getFace());
    }
}