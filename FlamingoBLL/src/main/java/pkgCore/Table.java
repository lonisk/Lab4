package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	private HashMap<UUID,Player> PlayersMap = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		
		PlayersMap.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{

		PlayersMap.remove(p.getPlayerID());
	}
	
	public Player GetPlayerFromTable(Player p) {
		return PlayersMap.get(p.getPlayerID());
	}
}