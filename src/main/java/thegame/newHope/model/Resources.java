package thegame.newHope.model;

/** A class with the Resource types available in the game
 * and the corresponsive gathered amount by Daily bases. */
public class Resources {
	
    private int wood;
    private int stone;
    private int iron;
    private int incrementWood;
    private int incrementStone;
    private int incrementIron;
    
    /** GETTERS and SETTERS */
    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }


	public int getIncrementWood() {
		return incrementWood;
	}

	public void setIncrementWood(int incrementWood) {
		this.incrementWood = incrementWood;
	}
	
	public int getIncrementStone() {
		return incrementStone;
	}

	public void setIncrementStone(int incrementStone) {
		this.incrementStone = incrementStone;
	}
 

	public int getIncrementIron() {
		return incrementIron;
	}

	public void setIncrementIron(int incrementIron) {
		this.incrementIron = incrementIron;
	}
	
	public void setIncrement(ResourceType type, int amount) {
		if(type == ResourceType.Wood) {
			this.incrementWood += amount;
		} 
		else if (type == ResourceType.Stone) {
			this.incrementStone += amount;
		}
		else if (type == ResourceType.Iron) {
			this.incrementIron += amount;
		}
	}


	/** The initial resource amount that the player stars the game with. */
    public Resources() {
    	
    	this.wood = 10;
    	this.stone = 5;
    	this.iron = 0;
    	this.incrementWood = 10;
    	this.incrementStone = 5;
    	this.incrementIron = 2;
    	

    	}
    
    /** Constructor of Resources. */
	public Resources(int wood, int stone, int iron, int incrementWood, int incrementStone, int incrementIron) {
		this.wood = wood;
		this.stone = stone;
		this.iron = iron;
		this.incrementWood = incrementWood;
		this.incrementStone = incrementStone;
		this.incrementIron = incrementIron;
	}

	/** This function adds the gathered amount of wood after a day. */
	public int addWood() {
		this.wood += this.incrementWood;
		return this.wood;
	}
	
	/** This function adds the gathered amount of stone after a day. */
    public int addStone() {
    	this.stone += this.incrementStone;
    	return this.stone;
    }
    
    /** This function adds a gathered amount of iron after a day. */
    public int addIron() {
        this.iron += this.incrementIron;
        return this.iron;
    }
}