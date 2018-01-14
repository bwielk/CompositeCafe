package cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CafeMenuTest{

	private CafeMenu cafe;
	
	@Before
	public void before(){
		cafe = new CafeMenu();
	}
	
	@Test
	public void menuHas3Items() {
		assertEquals(3, cafe.getItems().size());
		cafe.addItem("Bonnie and Clyde", "A meringue cake with berries" , true, 3.00);
		assertEquals(4, cafe.getItems().size());
	}
	
	@Test
	public void MenuContainsCheeseCake(){
		MenuItem hamSandwich = (MenuItem) cafe.getItems().values().toArray()[0];
		assertEquals("Ham sandwich", hamSandwich.getName());
		MenuItem cakeItem = (MenuItem) cafe.getItems().get("Cheese cake");
		assertEquals("Austrian style cheese cake", cakeItem.getDescription());
	}
}
