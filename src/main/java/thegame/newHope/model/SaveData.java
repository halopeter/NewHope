package thegame.newHope.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/** Th is a SaveData class. */
@XmlRootElement
public class SaveData {

	/** Here we are declaring what data we want to be saved when we hit the save button. */
	Resources resources;
	int dayCounter;

	/** Constructor of SaveData. */
	public SaveData() {

	}

	/** Constructor of SaveData.
	 * Here we are getting the Resources and days passed ingame.
	 * @param resources is the amount of the resources the player has.
	 * @param dayCounter is the amount of days passed ingame. */
	public SaveData(Resources resources, int dayCounter) {
		this.resources = resources;
		this.dayCounter = dayCounter;
	}

	/** This function returns the Resources.
	 * @return resources of the player has. */
	public Resources getResources() {
		return resources;
	}

	/** This function returns the DayCounter.
	 * @return Number of days passed. */
	public int getDayCounter() {
		return dayCounter;
	}

	/** This function sets the resources..
	 *@param resources is the amount of resources the player has. */
	@XmlElement
	public void setResources(Resources resources) {
		this.resources = resources;
	}

	/** This function sets the dayCounter.
	 *@param dayCounter is the amount of days passed. */
	@XmlElement
	public void setDayCounter(int dayCounter) {
		this.dayCounter = dayCounter;
	}
}
