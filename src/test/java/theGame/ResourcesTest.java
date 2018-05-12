package theGame;

import thegame.newHope.controller.Game;
import thegame.newHope.model.ResourceType;
import thegame.newHope.model.Resources;

import org.junit.Assert;
import org.junit.Test;

public class ResourcesTest {
	Game game;
	
	@Test
    public void WoodIncrementTest() throws Exception {

	Game game = Game.getInstance();
	
	int wood = game.getResources().getWood();
	game.getResources().addWood();
	game.getResources().addIron();
	
	Assert.assertEquals(game.getResources().getWood(), wood + game.getResources().getIncrementWood());
	}
	
	@Test
	public void StoneIncrementTest() throws Exception {
		
		Game game = Game.getInstance();
		
		int stone = game.getResources().getStone();
		game.getResources().addStone();
		Assert.assertEquals(game.getResources().getStone(), stone + game.getResources().getIncrementStone());
	}
	
	@Test
	public void IronIncrementTest() throws Exception {
		
		Game game = Game.getInstance();
		
		int iron = game.getResources().getIron();
		
		game.getResources().addIron();
		
		Assert.assertEquals(game.getResources().getIron(), iron + game.getResources().getIncrementIron());
	}
	
	 @Test
	 public void incrementType() {
		 game = game.getInstance();
		 
		 game.resetGame();
		 
		 game.applyBuildingEffect(ResourceType.Wood, 10);
		 game.applyBuildingEffect(ResourceType.Stone, 10);
		 game.applyBuildingEffect(ResourceType.Iron, 10);
		 
		 Assert.assertEquals(20 , game.getResources().getIncrementWood());
		 Assert.assertEquals(15 , game.getResources().getIncrementStone());
		 Assert.assertEquals(12 , game.getResources().getIncrementIron());

	 }
	 
	 @Test 
	 public void resourceConstructor() {
		game = game.getInstance();
		
		game.resetGame();
		
		Resources resources = new Resources(10,5,2,10,5,2);
		
		int wood = resources.getWood();
		int stone = resources.getStone();
		int iron = resources.getIron();
		int woodIncrement = resources.getIncrementWood();
		int stoneIncrement = resources.getIncrementStone();
		int ironIncrement = resources.getIncrementIron();
		
		Assert.assertEquals(10, wood);
		Assert.assertEquals(5, stone);
		Assert.assertEquals(2, iron);
		Assert.assertEquals(10, woodIncrement);
		Assert.assertEquals(5, stoneIncrement);
		Assert.assertEquals(2, ironIncrement);
	 }
	 
	 @Test
	 public void setResources() {
		 game = game.getInstance();
		 
		 game.resetGame();
		 
		 game.getResources().setWood(10);
		 game.getResources().setStone(10);
		 game.getResources().setIron(10);
		 
		 Assert.assertEquals(game.getResources().getWood(), 10);
		 Assert.assertEquals(game.getResources().getStone(), 10);
		 Assert.assertEquals(game.getResources().getIron(), 10);
	 }
	 
	 @Test
	 public void setIncrement() {
		 game = game.getInstance();
		 
		 game.resetGame();
		 
		 game.getResources().setIncrementWood(10);
		 game.getResources().setIncrementStone(10);
		 game.getResources().setIncrementIron(10);
		 
		 Assert.assertEquals(game.getResources().getIncrementWood(), 10);
		 Assert.assertEquals(game.getResources().getIncrementStone(), 10);
		 Assert.assertEquals(game.getResources().getIncrementIron(), 10);
	 }
}
