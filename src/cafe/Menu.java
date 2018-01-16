package cafe;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	
	private ArrayList<MenuComponent> menuComponents;
	private String name;
	private String description;
	
	public Menu(String name, String description){
		this.menuComponents = new ArrayList<MenuComponent>();
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent){
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
				numOfAllItems += 1;
			}else if(comp.getClass() == Menu.class){
				numOfSubmenus += 1;
				for(int i = 0; i < getItems().size(); i++){
					if(getItems().get(i).getClass() == MenuItem.class){
						numOfAllItems += 1;
					}
				}
			}
		}
	}
	
	private ArrayList getItems(){
		return this.menuComponents;
	}

	public int getNumberOfItems(){
		return numOfItems;
	}
	
	public int getNumberOfSubmenus(){
		return numOfSubmenus;
	}
	
	public int getNumberOfAllItems(){
		return numOfAllItems;
	}
}