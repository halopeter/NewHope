package thegame.newHope.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import thegame.newHope.model.Building;
import thegame.newHope.model.Game;
import thegame.newHope.model.Resources;

public class BuildingsViewController implements Initializable {

	Game game;
	Resources nyersanyag;
	
	@FXML
	private Label buildingsTitle;
	
	@FXML
	private Label sawmillTitle;
	
	@FXML
	private Label stoneQuarryTitle;
	
	@FXML
	private Label ironMinetitle;
	
	@FXML
	private Button buySawmill;
	
	@FXML
	private Button buyStoneQuarry;
	
	@FXML
	private Button buyIronMine;
	
	@FXML
	private Button backButton;
	
	@FXML
	private VBox buildingsContainer;
	
	@FXML
	private void handleBackButtonAction(ActionEvent event) {
		try {
			Parent backToGame = FXMLLoader.load(getClass().getClassLoader().getResource("Window.fxml"));
			
            Stage stage = (Stage) backButton.getScene().getWindow();
            Scene scene = new Scene(backToGame);
            scene.getStylesheets().add("style.css");

            stage.setScene(scene);
            stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		}
	
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
		game = Game.getInstance();
		nyersanyag = game.getResources();
		
		HBox hbox;
		VBox vbox;
		Label buildingName;
		Label description;
		Label woodCost;
		Label stoneCost;
		Label ironCost;
		Button buy;
		Region spacer;
		
		
		
		for(Building building : game.getBuildings()) {
			hbox = new HBox();
			spacer = new Region();
			buildingName = new Label();
			buildingName.setId("building-name");
			buildingName.setText(building.getName());
			buildingName.setMinWidth(260);
			
			hbox.getChildren().add(buildingName);
			
			vbox = new VBox();
			description = new Label();
			
			description.setText(building.getEffect() + Integer.toString(building.getIncrement()));
			description.setId("building-description");
			vbox.getChildren().add(description);
			
			woodCost = new Label();
			woodCost.setText(Integer.toString(building.getWoodCost()));
			vbox.getChildren().add(woodCost);
			
			stoneCost = new Label();
			stoneCost.setText(Integer.toString(building.getStoneCost()));
			vbox.getChildren().add(stoneCost);
			
			
			ironCost = new Label();
			ironCost.setText(Integer.toString(building.getIronCost()));
			
			vbox.getChildren().add(ironCost);
			vbox.setSpacing(5);
			
			hbox.setSpacing(40);
			hbox.setAlignment(Pos.CENTER_LEFT);
			
			
			hbox.getChildren().add(vbox);
			
			buy = new Button();
			buy.setText("Buy");
			
			hbox.getChildren().add(buy);
			
			buy.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
                game.buyBuilding(building);
				event.consume();
            });
			
			buildingsContainer.setSpacing(30);
			buildingsContainer.getChildren().add(hbox);
		}
	}
	
}
