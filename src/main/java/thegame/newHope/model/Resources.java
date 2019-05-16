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

		/** A method used to get the Wood amount.
		 * @return the resource. */
    public int getWood() {
        return wood;
    }

		/** A method used to set the Wood amount.
		 * @param wood is the amount of resource we have of this type. */
    public void setWood(int wood) {
        this.wood = wood;
    }

		/** A method used to get the Stone amount.
		 * @return the resource. */
    public int getStone() {
        return stone;
    }

		/** A method used to set the Stone amount.
		 * @param stone is the amount of resource we have of this type. */
    public void setStone(int stone) {
        this.stone = stone;
    }

		/** A method used to get the Iron amount.
		 * @return the resource. */
    public int getIron() {
        return iron;
    }

		/** A method used to set the Iron amount.
		 * @param iron is the amount of resource we have of this type. */
    public void setIron(int iron) {
        this.iron = iron;
    }

		/** A method used to get the Wood increment amount.
		 * @return the increment. */
	public int getIncrementWood() {
		return incrementWood;
	}

	/** A method used to set the Wood increment.
	 * @param incrementWood is the amount we need to add. */
	public void setIncrementWood(int incrementWood) {
		this.incrementWood = incrementWood;
	}

	/** A method used to get the Stone increment amount.
	 * @return the increment. */
	public int getIncrementStone() {
		return incrementStone;
	}

	/** A method used to set the Stone increment.
	 * @param incrementStone is the amount we need to add. */
	public void setIncrementStone(int incrementStone) {
		this.incrementStone = incrementStone;
	}


	/** A method used to get the Iron increment amount.
	 * @return the increment. */
	public int getIncrementIron() {
		return incrementIron;
	}

	/** A method used to set the Iron increment.
	 * @param incrementIron is the amount we need to add. */
	public void setIncrementIron(int incrementIron) {
		this.incrementIron = incrementIron;
	}

	/** A method used to set the Increment amount.
	 * @param type is the Resource type.
	 * @param amount is the amount of resources. */
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

    /** Constructor of Resources.
		 * @param wood is the wood amount in stockpile.
		 * @param stone is the stone amount in stockpile.
		 * @param iron is the iron amount in stockpile.
		 * @param incrementWood is the gathered wood per day.
		 * @param incrementStone is the gathered stone per day.
		 * @param incrementIron is the gathered iron per day. */
	public Resources(int wood, int stone, int iron, int incrementWood, int incrementStone, int incrementIron) {
		this.wood = wood;
		this.stone = stone;
		this.iron = iron;
		this.incrementWood = incrementWood;
		this.incrementStone = incrementStone;
		this.incrementIron = incrementIron;
	}

	/** This function adds the gathered amount of wood after a day.
	 * @return the updated Wood amount. */
	public int addWood() {
		this.wood += this.incrementWood;
		return this.wood;
	}

	/** This function adds the gathered amount of stone after a day.
	 * @return the updated Stone amount. */
    public int addStone() {
    	this.stone += this.incrementStone;
    	return this.stone;
    }

    /** This function adds a gathered amount of iron after a day.
		 * @return the updated Iron amount. */
    public int addIron() {
        this.iron += this.incrementIron;
        return this.iron;
    }
}
