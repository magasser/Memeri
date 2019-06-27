package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("./sample/memeri.fxml")));
        primaryStage.setTitle("Memeri");
        Scene scene = new Scene(root, 800,800);
        String styles = Objects.requireNonNull(this.getClass().getClassLoader().getResource("./sample/styles.css")).toExternalForm();
        scene.getStylesheets().add(styles);
        primaryStage.setScene(scene);
        //primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
