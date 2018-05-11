package thegame.newHope.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class SaveData {

	Resources resources;
	int dayCounter;
	
	public SaveData() {
		
	}
	
	public SaveData(Resources resources, int dayCounter) {
		this.resources = resources;
		this.dayCounter = dayCounter;
	}
	
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
