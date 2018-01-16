package cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MenuTest{
	
	@Before
	public void before(){
		MenuComponent mainMenu = new Menu("EatHouse menu", "A selection of delicious dishes");
		MenuComponent menuBreakfast = new Menu("Breakfast menu", "A selection of breakie choices");
		MenuComponent menuLunch = new Menu("Lunch menu", "A selection of lunches");
		MenuComponent menuDinner = new Menu("Dinner menu", "A selection of dinner choices");
		MenuComponent menuDinnerDessert = new Menu("Dinner dessert menu", "Dessert after dinner");
		MenuComponent menuLunchCoffee = new Menu("Coffee menu", "Drink");
		menuLunchCoffee.add(new MenuItem("Cheese cake", "Austrian style cheese cake", true, 1.50));
		menuLunchCoffee.add(new MenuItem("Carrot cake", "British style carrot cake", true, 2.00));
		
	}
	@Test
	public void menuHasNameAndDescription() {
		assertEquals("Dinner menu", menu.getName());
		assertEquals("A selection of delicious dishes", menu.getDescription());
	}

}
