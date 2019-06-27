package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MemeriController implements Initializable {

    private static final int INIT_SIZE = 5;

    public void startMemeri() {

    }


    @FXML
    private GridPane grid;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.grid.getChildren().clear();

        for(int x = 0; x < INIT_SIZE; ++x) {
            for(int y = 0; y < INIT_SIZE; ++y) {
                try {
                    Parent card = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("./sample/card.fxml")));

                    this.grid.add(card, x, y);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
