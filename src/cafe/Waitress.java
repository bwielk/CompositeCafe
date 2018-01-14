package cafe;

import java.util.Iterator;

public class Waitress {
	
	private Menu pancakeHouseMenu;
	private Menu cafeMenu;
	private int cafeItemsNumber;
	private int pancakesItemsNumber;
	
	public Waitress(Menu pancakeMenu, Menu cafeMenu){
		this.pancakeHouseMenu = pancakeMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void updateKnowledge(){
		Iterator cafe = cafeMenu.createIterator();
		Iterator pancakes = pancakeHouseMenu.createIterator();
		cafeItemsNumber = setNumOfItems(cafe);
		pancakesItemsNumber = setNumOfItems(pancakes);
	}
	
	public int getNumberOfCafeMenuItems(){
		return cafeItemsNumber;
	}
	
	public int getNumberOfPancakeMenuItems(){
		return pancakesItemsNumber;
	}
	
	private int setNumOfItems(Iterator iterator){
		int result = 0;
		while(iterator.hasNext()){
			iterator.next();
			result += 1;
		}
		return result;
	}
}