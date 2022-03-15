package no.ntnu.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("temp.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Card Application");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.setMinWidth(1200);
        stage.setMinHeight(800);
        stage.show();
    }
}
