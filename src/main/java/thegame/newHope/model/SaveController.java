package thegame.newHope.model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** This is a SaveController class. */
public class SaveController {

	/** Logger. */
    public static final Logger logger = LoggerFactory.getLogger(SaveController.class);

	/** Declaring a Game type variable for future usage. */
	Game game;

	/** Creating the name of the SaveFile. */
	private final String fileName = "New_Hope_Save.data";

	/** Controller of the SaveController. */
	public SaveController() {
		logger.info("Getting an instance of the game.");
		game = Game.getInstance();

	}

	/** This method saves the game progress. */
	public void saveGame() {
		/** This is where the players Resources amount
		 * and the number of days passed is saved out into a variable. */
		 logger.info("Saving out the Resources and the Day counter.");
		  SaveData gameSave = new SaveData(game.getResources(), game.getDayCounter());

		  try {

			  /** Here we check the is there already a SaveFile.
			   * If so, we are overwriting the data inside. */
			File file = new File(fileName);
			System.out.println("file existS? " + file.exists());
			JAXBContext jaxbContext = JAXBContext.newInstance(SaveData.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(gameSave, file);
			jaxbMarshaller.marshal(gameSave, System.out);

		      } catch (JAXBException e) {
						logger.error("An error occured while Saving the game!");
			e.printStackTrace();
		      }
	}

	/** With this method we are able to load a previous game progress. */
	public void loadGame() {

		/** Creating a variable for future usage. */
		logger.info("Loading in the game files from save.");
		SaveData gameLoad = new SaveData();

		 try {
			 /** This is where we are loading in the amount of Resources the player had
			  * and the amount of days passed into our Game. */
				File file = new File(fileName);
				JAXBContext jaxbContext = JAXBContext.newInstance(SaveData.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				SaveData saveGame = (SaveData) jaxbUnmarshaller.unmarshal(file);
				game.setResources(saveGame.getResources());
				game.setDayCounter(saveGame.getDayCounter());
				System.out.println(saveGame);
				System.out.println(saveGame.getDayCounter());


			  } catch (JAXBException e) {
					logger.error("An error occured while loading the game");
				e.printStackTrace();
			  }
	}
}
