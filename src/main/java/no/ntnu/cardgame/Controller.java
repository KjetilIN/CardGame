package no.ntnu.cardgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {


    @FXML
    private ImageView deckImage;

    @FXML
    private ImageView card1;

    @FXML
    private ImageView card2;

    @FXML
    private ImageView card3;

    @FXML
    private ImageView card4;
    @FXML
    private ImageView card5;


    @FXML
    private Label txtCurrentHand;

    @FXML
    public void setTxtCurrentHand(String hand){
        txtCurrentHand.setText(hand);
    }

}
