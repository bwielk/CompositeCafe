package cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MenuTest{
	
	private MenuComponent menuDinner;
	private MenuComponent menuLunch;
	private MenuComponent menuBreakfast;
	private MenuComponent mainMenu;
	private MenuComponent menuDinnerDessert;
	private MenuComponent menuLunchCoffee;
	
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
	}
	
	@Test
	public void submenusAreDetectedInDinnerMenu(){
		menuDinner.add(menuDinnerDessert);
		menuDinner.setNumbersOfItemsAndSubmenus();
		assertEquals(1, menuDinner.getNumberOfSubmenus());
		assertEquals(3, menuDinner.getNumberOfItems());
		assertEquals(6, menuDinner.getNumberOfAllItems());
	}
	
	@Test
	public void submenusAreDetectedInBreakfastMenu(){
		menuBreakfast.setNumbersOfItemsAndSubmenus();
		assertEquals(0, menuBreakfast.getNumberOfSubmenus());
		assertEquals(3, menuBreakfast.getNumberOfItems());
	}
	
	@Test
	public void submenusAreDetectedInLunchMenu(){
		menuLunch.add(menuLunchCoffee);
		menuLunch.setNumbersOfItemsAndSubmenus();
		assertEquals(1, menuLunch.getNumberOfSubmenus());
		assertEquals(3, menuLunch.getNumberOfItems());
		menuLunch.add(new MenuItem ("xxx", "xxx", false, 0.45));
		menuLunch.setNumbersOfItemsAndSubmenus();
		assertEquals(1, menuLunch.getNumberOfSubmenus());
		assertEquals(4, menuLunch.getNumberOfItems());
	}
	
	@Test
	public void submenusAreDetectedInMainMenuWithAllItemsInIt(){
		mainMenu.add(menuBreakfast);
		menuLunch.add(menuLunchCoffee);
		mainMenu.add(menuLunch);
		menuDinner.add(menuDinnerDessert);
		mainMenu.add(menuDinner);
		mainMenu.setNumbersOfItemsAndSubmenus();
		assertEquals(3, mainMenu.getNumberOfSubmenus());
		assertEquals(0, mainMenu.getNumberOfItems());
		assertEquals(15, mainMenu.getNumberOfAllItems());
		assertEquals(5, mainMenu.getNumberOfAllSubmenus());
	}
}