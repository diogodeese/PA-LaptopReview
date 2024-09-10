package pt.pa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.pa.gui.LaptopsGui;

/**
 * Main entry point for the application
 *
 * @author amfs
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        LaptopsGui laptopsGui = new LaptopsGui();
        Scene scene = new Scene(laptopsGui, 800, 600);

        primaryStage.setTitle("Laptop review");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
