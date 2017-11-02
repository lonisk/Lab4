package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID,Player> GameMap = new HashMap<UUID,Player>();
	
	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame(ArrayList<Player> Players)
	{
		for (Player p:Players) {
		GameMap.put(p.getPlayerID(), p);
		}
	}
	protected void RemovePlayerFromGame(Player p)
	{
		GameMap.remove(p.getPlayerID());
	}
	protected Player GetPlayerInGame(Player p)
	{	
		return GameMap.get(p.getPlayerID());
	}
}