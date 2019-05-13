package thegame.newHope.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class SaveData {

	/** Here we are declaring what data we want to be saved when we hit the save button. */
	Resources resources;
	int dayCounter;
	
	/** Constructor of SaveData. */
	public SaveData() {
		
	}
	
	/** Constructor of SaveData.
	 * Here we are getting the Resources and days passed ingame. */
	public SaveData(Resources resources, int dayCounter) {
		this.resources = resources;
		this.dayCounter = dayCounter;
	}
	
	/** GETTERS and SETTERS */
	public Resources getResources() {
		return resources;
	}
	
	public int getDayCounter() {
		return dayCounter;
	}
	
	@XmlElement
	public void setResources(Resources resources) {
		this.resources = resources;
	}
	
	@XmlElement
	public void setDayCounter(int dayCounter) {
		this.dayCounter = dayCounter;
	}
	
	
	
}
