package thegame.newHope.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

	/** Declaring variables that the actual Game is going to use.
	 * Like resources in our stockpile, an Instance of the game
	 * and the Days passed. */
	Resources resources;
	static Game instance;
	private int dayCounter;

	/** Declaring a List where we can put the purchasable buildings in the game. */
	private List<Building> buildings;

	/** Constructor of the Game. */
	private Game() {

		/** Here we are adding the purchasable buildings to the game. */
		buildings = new ArrayList<>();
		buildings.add(new Building("Sawmill", "Increases wood income by ", 10, 50, 30, 10, ResourceType.Wood));
		buildings.add(new Building("Stone Quarry", "Increases stone income by ", 5, 30, 40, 15, ResourceType.Stone));
		buildings.add(new Building("Iron Mine", "Increases iron income by ", 2, 15, 25, 30, ResourceType.Iron));

		resetGame();
	}

	/** Getting an Instance of the game if there is one already.
	 * If not, we are creating a new one. */
	public static Game getInstance() {
		if (instance == null) {
			instance = new Game();
		}
		return instance;
	}

	/** A method which we can use to reset the Game progress. */
	public void resetGame() {
		this.resources = new Resources();
		setDayCounter(1);
	}

	/** A method which is used to increment the DayCounter by one. */
	public void incrementDay() {

		this.dayCounter += 1;
	}

	/** A method used to subtract the wood cost of a building. */
	public void subWood(int cost) {
		int haveWood = resources.getWood();
		resources.setWood(haveWood -= cost);
	}

	/** A method used to subtract the stone cost of a building. */
	public void subStone(int cost) {
		int haveStone = resources.getStone();
		resources.setStone(haveStone -= cost);
	}

	/** A method used to subtract the iron cost of a building. */
	public void subIron(int cost) {
		int haveIron = resources.getIron();
		resources.setIron(haveIron -= cost);
	}

	/** A method used to buy the buildings the player wants to. */
	public void buyBuilding(Building building) {
		if (canBuyBuilding(building)) {

			subWood(building.getWoodCost());
			subStone(building.getStoneCost());
			subIron(building.getIronCost());

			applyBuildingEffect(building.getType(), building.getIncrement());
		}

	}

	/** Applying a buildings effect to the production of the Resource type. */
	public void applyBuildingEffect(ResourceType type, int amount) {
		resources.setIncrement(type, amount);
	}

	/** A function used to determinte that the player is able 
	 * to buy the building he wants to, or not. */
	public Boolean canBuyBuilding(Building building) {
		return resources.getWood() >= building.getWoodCost() && resources.getStone() >= building.getStoneCost()
				&& resources.getIron() >= building.getIronCost();

	}

	/** GETTERS and SETTERS */
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
