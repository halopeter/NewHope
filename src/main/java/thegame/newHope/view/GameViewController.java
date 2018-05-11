package thegame.newHope.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import thegame.newHope.controller.Game;
import thegame.newHope.controller.SaveController;
import thegame.newHope.model.Resources;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class GameViewController implements Initializable {
	
	Game game;
	SaveController save;
	
	@FXML
	private void handleEndDayButtonAction(ActionEvent event) {
		game.incrementDay();
		DayCounter.setText("Day-" + Integer.toString(game.getDayCounter()));
		if(chosenWood.isSelected()) {
			nyersanyag.addWood();
			wood.setText(Integer.toString(nyersanyag.getWood()));
		}

		if(chosenStone.isSelected()) {
			nyersanyag.addStone();
			stone.setText(Integer.toString(nyersanyag.getStone()));
		}

		if(chosenIron.isSelected()) {
			nyersanyag.addIron();
			iron.setText(Integer.toString(nyersanyag.getIron()));
		}

		
	}
	
	@FXML
	private void handleBuildingsButtonAction(ActionEvent event) {
		try {
			Parent buildings = FXMLLoader.load(getClass().getClassLoader().getResource("Buildings.fxml"));
			
            Stage stage = (Stage) DayCounter.getScene().getWindow();
            Scene scene = new Scene(buildings);

            stage.setScene(scene);
            stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	private void handleExitButtonAction(ActionEvent event) {
		Platform.exit();
	}
	
	@FXML
	private void handleSaveGameButtonAction(ActionEvent event) {
		save.saveGame();
	}
	

	@FXML
	private Button endDay;
	
	@FXML
	private Button buildingsButton;
	
	@FXML
	private Button exitButton;
	
	@FXML
	private Button saveGameButton;
	
	@FXML
	private Label DayCounter;
	
	@FXML
	private Label wood;
	
	@FXML
	private Label stone;
	
	@FXML
	private Label iron;
	
	@FXML
	private Label plusWood;
	
	@FXML
	private Label plusStone;
	
	@FXML
	private Label plusIron;
	
	@FXML
	private Label woodPlusSymbol;
	
	@FXML
	private Label stonePlusSymbol;
	
	@FXML
	private Label ironPlusSymbol;
	
	@FXML
	private RadioButton chosenWood;

	@FXML
	private RadioButton chosenStone;
	
	@FXML
	private RadioButton chosenIron;
	
	private Resources nyersanyag;
	
	@Override
	    public void initialize(URL url, ResourceBundle rb) {
			game = Game.getInstance();
			save = new SaveController();
			nyersanyag = game.getResources();
			DayCounter.setText("Day-" + Integer.toString(game.getDayCounter()));
	        wood.setText(Integer.toString(nyersanyag.getWood()));
	        stone.setText(Integer.toString(nyersanyag.getStone()));
	        iron.setText(Integer.toString(nyersanyag.getIron()));
	        plusWood.setText(Integer.toString(nyersanyag.getIncrementWood()));
	        plusStone.setText(Integer.toString(nyersanyag.getIncrementStone()));
	        plusIron.setText(Integer.toString(nyersanyag.getIncrementIron()));
	    }    
}
