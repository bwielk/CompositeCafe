package cafe;

import java.util.Iterator;

public class Waitress {
	
	private MenuComponent allMenus;
	private int numOfItems = 0;
	private int numOfSubmenus = 0;
	
	public Waitress(MenuComponent allMenus){
		this.allMenus = allMenus;
	}
	
	public void updateKnowledge(){
		allMenus.setNumbersOfItemsAndSubmenus();
		numOfItems = allMenus.getNumberOfItems();
		numOfSubmenus = allMenus.getNumberOfSubmenus();
	}
	
	public int getNumberOfItems(){
		return numOfItems;
	}
	
	public int getNumberOfSubmenus(){
		return numOfSubmenus;
	}
}