package cafe;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	
	protected ArrayList menuComponents = new ArrayList();
	protected static String name;
	protected static String description;
	
	public Menu(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void addItem(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return (MenuComponent) menuComponents.get(i);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setNumbersOfItemsAndSubmenus(){
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent comp = (MenuComponent) iterator.next();
			if(comp.getClass() == MenuItem.class){
				numOfItems += 1;
			}else if(comp.getClass() == Menu.class){
				numOfSubmenus += 1;
			}
		}
	}
	
	public int getNumberOfItems(){
		return numOfItems;
	}
	
	public int getNumberOfSubmenus(){
		return numOfSubmenus;
	}
}