package Abstract;

import Entities.Gamer;

public interface IGamerService {
	
	void register(Gamer gamer);
	
	void updateInformation(Gamer gamer);
	
	void registerDelete(Gamer gamer);
}
