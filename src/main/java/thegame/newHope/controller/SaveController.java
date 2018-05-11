package thegame.newHope.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import thegame.newHope.model.SaveData;

public class SaveController {

	
	Game game;
	
	
	public SaveController() {
		
		game = Game.getInstance();

	}
	
	public void saveGame() {
		  SaveData gameSave = new SaveData(game.resources, game.getDayCounter());

		  try {

			File file = new File("D:\\Egyetem\\file.xml");
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

				File file = new File("D:\\Egyetem\\file.xml");
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
