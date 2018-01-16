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
		int items = 0;
		int menus = 0;
		int allItems = 0;
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent comp = (MenuComponent) iterator.next();
			if(comp.getClass() == MenuItem.class){
				items += 1;
				if(items != numOfItems && items > numOfItems){
					numOfItems = items;
				}
			}else if(comp.getClass() == Menu.class){
				menus += 1;
				if(menus != numOfSubmenus && menus > numOfSubmenus){
					numOfSubmenus = menus;
				}
				for(int i = 0; i < getItems().size(); i++){
					if(getItems().get(i).getClass() == MenuItem.class){
						allItems += 1;
						if(allItems + items != numOfAllItems){
							numOfAllItems = allItems + items;
						}
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
	
	public int getNumberOfAllSubmenus(){
		return numOfAllSubmenus;
	}
}