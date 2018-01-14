package cafe;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class PancakeMenuTest extends PancakeMenu {
	
	private Menu pancakeMenu;
	
	@Before
	public void before(){
		this.pancakeMenu = new PancakeMenu();
	}
	@Test
	public void theFirstItemIsRegularPancakes() {
		MenuItem regularPancakes = (MenuItem) pancakeMenu.createIterator().next();
		assertEquals("Regular Pancake Breakfast", regularPancakes.getName());
	}
	
	@Test
	public void theSecondItemIsVegPancakeBreakfast() {
		Iterator menuIterator = pancakeMenu.createIterator();
		menuIterator.next();
		MenuItem vegPancakes = (MenuItem) menuIterator.next();
		assertEquals("Vegetarian Pancake Breakfast", vegPancakes.getName());
	}
}
