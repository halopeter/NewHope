package theGame;

import thegame.controller.Game;
import thegame.model.Resources;
import org.junit.Assert;
import org.junit.Test;

public class ResourcesTest {
	@Test
    public void WoodIncrementTest() throws Exception {

	Game game = Game.getInstance();
	
	int wood = game.getResources().getWood();
	int stone = game.getResources().getStone();
	int iron = game.getResources().getIron();
	game.getResources().addWood();
	game.getResources().addIron();
	
	Assert.assertEquals(game.getResources().getWood(), wood + game.getResources().getIncrementWood());
	Assert.assertEquals(game.getResources().getIron(), iron + game.getResources().getIncrementIron());
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

	
}
