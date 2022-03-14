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
import java.nio.file.Path;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    /* Backend fields */
    private DeckOfCards deck;
    private Hand hand;
    private static final String CARD_TYPE_ROOT_URL = "no\\ntnu\\cardgame\\img\\cards\\";

    /* FXML fields */
    @FXML
    private TextField txtHand;

    @FXML
    private Button buttonDealHand;

    @FXML
    private ImageView cardone;

    @FXML
    private ImageView cardtwo;

    @FXML
    private ImageView cardthree;

    @FXML
    private ImageView cardfour;

    @FXML
    private  ImageView cardfive;

    /* Constructor for the controller*/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
    }

    /* Methods */
    @FXML
    private void onDealHand(ActionEvent actionEvent)  {
        int sleeptime = 2000;
        hand = new Hand(deck.dealHand(5));
        String result = "";
        for (PlayingCard card :hand.getHand()){
            result += card.getAsString() + ", ";

        }

        txtHand.setText(result);
        buttonDealHand.setDisable(true);

        /* Show hands*/
        String cardUrl1 = CARD_TYPE_ROOT_URL + hand.getHand().get(0).getUrlSting();
        String cardUrl2 = CARD_TYPE_ROOT_URL + hand.getHand().get(1).getUrlSting();
        String cardUrl3 = CARD_TYPE_ROOT_URL + hand.getHand().get(2).getUrlSting();
        String cardUrl4 = CARD_TYPE_ROOT_URL + hand.getHand().get(3).getUrlSting();
        String cardUrl5 = CARD_TYPE_ROOT_URL + hand.getHand().get(4).getUrlSting();


        Image card1 = new Image(cardUrl1);
        Image card2 = new Image(cardUrl2);
        Image card3 = new Image(cardUrl3);
        Image card4 = new Image(cardUrl4);
        Image card5 = new Image(cardUrl5);

        cardone.setImage(card1);
        cardtwo.setImage(card2);
        cardthree.setImage(card3);
        cardfour.setImage(card4);
        cardfive.setImage(card5);


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
