package Concrete;

import Abstract.IGameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		
		System.out.println("Game added to system: " + game.getName());
		
	}

	@Override
	public void updateGame(Game game) {
		
		System.out.println("Game updated: " + game.getName());
	}

	@Override
	public void deleteGame(Game game) {
		
		System.out.println("Game deleted to system: " + game.getName());
	}

	@Override
	public void buyGame(Game game, Gamer gamer) {	
		
		System.out.println(gamer.getFirstName() + " " + game.getName() + " purchase successful...");
	}	
}
