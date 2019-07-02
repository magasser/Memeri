package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MemeriController implements Initializable {

    private static final int INIT_SIZE = 4;

    private Memeri memeri;

    public void startMemeri() {
        this.memeri = new Memeri(INIT_SIZE);
    }


    @FXML
    private GridPane grid;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.grid.getChildren().clear();
        startMemeri();

        Card[][] cards = this.memeri.getCards();

        for(int x = 0; x < this.memeri.getWidth(); ++x) {
            for(int y = 0; y < this.memeri.getHeight(); ++y) {
                try {
                    FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getClassLoader().getResource("./sample/card.fxml")));
                    StackPane card = loader.load();
                    CardController cc = loader.getController();

                    cc.setCard(cards[x][y]);
                    ImageView iv = (ImageView)card.lookup("#innerImage");


                    iv.setImage(cards[x][y].getImage());
                    this.grid.add(card, x, y);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
