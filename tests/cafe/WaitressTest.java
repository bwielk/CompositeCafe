package cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WaitressTest {
	
	private MenuComponent menuDinner;
	private MenuComponent menuLunch;
	private MenuComponent menuBreakfast;
	private MenuComponent mainMenu;
	private MenuComponent menuDinnerDessert;
	private MenuComponent menuLunchCoffee;
	private Waitress waitress;
	
	@Before
	public void before(){
		mainMenu = new Menu("EatHouse menu", "A selection of delicious dishes");
		menuBreakfast = new Menu("Breakfast menu", "A selection of breakie choices");
		menuLunch = new Menu("Lunch menu", "A selection of lunches");
		menuDinner = new Menu("Dinner menu", "A selection of dinner choices");
		menuDinnerDessert = new Menu("Dinner dessert menu", "Dessert after dinner");
		menuLunchCoffee = new Menu("Coffee menu", "Drink");
		menuLunch.add(new MenuItem("Cheese cake", "Austrian style cheese cake", true, 1.50));
		menuLunch.add(new MenuItem("Carrot cake", "British style carrot cake", true, 2.00));
		menuLunch.add(new MenuItem("Ham sandwich", "Honey roasted ham sandwich", false, 1.50));
		menuBreakfast.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausages", false, 4.50));
		menuBreakfast.add(new MenuItem("Vegetarian Pancake Breakfast", "Pancakes with poached eggs and tomato", true, 4.00));
		menuBreakfast.add(new MenuItem("Regular Waffle Breakfast", "Waffles with blueberries and strawberries", true, 3.50));
		menuLunchCoffee.add(new MenuItem("Lavazza", "Lavazza", true, 1.00));
		menuLunchCoffee.add(new MenuItem("Cappucino", "Cappucino", true, 2.00));
		menuLunchCoffee.add(new MenuItem("Latte", "Latte", true, 3.00));
		menuDinner.add(new MenuItem("Penne with mushrooms", "Penne with creamy mushroom sauce", true, 13.00));
		menuDinner.add(new MenuItem("Sirloin steak", "6oz Sirloin steak with chips and coleslaw", false, 12.00));
		menuDinner.add(new MenuItem("Penne with tomato sauce", "Penne with Italian style sauce", true, 15.00));
		menuDinnerDessert.add(new MenuItem("STP", "Sticky Toffee Pudding", true, 2.50));
		menuDinnerDessert.add(new MenuItem("Rice pudding", "Rice pudding with wild berries", true, 1.50));
		menuDinnerDessert.add(new MenuItem("Rice pudding Deluxe", "Rice pudding with wild berries and ice cream", true, 2.50));
		mainMenu.add(menuBreakfast);
		menuLunch.add(menuLunchCoffee);
		mainMenu.add(menuLunch);
		menuDinner.add(menuDinnerDessert);
		mainMenu.add(menuDinner);
		waitress = new Waitress(mainMenu);
	}
	
	/*@Test
	public void waitressKnowsHowManyItemsAreInBothMenus() {
		waitress.updateKnowledge();
		assertEquals(3, waitress.getNumberOfItems());
		assertEquals(3, waitress.getNumberOfSubmenus());
	}
	
	@Test
	public void waitressKnowsAboutAddedItemsToTheCafeMenu(){
		cafeMenu.addItem("Apple tart", "Traditional tart", true, 1.90);
		cafeMenu.addItem("Berry tart", "Traditional tart", true, 1.80);
		waitress.updateKnowledge();
		assertEquals(5, waitress.getNumberOfCafeMenuItems());
	}
	
	@Test
	public void waitressKnowsAboutAddedItemToThePancakeMenu(){
		pancakeMenu.addItem("Pancakes XL", "Big pancakes", true, 2.00);
		waitress.updateKnowledge();
		assertEquals(4, waitress.getNumberOfPancakeMenuItems());
	}*/
}
