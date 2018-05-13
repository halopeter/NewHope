package thegame.newHope.model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class SaveController {

	
	Game game;
	private final String fileName = "New_Hope_Save.data";
	
	
	public SaveController() {
		
		game = Game.getInstance();

	}
	
	public void saveGame() {
		  SaveData gameSave = new SaveData(game.getResources(), game.getDayCounter());

		  try {

			File file = new File(fileName);
			System.out.println("file existS? " + file.exists());
			JAXBContext jaxbContext = JAXBContext.newInstance(SaveData.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(gameSave, file);
			jaxbMarshaller.marshal(gameSave, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
	}
	
	public void loadGame() {
		
		SaveData gameLoad = new SaveData();
		
		 try {
				File file = new File(fileName);
				JAXBContext jaxbContext = JAXBContext.newInstance(SaveData.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				SaveData saveGame = (SaveData) jaxbUnmarshaller.unmarshal(file);
				game.setResources(saveGame.getResources());
				game.setDayCounter(saveGame.getDayCounter());
				System.out.println(saveGame);
				System.out.println(saveGame.getDayCounter());
				

			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
	}
}
