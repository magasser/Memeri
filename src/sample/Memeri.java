package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Memeri {

    private int width;
    private int height;

    private Card[][] cards;

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public Card[][] getCards(){
        return this.cards;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public Memeri(int size){
        this(size, size);
    }

    public Memeri(int width, int height){
        if ((width * height) % 2 != 0){
            System.err.println("Memeri not even numbers of cards!");
            return;
        }

        this.width = width;
        this.height = height;

        int nrOfImages = this.width * this.height / 2;
        List<String> images = getListOfImages();
        Collections.shuffle(images);
        List<String> memeriImages = new ArrayList<>();

        for (int i = 0; i < nrOfImages; ++i){
            memeriImages.add(images.get(i));
        }

        memeriImages.addAll(memeriImages);

        this.cards = new Card[width][height];

        int i = 0;
        for(int x = 0; x < this.width; ++x){
            for(int y = 0; y < this.height; ++y){
                this.cards[x][y] = new Card(memeriImages.get(i++));
            }
        }

    }

    private List<String> getListOfImages(){
        List<String> images = new ArrayList<>();
        File[] files = new File("./images/").listFiles();

        if (files != null){
            for (File file : files){
                images.add(file.getName());
            }
        }

        return images;
    }
}
