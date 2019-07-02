package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CardController implements Initializable {

    @FXML private ImageView innerImage;
    @FXML private ImageView outerImage;

    private Card card;


    public void setCard(Card card){
        this.card = card;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.innerImage.setVisible(false);
    }

    public void cardClicked() {
        this.innerImage.setVisible(!this.innerImage.isVisible());
        this.card.flip();
    }
}
