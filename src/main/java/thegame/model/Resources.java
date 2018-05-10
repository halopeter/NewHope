package thegame.model;

public class Resources {
	
    private int wood;
    private int stone;
    private int iron;
    private int incrementWood;
    private int incrementStone;
    private int incrementIron;
    
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


    public Resources() {
    	
    	this.wood = 10;
    	this.stone = 5;
    	this.iron = 0;
    	this.incrementWood = 10;
    	this.incrementStone = 5;
    	this.incrementIron = 2;
    	

    	}
    
    
    
	public Resources(int wood, int stone, int iron, int incrementWood, int incrementStone, int incrementIron) {
		this.wood = wood;
		this.stone = stone;
		this.iron = iron;
		this.incrementWood = incrementWood;
		this.incrementStone = incrementStone;
		this.incrementIron = incrementIron;
	}

	public int addWood() {
		this.wood += this.incrementWood;
		return this.wood;
		
	}
	
    public int addStone() {
    	this.stone += this.incrementStone;
    	return this.stone;
    
    }
    
    public int addIron() {
        this.iron += this.incrementIron;
        return this.iron;
    }

}
