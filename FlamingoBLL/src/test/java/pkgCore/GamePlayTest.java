package pkgCore;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import pkgEnum.eGameType;

public class GamePlayTest {

	@Test
	public void test() {
		GamePlay gameP = new GamePlayBlackJack(eGameType.POKER);
		ArrayList<Player> Players = new ArrayList<Player>();
		Player player1 = new Player("Luke",1);
		Player player2 = new Player("Alvin",2);
		Player player3 = new Player("Maddie",3);
		Player player4 = new Player("Brett",4);
			Players.add(player1);
			Players.add(player2);
			Players.add(player3);
			Players.add(player4);
		gameP.AddPlayersToGame(Players);
		assertEquals(gameP.GetPlayerInGame(player1),player1);
		assertEquals(gameP.GetPlayerInGame(player2),player2);
		assertEquals(gameP.GetPlayerInGame(player3),player3);
		//remove plasyer
		assertEquals(gameP.GetPlayerInGame(player4),player4);
		gameP.RemovePlayerFromGame(player1);
		gameP.RemovePlayerFromGame(player2);
		gameP.RemovePlayerFromGame(player3);
		gameP.RemovePlayerFromGame(player4);
	}
}