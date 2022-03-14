package no.ntnu.cardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import no.ntnu.cardgame.Backend.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    /* Backend fields */
    private DeckOfCards deck;
    private Hand hand;

    /* FXML fields */
    @FXML
    private TextField txtHand;

    @FXML
    private Button buttonDealHand;

    /* Constructor for the controller*/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
    }

    /* Methods */
    @FXML
    private void onDealHand(ActionEvent actionEvent){
        hand = new Hand(deck.dealHand(5));
        String result = "";
        for (PlayingCard card :hand.getHand()){
            result += card.getAsString() + ", ";

        }
        /* Show hands*/




        txtHand.setText(result);
        buttonDealHand.setDisable(true);

    }

    @FXML
    private void onExit(ActionEvent actionEvent){
        System.exit(0);
    }

    @FXML
    private void onNewDeck(){
        /* Reset everything */
        deck = new DeckOfCards();
        buttonDealHand.setDisable(false);
        txtHand.setText(" ");
    }





}
