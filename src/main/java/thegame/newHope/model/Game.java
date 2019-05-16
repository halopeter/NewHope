package thegame.newHope.model;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** This is a Game class. */
public class Game {

	/** Logger. */
    public static final Logger logger = LoggerFactory.getLogger(Game.class);

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
		logger.info("Adding the buildings to the list.");
		buildings.add(new Building("Sawmill", "Increases wood income by ", 10, 50, 30, 10, ResourceType.Wood));
		buildings.add(new Building("Stone Quarry", "Increases stone income by ", 5, 30, 40, 15, ResourceType.Stone));
		buildings.add(new Building("Iron Mine", "Increases iron income by ", 2, 15, 25, 30, ResourceType.Iron));

		resetGame();
	}

	/** Getting an Instance of the game if there is one already.
	 * If not, we are creating a new one.
	 * @return an Instance of the game. */
	public static Game getInstance() {
		if (instance == null) {
			logger.info("Creating a new game.");
			instance = new Game();
		}
		return instance;
	}

	/** A method which we can use to reset the Game progress. */
	public void resetGame() {
		logger.info("Reseting the game.");
		this.resources = new Resources();
		setDayCounter(1);
	}

	/** A method which is used to increment the DayCounter by one. */
	public void incrementDay() {
		logger.info("Incrementing the day by 1.");
		this.dayCounter += 1;
	}

	/** A method used to subtract the wood cost of a building.
	 * @param cost is the cost in Wood */
	public void subWood(int cost) {
		logger.info("Subtracting the Wood cost.");
		int haveWood = resources.getWood();
		resources.setWood(haveWood -= cost);
	}

	/** A method used to subtract the stone cost of a building.
	 * @param cost is the cost in Stone. */
	public void subStone(int cost) {
		logger.info("Subtracting the Stone cost.");
		int haveStone = resources.getStone();
		resources.setStone(haveStone -= cost);
	}

	/** A method used to subtract the iron cost of a building.
	 * @param cost is the cost in Iron. */
	public void subIron(int cost) {
		logger.info("Subtracting the Iron cost.");
		int haveIron = resources.getIron();
		resources.setIron(haveIron -= cost);
	}

	/** A method used to buy the buildings the player wants to.
	 * @param building is the list of buildings. */
	public void buyBuilding(Building building) {
		logger.info("Checking that the player can buy the building or not.");
		if (canBuyBuilding(building)) {

			logger.info("Subtracting the cost from the player.");
			subWood(building.getWoodCost());
			subStone(building.getStoneCost());
			subIron(building.getIronCost());

			logger.info("Applying the increment of the building.");
			applyBuildingEffect(building.getType(), building.getIncrement());
		}

	}

	/** Applying a buildings effect to the production of the Resource type.
	 * @param type is the resource type.
	 * @param amount is the amount of resources.*/
	public void applyBuildingEffect(ResourceType type, int amount) {
		logger.info("Applying the increment type of the building.");
		resources.setIncrement(type, amount);
	}

	/** A function used to determinte that the player is able
	 * to buy the building he wants to, or not.
	 * @param building is the buildings list.
	 * @return that the player can buy the building or not. */
	public Boolean canBuyBuilding(Building building) {
		logger.info("Checking that the player can buy the building or not.");
		return resources.getWood() >= building.getWoodCost() && resources.getStone() >= building.getStoneCost()
				&& resources.getIron() >= building.getIronCost();

	}

	/** This function returns the Resources.
	 * @return resources of the player. */
	public Resources getResources() {
		return resources;
	}

	/** This function sets the Resources.
	 *@param resources is the Resources amount we have in stockpile. */
	public void setResources(Resources resources) {
		this.resources = resources;
	}

	/** This function returns the DayCounter.
	 * @return Number of days passed. */
	public int getDayCounter() {
		return dayCounter;
	}

	/** This function sets the DayCounter.
	 *@param dayCounter is the number of days passed. */
	public void setDayCounter(int dayCounter) {
		this.dayCounter = dayCounter;
	}

	/** This function returns the Buildings.
	 * @return a list of the buildings. */
	public List<Building> getBuildings() {
		return buildings;
	}
	/** This function sets the Building list.
	 *@param buildings is the buildings. */
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

}
