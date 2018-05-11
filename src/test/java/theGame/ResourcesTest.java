package theGame;

import thegame.newHope.controller.Game;
import thegame.newHope.model.ResourceType;
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

	
}
