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
		numOfItems = allMenus.getNumberOfItems();
		numOfSubmenus = allMenus.getNumberOfSubmenus();
	}
	
	public int getNumberOfItems(){
		return numOfItems;
	}
	
	public int getNumberOfSubmenus(){
		return numOfSubmenus;
	}
	
	public int getVegetarianItems(){
		int result = 0;
		Iterator iterator = allMenus.createIterator();
		while(iterator.hasNext()){
			MenuComponent comp = (MenuComponent) iterator.next();
			try{
				if(comp.isVegetarian()){
					result +=1;
				}
			}catch (UnsupportedOperationException e){};
		}
		return result;
	}
}