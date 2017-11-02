package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void test() {
		Table table1 = new Table();
		Player p1 = new Player("Lucas",1);
		Player p2 = new Player("Alvin",2);
		table1.AddPlayerToTable(p1);
		table1.AddPlayerToTable(p2);
		assertEquals(table1.GetPlayerFromTable(p1),p1);
		assertEquals(table1.GetPlayerFromTable(p2),p2);
		table1.RemovePlayerFromTable(p1);
		table1.RemovePlayerFromTable(p2);
	}
}