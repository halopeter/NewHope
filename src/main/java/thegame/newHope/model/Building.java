package thegame.newHope.model;

/** A class named Building that will represent the purchasable buildings in the game */
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
	
	/** Constructor of a Building */
	public Building(String name, String effect,int increment, int woodCost, int stoneCost, int ironCost, ResourceType type) {
		this.woodCost = woodCost;
		this.stoneCost = stoneCost;
		this.ironCost = ironCost;
		this.name = name;
		this.effect = effect;
		this.increment = increment;
		this.type = type;
	}
	
	/** GETTERS and SETTERS */
	public int getWoodCost() {
		return woodCost;
	}
	public int getStoneCost() {
		return stoneCost;
	}
	public int getIronCost() {
		return ironCost;
	}
	public String getName() {
		return name;
	}
	public void setWoodCost(int woodCost) {
		this.woodCost = woodCost;
	}
	public void setStoneCost(int stoneCost) {
		this.stoneCost = stoneCost;
	}
	public void setIronCost(int ironCost) {
		this.ironCost = ironCost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	public ResourceType getType() {
		return type;
	}
	public void setType(ResourceType type) {
		this.type = type;
	}
}