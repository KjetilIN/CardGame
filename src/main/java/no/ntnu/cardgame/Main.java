package no.ntnu.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("temp.fxml"));
        Scene scene = new Scene(loader.load(),400,400);
        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();
    }
}
