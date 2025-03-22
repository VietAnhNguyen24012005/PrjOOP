package com.example.log_in;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            URL fxmlLocation = Main.class.getResource("signup.fxml");
            if (fxmlLocation == null) {
                throw new IOException("Cannot find signup.fxml");
            }

            FXMLLoader loader = new FXMLLoader(fxmlLocation);
            VBox root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Sign Up");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (IOException e) {
            System.err.println("Error loading FXML: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}