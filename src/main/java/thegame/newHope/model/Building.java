package thegame.newHope.model;


/** A class named Building that will represent the purchasable buildings in the game. */
public class Building {

	/** The material costs of the building that can be bought,
	 * and the effect that it will have on production. */
	private int woodCost;
	private int stoneCost;
	private int ironCost;
	private String name;
	private String effect;
	private int increment;
	private ResourceType type;

	/** Constructor of a Building.
	 *@param woodCost is the wood cost of the building.
	 *@param stoneCost is the stone cost of the building.
	 *@param ironCost is the iron cost of the building.
	 *@param name is the name of the building.
	 *@param effect is the effect of the building.
	 *@param increment is the increment amount of the building.
	 *@param type is the type of the resource. */
	public Building(String name, String effect,int increment, int woodCost, int stoneCost, int ironCost, ResourceType type) {
		this.woodCost = woodCost;
		this.stoneCost = stoneCost;
		this.ironCost = ironCost;
		this.name = name;
		this.effect = effect;
		this.increment = increment;
		this.type = type;
	}

	/** This function returns the Wood cost.
	 * @return woodCost. */
	public int getWoodCost() {
		return woodCost;
	}
	/** This function returns the Stone cost.
	 * @return stoneCost. */
	public int getStoneCost() {
		return stoneCost;
	}
	/** This function returns the Iron cost.
	 * @return ironCost. */
	public int getIronCost() {
		return ironCost;
	}
	/** This function returns the name.
	 * @return name. */
	public String getName() {
		return name;
	}
	/** This function sets the Wood Cost.
	 *@param woodCost is the Wood Cost of the building. */
	public void setWoodCost(int woodCost) {
		this.woodCost = woodCost;
	}
	/** This function sets the Stone Cost.
	 *@param stoneCost is the Stone Cost of the building. */
	public void setStoneCost(int stoneCost) {
		this.stoneCost = stoneCost;
	}
	/** This function sets the Iron Cost.
	 *@param ironCost is the Iron cost of the building. */
	public void setIronCost(int ironCost) {
		this.ironCost = ironCost;
	}
	/** This function sets the Name.
	 *@param name is the name of the building. */
	public void setName(String name) {
		this.name = name;
	}
	/** This function returns the Effect of the building.
	 * @return Effect. */
	public String getEffect() {
		return effect;
	}
	/** This function sets the Effect.
	 *@param effect is the effect of the building. */
	public void setEffect(String effect) {
		this.effect = effect;
	}
	/** This function returns the Increment amount.
	 * @return Increment amount. */
	public int getIncrement() {
		return increment;
	}
	/** This function sets the Increment.
	 *@param increment is the Increment amount. */
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	/** This function returns the Type of the building..
	 * @return Type. */
	public ResourceType getType() {
		return type;
	}
	/** This function sets the Type.
	 *@param type is the Resource type. */
	public void setType(ResourceType type) {
		this.type = type;
	}
}
