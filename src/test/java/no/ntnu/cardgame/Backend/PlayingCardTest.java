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

    @Test
    @DisplayName("Test get card URL")
    void testGetCardURl(){
        PlayingCard jackClubs = new PlayingCard('C',11);
        assertEquals("jack_of_clubs.png",jackClubs.getUrlSting());

        PlayingCard oneHeart = new PlayingCard('H',1);
        assertEquals("ace_of_hearths.png",oneHeart.getUrlSting());

        PlayingCard fourSpades = new PlayingCard('S',4);
        assertEquals("4_of_spades.png",fourSpades.getUrlSting());
    }
}