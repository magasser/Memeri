package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CardController implements Initializable {

    @FXML private ImageView innerImage;
    @FXML private ImageView outerImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.innerImage.setVisible(false);
    }
}
