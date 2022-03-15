package no.ntnu.cardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import no.ntnu.cardgame.Backend.*;

import java.net.URL;
import java.util.ArrayList;
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
    private TextField txtFlush;

    @FXML
    private TextField txtHearts;

    @FXML
    private Button buttonDealHand;

    @FXML
    private Button buttonCheckHand;

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
        buttonCheckHand.setDisable(true);
    }

    /* Methods */
    @FXML
    private void onDealHand()  {

        hand = new Hand(deck.dealHand(5));
        StringBuilder result = new StringBuilder();
        for (PlayingCard card :hand.getHand()){
            result.append(card.getAsString()).append(" ");

        }

        txtHand.setText(result.toString());
        buttonDealHand.setDisable(true);
        buttonCheckHand.setDisable(false);

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
        txtHearts.setText(" ");
        txtFlush.setText(" ");
        Image backCard = new Image("no/ntnu/cardgame/img/fixedImg/backside.png");
        cardone.setImage(backCard);
        cardtwo.setImage(backCard);
        cardthree.setImage(backCard);
        cardfour.setImage(backCard);
        cardfive.setImage(backCard);
        buttonCheckHand.setDisable(true);


    }

    @FXML
    private void onCheckHand(){
        if(hand.hasFlush()){
            txtFlush.setText("YES!");
        }else{
            txtFlush.setText("No flush here....");
        }

        ArrayList<PlayingCard> hearts = (ArrayList<PlayingCard>) hand.getHearts();
        if(hearts.isEmpty()){
            txtHearts.setText("No hearts in deck");
        }else{
            StringBuilder result = new StringBuilder();
            for(PlayingCard card : hearts){
                result.append(card.getAsString()).append(" ");
            }
            txtHearts.setText(result.toString());
        }
        buttonCheckHand.setDisable(true);

    }





}
