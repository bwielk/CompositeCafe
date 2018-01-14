package cafe;

import java.util.Hashtable;

public class CafeMenu {

	private Hashtable menuItems = new Hashtable();
	
	public CafeMenu(){
		addItem("Cheese cake", "Austrian style cheese cake", true, 1.50);
		addItem("Carrot cake", "British style carrot cake", true, 2.00);
		addItem("Ham sandwich", "Honey roasted ham sandwich", false, 1.50);
	}
	
	public void addItem(String name, String description, boolean isVegetarian, double price){
		MenuItem item = new MenuItem(name, description, isVegetarian, price);
		menuItems.put(item.getName(), item);
	}
	
	public Hashtable getItems(){
		return menuItems;
	}
}
