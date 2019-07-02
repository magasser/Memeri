package sample;

import javafx.scene.image.Image;

public class Card {

    private static final String IMAGE_PATH = "./images/";
    private Image image;
    private boolean isFlipped;

    public Image getImage(){
        return this.image;
    }

    public Card(String image){
        this.image = new Image(IMAGE_PATH + image);
        this.isFlipped = false;
    }

    public void flip(){
        this.isFlipped = !this.isFlipped;
    }
}
