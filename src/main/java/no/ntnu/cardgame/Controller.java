package no.ntnu.cardgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lbl;

    @FXML
    public void onClick(){
        lbl.setText("CLICK");
    }
}
