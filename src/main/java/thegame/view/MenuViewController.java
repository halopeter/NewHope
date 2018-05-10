package thegame.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import thegame.controller.Game;
import thegame.controller.SaveController;

public class MenuViewController implements Initializable{

	Game game;
	SaveController save;
	
	@FXML
	private void handleNewButton(ActionEvent event) {
		try {
			Parent mainMenu = FXMLLoader.load(getClass().getClassLoader().getResource("Window.fxml"));
			
            Stage stage = (Stage) mainTitle.getScene().getWindow();
            Scene scene = new Scene(mainMenu);

            stage.setScene(scene);
            stage.show();
            
            game = Game.getInstance();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
    private void handleExitButtonAction(ActionEvent event) {
        Platform.exit();
    }
	
	@FXML
	private void handleContinuteButton(ActionEvent event) {
		save.loadGame();
		
		try {
			Parent mainMenu = FXMLLoader.load(getClass().getClassLoader().getResource("Window.fxml"));
			
            Stage stage = (Stage) mainTitle.getScene().getWindow();
            Scene scene = new Scene(mainMenu);

            stage.setScene(scene);
            stage.show();
                        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Button newButton;
	
	@FXML
	private Button continueButton;
	
	@FXML
	private Button exitButton;
	
	@FXML
	private Label mainTitle;
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
		game = Game.getInstance();
		save = new SaveController();
}
	
}
