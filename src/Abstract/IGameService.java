package Abstract;

import Entities.Game;
import Entities.Gamer;

public interface IGameService {
	
	void add(Game game);
	
	void updateGame(Game game);
	
	void deleteGame(Game game);
	
	void buyGame(Game game, Gamer gamer);
	
}
