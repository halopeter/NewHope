package thegame.newHope.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		Parent root = FXMLLoader.load((getClass().getClassLoader().getResource("StartingGame.fxml")));
		// Parent root =
		// FXMLLoader.load(getClass().getResource("/view/StartingGame.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("/Maven Dependencies/junit-3.8.1.jar/stylesheet.css");

		primaryStage.setTitle("JavaFX and Maven");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
