module no.ntnu.cardgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens no.ntnu.cardgame to javafx.fxml;
    exports no.ntnu.cardgame;
    exports no.ntnu.cardgame.FrontEnd.controllers;
    opens no.ntnu.cardgame.FrontEnd.controllers to javafx.fxml;
}
