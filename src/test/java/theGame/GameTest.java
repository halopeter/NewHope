package theGame;

import org.junit.Assert;
import org.junit.Test;
import thegame.newHope.controller.Game;
import thegame.newHope.model.Building;
import thegame.newHope.model.ResourceType;
import thegame.newHope.model.Resources;

public class GameTest 
{
 
	Game game;
	 @Test
	    public void canBuyBuildingTest() throws Exception {
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
	 
	 @Test
	 public void incrementDayTest() {
		 game = game.getInstance();
		 
		 game.resetGame();
		 
		 int day = game.getDayCounter();
		 
		 game.incrementDay();
		 
		 Assert.assertEquals(game.getDayCounter(),day + 1);
	 }
	 
	 @Test
	 public void resetGameTest() {
		 game = game.getInstance();
		 
		 game.resetGame();
		 Assert.assertEquals(10, game.getResources().getWood());
		 Assert.assertEquals(5, game.getResources().getStone());
		 Assert.assertEquals(0, game.getResources().getIron());
		 Assert.assertEquals(10, game.getResources().getIncrementWood());
		 Assert.assertEquals(5, game.getResources().getIncrementStone());
		 Assert.assertEquals(2, game.getResources().getIncrementIron());
		 Assert.assertEquals(1, game.getDayCounter());
		 
		 
	 }
	 
	 @Test
	 public void subTest() {
		 game = game.getInstance();
		 
		 game.resetGame();
		 int wood = game.getResources().getWood();
		 int stone = game.getResources().getStone();
		 int iron = game.getResources().getIron();
		 
		 game.subWood(10);
		 game.subStone(10);
		 game.subIron(10);
		 
		 Assert.assertEquals(game.getResources().getWood(), wood -= 10);
		 Assert.assertEquals(game.getResources().getStone(), stone -= 10);
		 Assert.assertEquals(game.getResources().getIron(), iron -= 10);
	 }
	 


}
