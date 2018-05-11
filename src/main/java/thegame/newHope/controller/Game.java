package thegame.newHope.controller;

import java.util.ArrayList;
import java.util.List;

import thegame.newHope.model.Building;
import thegame.newHope.model.ResourceType;
import thegame.newHope.model.Resources;

public class Game {

	Resources resources;
	static Game instance;
	private int dayCounter;

	private List<Building> buildings;

	private Game() {

		buildings = new ArrayList<>();
		buildings.add(new Building("Sawmill", "Increases wood income by ", 10, 50, 30, 10, ResourceType.Wood));
		buildings.add(new Building("Stone Quarry", "Increases stone income by ", 5, 30, 40, 15, ResourceType.Stone));
		buildings.add(new Building("Iron Mine", "Increases iron income by ", 2, 15, 25, 30, ResourceType.Iron));

		resetGame();
	}

	public static Game getInstance() {
		if (instance == null) {
			instance = new Game();
		}
		return instance;
	}

	public void resetGame() {
		this.resources = new Resources();
		setDayCounter(1);
	}

	public void incrementDay() {

		this.dayCounter += 1;
	}

	public void subWood(int cost) {
		int haveWood = resources.getWood();
		resources.setWood(haveWood -= cost);
	}

	public void subStone(int cost) {
		int haveStone = resources.getStone();
		resources.setStone(haveStone -= cost);
	}

	public void subIron(int cost) {
		int haveIron = resources.getIron();
		resources.setIron(haveIron -= cost);
	}

	public void buyBuilding(Building building) {
		if (canBuyBuilding(building)) {

			subWood(building.getWoodCost());
			subStone(building.getStoneCost());
			subIron(building.getIronCost());

			applyBuildingEffect(building.getType(), building.getIncrement());
		}

	}

	public void applyBuildingEffect(ResourceType type, int amount) {
		resources.setIncrement(type, amount);
	}

	public Boolean canBuyBuilding(Building building) {

		return resources.getWood() >= building.getWoodCost() && resources.getStone() >= building.getStoneCost()
				&& resources.getIron() >= building.getIronCost();

	}

	public Resources getResources() {
		return resources;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}

	public int getDayCounter() {
		return dayCounter;
	}

	public void setDayCounter(int dayCounter) {
		this.dayCounter = dayCounter;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

}
