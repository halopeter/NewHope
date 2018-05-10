package theGame;

import org.junit.Assert;
import org.junit.Test;
import thegame.controller.Game;
import thegame.model.Building;
import thegame.model.ResourceType;
import thegame.model.Resources;

public class BuildingTest 
{
 
	Game game;
	 @Test
	    public void buildingWoodBuyingTest() throws Exception {
	     game = Game.getInstance();
	     
	     Resources minResources = new Resources(0,0,0, 1,1,1);
	     Resources maxResources = new Resources(1000,1000,1000, 1,1,1);
	     
	     game.resetGame();
	     
	     game.setResources(minResources);
		 Building toBuyWood = new Building("Sawmill", "Something", 5, 20,30,40,ResourceType.Wood);
		 Assert.assertEquals(game.canBuyBuilding(toBuyWood) , false);
		 
	     game.setResources(maxResources);
		 Assert.assertEquals(game.canBuyBuilding(toBuyWood) , true);
		 
	     game.setResources(minResources);
	     Building toBuyStone = new Building("Stone Quarry", "Something", 5, 20,30,40,ResourceType.Stone);
	     Assert.assertEquals(game.canBuyBuilding(toBuyStone), false);
	     
		 game.setResources(maxResources);
	     Assert.assertEquals(game.canBuyBuilding(toBuyStone), true);
	     
	     game.setResources(minResources);
		 Building toBuyIron = new Building("Iron Mine", "Something", 5, 20,30,40,ResourceType.Iron);
		 Assert.assertEquals(game.canBuyBuilding(toBuyIron) , false);
		 
	     game.setResources(maxResources);
		 Assert.assertEquals(game.canBuyBuilding(toBuyIron) , true);

	    }

}
