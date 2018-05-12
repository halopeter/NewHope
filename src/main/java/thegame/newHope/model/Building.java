package thegame.newHope.model;

/**
 * Ez a {@code Building} osztály reprezentálja a játékban megvehető építményeket,
 * melyeknek van megvételi ára, neve, és hogy mennyivel növeli meg bizonyos
 * nyersanyagok gyűjtését naponta.
 */

public class Building {

	/**
	 * {@code woodCost} hogy egy adott épületnek mennyi a fa építési költsége
	 */
	private int woodCost;
	private int stoneCost;
	private int ironCost;
	private String name;
	private String effect;
	private int increment;
	private ResourceType type;
	
	public Building(String name, String effect,int increment, int woodCost, int stoneCost, int ironCost, ResourceType type) {
		this.woodCost = woodCost;
		this.stoneCost = stoneCost;
		this.ironCost = ironCost;
		this.name = name;
		this.effect = effect;
		this.increment = increment;
		this.type = type;
	}
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