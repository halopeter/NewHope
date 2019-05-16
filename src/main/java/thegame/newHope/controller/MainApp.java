package thegame.newHope.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
*	The main app class.
*/
public class MainApp extends Application {

	/** Logger. */
    public static final Logger logger = LoggerFactory.getLogger(MainApp.class);

	@Override
	public void start(Stage primaryStage) throws IOException {

		Parent root = FXMLLoader.load((getClass().getClassLoader().getResource("StartingGame.fxml")));

		Scene scene = new Scene(root);
        scene.getStylesheets().add("style.css");

		primaryStage.setTitle("JavaFX and Maven");
		primaryStage.setScene(scene);
		primaryStage.show();

		logger.info("Showing the Scene.");
	}

	/** This is the main which launches the whole game.
	 *@param args is the arguments of the Launch. */
	public static void main(String[] args) {
		launch(args);
		logger.info("Launching main.");
	}
}
